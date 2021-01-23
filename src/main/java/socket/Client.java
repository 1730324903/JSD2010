package socket;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 聊天室客户端
 * 谁发起连接谁是客户端
 */
public class Client {
    /*
    java.net.Socket 套接字
    Socket封装了TCP得通讯细节，我们使用Socket与服务器建立连接后，只需要通过两条流的
    读写来完成与服务端的交互工作
     */
    private Socket socket;

    public Client(){
        try {
            /*
            实例化Socket时需要传入两个参数，分别表示服务端的IP地址与端口
            IP地址：用于找到网络上的服务段的计算机
            端口：用于找到服务端的计算机上的服务端应用程序
             */
            System.out.println("正在连接服务器...");
            socket = new Socket("localhost",8088);
            System.out.println("与服务端建立连接！");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            //启动线程用于读取服务端发送过来的消息
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.setDaemon(true);
            t.start();

            /*
            Socket提供的方法：
            OutputStream getOutputStream()
            该方法会返回一个字节输出流，通过这个流写出的数据会通过网络发送给远端计算机
            */
            OutputStream out = socket.getOutputStream();
            //按行发送字符串给服务端
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scan = new Scanner(System.in);

            while (true){
                String line =scan.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }
            //pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    /**
     * 该线程负责读取服务端发送过来的消息
     */
    private class ServerHandler implements Runnable{
        public void run(){
            try {
                //通过socket获取输入流,
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line=br.readLine())!=null){
                    System.out.println(line);
                }
            }catch (Exception e){
                //e.printStackTrace();
            }
        }
    }
}

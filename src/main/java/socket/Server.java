package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 聊天室服务端
 */
public class Server {
    /*
    java.net.ServerSocket 运行在服务端的ServerSocket相当于是“总机”，只是负责：
    1：向系统申请服务端口，客户端就是通过这个端口与服务端建立连接的。
    2：监听服务端口，一旦与一个客户端连接，ServerSocket就会立即建立一个Socket与之对应，
    通过这个Socket就可以与客户端对等交互了
     */
    private ServerSocket server;

    //private PrintWriter[] allOut = {};
    private Collection<PrintWriter> allOut = new ArrayList<>();


    public Server(){
        try {
            System.out.println("正在启动服务端...");
            /*
            实例化ServerSocket可能抛出异常：
            java.net.BindException:address already in use
            如果遇到这个问题，说明申请的端口已经被其他程序使用了
             */
            server = new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            /*
            ServerSocket提供的方法：
            Socket accept()
            该方法是一个阻塞方法，调用后开始等待客户端的连接，一旦一个客户端建立连接
            该方法会立即返回一个Socket，通过这个Socket实例与客户交互
            多次调用该方法可以接收多个客户端的连接。
             */
            while (true) {
                System.out.println("等待客户连接");
                Socket socket = server.accept();
                System.out.println("一个客户端连接了！");
                //当一个客户端连接后，启动一个线程来与其进行交互
                ClientHangler clientHangler = new ClientHangler(socket);
                Thread t = new Thread(clientHangler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 这个线程的任务是负责与特定的客户端进行交互。
     * 服务端运行，每当一个客户端连接，都会启动一个线程来执行一个这样的任务。
     */
    private class ClientHangler implements Runnable{
        private Socket socket;
        private String host;//当前客户端的IP地址信息

        public  ClientHangler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机地址信息
            host=socket.getInetAddress().getHostAddress();
        }

        public void run(){
            PrintWriter pw = null;
            try{
                /*
                Socket提供的方法：
                InputStream getInputStream()
                通过Socket获取的字节输入流可以读取远端计算机发送过来的字节
                */
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);

                /*
                通过socket获取输出流，用于给客户端发送消息
                 */
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);

                 /*
            将该输出流存入数组allOut中，这样其他的ClientHandler实例就可以得到
            当前ClientHandler实例中的这个输出流，以便将消息转发给该客户端
             */
                //synchronized (server){//这里的server是ServerSocket
                synchronized (Server.this) {//锁所有ClientHandler的为外部类对象Server的实例
                    //1.对allOut数组扩容
                    //allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    allOut.add(pw);
                    //2.将输出流存入该数组中
                    //allOut[allOut.length - 1] = pw;
                }
                System.out.println(host+"上线了，当前在线人数："+allOut.size());

                String line;
                while ((line = br.readLine())!=null) {
                    System.out.println(host+"说：" + line);
                    synchronized (Server.this) {
                        //回复客户端
                        //for (int i = 0; i < allOut.length; i++) {
                        //    allOut[i].println(host + "说：" + line);
                        //}

                        for(PrintWriter p : allOut){
                            p.println(host + "说：" + line);

                        }
                    }
                    //pw.println(host+"说："+line);
                }
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                //处理当前客户断开连接的操作
                synchronized (Server.this) {
                    //将当前客户端的输入流从allOut数组中删掉
                    //for (int i = 0; i < allOut.length; i++) {
                    //    if (allOut[i] == pw) {
                    //        allOut[i] = allOut[allOut.length - 1];
                    //        allOut = Arrays.copyOf(allOut, allOut.length - 1);
                    //        break;
                    //    }
                    //}
                    allOut.remove(pw);

                }
                System.out.println(host+"下线人数，当前在线人数"+allOut.size());
                try {
                    socket.close();//与客户断开连接
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

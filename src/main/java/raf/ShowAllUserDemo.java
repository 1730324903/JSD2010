package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("user.dat","r");
        for(int i=0;i<raf.length()/100;i++){
            //读用户名
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data,"UTF-8").trim();
            //System.out.println("111"+username);
            //读密码
            raf.read(data);
            String password = new String(data,"UTF-8").trim();
            //读昵称
            raf.read(data);
            String nickname = new String(data,"UTF-8").trim();
            //读年龄
            int age = raf.readInt();
            System.out.println(username+","+password+","+nickname+","+age);
        }
    }
}

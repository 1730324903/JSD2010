package io;

import java.io.*;

/**
 * 使用文件流完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
        1：创建文件输入流读取源文件
        2：创建文件输出流用于写复制文件
        3：循环从源文件读取字节并写入到复制文件中完成复制
        4：关闭两个流
        利用块读写形式复制。
         */
        FileInputStream fis = new FileInputStream("fos.txt");
        FileOutputStream ran = new FileOutputStream("foss.txt");
        byte[] data = new byte[1024*10];
        int len;
        while ((len = fis.read(data))!=-1){
           ran.write(data,0,len);
        }
        System.out.println("复制完成");
        //fis.close();
        //ran.close();
    }
}

package io;

import java.io.*;

/**
 * 使用缓冲流完成文件复制
 *
 * 缓冲字节流：java.io.BufferedInputStream和BufferedOutputStream
 * 它们是一对高级流，在流连接中的作用是加快读写字节的效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("name.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("names.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d;//记录每次读取到的字符
        long strat = System.currentTimeMillis();
        /*
        缓冲流内部维护着一个8k的字节数组（默认是8k，可以在创建缓冲流时指定其他长度）
        然后无论我们对缓冲流的读写操作是采取单字节读写还会是块读写，都不会被缓冲流转换为
        块读写来保证读写效率
         */
        while ((d=bis.read())!=-1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成："+(end-strat));
        //关闭时只需要关闭最外层的高级流即可，他会自动关闭其连接的流
        bis.close();
        bos.close();
    }
}

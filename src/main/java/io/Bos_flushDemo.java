package io;

import java.io.*;

/**
 * 缓冲流写出数据时的缓冲区问题
 */
public class Bos_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String str = "让我在看你一眼，从南到北";
        byte[] data = str.getBytes("UTF-8");

        bos.write(data);
        /*
        void flush方法是在java.io.OutputStream中定义的方法，所有字节输出流都支持
        这个方法，但是实际上只有缓冲流真正实现了这个方法，用于将缓冲流区中已经缓冲的数据
        一次性写出，其实时实现的目的只是用于传递该方法
         */
        bos.flush();

        System.out.println("完毕");
        /*
        缓冲流的close方法中会自动调用一次flush方法，确定关闭前缓冲区的数据会被写出
         */
        bos.close();
    }
}

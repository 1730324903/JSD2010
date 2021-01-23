package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * 向文件中写字符串
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
        String len = "听说你一直在这找我";
        byte[] data = len.getBytes("UTF-8");
        raf.write(data);

        raf.write(",咋地没完了阿！".getBytes("UTF-8"));
        System.out.println("over");
        raf.close();
    }
}

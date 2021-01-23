package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt","r");
        //使用块读，将文件中所有的字节一次性读取回来
        byte[] data = new byte[(int)raf.length()];
        raf.read(data);
        String str = new String(data,"UTF-8");
        System.out.println(str);
        raf.close();
    }
}

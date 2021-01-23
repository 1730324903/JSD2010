package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat" ,"r");
        /*
        int read()
        从文件中读取一个字节，并将对应的8位二进制存入int值的低八位，将该int值返回，
        如果返回值为-1则表示文件读取到末尾（EOf end of file）
         */
        /*
        00000000 00000000 00000000 00000001
         */
        int d = raf.read();
        System.out.println(d);

        int d1 = raf.read();
        System.out.println(d1);

        int d2 = raf.read();
        System.out.println(d2);

    }
}

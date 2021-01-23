package raf;

import java.io.*;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件的API，其基于指针对文件任意位置可进行读或者写操作
 */
public class RAFDemo {
    public static void main(String[] args) throws IOException {
        /*
        对当前目录下的raf.dat文件写操作

        RandomAccessFile常用构造方法
        RandomAccessFile(String path,String made)
        RandomAccessFile(File file,String mod)
        第一个参数是要操作的文件，可以直接给路径或传入一个File对象
        第二个参数是操作模式，支持：“r”只读模式，”rw“读写模式
         */
        RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");

        //File file = new File("./raf.dat");
        //RandomAccessFile rad = new RandomAccessFile(file,"r");
        /*
        向文件中写入一个字节，写入的是给定的int值对型的二进制的“低八位”
         */
        //00000000 00000000 00000000 00000001
        raf.write(1);
        //00000000 00000000 00000000 00000020
        raf.write(2);
        /*
        文件中的数据
        00000001 00000020
         */
        System.out.println("写出完毕！");
        raf.close();
    }
}

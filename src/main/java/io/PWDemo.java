package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字节流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字节流内部维护一个缓冲区，可以块读写文本数据以加快读写效率，并且缓冲流还可以按行读写字符串
 *
 * java.io.PrintWriter据有自动换行刷新的缓冲字符输出流，内部总是连接着BufferedWriter作为
 * 缓冲功能
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向文件中写入文本数据
        /*
        PW提供了直接对文件做写操作的构造器
        PrintWriter(String path)
        PrintWriter(File file)
        以上两种构造器还提供了重载，允许在传入一个String类型参数来指定字符集
         */
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
        pw.println("如果华佗在世，崇洋都被医治");
        pw.println("外邦来学汉字，激发我民族医治");
        System.out.println("写出完毕");
        pw.close();
    }
}

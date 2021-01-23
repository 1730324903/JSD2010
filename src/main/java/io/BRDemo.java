package io;

import java.io.*;

/**
 * 缓冲字符输入流
 * 特点：可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        /*
        String readLine()
        读取一行字符串，返回的字符串那种不带有最后的换行符，如果当前行是空行则返回
        的字符串是空字符串，当流读取到的末尾时，返回值为null。
         */
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}

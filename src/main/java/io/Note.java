package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 编写一个简易记事本工具
 * 程序启动后要求用户输入文件名然后对文件进行操作
 * 之后用户输入的每一行内容写入文件（不需要考虑换行问题）
 * 当用户单独输入exit时程序退出
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名");
        String name = scan.nextLine();
        //FileInputStream fil = new FileInputStream(name+".txt");
        FileOutputStream fio = new FileOutputStream(name+".txt");
        System.out.println("请输入内容");
        while (true){
            String name1 = scan.nextLine().toLowerCase().trim();
            byte[] bytes = name1.getBytes();
            if(name1.length()>0&&"exit".equals(name1)==false){
                fio.write(bytes);
            }
            if("exit".equals(name1)){
                break;
            }
        }
    }
}

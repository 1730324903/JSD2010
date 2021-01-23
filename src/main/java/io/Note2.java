package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本
 * 如果用户输入文件已经存在，要求其更换名字
 */
public class Note2 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名");
        String name = scan.nextLine();
        File file = new File(name+".txt");
        while (file.exists()){
                System.out.println("文件已存在");
                System.out.println("请重新输入");
                String name1 = scan.nextLine();
                file = new File(name1+".txt");
            }
        PrintWriter pw = new PrintWriter(new BufferedWriter
                (new OutputStreamWriter(new FileOutputStream(file))),true);

            while(true){
            System.out.println("请输入内容");
            String a = scan.nextLine().toLowerCase().trim();
            pw.write(a);
            if("exit".equals(a)) {
                pw.close();
                System.out.println("记事本已经关闭");
                break;
               }
            }
    }
}

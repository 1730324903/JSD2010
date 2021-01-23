package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 编写一个简易的记事本工具
 * 程序启动后要求用户输入一个文件名，然后对文件进行写操作；
 * 之后用户输入的每一行内容都要写入文件中（不需要考虑换行问题）
 * 当用户单独输入exit时程序退出
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名");
        String name = scan.nextLine();
        RandomAccessFile raf = new RandomAccessFile(name+".txt", "rw");
        System.out.println("请输入你要输入的内容，输入exit后回车即可退出");
        String sr=scan.nextLine();
       while(!sr.toLowerCase().equals("exit"))
       {
           raf.write(sr.getBytes("UTF-8"));
           System.out.println("请输入你要输入的内容，输入exit后回车即可退出");
           sr=scan.nextLine();
       }
        System.out.println("程序停止");
    }
}
/*while 判定ture*/
//while (true) {
//    System.out.println("请输入你要输入的内容，输入exit后回车即可退出");
//    String sr=scan.nextLine();
//    if(sr.toLowerCase().equals("exit")){
//        break;}
//    raf.write(sr.getBytes("UTF-8"));
//}
package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成修改昵称功能
 * 程序启动后要求用户输入用户名和新的昵称
 * 然后将user.dat文件中该用户的昵称进行更改，如果输入的用户名不存在则提示：查无此人
 *
 * 思路
 * 先读user.dat文件每条记录的用户名并与输入的用户名对比
 * 找到这个用户所在的记录后，将指针移动到这条记录的昵称位置，并将新昵称转换为字节数组后扩容
 * 至32字节并重写写入来覆盖旧昵称完成修改操作。
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scan.nextLine();
        System.out.println("请输入新昵称");
        String name1 = scan.nextLine();
        byte[] bytes = name1.getBytes("UTF-8");
        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        boolean update = false;//是否有记录被修改过
        //raf.seek(0);
        for(int i=1;i<=raf.length()/100;i++) {
            //raf.seek(i*100);
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data, "UTF-8").trim();
            if (username.equals(name)) {
                raf.seek(i*100-36);
                bytes= Arrays.copyOf(bytes,32);
                raf.write(bytes);
                update = true;//有记录已经修改
                //System.out.println("修改成功");
                break;
            }
            raf.seek(i*100);
        }
        if(update){
            System.out.println("修改成功");
        }else{
            System.out.println("不存在");
        }
    }
}

package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.AlgorithmParameterGenerator;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册
 * 用户信息包含四项：用户名，密码，昵称，年龄
 * 其中用户名，密码，昵称为字符串，年龄为int值
 *
 * 规划：
 * 每条记录占用100字节，其中用户名，密码，昵称各占32字节，年龄4字节，
 * 字符串故意留言可以保证统一格式，便于修改也便于读取。
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎注册！");
        System.out.println("请输入用户名");
        String username = scan.nextLine();
        System.out.println("输入密码");
        String password = scan.nextLine();
        System.out.println("输入昵称");
        String nickname = scan.nextLine();
        System.out.println("输入年龄");
        int age = scan.nextInt();

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");

        //先将指针移动到文件末尾
        raf.seek(raf.length());

        //写入用户名
        byte[] data = username.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);
        //写密码
        data = password.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);
        //写昵称
        data = nickname.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        //写年龄
        raf.writeInt(age);
        System.out.println("这册完毕！");

        raf.close();
    }
}

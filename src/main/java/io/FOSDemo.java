package io;

import java.io.*;

/**
 *java IO 标准的输入与输出
 *java IO将读写功能按照方向划分为输入与输出
 * 输入流：用于读取数据的流，时从外界到程序中的方向
 * 输出流：用于写数据的流
 *
 * java.io.InputStream和OutputStream是所有字节输入流与输出流的超类，规定了相关的
 * 读写字节的方法
 *
 * java将流归纳为两类：
 * 节点流：又称为低级流，是真实连接程序与另一端的“管道”，负责实际搬运数据的流，读写一定是建立
 * 在节点流基础上进行的。
 * 处理流：不能独立存在，必须连接在其他流上，目的是当前数据“流经”当前流时对其进行某种加工处理
 * 来简化我读写数据的操作
 *
 * 文件流：java.io.FilOutputStream和FileInputStream
 * 它们是一对低级流，用于读写文件数据的流。
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        使用文件输出流向文件中写字节

        FileOutputStream常用的构造器：
        FileOutputStream(String path)
        FileOutputStream(File file)
        以上两种构造器船舰的文件输出流为覆盖写模式，即：如果指定的文件已经存在，会将该文件
        原来的数据全部清楚，然后再将所以后通过当前流写出的数据写入到文件中

        FileOutputStream(String path,boolean append)
        FileOutputStream(File)
        如果传入一个boolean值的参数，并且为true时，那么此时创建的文件输出流为追加模式。
        文件中原数据保留，新写的信息都被追加到文件末尾
         */
        //文件流写文件要么将文件原数据全部清楚后重新写，要么都保留并追加写。（只能顺序向后进行写操作）
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        //FileOutputStream fos = new FileOutputStream("fos.txt");
        //RAF是可以操作指针任意位置进行写操作。这种方式也称为随即读写模式
        //RandomAccessFile fos = new RandomAccessFile("fos.txt","rw");
        //String str = "夜空中最亮的星";
        //byte[] data = str.getBytes("UTF-8");
        //fos.write(data);
        //fos.write(",能否听清，那仰望的人心地的孤独与叹息。".getBytes("UTF-8"));

        fos.write("我祈祷".getBytes("UTF-8"));

        System.out.println("写出完毕");
        fos.close();
    }
}

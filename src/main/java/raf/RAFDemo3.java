package raf;

import com.sun.deploy.nativesandbox.NativeSandboxBroker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本数据类型，以及基于指针得的操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
        //刚创建好RAF时，指针默认在文件的最开始
        long pos = raf.getFilePointer();
        System.out.println("pas:"+pos);//0

        //写入一个int最大值
        int imax = Integer.MAX_VALUE;
        /*
        01111111 11111111 11111111 11111111
        imax>>>24
        00000000 01111111 11111111 11111111
        imax>>>16
        00000000 00000000 01111111 11111111
         */
        raf.write(imax>>>24);
        //System.out.println("pos:"+raf.getFilePointer());//下标为1
        raf.write(imax>>>16);
        //System.out.println("pos:"+raf.getFilePointer());//下标为2
        raf.write(imax>>>8);
        //System.out.println("pos:"+raf.getFilePointer());//下标为3
        raf.write(imax);
        //System.out.println("pos:"+raf.getFilePointer());//下标为4

        /*
        RandomAccessFile提供了方便写出基于数据类型的相关方法
        writeInt(int num)该方法等同于上边的四句
         */
        raf.writeInt(imax);
        //System.out.println("pos:"+raf.getFilePointer());//下标为8
        raf.writeLong(123);//连续写8个字节，将long值写入文件
        //System.out.println("pos:"+raf.getFilePointer());//下标为16
        raf.writeDouble(123.123);
        //System.out.println("pos:"+raf.getFilePointer());//下标为24
        //raf.writeBoolean(false);
        ////System.out.println("pos:"+raf.getFilePointer());//下标为25（布尔型字节长度为1）

        System.out.println("输出完毕");


        raf.seek(0);//移动指针到文件最开始
        //int d = raf.read();
        //System.out.println(d);

        int d = raf.readInt();
        System.out.println(d);
        System.out.println("pos:"+raf.getFilePointer());

        raf.seek(8);
        long l = raf.readLong();
        System.out.println(l);
        //double dou = raf.readDouble();
        //System.out.println(dou);

        //将long的值改为456
        //1先将指针移动到long的开始位置
          raf.seek(8);
        long filePointer = raf.getFilePointer();
        System.out.println(filePointer);
        raf.write(456);
        //2将456的八个字节写入
        //raf.seek(8);
        l = raf.read();
        System.out.println(l);

        raf.close();

    }
}

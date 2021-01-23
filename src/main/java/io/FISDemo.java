package io;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输入流，用于读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] data = new byte[1000];
        int len = fis.read(data);//转换成字节长度
        //data[0]=8000000
        //data[1]=123464546
        System.out.println("实际读取到了"+len+"个字节");
        //读取data数组从0到len的长度
        String str = new String(data,0,len,"UTF-8");
        System.out.println(str);
        System.out.println(str.length());
    }
}

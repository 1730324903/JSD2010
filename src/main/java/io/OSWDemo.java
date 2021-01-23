package io;

import java.io.*;

/**
 * 字符流
 *
 * java将流按照读写单位划分为字节流和字符流
 *
 * java.io.InputStream和OutputStream是所有字节输入输出流的超类
 * java.io.Reader和Writer是所有字符输入输出流的超类
 * 字符流的最小读写单位为字符(char)，但是底层实际还是读写字节，只不过字符与字节的转换由字符流自行完成
 *
 * 转换流：java.io.InputStreamReader和OutputStreamWriter
 * 他们是非常常用的一对字符流实现类，并且是一对高级流，实际开发中我们并不直接使用它们，但它们
 * 在流连接中是非常重要的一环。
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        /*
        转换流中的输出流主要工作就是将写出的字符串按照指定的字符集转换为字节名然后再将
        转换后的字节交给它连接的字节写出
         */
        osw.write("天不下雨，天不刮风。");
        osw.write("天上有太阳");
        System.out.println("写入完毕");
        osw.close();
    }
}

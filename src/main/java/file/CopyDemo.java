package file;
/**
 * 文件复制
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("bigairplane.png","r");
        RandomAccessFile desc = new RandomAccessFile("bigairplane1.png","rw");

        int d ;
        long start = System.currentTimeMillis();
        while ((d=src.read())!=-1){//源文件
            desc.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("完事了老铁,整挺快阿！"+(end-start)+"ms");
        src.close();
        desc.close();
    }
}

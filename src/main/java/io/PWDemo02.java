package io;

import java.io.*;
import java.util.Objects;

/**
 * 在流连接中使用PW
 */
public class PWDemo02 {
    private int x;
    private int y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PWDemo02 pwDemo02 = (PWDemo02) o;
        return x == pwDemo02.x &&
                y == pwDemo02.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write("来～左边跟我画个龙");
        pw.write("右边划一道彩虹");
        System.out.println("写出完毕");
        pw.close();
    }
}

package string;

/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否已经以给定的内容开始或结束的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String line = "http:/www.tedu.cn";

        boolean starts = line.startsWith("http");
        System.out.println("starts:"+starts);

        boolean ends = line.endsWith(".cn");
        System.out.println("ends:"+ends);
    }
}

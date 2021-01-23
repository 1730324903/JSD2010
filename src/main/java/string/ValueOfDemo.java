package string;

/**
 * String提供了一组静态的方法：ValueOf
 * 作用是将java中其他的类型转换为字符串，比较常用于将基本类型转换成字符串
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 123;
        String s1 = String.valueOf(a);
        System.out.println(s1);

        double b = 123.456;
        String b1 = String.valueOf(b);
        System.out.println(b1);

        long l = 123456789;
        String l1 = String.valueOf(l);
        System.out.println(l1);

        String s3 = a+"";//任何内容跟字符串相连结果都是字符串
        System.out.println(s3);
    }
}

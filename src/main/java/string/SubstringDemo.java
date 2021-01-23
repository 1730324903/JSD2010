package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串那种指定该范围内容的子字符串，两个参数范围对应的下标，
 * 注：在JAVA API中，通常使用两个数字表示范围时都是含头不含尾的。
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //             01234567890   第二个0代表10
        String line = "www.tedu.cn";

        String sub = line.substring(4,8);
        System.out.println(sub);//tedu

        //重载的放法传入的参数是从该位置开始截取到字符串的末尾
        sub = line.substring(4);
        System.out.println(sub);//tedu.cn
    }
}

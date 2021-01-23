package string;

/**
 * String toUpperCase()
 * String toLowerCase()
 * 将字符串中的英文部分转换为全大写或者全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String line = "我爱Java";
        System.out.println(line);
        String upper = line.toUpperCase();//英文部分变成全大写
        System.out.println(upper);
        String lower = line.toLowerCase();//英文部分变成全小写
        System.out.println(lower);
    }
}

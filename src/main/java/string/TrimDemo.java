package string;

/**
 * 去除字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String line = "   hello   ";
        System.out.println(line);
        line = line.trim();
        System.out.println(line);

    }
}

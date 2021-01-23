package string;

/**
 * int indexOf(String str)
 * 判断当前字符中给字符串的所在位置，如果当前的字符串不包含给定内容时返回值为-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //            0123456789012345  第二个0代表10
        String str = "thinking in java";

        int index = str.indexOf("in");//查找in第一次出现得位置
        System.out.println(index);//2

        //从下标3（第四个字母开始）处往后第一次出现in得位置
        index = str.indexOf("in",3);
        System.out.println(index);//5

        //查找最后一次出现in的位置
        index = str.lastIndexOf("in");
        System.out.println(index);//9
    }
}

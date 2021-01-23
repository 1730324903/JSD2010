package string;

import java.sql.SQLOutput;

/**
 * String支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串中满足正则表达式的部分进行拆分，将拆分出的各部分内容以一个数组的形式返回。
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi789jkl";
        //拆分出所有的字母部分
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        /*
        如果在字符串最开始就遇到拆分项，那么拆分在最开始就会拆分出一个空字符串，
        如果连续遇到两个拆分项，那么中间会拆分出一个空串，
        但是如果在末尾遇到拆分项，拆分的空字符串会被忽略。
         */
        String s = "12.34.56.....74.89........";
        String[] s1 = s.split("\\.");
        System.out.println(s1.length);
        for(int i=0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
    }
}

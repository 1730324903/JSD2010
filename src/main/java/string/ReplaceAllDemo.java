package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * String 支持正则表达式的方法三：
 * String replaceAll(String regex,String str)
 * 当前字符串中满足正则表达式的部分还为给定内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi789jkl";
        //将当前字符串中的数字部分换乘 #SSHSSK
        str = str.replaceAll("[0-9]+","#SSHSSK");
        System.out.println(str);

        String regex = "(wqnmlgb|bsd|cnm|nc|nmsl|mmp|nt|mdzz|djb)";
        String message = "cnm!你个nc，你怎么这么nt！你个djb";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}

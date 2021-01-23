package string;

/**
 * String支持正则表达式的方法之一：
 * boolean matches(String regex)
 * 使用正则表达式验证当前字符串的格式，匹配则返回true
 * 注：给定的正则表达式不写边界匹配也是做边界的匹配
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String mail = "liuhuaqiang_@baidu.com";
        /*
        [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-z]+)+
         */
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-z]+)+";
        boolean match = mail.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }
    }
}

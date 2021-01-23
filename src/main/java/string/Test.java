package string;

public class Test {
    public static void main(String[] args) {
        String name1 = getHoustName("www.tedu.cn");
        String name2 = getHoustName("http://doc.canglaoshi.org");
        String name3 = getHoustName("tts.tedu.com.cn");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
    public static String getHoustName(String line){
        int i = line.indexOf(".")+1;
        int a=  line.indexOf(".",i);
        return line.substring(i,a);
    }
}

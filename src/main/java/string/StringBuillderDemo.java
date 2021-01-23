package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * String的优化导致了他必须是不变的对象，然而这就是非常不利于修改内容的，性能差，开销大，
 * 为了解决这个问题，java提供了一个专门用来修改字符串内容的api：Stringbuilder
 * StringBuilder内部维护一个可变的char数组，修改内容是开销小，速度快，并且提供了修改字符串
 * 内容的相关操作：增删该插，以及String中操作字符串的常用方法（length，indexOf等等）。
 */
public class StringBuillderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";
        //StringBuilder builder = new StringBuilder();
        StringBuilder builder = new StringBuilder(str);
        builder.append("，为了找个好工作");
        System.out.println(builder);
        String line = builder.toString();//转换成字符串
        System.out.println(line);
        /*
        改：replace，将当前字符串部分内容替换成为给定内容
        好好学习java，为了找一个好工作
        好好学习java，就是为了改变世界!
         */
        builder.replace(9, 16, "就是为了改变世界!");
        System.out.println(builder.toString());
        /*
        删：delete()，将当前字符串中的部分内容删除
        好好学习java，就是为了改变世界!
        ，就是为了改变世界!
         */
        builder.delete(0,8);
        System.out.println(builder.toString());
        /*
        插：insert()，将给定内容插入指定位置
        ，就是为了改变世界！
        活着，就是为了改变世界！
         */
        builder.insert(0,"活着");
        System.out.println(builder);
        /*
        StringBuilder修改字符串的性能问题
         */
        String s = "a";
        for(int i=0;i<1000000;i++){
            StringBuilder b = new StringBuilder(str);
            //b.append("a");//性能好非常快
            s +="a";//性能不好
        }
        System.out.println("程序结束");
    }
}




package object;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 测试Object中的常见方法
 */
public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        /*
        Object类定义的方法
        String toString()
        该方法的目的是将当前对象转换为一个字符串，默认返回的是当前对象的地址和信息，格式
        为：类名@地址
         */
        String str = point.toString();
        System.out.println(str);

        /*
        System.out.println(Object o);
        该方法是将给定的对象toString方法的返回值输出到控制台
         */
        System.out.println(point);//子类不能重写toString，输出的内容帮助不大
        /*
        任何内容与字符串相连，结果都是字符串
        当字符串与其他引用类型连接时，会将该引用类型toString的方法的返回值进行连接
         */
        String line = "point"+point;
        System.out.println(line);

        /*
        Object定义的另一个常用方法：
        boolean equals（Object o）
        用来比较当前对象（this）与给定的对想象o内容是否相同
        注意！如果子类不重写这个方法则没有实际价值，因为Object使用==比较的。
         */
        Point point2 = new Point(1,2);
        System.out.println(point==point2);
        System.out.println(point.equals(point2));
    }
}

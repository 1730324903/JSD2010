package Integer;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.function.DoubleBinaryOperator;

/**
 * 包装类的常用功能
 */
public class Demo2 {
    public static void main(String[] args) {
        //数字类型的包装类定义了两个常量MAX_VALUE和MIN_VALUE表示取值范围
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(lmax);
        System.out.println(lmin);

        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println(dmax);
        System.out.println(dmin);

        /*
        包装类提供了一个静态方法parseXXX可以将字母串解析对应的基本类型。
        前提是这个字符串得正确表示了基本类型可以保存得值，否则会抛出异常：
        NumberFormatExceptin
         */
        String line = "123";
        //String line = "123.123";
        int i = Integer.parseInt(line);
        System.out.println(i);
        double dou = Double.parseDouble(line);
        System.out.println(dou);
    }
}

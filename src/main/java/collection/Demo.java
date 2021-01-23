package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        String s = "hello";
        s="aasa";
        int a = 1;
        Point p = new Point(1,2);
        Collection c = new ArrayList();
        c.add(p);
        test(s,a,p,c);
        System.out.println("s:"+s);//?hello
        System.out.println("a:"+a);//?1
        System.out.println("p:"+p);//?(3,2)
        System.out.println("c:"+c);//?[(7,5)]
    }
    public static void test(String s,int a,Point p,Collection c) {
        a++;
        s = s + "world";
        p.setX(3);//3,2
        p = new Point(4,5);
        c.clear();//0
        c.add(p);//4,5
        c = new ArrayList();//0
        p.setX(7);//7,5
        c.add(p);//7.5
    }
}

package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection，代表的是可以方重复元素并且有序的集合。
 * List提供了一套可以通过下标操作元素的方法，使用更灵活。
 * List常用实现类：
 * java.util.ArrayList:内部使用数组实现，查询性能更好
 * java.util.LinkedList:内部使用链表实现，增删性能更好
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("there");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /*
        E get(int index)
        获取List集合中指定位置元素
         */
        String str = list.get(0);
        System.out.println(str);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
        E set(int index,E e)
        将给定下标设置到指定位置上，返回值为原位置元素（被替换的元素）
         */
        String old = list.set(3, "3");
        System.out.println(list);
        System.out.println(old);
        //Collections.reverse(list);
        //System.out.println(list);


        /*
        在不创建集合的前提下，反转集合元素
         */
        for (int i = 0; i < list.size()/2; i++) {
            String s = list.get(i);//获取正数位置的元素
            s = list.set(list.size()-1-i,s);//将正数位置上的元素设置到对应的倒数位置上
            list.set(i,s);//将倒数位置到正数位置上
        }
        System.out.println(list);

        //Collection是集合的工具，提供的静态方法reverse是反转集合操作
        Collections.reverse(list);
        System.out.println(list);
    }
}

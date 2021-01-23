package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换成List集合
 * 数组的工具类：java.util.Arrays提供了一个静态方法：asList，可以将一个数组转换为一个List
 * 集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","there","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        System.out.println("list:"+list);

        list.set(2,"3");
        System.out.println("list:"+list);
        /*
        通过数组转换来的集合，对该集合的操作就是对原数组的操作
         */
        System.out.println("array:"+Arrays.toString(array));

        /*
        由于数组是定长的，因此该集合会影响元素个数的操作都是不被支持的操作，调用后会
        抛出异常
         */
        //list.add("six");
        //System.out.println(list);
        /*
        若希望对集合做增删元素操作，则需要单独创建一个集合并包含数组转换而来的集合
        中所有元素即可
         */
        //List<String> list2 = new ArrayList<>();
        //list2.addAll(list);
        /*
        所有集合都支持一个参数位Collection的构造器方法，目的是创建当前集合同时
        包含给定集合中的所有元素
         */
        List<String> list2 = new ArrayList<>(list);
        System.out.println("list2:"+list2);
        list2.add("six");
        System.out.println("list2:"+list2);

    }
}

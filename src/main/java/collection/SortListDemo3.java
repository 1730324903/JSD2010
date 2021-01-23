package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");
        System.out.println(list);
        //Collections.sort(list);

        //按照数字排序
        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        System.out.println(list);
        //降序仅需要反过来减即可
        Collections.sort(list,(o1,o2)->o2.length()-o1.length());
        System.out.println(list);
    }
}

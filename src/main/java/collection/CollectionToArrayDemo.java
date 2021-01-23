package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换位数组
 *
 * Collection提供了一个方法，toArray，将当前集合转换为数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("there");
        c.add("four");
        c.add("five");
        System.out.println(c);

        //Object[] arr = c.toArray();
        String[] arr = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr));
    }
}

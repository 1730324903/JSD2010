package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合的某些操作时依靠元素的equals方法进行集合。
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        //Collection c = new ArrayList<>();
        Collection c = new HashSet();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        c.add(new Point(1,2));
        /*
        集合的toString方法在输出时，每个元素也是依靠元素的toString方法来表示内容
         */
        System.out.println(c);

        Point p = new Point(1,2);
//        c.add(p);
        /*
        boolean contains(Object o)
        判断当前集合是否包含给定元素
        判断是否包含依据是，当前集合是否存在与给定集合equals比较为true的元素
         */
        boolean contains = c.contains(p);
        System.out.println("包含："+contains);

        /*
        删除给定元素也是删除与给定元素equals比较为true的，对于List集合而言，重复元素
        只删除一次
         */
        c.remove(p);
        System.out.println(c);
    }
}

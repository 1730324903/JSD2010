package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 集合提供了统一的遍历元素方式，迭代器模式
 * Iterator iterator()
 * 该方法会返回一个迭代器，使用这个迭代器即可遍历当前集合元素。
 *
 * java.util.Iterator 接口：迭代器
 * 迭代器遍历结合遵循的方式为：问，取，删。（其中删除元素不是遍历过程中的必要操作）
 *
 * 不同集合都提供了用于遍历自身元素的迭代器实现类，我们无需知道它们的名字，只将它们以
 * Iterator的角度进行操作即可
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("there");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println("c:"+c);

        Iterator it = c.iterator();
        System.out.println(it);
        /*
        boolean hasNext()
        判断集合是否还有下一个元素可以获取，第一次调用时是判断是否有第一个元素，以此类推
        这个就是迭代器“问”的过程
         */
        while(it.hasNext()){
            /*
            E next()
            获取集合下一个元素
            这个就是迭代器“取”的过程
            */
            String str = (String)it.next();
            System.out.println(str);
            if("#".equals(str)){
                /*
                迭代器要求在遍历的过程中不能通过集合的方法删除元素，否则会抛出异常
                 */
//                c.remove(str);
                //迭代器提供了remove方法，删除的是通过next取出的元素
                it.remove();
            }
        }
        System.out.println(c);
    }
}

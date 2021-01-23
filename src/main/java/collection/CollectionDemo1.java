package collection;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合框架
 * java.util.Collection接口
 * Collection是所有集合的顶级接口，规定了所有集合的相关功能方法
 * 集合和数组一样，可以保存一组元素，但是将元素的相关操作都封装成了方法，并且有多种数据结构提供选择使用
 *
 * Collection下面有两个常见的子接口：
 * java.util.List:可重集合，并且有序
 *                java.util.ArrayList和LinkedList是常见的List集合实现类
 * java.util.set：不可重复集合。常用的实现类：HashSet
 * 这里判断元素是否重复是依靠元素本身equals比较的结果而定。Set集合不允许存在元素equals比较
 * 为true的情况
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        /*
        boolean add(E e)
        向当前集合中添加一个元素，该元素成功添加则返回true
         */
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        System.out.println(c);
        /*
        int size()
        返回当前集合的元素个数
         */
        int size = c.size();
        System.out.println("size:"+size);
        /*
        boolean isEmpty()
        判断当前集合是否为空集合，当前集合的size为0时，返回true
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集:"+isEmpty);

        c.clear();//清空
        System.out.println(c);
        System.out.println("size:"+c.size());
        System.out.println("是否为空集："+c.isEmpty());
    }
}

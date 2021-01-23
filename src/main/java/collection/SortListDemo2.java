package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(3,4));
        list.add(new Point(8,9));
        list.add(new Point(6,1));
        list.add(new Point(2,2));
        list.add(new Point(15,8));
        list.add(new Point(7,5));
        System.out.println(list);
        /*
        Collections.sort(List list)
        该方法在排序集合时要求集合元素必须实现了接口：Comparable，否则编译不通过，
        实现该接口就是重写比较方法从而确定同类型的对象之间的大小关系，sort方法就是
        利用元素自身提供的比较方法确定大小后进行自然排序的。
        对于不能直接使用这个sort方法时就是不要使用了，因为它对我们的代码将产生侵入性。
        侵入性：当我们调用某个方法的时，其要求我们为其修改其他额外代码就是侵入性。侵入性
        不利于程序后期的维护，应尽量避免。
         */
        //MyComparator c = new MyComparator()
        //Collections.sort(list,c);
        //Comparator<Point> c = new Comparator<Point>() {
        //    @Override
        //    public int compare(Point o1, Point o2) {
        //        int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
        //        int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
        //        return len1-len2;
        //    }
        //};
        //Collections.sort(list,c);

        //lambda表达式写法
        Collections.sort(list,(o1,o2)->
              o1.getX()*o1.getX()+o1.getY()*o1.getY()-o2.getX()*o2.getX()-o2.getY()*o2.getY()

        );
        System.out.println(list);
    }
}
//class MyComparator implements Comparator<Point>{
//    /**
//     * 该方法是用来定义o1与o2的大小关系
//     * @param o1
//     * @param o2
//     * @return 当返回值>0时  表示len1>len2
//     *         当返回值<0时  表示len1<len2
//     *         当返回值=0时  表示len1=len2
//     */
//    @Override
//    public int compare(Point o1, Point o2) {
//        int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//        int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//        return len1-len2;
//    }
//}

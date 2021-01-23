package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增强型for循环，又称为新循环，JDK5之后推出的特性，使得我们可以使用相同的语法遍历集合或数组
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","there","four","five"};
        for(int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }

        //新循环是编译器认可而非虚拟机，编译器会将代码改为普通for循环遍历数组
        for(String str : array){
            System.out.println(str);
        }
        /*
        JDK5之后还有一个特性：泛型，它被大量的应用于集合中，用来在使用集合时指定集合
        的元素类型.
        对于基本类型而言，要指定他的包装类。
         */
        //这里指定集合元素String类型
        Collection<String> c = new ArrayList<>();
        c.add("one");//add(E e)这里的E就相当于是String了，不能存放其他类型
        //c.add(123);//编译不通过！
        c.add("two");
        c.add("there");
        c.add("four");
        c.add("five");
        /*
        新循环遍历集合就是迭代器遍历，因此注意，不要在遍历的过程中使用集合的方法增删元素
         */
        for(String str : c){
            System.out.println(str);
        }
        //迭代器也支持泛型，指定时与遍历的集合指定指定的泛型一致即可
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String str = it.next();//获取元素后无需再造型
            System.out.println(str);
        }
    }
}

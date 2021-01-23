package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue 队列
 * Queue接口继承自Collection，所以也是集合的一个种子类分支。
 * Queue可以保存一组元素，但是存取元素必须遵循先进先出原则
 * 常用实现类：java.util.LinkedList
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String > queue = new LinkedList<>();
        //入队操作
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);
        //出对操作
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);
        //引用队首元素
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        //队列本身是一种集合，因此Collection中的方法都是可以使用的
        System.out.println("size:"+queue.size());
        System.out.println("isEmpty:"+queue.isEmpty());
        /*
        使用新循环（迭代器）遍历队列元素，元素仍然还在队列中
         */
        for(String s : queue){
            System.out.println(s);
        }
        System.out.println(queue);

        //使用poll方法遍历队列
        while (queue.size()>0){
            String s = queue.poll();
            System.out.println(s);
        }
        System.out.println(queue);

        //Iterator it = queue.iterator();
        //while (it.hasNext()){
        //    String str1 = queue.poll();
        //    //String str1 = queue.peek();
        //    //String str1 = (String) it.next();
        //    System.out.println(str1);
        //}
        //System.out.println(queue);

    }
}

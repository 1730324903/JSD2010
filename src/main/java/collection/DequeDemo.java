package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque  双端队列
 * Deque继承Queue，是对列两端都可以做出入队的队列
 * 常用实现类 java.util.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        System.out.println(deque);
        //从队首方向入队
        deque.offerFirst("four");
        System.out.println(deque);
        //从队尾方向入队，与offer一致
        deque.offerLast("five");
        System.out.println(deque);

        String str = deque.poll();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollFirst();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollLast();
        System.out.println(str);
        System.out.println(deque);
    }
}

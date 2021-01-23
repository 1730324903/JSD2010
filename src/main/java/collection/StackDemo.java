package collection;

import socket.Server;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 使用双端队列Deque，如果只从一侧做出入队列操作形成了栈结构
 * 栈存取元素遵循先进后出原则，并且双端队列提供了栈经典的出入栈方法：push，pop
 *
 * 通常实际开发中使用栈是为了实现"后退"这样的功能
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        //入栈操作
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);

        //出栈操作
        String str = stack.pop();
        System.out.println(str);
        System.out.println(stack);

        for(String str1:stack){
            System.out.println(str1);
        }
        System.out.println(stack);
        while (stack.size()>0){
            String str2 = stack.pop();
            System.out.println(str2);
        }
        System.out.println(stack);
    }
}

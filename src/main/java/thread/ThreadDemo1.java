package thread;

/**
 * 多线程
 *
 * 线程：一个单一的顺序执行流程。
 * 多线程：多个程序“同时”运行。
 *
 * 线程有两种创建方式，第一种：
 * 继承Thread并重写run方法
 */
public class ThreadDemo1{
    public static void main(String[] args) {
        Thread m1 = new MyThread01();
        Thread m2 = new MyThread02();
        /*
        启动启动该线程要调用start方法,调用后线程会纳入到线程调度器中统一调度.
        一旦该线程第一次获取CPU的时间时就会自动执行run方法.
        注意:不能主动调用run方法!
         */
        m1.start();
        m2.start();
    }

}

/**
 * 第一种创建线程的方式的有点机构简单，便于使用匿名内部类结构
 *
 * 但是也存在缺点：
 * 1：由于java是单继承的，这会导致如果继承了Thread就无法再继承其它类，通过我们继承某个类的目的
 * 是反复用方法，此时如果两者希望同时满足时会出现继承冲突的问题（不能同时继承Thread和其它类）
 * 2：定义线程的同时重写run方法来定义线程的任务，这会导致线程与线程的人物绑定在了一起，不利于
 * 线程的复用性
 */
class MyThread01 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你是谁");
        }
    }
}
class MyThread02 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("查水表");
        }
    }
}


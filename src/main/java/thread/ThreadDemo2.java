package thread;

/**
 * 第二种创建线程的方式：
 * 实现Runnable接口
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建线程任务
        Runnable m1 = new MyThread1();
        Runnable m2 = new MyThread2();
        //创建线程
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        //Thread.sleep(1000);
        t2.start();
    }
}
class MyThread1 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你是谁");

        }
    }
}
class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("查水表");
        }
    }
}

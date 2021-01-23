package thread;

/**
 * 互斥锁
 * 使用多个synchronized锁定多个不同的代码片段，但是它们指定的同步监视器对象是同一个，
 * 那些代码片段就是互斥的
 *
 * 互斥的代码片段是不能被多个线程同时执行的
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Boo b = new Boo();
        Thread t1 = new Thread(){
            public void run(){
                b.methodA();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                b.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}
class Boo{
    public synchronized void methodA() {
        synchronized (this) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行A方法");
                Thread.sleep(500000);
                System.out.println(t.getName() + "：正在执行结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void methodB(){

        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行B方法");
            Thread.sleep(5000);
            System.out.println(t.getName()+"：正在执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
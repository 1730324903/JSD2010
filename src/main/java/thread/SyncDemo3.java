package thread;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 静态方法上若是使用synchronized，那么该方法一定具有同步效果，
 * 静态方法指定的同步监听器对象为当前类的对象，后面学习反射的知识时会介绍对象。
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        //Foo f1 = new Foo();//不建议new对象来 .方法   直接用类名.方法
        //Foo f2 = new Foo();
        Thread t1 = new Thread(){
            public void run(){
                //f1.dosome();
                Foo.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                //f2.dosome();
                Foo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}
class Foo{
    //public synchronized static void dosome(){
    public static void dosome(){
        /*
        静态方法中如果使用同步块，那么指定的同步块监听器对象就是当前类的类对象即可
        获取类对象了可以直接用：类名.class即可
         */
        synchronized (Foo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行dosome方法");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行dosome方法完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package thread;

/**
 * java中所有的代码都是靠线程运行的，单独看每条线程的执行方式仍然是顺序执行的，但是多个这样的
 * 线程之间是并发运行的（感官上同时运行）。
 *
 * main方法也是靠一条线程运行的，通常我们称它为“主线程”。
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        //获取运行main方法的线程
        Thread main = Thread.currentThread();
        System.out.println("运行main方法的线程是："+main);
        Thread t = new Thread(){
          public void run(){
              Thread T = Thread.currentThread();//自定义的线程t
              System.out.println("自定义线程"+T);
              dosome();
              System.out.println(T+"自定义线程执行完毕");
          }
        };
        t.start();//当t线程启动后，该线程中run方法的代码和main方法后续代码就是并发运行了

        dosome();//主线程开始执行dosom方法
        System.out.println(main+"执行后续的语句...");
    }
    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("运行dosome方法的线程是："+t);
    }
}

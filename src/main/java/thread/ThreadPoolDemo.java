package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要解决两个问题
 * 1:重用线程
 * 2:控制线程数量
 *
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //1创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        //2指派任务
        for(int i=0;i<5;i++){
            Runnable r = new Runnable(){
                @Override
                public void run() {
                    try {
                        Thread t = Thread.currentThread();
                        System.out.println(t+"正在执行任务...");
                        Thread.sleep(5000);
                        System.out.println(t+"线程执行完毕");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            threadPool.execute(r);
            System.out.println("指派了一个任务在线程池中");
        }
        //threadPool.shutdown();
        //threadPool.shutdownNow();
        System.out.println("线程池停止了");
    }
}

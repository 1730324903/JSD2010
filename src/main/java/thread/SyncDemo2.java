package thread;

/**
 * 同步块
 * 语法：
 * synchronized(同步监听对象){
 *     需要多线程同步执行的代码片段
 * }
 *
 * 同步块可以更准确的锁定需要排队的代码片段。有效的缩小同步范围可以在保证并发安全的前提下
 * 提高并发率
 */
public class SyncDemo2 {
    public static void main(String[] args) {
         Shop shop = new Shop();
        Thread t1 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    /*
    在方法上使用synchronized，那么同步监听对象是不可取代
     */
    //public synchronized void buy(){
    public  void buy(){
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName()+":正在挑衣服");
            Thread.sleep(500);

        /*
         *使用同步块时，需要指定同步监听器对象，这个对象可以时java中任何类的实例
         * 只要保证多个需要排队执行该同步块的多个襄城看到这个对象是“同一个”即可！
         */

            synchronized (this) {
            //synchronized(new Object){   //多个线程看到的不是同一个锁对象，则无效
                System.out.println(t.getName() + "：正在试衣服");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+"：结帐了");
    }
}


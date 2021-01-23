package thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一个临界资源，由于线程切换世界不确定，导致操作顺序出现混乱并影响操作结果，
 * 严重时会导致系统瘫痪。
 * 临界资源：操作该资源的完整过程同一时间只能被一个线程进行的。
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    private int beans = 20;//桌子上有20个豆子

    /**
     * 当一个方法使用关键字：synchronized修饰词后，这个方法称为同步方法，多个线程不能同时在
     * 该方法内部执行，将异步操作临界资源改为同步操作可以解决多线程并发安全问题
     */
    public synchronized int getBeans(){
        if(beans==0){
            throw new RuntimeException("没有豆子了");
        }
        Thread.yield();
        return beans--;
    }
}

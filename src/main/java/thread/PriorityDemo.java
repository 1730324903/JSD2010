package thread;

/**
 * 线程的优先级
 *
 * 当线程调用start方法后，该线程即纳入到线程调度器中被其统一管理，线程调度器会尽可能均匀的将
 * CPU时间片分配给每个线程，使得线程并发运行
 * 但是线程不能索取CPU时间，只能被动的被分配。
 * 调整线程的优先级可以最大程度的改善获取CPU时间片的机率，原则上优先级越高的线程索取CPU时间片
 * 的次数越多
 * 线程的优先级有10个等级，分别用整数1-10表示，其中1为最低优先级，10为最高优先级，5为默认值。
 *
 * 由于现在的CPU是多核心，处在不同核心上的线程之间的优先级是没有该效果的。
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
          public void run(){
              for(int i=0;i<10000;i++) {
                  System.out.println("max");
              }
          }
        };
            Thread min = new Thread(){
                public void run(){
                    for(int i=0;i<10000;i++) {
                        System.out.println("min");
                    }
                }
            };
        Thread norm = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++) {
                    System.out.println("nor");
                }
            }
        };
        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        min.start();
        max.start();
        norm.start();
    }
}

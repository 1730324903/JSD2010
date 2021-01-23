package thread;

/**
 * sleep方法要求我么你必须处理中断异常。
 * 当一个线程调用噶爱方法处于睡眠状态阻塞的过程中，它们的interrupt()方法被调用，那么此时会中断它的
 * 睡眠阻塞，这时sleep方法就会抛出异常
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林：刚美完容，谁一会");
                try {
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    System.err.println("林：干麻那！");
                }
                System.err.println("林：醒了");
            }
        };
        Thread huang = new Thread(){
            public void run(){
                System.out.println("大锤80，小锤40");
                for (int i=0;i<5;i++) {
                    System.out.println("80");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("咣当");
                System.out.println("黄：大哥，搞定");
                lin.interrupt();//中断lin的sleep阻塞
            }
        };
        lin.start();
        huang.start();
    }
}

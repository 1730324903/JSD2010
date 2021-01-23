package thread;

/**
 * 使用匿名内部类创建线程
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //第一种创建线程方式
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    System.out.println("你找谁");
                }
            }
        };

        //Thread t3 = new Thread(new Runnable() {
        //    @Override
        //    public void run() {
        //        for (int i=0;i<1000;i++){
        //            System.out.println("你找谁");
        //        }
        //    }
        //});

        //第二种创建线程的方式
        Runnable r2 = () -> {
            for(int i=0;i<1000;i++){
                System.out.println("查水表");
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

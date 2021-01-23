package thread;

import java.util.Scanner;

/**
 * sleep阻塞
 *
 * 线程提供了一个静态方法
 * static void sleep(long ms);
 * 该方法可以让执行这个方法的线程阻塞指定毫秒
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        /**
         * 完成倒计时程序
         * 程序启动后要求用户输入一个数字，然后从该数字开始每秒递减并输出，
         * 到0时输出时间到了，然后程序终止
         */
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输出数字");
            int num = scan.nextInt();
           while (num!=0){
               num--;
               Thread.sleep(1000);//延迟一秒
               System.out.println(num);
               if(num==0){
                   System.out.println("程序终止了");
                   break;
               }
           }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("程序结束了");
    }
}

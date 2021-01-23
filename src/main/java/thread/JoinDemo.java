package thread;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * join方法可以协调线程之间的同步运算。
 *
 * 同步运算和异步运算是多线程执行的两种方式
 * 同步运算：线程之间的执行存在先后顺序有序进行
 * 异步运算：线程之间各干各的
 * 多线程运算本身就是异步运行的，但是在某些业务中我们需要协调线程之间的同步运算，此时就可以
 * 使用join来完成
 */
public class JoinDemo {
    static boolean isFinish = false;//表示图片是否下载

    public static void main(String[] args) {
        /*
        java有一个语法要求：当一个方法在局部内部类中若使用到了这个方法中的其他局部变量
        时，这个变量必须时final的（JDK8之后，可以不显示的声明为final，但是仍然是final）
         */
        //boolean isFinish = false;
        Thread download = new Thread(){
            public void run(){
                System.out.println("down:开始显示下载图片...");
                for(int i=0;i<100;i++){
                    System.out.println("down："+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("图片下载完成");
                isFinish = true;
            }
        };
        Thread show = new Thread(){
            public void run(){
                System.out.println("开始显示文字");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("show:显示文字完毕");

                //这里在显示图片前应当等待download线程执行完毕（图片下载完毕）
                System.out.println("show:等待download工作...");
                try {
                    download.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("show:等待完毕！继续后续操作");

                System.out.println("show:开始显示图片...");
                if(!isFinish){
                    throw new RuntimeException("图片加载失败");
                }
                System.out.println("图片显示完毕");
            }
        };
        download.start();
        show.start();
    }
}

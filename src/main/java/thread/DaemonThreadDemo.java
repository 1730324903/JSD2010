package thread;

/**
 * 守护线程
 * 守护线程是通过普通线程调用setDaemon(true)设置而来，因此创建和使用与普通线程并无区别，
 * 但是有一点是不同的：进程的结束
 *
 * java进程结束：当进程中所有的普通线程都结束时，java进程就会结束（jvm结束），因此会强制杀死
 * 所有正在运行的守护线程。
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:let me go");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊啊啊啊啊啊啊");
                System.out.println("扑通");
            }
        };
        Thread jack = new Thread(){
            public void run(){
                while (true){
                    System.out.println("jack：your jump!i jump");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        rose.start();
        /*
        设置守护线程必须在该线程启动前进行！
         */
        jack.setDaemon(true);
        jack.start();
        System.out.println("main方法执行完了");
    }
}

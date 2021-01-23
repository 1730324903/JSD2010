package thread;

/**
 * 线程提供了一套获取其在身信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        //获取线程名字
        String name = main.getName();
        System.out.println("name:"+name);

        //获取线程的唯一标识
        long id = main.getId();
        System.out.println("id:"+id);

        //获取线程的优先级
        int priority = main.getPriority();
        System.out.println("优先级："+priority);

        //查看线程是否是活着
        boolean isAlive = main.isAlive();
        //查看线程是否为守护线程
        boolean isDaemon = main.isDaemon();
        //查看线程是否被打断
        boolean isInterrupted = main.isInterrupted();
        System.out.println("isAlive:"+isAlive);
        System.out.println("isDaemon:"+isDaemon);
        System.out.println("isInterrupted:"+isInterrupted);
    }
}

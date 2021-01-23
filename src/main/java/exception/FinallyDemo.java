package exception;

/**
 * finally块
 * finally块是异常处理机制的最后一块，他可以直接跟在try之后，或者最后一个catch之后
 * finally块可以保证：只是一个程序值执行到try语句块中，无论是否抛出异常，finally块都必定执行！
 *
 * 因此我们可以将无论程序是否报错，都要执行的代码放在这里确保会运行，比如IO操作的close。
 * finally通常就是用在时方资源这类操作上使用的
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了！" );
        try{
            String str = "null";
            System.out.println(str.length());
            return;
        }catch(Exception e){
            System.out.println("出错了！");
        }finally {
            System.out.println("finally中代码执行了!");
        }

        System.out.println("程序结束了！");
    }
}

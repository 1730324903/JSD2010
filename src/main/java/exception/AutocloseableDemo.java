package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后，推出一个新的特性：自动关闭
 * 可以用更精简的代码完成繁琐的异常处理机制中IO关闭工作
 */
public class AutocloseableDemo {
    public static void main(String[] args) {
        /*
        只有实现了Autocloseable接口的类才可以在try后面的()中定义并初始化。
        java IO中的流，RandomAccessFile都实现了这个接口

        注意一点，这个语法是java编译器认可的，并且编译后编译器会将代码改成如
        FinallyDemo2案例的样子
         */
        try(
                FileOutputStream fos = new FileOutputStream("fos.dat");
        ){

            fos.write(1);
        }catch(IOException e){
            System.out.println("出错了！");
        }

    }
}

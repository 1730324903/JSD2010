package file;

import java.io.File;
import java.io.FileFilter;

/**
 * lambda表达式
 * JDK8之后，java支持使用lambda表达式
 * 语法：
 * (参数列表)->{
 *    方法体
 * }
 * 可以使用lambda表达式创建匿名内部类，但那时实现的接口只能有一个抽象方法时才可以使用！！
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        FileFilter filter = new FileFilter() {
            public boolean accept(File file){
                return file.getName().endsWith(".xml");
            }
        };
        //lambda表达式（实现的接口名，方法名，方法的参数类型都不用重写）
        FileFilter filter1 = (file)->{
            return file.getName().endsWith(".xml");
        };
        /*
        如果方法中只有一句代码，那么这个方法体的“{}”可以忽略不写，如果这句话有return
        关键字，那么这个关键字也要一同被忽略。
         */
        FileFilter filter2 = (file)->file.getName().endsWith(".xml");
                           //这个小括号也能去掉
    }

}

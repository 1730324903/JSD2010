package file;

import java.io.File;

/**
 * java.io.File;
 * File的每个实力可以表示键盘上的一个文件和目录
 * 使用File可以
 * 1.访问该文件或目录的属性信息（名字，大小等）
 * 2.创建，删除文件或目录
 * 3.访问一个目录中的所有子项
 *
 * 但是不能访问文件数据
 */
public class FileDemo {
    public static void main(String[] args) {
        /*
        创建File是需要指定文件或目录的路径，这个是路径通常使用的相对路径，这样才能做到更好
        的跨平台性
        “./”是常用的相对路径，表示“当前目录”，当前目录具体是那里要视当前程序的运行环境而定
        我们idea中运行环境，当前程序所在的项目目录
         */
        File file = new File("./demo.txt");
        String name = file.getName();
        System.out.println(name);

        long length = file.length();
        System.out.println("大小："+length+"字节");

        //可读
        boolean cr = file.canRead();
        //可写
        boolean cw = file.canWrite();
        System.out.println("可写："+cr);
        System.out.println("可读:"+cw);
        //是否隐藏
        boolean isHidden = file.isHidden();
        System.out.println("是否隐藏:"+isHidden);
    }
}

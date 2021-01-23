package file;

import java.io.File;

/**
 * 创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新创建一个目录
        File dir = new File("demo");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else{
            dir.mkdir();
            System.out.println("该目录已创建");
        }

    }
}

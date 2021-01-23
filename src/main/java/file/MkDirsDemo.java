package file;

import java.io.File;

/**
 * 创建多级目录
 */
public class MkDirsDemo {
    public static void main(String[] args) {
        //在当前目录下创建目录a/b/c/d/f
        File dir = new File("./a/b/c/d/f");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else{
            dir.mkdirs();
            System.out.println("目录已经创建");
        }
    }
}

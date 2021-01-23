package file;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("a/b/c/d");
        if(dir.exists()){
            dir.delete();//删除目录的前提是这个目录必须是一个空目录
            System.out.println("目录以删除");
        }else{
            System.out.println("目录不存在");
        }
    }
}

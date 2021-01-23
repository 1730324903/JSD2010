package file;

import java.io.File;

/**
 * 获取一个目录的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        /*
        boolean isFile()
        判断当前File表示的文件

        boolean isDirectory()
        判断当前File表示的是一个目录
         */
        if(dir.isDirectory()){
            /*

             */
            File[] subs = dir.listFiles();
            System.out.println("当前目录有"+subs.length+"个子目录");
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}

package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 有条件的获取一个目录的子项
 * 重载的方法：
 * File[] listFiler(FileFilter filter)
 * 获取当前File表示的目录满足给定过滤器要求的所有项目
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            /*
            仅获取所有的.xml文件
             */
             // FileFilter filter = new FileFilter() {
                /*
                实现文件过滤器接口就必须重写accept方法，该方法是定义规律规则，
                当给定的file符合过滤要求时，方法应当返回true
                 */
                //    public boolean accept(File file){
                //        String name = file.getName();
                //        boolean ends = name.endsWith(".xml");
                //        return  ends;//
                //    }
                //};
                //File[] subs = dir.listFiles(filter);
                File[] subs = dir.listFiles(new FileFilter() {
                    public boolean accept(File file) {
                        String name = file.getName();
                        boolean ends = name.endsWith(".xml");
                        return ends;
                }
            });
            System.out.println(subs.length);
            for(int i = 0;i<subs.length;i++){
                System.out.println(subs[i].length());
                }

            }
        }

}

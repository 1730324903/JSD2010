package file;

import java.io.File;

/**
 * 删除文件
 */
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除！");

        }else{
            System.out.println("文件不存在");
        }
    }
}

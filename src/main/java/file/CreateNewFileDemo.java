package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File新建文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个名为test.txt的文件
        File file = new File("./test.txt");
        /*
        boolean exists()
        判断当前File表示的文件或目录是否已经存在
         */
        if(file.exists()){
            System.out.println("该文件已存在！");
        }else{
            //创建当前文件file表示得的文件
            file.createNewFile();
            System.out.println("该文件已创建");
            boolean isHidden = file.isHidden();
            System.out.println("创建");
        }
    }
}

package file;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建100个文件，名字分别为test1，test2.......test100
        for (int i = 1; i <= 100; i++) {
            File file = new File("./test" + i + ".txt");
            if (file.exists()) {
                System.out.println("该文件已存在！");
            } else {
                //创建当前文件file表示得的文件
                file.createNewFile();
                System.out.println("该文件已创建");
                boolean isHidden = file.isHidden();
                System.out.println("创建");
            }
        }
    }
}

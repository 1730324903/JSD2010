package reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Student {
    String name;
    int age;

    public void say() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("name.txt");

    }
}

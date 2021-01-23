package io;

import java.io.*;

/**
 * 对象的字节输入流
 */
public class OISDemo {
    public static void main(String[] args) throws Exception{
        /*
        读取person.obj文件，将里面的数据还原为Person对象
         */
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);


        /*
        readObject方法可能抛出异常：ClassNotFoundException
        这是因为该方法要求读取的字节必须是通过对象流将一个
         */
        Person p = (Person)ois.readObject();
        System.out.println(p);

        //ois.close();
    }
}

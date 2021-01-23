package io;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;

/**
 * 对象流：java.io.ObjectInputStream和ObjectOutputStream
 * 对象流也是一对高级流，使用它们可以方便的读写java中任意类型的实例，因为它们会将对象与字节
 * 之间进行转换
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        将一个Person实例写入文件person.obj中
         */
        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"sss","aaa","www"};
        Person p = new Person(name,age,gender,otherInfo);

        FileOutputStream fos = new FileOutputStream("person.obj",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
        对象输出流的写出对象方法：writeObject要求写出的对象所属的类必须实现可序化接口
        否则会抛出异常：java.io.NotSerializableException

        序列化：将一个对象按照其结构转化为一组字节的过程
        持续化：将数据写入磁盘做长久保存的过程
         */
        oos.writeObject(p);
        System.out.println("写出完毕");
        oos.close();
    }
}

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        Person p=new Person();
        System.out.println(p.toString());
        ArrayList<Person> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("输入名字");
            String line = sca.nextLine();
            //p.setName(line);
            list.add(p);
        }
        System.out.println(list);
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println(list);
    }
}
class Person{
     private String name;
     private Integer A;
    private Integer A1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", A=" + A +
                ", A1=" + A1 +
                '}';
    }
}
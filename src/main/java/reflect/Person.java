package reflect;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 使用当前类测试反射
 */
public class Person {
    private String name;
    private int age;

    public Person(){
        name = "张三";
        age = 20;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println(name+"hello");
    }
    public void sayHi(){
        System.out.println(name+"hi");
    }
    public void say(String info){
        System.out.println(name+":"+info);
    }
    public void say(String info,int sum){
        for (int i=0;i<sum;i++){
            System.out.println(name+":"+info);
        }
    }
    private void hehe(){
        System.out.println("我是Person私有方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package string;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * String是一个不变对象，即：String对象创建后内容不可改变，改变内容一定创建新对象
 * 这是因为java对字符串的一个优化导致的--字符串的常量池
 * java推荐我们使用字面常量（直接量）形式常见字符串，并且使用这种方式创建字符串时会缓解
 * 字符对象的常量池中（java在堆内存在开辟了一个空间专门缓解这些字符串）这样当我们再次使用
 * 该字面创建字符串时会重用对象来减少内存开销，避免内存中堆积大量的内存一样的字符串对象
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = "123abc";
        System.out.println(s1==s2);//true
        String s3= s1+"jnn";
        System.out.println("s1:"+s1);
        System.out.println("s2"+s2);
        System.out.println(s3==s2);//false
        /*
        这里有一个编译器的小特征：
        编译器在编译源代码时如果发现一个计算鞭打士在编译期间就可以确定结果时就会进行计算
        并将结果编译到class文件中，例如下面代码会编译器改为：
        String s4 = “123abc”；
         */
        String s4 = "123"+"abc";
        System.out.println("s4"+s4);
        System.out.println(s2==s2);//true

        String s = "123";
        String s5 = s+"abc";//拼接内容会创建新对象
        System.out.println("s5:"+s5);
        System.out.println(s2==s5);//false
        /*
        对于引用类型而言，由于变量本身的存在的值是对象在堆里面的地址，因此
        == 在比较时含义为比阿减的两个地址是否相同，值的是比较是否指向同一个对象
        equals是比较对象的内容是否相同，而并不关心是否为同一个对象，对于字符串而言们通常我们
        都是equals进行比较
         */
        System.out.println(s2.equals(s5));
    }
}

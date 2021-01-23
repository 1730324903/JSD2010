package exception;

/**
 * 异常抛出
 *
 * throw关键字可以让程序主动对外抛出一个异常
 * 通过以下情况我们会主动对外抛出异常
 * 1.当程序遇到异常，但是这个异常不应该在当前代码片段中被解决，可以对外抛出。
 * 2.程序已到一个满足语法但是不满足业务问题情况时可以主动对外抛出异常，告知这样做不合理
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //满足语法，但时不满足业务需求
        try {
            /*
            当我们调用一个含有throws声明异常抛出的方法时，编译器要求我们必须处理这个异常，处理的
            方式有两种：
            1：使用try-catch捕获并处理这个异常
            2：在当前方法上继续使用throws声明这个异常的抛出具体使用的哪种取决于异常处理的责任问题
            但永远不应当在main方法上写throws
             */
            p.setAge(1000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("今年："+p.getAge()+"岁");
    }
}

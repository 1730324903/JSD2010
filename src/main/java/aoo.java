public class aoo {
    public static void main(String[] args) {
        boo b=new boo() {
            public void say() {
                System.out.println("sss");
            }
        };
        b.say();
    }
}
abstract class boo{
    private static final int a=4;
    private int b=4;
    public abstract void say();
    }
    interface coo{
        static final int a=4;
    }

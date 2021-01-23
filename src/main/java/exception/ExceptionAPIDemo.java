package exception;

/**
 * 异常常见的方法
 */
public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "a";
            System.out.println(Integer.parseInt(str));

        }catch (Exception e){
            //输出错误的堆栈信息，便于Debug
            e.printStackTrace();
            //获取错误信息，通常用于给用户提示使用
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("程序结束了");
    }
}

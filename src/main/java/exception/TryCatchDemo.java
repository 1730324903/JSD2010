package exception;

/**
 * 异常处理机制中的try—catch
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了.....");
        try {
            //String str = null;
            //String str = "";
            String str = "a";
            System.out.println(str.length());

            System.out.println(str.charAt(0));

            System.out.println(Integer.parseInt(str));
            //try语句块中报错代码以下内容都不会执行！
            System.out.println("!!!!!!!!");
        }catch(NullPointerException e){
            System.out.println("出现了空指针");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了字符串下标越界！");
        }catch(Exception e){
            System.out.println("反正就是出了个错");
        }

        System.out.println("程序结束了.....");
    }
}

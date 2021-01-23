package exception;

/**
 * 异常常见面试题
 * 请分别说明final，finally，finalize
 *
 * finalize是Object中定义的方法，当一个对象即将被GC释放时，GC会调用该方法，一旦方法被调用
 * 完毕，这个对象即被释放。注意：这个方法中不应该有耗时得操作
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(test("0")+","+test(null)+","+test(""));
    }
    public static int test(String str){
        try{
            return '0'-str.charAt(0);
        }catch (NullPointerException e){
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}


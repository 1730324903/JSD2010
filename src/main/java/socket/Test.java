package socket;

import java.util.Arrays;

/**
 * 测试从数组中删除执行元素
 */
public class Test {
    public static void main(String[] args) {
        int[] allOut = {3,4,5,7,9,23,65,987,123,656,3421,32,44,789};
        int pw = 987;
        System.out.println(Arrays.toString(allOut));
        //将pw的值从数组allOut中删除
        for(int i=0;i<allOut.length;i++){
            if(allOut[i]==pw){
                allOut[i]=allOut[allOut.length-1];
                break;
            }
        }
        allOut = Arrays.copyOf(allOut,allOut.length-1);
        System.out.println(Arrays.toString(allOut));
    }
}

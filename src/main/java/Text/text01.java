package Text;

import java.util.Arrays;

public class text01 {
    public static void main(String[] args) {
        int[] a ={1,35,29,28,158,65,58,485,5978,58,62,48,48,258,485,588,6998,58,585,48,55};
        //9,10,12,35
        //for (int i = 0; i < a.length-1 ; i++) {//循环找最大值或最小值
        //    for (int j = 0; j < a.length-1; j++) {//1 a[2]>a[2+1]//循环判断值
        //        if(a[j]>a[j+1]){
        //            int x =  a[j];//x=12
        //            a[j] = a[j+1];//a[0]=10
        //            a[j+1] = x; //a[j+1]=12
        //        }
        //
        //    }
        //Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        for (int i=0; i<3;i++)
            for (int j=0;j<i;j++)
                System.out.println(i +j);
    }
}

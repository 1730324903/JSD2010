package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List sublist(int start,int end)
 * 获取当前集合中指定范围内的子集(含头不含尾)
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        List<Integer> sublist = list.subList(3,8);
        System.out.println(sublist);

        //将子集每个元素扩大10倍
        for(int i=0;i<sublist.size();i++){
            int num = sublist.get(i);//Integer
            num = sublist.set(sublist.size()-1-i,num);
            num = num*10;
            sublist.set(i,num);
        }
        System.out.println(sublist);
        ////对子集的操作就是对原集合对应的操作
        //System.out.println(sublist);
        ////删除集合中2-8这部分
        //List<Integer> sublist1 = list.subList(2,9);
        //System.out.println(sublist1);
        //sublist1.clear();
        //System.out.println(list);
    }
}

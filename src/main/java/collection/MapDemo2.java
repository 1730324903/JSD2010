package collection;

import java.security.Key;
import java.util.*;

/**
 * Map的遍历
 * Map提供了三种遍历方式：
 * 1.遍历所有的key
 * 2.遍历每一组键值对
 * 3.遍历所有的value(相对不常用)
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",98);
        map.put("数学",97);
        map.put("英语",96);
        map.put("物理",96);
        map.put("化学",98);
        System.out.println(map);
        /*
        遍历所有的key
        Set.keySet()
        将当前Map中所有的key以一个Set集合形式返回。
         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();//迭代器
        while (iterator.hasNext()){//判断下一个是否有元素
            Map.Entry<String, Integer> next = iterator.next();//将有的元素取出
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+":"+value);

        }
        for (Map.Entry<String,Integer> e : entrySet) {
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }
        /*
        Collection values()
        将当前Map中所有的value以一个集合的形式返回
         */
        Collection<Integer> values = map.values();
        for(Integer value : values){
            System.out.println("value:"+value);
        }
        Collection<Integer> a = map.values();
        Iterator<Integer> b = a.iterator();
        while (b.hasNext()){
            Integer next = b.next();
            System.out.println(next);
        }
        Set<Map.Entry<String,Integer>> a1 = map.entrySet();
        Iterator<Map.Entry<String,Integer>> b1 = a1.iterator();
        while (b1.hasNext()){
            Map.Entry<String,Integer> c1 = b1.next();
            String k = c1.getKey();
            Integer v = c1.getValue();
            System.out.println(k+":"+v);
        }
        Set<String> k1 = map.keySet();
        Iterator<String> b4 = k1.iterator();
        while (b.hasNext()){
            String K2 = b4.next();

            System.out.println(K2);
        }
    }
}

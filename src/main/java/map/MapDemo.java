package map;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map体现的结构是一个多行两列的表格，其中左列称为key，右列称为value
 * Map总是根据key的值获取它对应的value的值
 *
 * Map是一个接口，规定了Map的相关操作方法
 * 常用实现类：java.util.HashMap，俗称：散列表，哈希表
 * HashMap是使用散列算法实现的Map，当今查询速度最快的数据结构。
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        /*
        V put(K k,V v)
        将一组键值对存入到Map中
        Map要求key不允许重复，如果使用重复的key存value，则是替换value操作，那么返回值
        就是被替换掉的value。否则返回值为null。
         */
        Integer value = map.put("语文",99);
        System.out.println(value);//null
        map.put("语文",99);
        map.put("数学",95);
        map.put("英语",98);
        map.put("化学",97);
        map.put("物理",96);
        System.out.println(map);
        //替换原来“语文”的值98并将这个值返回
        value = map.put("语文",77);
        System.out.println(map);
        System.out.println(value);
        System.out.println(value);
        /*
        V get(Object key)
        根据给定的key获取对应的value，如果给定的key不存在则返回null
         */
        value = map.get("数学");
        System.out.println("数学:"+value);
        value = map.get("体育");
        System.out.println("体育"+value);

        //每组键对算一个元素
        int size = map.size();
        System.out.println("size:"+size);
        /*
        V remove(Object key)
        删除给定的key所对应的键值对，返回值为这个key对应的value
         */
        value = map.remove("化学");
        System.out.println(map);
        System.out.println(value);

    }
}

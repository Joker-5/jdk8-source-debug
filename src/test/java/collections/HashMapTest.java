package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // 1.默认构造器分析
        HashMap<Integer, Integer> map = new HashMap<>();
        // 2.含参构造器分析
        HashMap<Integer, Integer> map1 = new HashMap<>(10, 0.50f);
        // 3.含map参构造器分析
        HashMap<Integer, Integer> map2 = new HashMap<>(map1);
        // 4.put方法分析
        map.put(1, 1);
        // 5.get方法分析
        Integer v = map.get(1);
        // 6.remove方法分析
        map.remove(1);
        // 7.containsKey方法解析
        boolean b = map.containsKey(1);
    }
}

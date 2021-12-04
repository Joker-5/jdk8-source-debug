package juc;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        // 1.构造器分析
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        // 2.put方法分析
        map.put(1, 1);
        // 3.putAll方法分析
        map.putAll(Arrays.stream((new int[]{1, 2, 3})).boxed().collect(Collectors.toMap(Object::hashCode, Object::hashCode)));
        // 4.get方法分析
        int i = map.get(1);
    }
}

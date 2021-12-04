package juc;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        // 1.构造器分析
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        // 2.put方法分析
        map.put(1, 1);
    }
}

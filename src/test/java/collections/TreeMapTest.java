package collections;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        // 1.构造器解析
        TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2) -> o1 - o2);
        // 2.put方法解析
        map.put(1, 1);
    }
}

package collections;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        // 1.构造器解析
        TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2) -> o1 - o2);
        // 2.put方法解析
        map.put(1, 1);
        // 3.get方法解析
        map.get(1);
        // TreeMap要是get一个null会直接抛异常
//        map.get(null);
    }
}

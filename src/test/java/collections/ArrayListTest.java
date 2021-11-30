package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        // 1.含参构造器分析
        ArrayList<Integer> list = new ArrayList<>(10);
        // 2.add方法分析
        list.add(1);
        // 3.指定idx的add方法分析
        list.add(1, 11);
        // 4.toArray方法分析
        Object[] array = list.toArray();
        // 5.ensureCapacity方法分析
        list.ensureCapacity(80);
    }
}

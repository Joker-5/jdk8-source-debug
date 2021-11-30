package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        // 1. 有参构造器分析
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        // 2. 默认add方法分析
        linkedList.add(1);
        // 3. 指定idx的add方法分析
        linkedList.add(0,1);
        // 4.addFirst方法分析
        linkedList.addFirst(24);
        // 5.默认addAll方法分析
        linkedList.addAll(list);
        // 6.remove方法分析
        linkedList.remove(2);
    }
}

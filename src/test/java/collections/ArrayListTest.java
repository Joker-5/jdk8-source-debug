package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1, 11);
        Object[] array = list.toArray();
        Arrays.stream(array).forEach(e -> System.out.println(e));
        System.out.println(list.size());
    }
}

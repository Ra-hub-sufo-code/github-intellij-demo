package Sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(9);
        list.add(8);
        list.add(239);
        list.add(769);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}

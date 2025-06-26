package SetDemo;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        //TreeSet is arranged the element in sorted way
        for (int i=110; i<=117;i++) {
            set.add(i);
        }
        System.out.println(set);

    }
}

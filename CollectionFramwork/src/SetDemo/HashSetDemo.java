package SetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //insertion order not preserve index wise
        //random access not allow here
        //duplicate not allow
        set.add(67);
        set.add(607);
        set.add(617);
        set.add(627);

        System.out.println(set);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
                System.out.println(it.next());
        }

        System.out.println(set);
        Iterator<Integer> it2 = set.iterator();
        System.out.println("Remove element...");
        while (it2.hasNext()) {
            Integer num = it2.next();
            if ( num >= 607) {
                it2.remove();
                System.out.println("Remove element above the 607 ");
            }
            else {
                System.out.println(num);
            }
        }
    }
}

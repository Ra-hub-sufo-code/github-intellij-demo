package Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Long> vec = new Vector<>();
        vec.add(69907L);
        vec.add(69877L);
        vec.add(66787L);
        vec.add(35577L);
        vec.add(75377L);
        System.out.println("Vector element : "+vec);
        System.out.println(vec.get(3));
        if (vec.isEmpty()) {
            System.out.println("Vector is empty");
        }
        else {
            System.out.println("Vector is not empty");
        }

        vec.clear();
        System.out.println("Vector element : "+vec);
        if (vec.isEmpty()) {
            System.out.println("Vector is empty");
        }
        else {
            System.out.println("Vector is not empty");
        }
    }
}

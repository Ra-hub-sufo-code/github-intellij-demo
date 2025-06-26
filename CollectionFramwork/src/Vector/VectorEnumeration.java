package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
    public static void main(String[] args) {
        Vector<Double> vec = new Vector<>();
        Enumeration<Double> enu = vec.elements();

        vec.add(6778.8);
        vec.add(6712.8);
        vec.add(6745.8);
        vec.add(677.8);
        vec.add(6217.8);

        //traversing in vector
        // once traverse in vector with help of same enumeration
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }

        Enumeration<Double> e2 = vec.elements();

        //delete the specific element from the vector
        while (e2.hasMoreElements()) {
            double dou = e2.nextElement();
            if (dou==677.8) {
                vec.remove(dou); // remove element from vector
                System.out.println("Removing : "+dou);
            }
            else {
                System.out.println(dou);
            }
        }
        System.out.println(vec);
    }
}

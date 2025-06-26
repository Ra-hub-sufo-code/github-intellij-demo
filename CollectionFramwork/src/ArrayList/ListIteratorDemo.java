package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(Arrays.asList("Raushan","java","Rahul"));
        ListIterator<String> it = data.listIterator();
        // listIterator only fetch list element

        System.out.println("Forward direction");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //when are you traversing on list with help of iterator many times,you can use element again
        System.out.println("Backward direction");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println(data);
    }
}

package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class StringLinkedList {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Raushan");
        str.add("Abhishek");
        str.add("Beauty");
        str.add("Bipin");

        //fetch
        System.out.println(str.getFirst());
        System.out.println(str.getLast());

        ListIterator<String> it = str.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

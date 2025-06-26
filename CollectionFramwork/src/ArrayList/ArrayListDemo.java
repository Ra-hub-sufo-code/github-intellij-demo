package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // insertion order preserve
        // random access allow by index wise
        // duplicate allow
        List<Integer> nums = new ArrayList<>();
        nums.add(78);
        nums.add(898);
        nums.add(768);
        nums.add(708);
        nums.add(78);
        System.out.println(nums);

        System.out.println("Element at 4 index is: "+nums.get(4));
        System.out.println("Size of ArrayList is: "+nums.size());
        System.out.println("Set vale at index 2: ");
        nums.set(2,78);
        // specific index pe element ko set() method se set karoge to List not grow
        System.out.println("ArrayList is: "+nums);

        nums.add(3,67);
        // specific index pe element ko add() method se set karoge to List grow nature
        System.out.println("After add element at index ArrayList:"+nums);

        if(nums.isEmpty()) {
            System.out.println("ArrayList empty");
        }
        else {
            System.out.println("ArrayList not empty");
        }
        // iterator to use fetch element in collection
        Iterator<Integer> ite = nums.iterator();
        while (ite.hasNext()) {
            //after the next() no any stop extract the element from the list
            int n = ite.next();
            if (n == 67) {
                System.out.println("remove the element ");
                ite.remove();
            }
            else {
                System.out.println(n);
            }
        }
    }
}

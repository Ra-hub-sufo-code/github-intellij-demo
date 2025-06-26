package Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> sta = new Stack<>();
        sta.push(607);
        sta.push(617);
        sta.push(627);
        sta.push(637);

        System.out.println(sta);
        System.out.println(sta.pop());
        System.out.println(sta.pop());

        sta.push(45);
        sta.push(123);
        System.out.println(sta);
    }
}

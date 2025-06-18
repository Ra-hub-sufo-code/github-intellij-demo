package String;

public class CountStrLen {
    public static void main(String[] args) {
        String name;
        name = "Raushan kumar";
        int count = findStrLen(name);
        System.out.print("String length is: "+count);
    }
    public static int findStrLen(String cha) {
        int len = cha.length();
        return len;
    }
}

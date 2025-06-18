package String;

import java.util.Scanner;

public class CapitalizeFirstLettOfStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your name: ");
        String name2 = input.nextLine();
        StringBuilder  name = new StringBuilder(name2);
        StringBuilder  res = new StringBuilder(name2);
        res = capitalizeStr(name);
        System.out.println("Result is: "+res);
    }
    public static StringBuilder capitalizeStr( StringBuilder cha) {
        int i;
        char chara;
        for (i=0; i < (cha.length()-1); i++) {
            if (cha.charAt(i) == 32) {
                if (cha.charAt(i + 1) >= 97 && cha.charAt(i + 1) <= 122) {
                    cha.setCharAt(i + 1, (char) ((char) cha.charAt(i + 1) - 32));
                }
            }
        }
        cha.setCharAt(0,(char) (cha.charAt(0)-32));
        return cha;
    }
}
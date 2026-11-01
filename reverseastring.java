
package Recursion;

import java.util.Scanner;

public class reverseastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverse(s, s.length() - 1));
    }

    static String reverse(String s, int i) {
        if (i < 0) {
            return "";
        }

        return s.charAt(i) + reverse(s, i - 1);
    }
}

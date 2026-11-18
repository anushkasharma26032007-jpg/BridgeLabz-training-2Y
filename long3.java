package CBTPREPARATION.lonsubstrwithoutrepeatingcha;

import java.util.HashSet;
import java.util.Scanner;

public class long3 {
    static void   amain() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            maxlen = Math.max(maxlen, right - left + 1);
        }
        System.out.println(maxlen);
    }
}

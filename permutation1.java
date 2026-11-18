package CBTPREPARATION.permutationinasring;

import java.util.Arrays;
import java.util.Scanner;

public class permutation1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2 =sc.next();
        char[]a =s1.toCharArray();
        Arrays.sort(a);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String str = s2.substring(i,i+s1.length());
            char []b = str.toCharArray();
            Arrays.sort(b);
            if(Arrays.equals(a,b)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}

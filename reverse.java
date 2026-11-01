package Recursion;

import java.util.Scanner;

public class reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }
    static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
         reverse(n/10);
    }
}

package Recursion;

import java.util.Scanner;

public class countdigit{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));
    }
    static int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
}

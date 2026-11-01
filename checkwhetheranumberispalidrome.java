package Recursion;

import java.util.Scanner;

public class checkwhetheranumberispalidrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==palidromecheck(n,0)){
            System.out.println("Palidrome");
        }
      else{
            System.out.println("Not Palidrome");
        }
    }
    static int palidromecheck(int n,int rev){
        if(n==0){
            return rev;
        }

        return palidromecheck(n/10,rev*10+n%10);
    }
}

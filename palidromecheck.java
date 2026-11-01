package Recursion;

import java.util.Scanner;

public class palidromecheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palidrome(s,0,s.length()-1));
    }
    static boolean palidrome(String s,int l, int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!= s.charAt(r)){
            return false;
        }
        return palidrome(s,l+1,r-1);
    }
}

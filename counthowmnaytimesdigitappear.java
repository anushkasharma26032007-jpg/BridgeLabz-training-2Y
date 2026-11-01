package Recursion;

import java.util.Scanner;

public class counthowmnaytimesdigitappear {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(count(n, d));
    }
    static int count(int n,int d){
        if(n==0){
            return 0;
        }
        if(n%10 == d){
            return 1+count(n/10,d);
        }else{
            return count(n/10,d);
        }
    }
}

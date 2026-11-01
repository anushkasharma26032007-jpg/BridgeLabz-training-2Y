package Recursion;

import java.util.Scanner;

public class issorted {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(sort(a,0));
    }
    static boolean sort(int []a,int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return sort(a,i+1);
    }
}

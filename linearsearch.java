package Recursion;

import java.util.Scanner;

public class linearsearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(a,0,target));
    }
    static int search(int[]a ,int i, int target){
        if(i==a.length){
            return -1;
        }
        if(a[i]==target){
            return i;
        }
        return search(a,i+1,target);
    }
}

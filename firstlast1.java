package CBTPREPARATION.firstandlastocuurnce;

import java.util.Scanner;

public class firstlast1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int a [] =new int[n];
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
         int first =-1;
         int last =-1;
         int left=0;
         int right = a.length-1;
         int target = sc.nextInt();
         while(left<=right){
             int mid = left+(right-left)/2;
             if(a[mid]==target){
                 first = mid;
                 right = mid-1;
             }else if(a[mid]<target){
                 left = mid+1;
             }else{
                 right = mid-1;
             }
         }
        left = 0;
        right = a.length - 1;
         while(left<=right){
             int mid = left+(right-left)/2;
             if(a[mid]==target){
                 last = mid;
                 left = mid+1;
             }else if(a[mid]<target){
                 left = mid+1;
             }else{
                 right=mid-1;
             }
         }
        System.out.print("["+first+","+last+"]");
    }
}

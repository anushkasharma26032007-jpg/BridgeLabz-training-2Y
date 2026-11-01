package Recursion;

import java.util.Scanner;

public class AddDigit2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      while(n>=10) {
          int sum =0;
          while(n>0){
              sum = sum+n%10;
              n=n/10;
          }
          n=sum;
      }
        System.out.println(n);
    }
}

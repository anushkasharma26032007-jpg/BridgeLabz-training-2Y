package CBTPREPARATION.maximumsumsubarrayofk;

import java.util.Scanner;
public class sumsubarray1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum =0;
        for(int i=0;i<k;i++){
            sum = sum +a[i];
        }
        int maxsum = sum;
        for(int i=k;i<n;i++) {
            sum = sum - a[i - k] + a[i];
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}

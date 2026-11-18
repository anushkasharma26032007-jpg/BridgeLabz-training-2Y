package CBTPREPARATION.Distinctno.inawindow;

import java.util.HashSet;
import java.util.Scanner;

public class distrinctno1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[]a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        if(k>n||k<=0){
            System.out.println("Invalid Input");
            return;
        }
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(a[j]);
            }
            System.out.print(set.size()+" ");
        }
    }
}

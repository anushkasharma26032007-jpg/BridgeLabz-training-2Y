package CBTPREPARATION.palidrome;
import java.util.Scanner;
public class palidrome2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int original = n;
        int rev =0;
        while (n > 0) {
            int x = n % 10;
            rev = rev *10+x;
            n=n/10;
        }
        if(original==rev){
            System.out.println("Palidrome");
        }else{
            System.out.println("Not Palidrome");
        }
    }
}

package Recursion;
import java.util.Scanner;
public class AddDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Add(n));
    }
    static   int Add(int n){
        if(n==0){
            return 0;
        }
        return n%10 + Add(n/10);
    }
}

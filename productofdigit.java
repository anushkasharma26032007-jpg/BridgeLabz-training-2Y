package Recursion;

import java.util.Scanner;

public class productofdigit {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(productofdigit(n));
    }
    static int productofdigit(int n){
        if(n==0) {
            return 1;
        }
        return (n%10)*productofdigit(n/10);
    }
}

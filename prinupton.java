package Recursion;

import java.util.Scanner;

public class prinupton {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
    static void solve(int n) {
        if (n == 0) {
            return ;
        }
        System.out.println(n);
        solve(n-1);
    }

}

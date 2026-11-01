package Recursion;
import java.util.Scanner;
public class quizn {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findmax(a,0));
    }
    static int findmax(int []a,int i){
        if(i==a.length-1){
            return a[i];
        }
        int max = findmax(a,i+1);
        if(a[i]>max){
            return a[i];
        }
        return max;
    }
}

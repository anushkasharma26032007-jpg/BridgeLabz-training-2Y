package CBTPREPARATION.maximumfrequemcy;
import java.util.Scanner;
public class frequency2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int maxfreq =0;
        int answer = a[0];
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
           if(count>maxfreq){
               maxfreq = count;
               answer = a[i];
           }
        }
        System.out.println(answer);
    }
}

package CBTPREPARATION.twiceapperingenumber;
import java.util.HashMap;
import java.util.Scanner;
public class twicwappearing1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        boolean found = false;
        for(int num: map.keySet()){
            if(map.get(num)==2){
                System.out.print(num+" ");
                found = true;
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }
}

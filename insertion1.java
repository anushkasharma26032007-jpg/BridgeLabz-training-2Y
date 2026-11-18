package CBTPREPARATION.searchinsertioncode;
import java.util.Scanner;
public class insertion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int left =0;
        int right = n-1;
        int target = sc.nextInt();
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            } else if (nums[mid]<target) {
                left = mid+1;

            }else{
                right = mid-1;
            }
        }
        System.out.print(left);
        sc.close();
    }
}

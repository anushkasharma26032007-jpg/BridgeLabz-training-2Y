package CBTPREPARATION.KOKOeatinngbanana;

import java.util.Scanner;

public class kokobana1 {
    static void main() {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int h = sc.nextInt();

            int left = 1;
            int right = a[0];

            for (int i = 1; i < n; i++) {
                if (a[i] > right)
                    right = a[i];
            }

            int ans = right;

            while (left <= right) {
                int mid = (left + right) / 2;
                int hours = 0;

                for (int i = 0; i < n; i++) {
                    hours += (a[i] + mid - 1) / mid;
                }

                if (hours <= h) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }

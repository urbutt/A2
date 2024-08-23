
// Problem code : 268/A

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        // This part counts the pairs of elements where the first element of one pair is
        // equal to the second element of another pair (i.e; host and guest uniform
        // color same).

        int k = 0, count = 0;
        while (k < n) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[k][0] == arr[i][1] && arr[i][1] != arr[k][1]) {
                    count++;
                }
            }
            k++;
        }
        System.out.println(count);
        scan.close();
    }

}

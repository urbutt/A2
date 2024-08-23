//Problem code : 337/A

import java.util.Arrays;
import java.util.Scanner;

public class puzzles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        /*
         * This part of the code is finding the minimum difference between the puzzle
         * pieces selected
         * for the puzzles.
         */

        int sub = arr[0 + (n - 1)] - arr[0];
        for (int i = 1; i < arr.length - (n - 1); i++) {
            if (sub > arr[i + (n - 1)] - arr[i]) {
                sub = arr[i + (n - 1)] - arr[i];
            }
        }
        System.out.println(sub);
        scan.close();
    }
}
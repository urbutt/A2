//Problem code : 276/A

import java.util.Scanner;

public class LunchRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number of restaurants (n) and the time limit (k)
        int n = scan.nextInt();
        int k = scan.nextInt();

        // Initialize the maximum joy value (maxJoy)
        int maxJoy = Integer.MIN_VALUE;

        // Iterate through the n restaurants
        for (int i = 0; i < n; i++) {
            // Read the joy value (f) and the time required (t) for the current restaurant
            int f = scan.nextInt();
            int t = scan.nextInt();

            // Calculate the joy value for the restaurant and then store the maximum value
            maxJoy = Math.max(maxJoy, (t <= k) ? f : f - (t - k));
        }
        // Print the maximum joy value
        System.out.println(maxJoy);

        scan.close();
    }
}

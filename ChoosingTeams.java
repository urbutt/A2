//Problem code : 432/A

import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // Number of students
        int k = scan.nextInt(); // Required number of future participation's
        int count = 0; // Count of eligible students
        for (int i = 0; i < n; i++) {
            // Check if the student can participate k more times
            if (5 - scan.nextInt() >= k) {
                count++;
            }
        }
        scan.close();

        // Print the maximum number of teams
        System.out.println(count / 3);
    }
}

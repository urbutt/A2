
//Problem code : 466/A

import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // Number of rides needed
        int m = scan.nextInt(); // Number of rides in a special ticket
        int a = scan.nextInt(); // Cost of a single ride ticket
        int b = scan.nextInt(); // Cost of a special ticket
        scan.close();

        // Calculate costs for different scenarios
        int case1 = n * a; // Cost if using only single ride tickets
        int case2 = (n / m) * b + (n % m) * a; // Cost of special tickets + single tickets for remainder
        int case3 = (n / m) * b + (n % m) * b; // Cost if using only special tickets, including for remainder

        // cheaper to buy an extra special ticket rather than individual tickets for
        // remaining rides even i some go lost
        if (m > b) {
            case3 = (n / m) * b + b; // Cost of full special tickets + one extra special ticket
        }

        // Find the minimum cost among the three cases
        int min = Math.min(case1, Math.min(case2, case3));

        // Print the result, considering the special case where one special ticket
        // covers all needed rides
        System.out.println((m > n && b < min) ? b : min);
    }
}

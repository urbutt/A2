
//Problem code : 313/A

import java.util.Scanner;

public class IlyaBankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        scan.close();
        // If the balance is greater than -10, no change needed
        if (balance > -10) {
            System.out.println(balance);
        } else {
            // Print the maximum of:
            // 1. The balance after removing the last digit (balance / 10)
            // 2. The balance after removing the second-to-last digit (secondLast)
            int secondLast = balance / 100 * 10 + balance % 10;
            System.out.println(Math.max(balance / 10, secondLast));
        }
    }
}
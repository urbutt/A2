
//Problem code : 318/A

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        scan.close();

        // calculating mid point , after that the even numbers start

        long num = (long) Math.ceil((double) n / 2);

        // If k <= num, it's an odd number (2k - 1)
        // If k > num, it's an even number (2 * (k - num))
        System.out.println((k <= num) ? 2 * k - 1 : 2 * (k - num));
    }
}

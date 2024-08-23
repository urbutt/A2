
// Problem code : 451/A

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a % 2 == 0) {
            if (b >= a) {
                System.out.println("Malvika");
            } else if (b < a && b % 2 != 0) {
                System.out.println("Akshat");
            } else {
                System.out.println("Malvika");
            }
        } else {
            if (b >= a) {
                System.out.println("Akshat");
            } else if (b < a && b % 2 == 0) {
                System.out.println("Malvika");
            } else {
                System.out.println("Akshat");
            }
        }
        scan.close();
    }

}
//Problem Code : 510/A

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 != 0) {
                    System.out.print("#");
                } else {
                    if (j == 1 & i % 4 == 0) {
                        System.out.print("#");
                    } else if (j == m && i % 4 == 2) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }

    }
}

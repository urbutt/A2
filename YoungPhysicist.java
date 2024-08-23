//Problem code :69/A

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), a = 0, b = 0, c = 0;
        while (n-- > 0) {
            a += scan.nextInt();
            b += scan.nextInt();
            c += scan.nextInt();
        }
        System.out.println((a == 0 && b == 0 && c == 0) ? "YES" : "NO");
        scan.close();
    }
}
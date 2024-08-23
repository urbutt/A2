import java.util.Scanner;

public class Problem339A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scan.nextInt();
        }
        scan.close();
        if (sum + ((n - 1) * 10) <= c) {
            System.out.println((c - sum) / 5);
        }
        if (sum + ((n - 1) * 10) > c) {
            System.out.println(-1);
        }
    }
}

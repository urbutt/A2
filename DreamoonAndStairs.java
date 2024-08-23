import java.util.Scanner;
//Problem Code : 476/A

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        if (n >= m) {
            int min = n / 2 + n % 2;
            for (int i = 0; i <= n / 2; i++, min++) {
                if (min % m == 0) {
                    System.out.println(min);
                    break;
                }
            }
        } else {
            System.out.println(-1);
        }
    }
}


import java.util.Scanner;

public class expression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        // Trying different expressions and printing maximum of them

        int exp1 = a + b + c;
        int exp2 = (a + b) * c;
        int exp3 = a * (b + c);
        int exp4 = a * b * c;
        int exp5 = (a * b) + c;
        int exp6 = a + (b * c);

        System.out.println(Math.max(exp1, Math.max(exp2, Math.max(exp3, Math.max(exp4, Math.max(exp5, exp6))))));
    }
}

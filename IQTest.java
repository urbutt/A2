
// Problem Code : 25/A
import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Read n integers into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        // Count even and odd numbers
        int EvenCount = 0, OddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
        }

        // Find and print the index of the number that differs in evenness
        if (EvenCount > OddCount) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }

    }

}

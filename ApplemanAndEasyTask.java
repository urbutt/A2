
// Problem code : 462/A
import java.util.Scanner;

public class ApplemanAndEasyTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the size of the checkerboard
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline

        // Read the checkerboard cell values
        char[][] checkerboard = new char[n][n];
        for (int i = 0; i < n; i++) {
            checkerboard[i] = scan.nextLine().toCharArray();
        }
        scan.close();

        // Check if the checkerboard satisfies the condition and print the result
        System.out.println(isEven(checkerboard, n) ? "YES" : "NO");
    }

    public static boolean isEven(char[][] checkerboard, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;

                // Check cell above
                if (i - 1 >= 0 && checkerboard[i - 1][j] == 'o') {
                    count++;
                }
                // Check cell below
                if (i + 1 < n && checkerboard[i + 1][j] == 'o') {
                    count++;
                }
                // Check cell to the left
                if (j - 1 >= 0 && checkerboard[i][j - 1] == 'o') {
                    count++;
                }
                // Check cell to the right
                if (j + 1 < n && checkerboard[i][j + 1] == 'o') {
                    count++;
                }

                // If any cell has an odd count of adjacent 'o' cells, return false
                if (count % 2 != 0) {
                    return false;
                }
            }
        }
        // If all cells have an even count of adjacent 'o' cells, return true
        return true;
    }
}

//Problem Code : 330/A

import java.util.Scanner;

public class Cakeminator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt(); // Number of rows
        int c = scan.nextInt(); // Number of columns

        char[][] cakeGrid = new char[r][c];
        for (int i = 0; i < r; i++) {
            String row = scan.next();
            cakeGrid[i] = row.toCharArray();
        }
        scan.close();
        System.out.println(MaxEatablePieces(cakeGrid, r, c));

    }

    public static int MaxEatablePieces(char[][] cakeGrid, int r, int c) {
        int countRows = 0;
        int countColumn = 0;

        // Count rows without strawberries
        for (int i = 0; i < r; i++) {
            boolean rowFlag = true;
            for (int j = 0; j < c; j++) {
                if (cakeGrid[i][j] == 'S') {
                    rowFlag = false;
                    break;
                }
            }
            if (rowFlag) {
                countRows++;
            }
        }

        // Count columns without strawberries
        for (int i = 0; i < c; i++) {
            boolean columnFlag = true;
            for (int j = 0; j < r; j++) {
                if (cakeGrid[j][i] == 'S') {
                    columnFlag = false;
                    break;
                }
            }
            if (columnFlag) {
                countColumn++;
            }
        }

        // Calculate and return the total eatable pieces of cake
        return countRows * c + (countColumn * r - (countRows * countColumn));
    }
}

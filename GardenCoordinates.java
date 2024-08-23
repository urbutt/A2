
import java.util.Scanner;

public class GardenCoordinates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        scan.close();

        findCoordinates(x1, y1, x2, y2);
    }

    public static void findCoordinates(int x1, int y1, int x2, int y2) {
        int x3, x4, y3, y4;
        if (x1 == x2 || y1 == y2) {
            int px = y2 - y1;
            int py = -(x2 - x1);
            x3 = x2 + px;
            y3 = y2 + py;
            x4 = x1 + px;
            y4 = y1 + py;
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {

        } else {
            System.out.println(-1);
        }
    }
}

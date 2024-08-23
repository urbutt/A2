
import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int TotalLevels = scan.nextInt();

        // Unique Levels played by both p and q player then compares with the total no
        // of levels to check win or loss

        HashSet<Integer> uniqueLevels = new HashSet<>();
        int pLevels = scan.nextInt();
        for (int i = 0; i < pLevels; i++) {
            uniqueLevels.add(scan.nextInt());
        }
        int qLevels = scan.nextInt();
        for (int i = 0; i < qLevels; i++) {
            uniqueLevels.add(scan.nextInt());
        }
        scan.close();
        System.out.println((uniqueLevels.size() == TotalLevels) ? "I become the guy." : "Oh, my keyboard!");
    }
}

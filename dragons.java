//Problem code : 230/A

import java.util.ArrayList;
import java.util.Scanner;

public class dragons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read Kirito's initial strength
        int kiritoStrength = scan.nextInt();

        // Read the total number of dragons
        int dragonCount = scan.nextInt();

        // ArrayList to store dragon strengths
        ArrayList<Integer> dragonStrengths = new ArrayList<>();

        // ArrayList to store dragon bonuses
        ArrayList<Integer> dragonBonuses = new ArrayList<>();

        // Read dragon strengths and bonuses
        for (int i = 0; i < dragonCount; i++) {
            dragonStrengths.add(scan.nextInt());
            dragonBonuses.add(scan.nextInt());
        }

        scan.close();

        // Battle loop: continues until all dragons are defeated or Kirito loses
        while (!dragonStrengths.isEmpty()) {
            int weakestIndex = findWeakestDragonIndex(dragonStrengths);

            // Check if Kirito is strong enough to defeat the weakest dragon
            if (kiritoStrength > dragonStrengths.get(weakestIndex)) {
                kiritoStrength += dragonBonuses.get(weakestIndex); // Gain bonus strength
                dragonStrengths.remove(weakestIndex); // Remove defeated dragon
                dragonBonuses.remove(weakestIndex); // Remove corresponding bonus
            } else {
                System.out.println("NO"); // Kirito loses
                return;
            }
        }

        System.out.println("YES"); // Kirito defeats all dragons
    }

    public static int findWeakestDragonIndex(ArrayList<Integer> dragonStrengths) {
        int minIndex = 0; // Assume the first dragon is the weakest initially

        // Iterate through the dragon strengths, starting from the second element
        for (int i = 1; i < dragonStrengths.size(); i++) {
            if (dragonStrengths.get(i) < dragonStrengths.get(minIndex)) {
                minIndex = i; // Update the weakest dragon index if a weaker one is found
            }
        }
        return minIndex;
    }
}

//Problem code : 490/A

import java.util.ArrayList;
import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number of students
        int n = scan.nextInt();

        // ArrayList to store the skills of each student
        ArrayList<Integer> skills = new ArrayList<>();

        // Counters for each skill type
        int a = 0, b = 0, c = 0;

        // Read skills and count occurrences
        for (int i = 0; i < n; i++) {
            skills.add(scan.nextInt());
            if (skills.get(i) == 1)
                a++;
            else if (skills.get(i) == 2)
                b++;
            else if (skills.get(i) == 3)
                c++;
        }
        scan.close();

        // Calculate the maximum number of teams possible
        int NoOfTeams = Math.min(a, Math.min(b, c));

        // Check if it's possible to form at least one team
        if (!skills.contains(1) || !skills.contains(2) || !skills.contains(3)) {
            System.out.println(0);
        } else {
            System.out.println(NoOfTeams);
            teams(skills, NoOfTeams);
        }
    }

    public static void teams(ArrayList<Integer> skills, int NoOfTeams) {
        for (int i = 0; i < NoOfTeams; i++) {
            for (int j = 1; j <= 3; j++) {
                // Print the index of the student with skill j
                System.out.print(skills.indexOf(j) + 1 + " ");
                // Mark this as used by setting their skill to 0
                skills.set(skills.indexOf(j), 0);
            }
            System.out.println();
        }
    }
}

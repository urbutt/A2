// Problem code : 443/A

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // using regex to remove curly brackets and converting to array
        String[] letters = scan.nextLine().replaceAll("[{}\\s]", "").split(",");
        scan.close();

        // using HashSet to remove duplicates

        if (letters[0].isEmpty()) {
            System.out.println(0);
        } else {
            HashSet<String> str = new HashSet<>(Arrays.asList(letters));
            System.out.println(str.size());
        }

    }
}

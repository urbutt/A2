//Problem code :208/A

import java.util.Scanner;

public class WubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine().replaceAll("(WUB)+", " ").trim());
        scan.close();
    }
}
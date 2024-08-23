//Problem code : 441/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ValeraAndAntiqueItems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read number of sellers and Valera's money
        // Using hash set to remove duplicates as only one item/seller
        int noOfSellers = scan.nextInt();
        int money = scan.nextInt();

        // List to store sellers Valera can buy from
        HashSet<Integer> SellersDealFinal = new HashSet<>();

        // Process each seller
        for (int i = 0; i < noOfSellers; i++) {
            int noOfItems = scan.nextInt();
            // Check each item of the current seller
            for (int j = 0; j < noOfItems; j++) {
                // If Valera can afford an item, add seller to the list
                if (money > scan.nextInt()) {
                    SellersDealFinal.add(i + 1);
                }
            }
        }
        scan.close();

        // Print number of sellers Valera can buy from
        System.out.println(SellersDealFinal.size());

        // Convert to arraylist and sort the list of sellers
        ArrayList<Integer> SellersDeal = new ArrayList<>(SellersDealFinal);
        Collections.sort(SellersDeal);

        // Print sorted list of sellers
        for (Integer e : SellersDeal) {
            System.out.print(e + " ");
        }
    }
}
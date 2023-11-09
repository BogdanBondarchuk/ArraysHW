package app;

import java.util.Scanner;

public class Main01 {
    static String[] products = {"Cappuccino", "Espresso", "Latte", "Double cappuccino", "Espresso"};
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product name to count: ");
        String productName = scanner.nextLine();

        for (String name : products) {
            if (name.equals(productName)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The list of " + productName + ":");
            int matchCount = 0;
            for (String name : products) {
                if (name.equals(productName)) {
                    matchCount++;
                    System.out.println(matchCount + ") name is " + name);
                }
            }
            System.out.println("Number of " + productName + " matches are: " + count);
        } else {
            System.out.println("No matches found for " + productName);
        }

        scanner.close();
    }
}

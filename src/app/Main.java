package app;

public class Main {
    static String[] products;
    static String productName;
    static int count;

    public static void main(String[] args) {
        products = new String[]{"Cappuccino", "Espresso", "Latte", "Double cappuccino", "Espresso"};
        productName = "Espresso";
        System.out.println("The list of " + productName + " :");

        count = 0; // Початкове значення лічильника

        for (String name : products) {
            if (name.equals(productName)) { // Порівнюємо кожен продукт з вказаним ім'ям
                count++;
                System.out.println(count + ") name is " + name);
            }
        }

        if (count > 0) {
            System.out.println("Number of " + productName + " matches are: " + count);
        } else {
            System.out.println("No matches found for " + productName);
        }
    }
}

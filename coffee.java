import java.util.Scanner;

public class Test {
    static int[] prices = { 100, 50, 20, 30 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] quantity = new int[4];
        String[] menu = {"Latte", "Cappucino", "Mocha", "Ristretto"};

        while (true) {
            System.out.println("Select your coffee press 0 to exit.");
            System.out.println("-------------------------");
            System.out.println(" ");

            //display coffee
            for (int i = 0; i < menu.length; i++) {
                System.out.println("press " + (i + 1) + " " + menu[i] + " " + prices[i] + " baht");
            }

            int number = sc.nextInt();
            if (number == 0) {
                break;

            } else {
                String selectedCoffee = menu[number - 1];
                System.out.println(selectedCoffee);
                quantity[number - 1] ++;
            }
        }

        int allPrices = 0;
        for (int i = 0; i < quantity.length; i++) {
            int number = quantity[i];
            if (number != 0) {
                System.out.println(menu[i]+ " " + number);
            }
            int price = sum(i, number);
            allPrices += price;
        }

        System.out.println("Prices is " + allPrices);
        System.out.println(" ");
        System.out.println("Please Input your money") ;
        int inputMoney = sc.nextInt();
        if (inputMoney - allPrices == 0) {
            System.out.println("Thank you");

        } else if (inputMoney - allPrices < 0) {
            System.out.println("Not enough money");

        } else if (inputMoney - allPrices > 0) {
            System.out.println("Your change is " + (inputMoney - allPrices));
        }
    }

    public static int sum(int index, int quantity) {
        return prices[index] * quantity;
    }
}
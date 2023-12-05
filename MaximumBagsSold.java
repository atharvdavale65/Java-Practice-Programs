import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    int quantity;
    int price;

    Customer(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }
}

class RiceBag {
    int quantity;
    int price;

    RiceBag(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }
}

public class MaximumBagsSold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            customers.add(new Customer(a, b));
        }

        List<RiceBag> riceBags = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int q = scanner.nextInt();
            int p = scanner.nextInt();
            riceBags.add(new RiceBag(q, p));
        }

        int result = maximumBagsSold(n, m, customers, riceBags);
        System.out.println(result);

        scanner.close();
    }

    private static int maximumBagsSold(int n, int m, List<Customer> customers, List<RiceBag> riceBags) {
        int soldBags = 0;

        for (Customer customer : customers) {
            int customerQuantity = customer.quantity;
            int customerPrice = customer.price;

            for (RiceBag riceBag : riceBags) {
                int bagQuantity = riceBag.quantity;
                int bagPrice = riceBag.price;

                if (bagQuantity >= customerQuantity && bagPrice <= customerPrice) {
                    soldBags++;
                    riceBags.remove(riceBag);
                    break;
                }
            }
        }

        return soldBags;
    }
}

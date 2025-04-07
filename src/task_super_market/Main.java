package task_super_market;

import task_super_market.databace.Basket;
import task_super_market.models.Card;
import task_super_market.models.Product;
import task_super_market.service.serviceImpl.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double som = 0;
        System.out.print("Write product: ");
        while (true) {
            System.out.println("\nProduct name: ");
            String string = new Scanner(System.in).nextLine();
            System.out.print("Product price: ");
            double price = new Scanner(System.in).nextInt();
            Product[] products1 = {new Product(string, price)};

            Basket basket = new Basket(products1);
            Card card = new Card("Айбек", "Исмаилов",
                    "1234-5678-9876", 500, "1234");
            Client client = new Client("Айбек", "Исмаилов", 25, card, basket);

            double totalAmount = basket.getTotalPrice();
            System.out.println(client.payWithCard(totalAmount));
        }


    }
}

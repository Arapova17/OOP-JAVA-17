package task_super_market;

import task_super_market.databace.Basket;
import task_super_market.models.Card;
import task_super_market.models.Product;
import task_super_market.service.serviceImpl.Client;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Сүт", 50),
                new Product("Нан", 30),
                new Product("Кофе", 120)
        };

        Basket basket = new Basket(products);
        Card card = new Card("Айбек", "Исмаилов",
                "1234-5678-9876", 100, "1234");
        Client client = new Client("Айбек", "Исмаилов", 25, card, basket);

        double totalAmount = basket.getTotalPrice();
        System.out.println(client.payWithCard(totalAmount));
    }
}

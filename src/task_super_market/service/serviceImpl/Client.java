package task_super_market.service.serviceImpl;

import task_super_market.databace.Basket;
import task_super_market.models.Card;
import task_super_market.service.CardInterface;

import java.util.Scanner;

public class Client implements CardInterface {
    private String firstName;
    private String lastName;
    private int age;
    private Card card;
    private Basket basket;

    public Client() {
    }

    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card card() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Basket basket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String payWithCard(double money) {
        if (money > 100){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write password: ");
            String inputPassword = scanner.nextLine();

            if (!card.verifyPassword(inputPassword)){
                return "Tуура эмес пароль!";
            }
        }


        if (card.balance() >= money){
            card.deductBalance(money);
            System.out.println("Chek:");
            return "Summa: " + basket.getTotalPrice();
        }else {
            return "Cизде каражат жетишпейт: " + getCardBalance();
        }
    }

    @Override
    public double getCardBalance() {
        return card.balance();
    }
}

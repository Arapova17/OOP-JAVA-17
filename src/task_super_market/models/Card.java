package task_super_market.models;

public class Card {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private double balance;
    private String password;

    public Card() {
    }

    public Card(String firstName, String lastName, String cardNumber, double balance, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.password = password;
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

    public String cardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double balance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance(){
        return balance;
    }

    public void deductBalance(double amount){
        this.balance -= amount;
    }

    public boolean verifyPassword(String inputPassword){
        return this.password.equals(inputPassword);
    }

}

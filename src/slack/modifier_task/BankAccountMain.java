package slack.modifier_task;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount.deposit(5000); // 5000 сом кошобуз
        BankAccount.withdraw(2000); // 2000 сом чыгарабыз
        System.out.println("Акыркы баланс: " + BankAccount.getBalance());
    }
}

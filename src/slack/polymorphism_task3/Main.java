package slack.polymorphism_task3;

import slack.modifier_task.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("My phone: ");

        String string1 = scanner.nextLine();
        switch (string1) {
            case "Notes":
                System.out.println("My history: ");
                Notes notes = new Notes(new Scanner(System.in));
                System.out.println(notes);
                break;
            case "Bank account":
                System.out.println("My bank:");
                Bank.myBankAccount(1000);
                System.out.println("Withdraw: ");
                Bank.withdraw();
                System.out.println("Акыркы баланс: " + Bank.getBalance());
                break;
            case "Calculator":
                Calculator calculator = new Calculator();
                calculator.calculator();
                break;
            default:
                System.out.println("Error!");

        }

    }
}

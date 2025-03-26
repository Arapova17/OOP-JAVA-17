package slack.polymorphism_task3;

import java.util.Scanner;

public class Bank extends MyPhone{
    private static double balance;

    public static void myBankAccount(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + " amount");
            System.out.println("My bank " + balance);
        }else {
            System.out.println("Error!");
        }
    }


    public static void withdraw(){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " amount");
            System.out.println("New balance " + balance);
        }else {
            System.out.println("Error!");
        }
    }

    public static double getBalance(){
        return balance;
    }
}

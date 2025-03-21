package slack.modifier_task;

 class BankAccount {
    private String accountNumber;
    private static double balance;



    public static void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + " amount");
            System.out.println("New balance " + balance);
        }else {
            System.out.println("Error!");
        }
    }

    public static void withdraw(double amount){
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

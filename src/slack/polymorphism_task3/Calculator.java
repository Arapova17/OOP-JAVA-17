package slack.polymorphism_task3;

import java.util.Scanner;

public class Calculator extends MyPhone {

    public void calculator() {
        while (true) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Calculator: ");
            int num = scanner.nextInt();
            char symbol = scanner.next().charAt(0);
            int san = scanner.nextInt();
            int result = 0;
            switch (symbol) {
                case '+':
                    result = num + san;
                    break;
                case '-':
                    result = num - san;
                    break;
                case '*':
                    result = num * san;
                    break;
                case '/':
                    result = num / san;
                    break;
                default:
                    System.out.println(result);
            }
            System.out.println("Result: " + result);
        }
    }
}
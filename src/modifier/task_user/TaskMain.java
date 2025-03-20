package modifier.task_user;

import java.util.Arrays;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {

//        User user = new User();
//        user.register();
//        user.login();
//        Product product = new Product();
//        product.createProduct(user);
//        System.out.println(Arrays.toString(user.getAllProducts()));

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Product product = new Product();

        boolean isTrue = true;
        boolean isAuthenticated = false;

        while (isTrue) {
            System.out.println("""
                       Menu 
                    1.Register
                    2.Login
                    3.Add product
                    4.Get All Product
                    5.Exit
                    """);
            System.out.println("Choose method: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.register();
                    break;
                case 2:
                    if (user.login()){
                        isAuthenticated = true;
                    }else {
                        System.out.println("Login!");
                    }
                    break;
                case 3:
                    if (isAuthenticated) {
                        product.createProduct(user);
                    }else {
                        System.out.println("Error Authenticate");
                    }
                    break;
                case 4:
                    if (isAuthenticated) {
                        System.out.println(Arrays.toString(user.getAllProducts()));
                    }else {
                        System.out.println("Error Authenticate");
                    }
                    break;
                case 5:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Incorrect choice");
            }
        }

    }
}

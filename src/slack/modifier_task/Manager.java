package slack.modifier_task;

public class Manager extends Employee{

    void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println(amount + " amount");
            System.out.println("Salary " + salary);
        } else {
            System.out.println("Error!");
        }
    }

    double getSalary(){
        return salary;
    }
}

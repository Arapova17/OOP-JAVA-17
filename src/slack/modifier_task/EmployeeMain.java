package slack.modifier_task;

public class EmployeeMain {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.increaseSalary(15000);
        System.out.println(manager.getSalary());
    }
}

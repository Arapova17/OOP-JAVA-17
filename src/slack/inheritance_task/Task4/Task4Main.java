package slack.inheritance_task.Task4;

public class Task4Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        apartment.setTitle("Datka");
        apartment.setAddress("Малдыбаева 6/1");
        apartment.setPrice(30000);
        System.out.println(apartment);
        apartment.payperMonth(30000);


        Apartment apartment1 = new Apartment("Kut", 30000,  "Шопокова 53");
        System.out.println(apartment1);
        apartment1.payperMonth(30000);


    }
}

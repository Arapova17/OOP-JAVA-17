package slack.inheritance_task.Task4;

public class Apartment {
    private String title;
    private int price;
    private String address;

    public Apartment() {
    }

    public Apartment(String title, int price, String address) {
        this.title = title;
        this.price = price;
        this.address = address;
    }


    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   public void payperMonth(int rent){
        int student = 6;
       System.out.println("Rent: " + rent / student);
   }

    @Override
    public String toString() {
        return "\nApartment" +
                "\ntitle = " + title +
                "\nprice = " + price +
                "\naddress = " + address;
    }
}

package OOP.Encapsulation;

public class Hous {
    private String address;
    private int numbersOfRooms;
    private int area;

    public Hous() {

    }

    public Hous(String address, int numbersOfRooms, int area) {
        this.address = address;
        this.numbersOfRooms = numbersOfRooms;
        this.area = area;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int numbersOfRooms() {
        return numbersOfRooms;
    }

    public void setNumbersOfRooms(int numbersOfRooms) {
        this.numbersOfRooms = numbersOfRooms;
    }

    public int area() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int calculatePrice(int price){
        return area * price;
    }

    @Override
    public String toString() {
        return "Hous" +
                "\naddress = " + address +
                "\nnumbersOfRooms = " + numbersOfRooms +
                "\narea = " + area ;
    }
}

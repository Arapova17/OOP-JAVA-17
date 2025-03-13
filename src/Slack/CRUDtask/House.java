package Slack.CRUDtask;

public class House {
    private long id;
    private String address;
    private double price;
    private int room;
    private String country;

    // constructor
    public House(long id, String address, double price, int room, String country) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.room = room;
        this.country = country;
    }

    // get
    public long id() {
        return id;
    }

    //set
    public void setId(long id) {
        this.id = id;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double price() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int room() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String country() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // TODO CREATE
    public void createHouse(House house){

    }

    //toString
    @Override
    public String toString() {
        return "House{" +
                "id = " + id +
                "\naddress = " + address +
                "\nprice = " + price +
                "\nroom = " + room +
                "\ncountry = " + country ;
    }
}

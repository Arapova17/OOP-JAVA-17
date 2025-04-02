package exception_handling.models;

import exception_handling.enums.HouseType;

public class House {
    private long id;
    private String address;
    private int price;
    private int room;
    protected HouseType houseType;
    private boolean isBooked;
    private String counter;

    public House() {
    }

    public House(long id, String address, int price, int room, HouseType houseType, boolean isBooked, String counter) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.room = room;
        this.houseType = houseType;
        this.isBooked = isBooked;
        this.counter = counter;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int room() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public HouseType houseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String counter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", room=" + room +
                ", houseType=" + houseType +
                ", isBooked=" + isBooked +
                ", counter='" + counter + '\'' +
                '}';
    }
}

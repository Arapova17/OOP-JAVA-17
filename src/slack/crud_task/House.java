package slack.crud_task;

public class House {
    private long id;
    private String address;
    private double price;
    private int room;
    private String country;
    

    // get
    public long getId() {
        return id;
    }

    //set
    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // TODO CREATE
   public House[] createHouse(House[] houses, House house){
        House[] newHouses = new House[houses.length + 1];

       for (int i = 0; i < houses.length; i++) {
           newHouses[i] = houses[i];
       }

       newHouses[houses.length] = house;
       return newHouses;
   }

   // TODO GET ALL
    public House[] getAllHouses(House[] houses){
        return houses;
    }

    // TODO GET BY ID
    public House getById(long id, House[] houses){
        for (House house : houses){
            if (id == house.getId()){
                return house;
            }
        }
        return null;
    }

    // TODO UPDATE
    public House[] updateHouseById(long ip, House[] houses, House updateHouse){
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id){
                houses[i].setAddress(updateHouse.getAddress());
                houses[i].setPrice(updateHouse.getPrice());
                houses[i].setRoom(updateHouse.getRoom());
                houses[i].setCountry(updateHouse.getCountry());
                return houses;
            }
        }
        System.out.println("House withe ID: " + id + " not found");
        return houses;
    }

    // TODO DELETE
    public House[] deleteHouseById(long id, House[] houses){
        int index = - 1;

        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id){
                index = i;
                break;
            }
        }

        if (index == - 1){
            System.out.println("House withe ID " + id + " not found");
            return houses;
        }

        House[] newHouses = new House[houses.length - 1];
        for (int i = 0, j = 0; i < houses.length; i++) {
            if (i != index){
                newHouses[j++] = houses[i];
            }
        }

        return newHouses;

    }

    @Override
    public String toString() {
        return "\nid = " + id +
                "\naddress = " + address +
                "\nprice = " + price +
                "\nroom = " + room +
                "\ncountry = " + country + "\n--------------";
    }
}

package Inheritance;

public class Technique {
    private String marca;
    private int price;

    public String marca() {
        System.out.println(marca);
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String ShopName(String name){
        System.out.println("\nShop: " + name);
        return name;
    }

    @Override
    public String toString() {
        return "Technique:" +
                "\nmarca = " + marca +
                "\nprice = " + price ;
    }
}

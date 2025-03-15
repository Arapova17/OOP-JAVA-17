package OOP.Inheritance;

public class Technique {
    private String marca;
    private int price;

    public Technique(String marca, int price) {
        this.marca = marca;
        this.price = price;
    }

    public String marca() {
        System.out.println(marca);
        return marca;
    }

    public void setMarcaSmartWatch(String marcaSmartWatch) {
        this.marca = marcaSmartWatch;
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void ShopName(String name){
        System.out.println("\nShop: " + name);
    }

    @Override
    public String toString() {
        return "\nmarca = " + marca +
                "\nprice = " + price ;
    }
}

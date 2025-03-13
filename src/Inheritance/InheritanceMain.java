package Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {


        Phone phone = new Phone();
        phone.setMarca("Redmi");
        phone.setMemory(64);
        phone.setImportState("Chines");
        phone.setPrice(28000);
        phone.ShopName("MI");
        System.out.println(phone);

        laptop laptop = new laptop();
        laptop.setMarca("Xiaomi");
        laptop.setMemory(254);
        laptop.setImportState("Chines");
        laptop.setPrice(48000);
        laptop.ShopName("MI");
        System.out.println(laptop);
    }
}

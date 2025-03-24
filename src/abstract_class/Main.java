package abstract_class;

public class Main {
    public static void main(String[] args) {

        CarB carB = new CarB("nexia", "black", "160");
        carB.gas();
        carB.brake();
        System.out.println(carB.toString());

        Car carC = new CarC("kamaz", "wright", "140");
        carC.brake();
        carC.gas();
        System.out.println(carC.toString());
    }
}

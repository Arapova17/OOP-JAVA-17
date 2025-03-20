package slack.oop;

public class Flower {
    String flowerName;
    int freshness;
    double price;

    // Конструктор
    public Flower(String flowerName, int freshness, double price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }

    // Гүлдүн маалыматтарын чыгаруучу метод
    public void displayFlower() {
        System.out.println("Аты: " + flowerName + ", Жаңылыгы: " + freshness + ", Баасы: " + price);
    }


}

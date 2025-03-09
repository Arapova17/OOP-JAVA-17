package Slack.OOP;

public class FlowerMain {
    public static void main(String[] args) {

        // Гүл объектилерин түзүү
        Flower rose = new Flower("Роза", 7, 150.0);
        Flower tulip = new Flower("Жоогазын", 9, 120.5);
        Flower lily = new Flower("Лилия", 6, 180.0);
        Flower daisy = new Flower("Ромашка", 8, 90.0);

        // Гүлдөрдү массивге салуу
        Flower[] flowers = {rose, tulip, lily, daisy};

        // 🏆 Эң кымбат гүлдүн баасын табуу
        double maxPrice = FlowerShop.findMostExpensiveFlower(flowers);
        System.out.println("Эң кымбат гүлдүн баасы: " + maxPrice);

        // 🌿 Жаңылыгы боюнча сорттоо (Bubble Sort)
        FlowerShop.sortFlowersByFreshness(flowers);
        System.out.println("\nГүлдөр жаңылыгына жараша сорттолгон:");
        for (Flower flower : flowers) {
            flower.displayFlower();
        }

    }
}

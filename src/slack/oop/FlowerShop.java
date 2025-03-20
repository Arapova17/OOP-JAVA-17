package slack.oop;

public class FlowerShop {
    // Эң кымбат гүлдү табуучу метод
    public static double findMostExpensiveFlower(Flower[] flowers) {
        double maxPrice = 0;
        for (Flower flower : flowers) {
            if (flower.price > maxPrice) {
                maxPrice = flower.price;
            }
        }
        return maxPrice;
    }

    // Гүлдөрдү жаңылыгына жараша сорттоо (Bubble Sort колдонуу)
    public static void sortFlowersByFreshness(Flower[] flowers) {
        int n = flowers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flowers[j].freshness < flowers[j + 1].freshness) {
                    // Эгер кийинки гүлдүн жаңылыгы көбүрөөк болсо, орундарын алмаштыруу
                    Flower temp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temp;
                }
            }
        }
    }
}

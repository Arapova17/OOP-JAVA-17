package slack.inheritance_task;

public class InheritanceMain {
    public static void main(String[] args) {

        // Телефондор
        Phone phone1 = new Phone("Samsung", 2023, "Galaxy S23");
        Phone phone2 = new Phone("Apple", 2022, "iPhone 14");

        // Компьютерлер
        Computer comp1 = new Computer("Dell", 2021, "Intel i7");
        Computer comp2 = new Computer("Asus", 2024, "AMD Ryzen 9");

        // Акылдуу сааттар
        SmartWatch watch1 = new SmartWatch("Xiaomi", 2022, true);
        SmartWatch watch2 = new SmartWatch("Garmin", 2023, false);

        // Бардык түзмөктөрдүн маалыматтарын жана иштетүү методдорун чакыруу
        Technique[] devices = {phone1, phone2, comp1, comp2, watch1, watch2};

        for (Technique device : devices) {
            System.out.println("\n" + device);
            System.out.println(device.turnOnOff());
        }
    }
}
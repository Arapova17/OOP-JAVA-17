package enum_lesson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Region[] values = Region.values();
        System.out.println(Arrays.toString(values));

        for (Region region : Region.values()){
            System.out.println(region); region.feature();
        }
    }
}

package lms.task_enum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Күндү киргизиңиз (англис тилинде, мисалы: MONDAY): ");
        String inputDay = scanner.nextLine().toUpperCase();

        Day[] days = new Day[]{Day.valueOf(inputDay)};
        for (Day day : days){
            switch (day) {
                case MONDAY:
                    System.out.println("Дүйшөмбү күнү Жава окуйм.");
                    break;
                case TUESDAY:
                    System.out.println("Шейшемби күнү Англис тили сабагын окуйм.");
                    break;
                case WEDNESDAY:
                    System.out.println("Шаршемби күнү Математика сабагын окуйм.");
                    break;
                case THURSDAY:
                    System.out.println("Бейшемби күнү Физика сабагын окуйм.");
                    break;
                case FRIDAY:
                    System.out.println("Жума күнү Химия сабагын окуйм.");
                    break;
                case SATURDAY:
                    System.out.println("Ишемби күнү программалоо боюнча практика жасайм.");
                    break;
                case SUNDAY:
                    System.out.println("Жекшемби күнү эс алам.");
                    break;
                default:
                    System.out.println("Жараксыз күн.");
                    break;
            }
        }
    }
}

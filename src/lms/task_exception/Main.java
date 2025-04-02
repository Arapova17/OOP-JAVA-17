package lms.task_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Каалаган фигураны тандаңыз:");
            System.out.println("1 - Параллелепипед");
            System.out.println("2 - Цилиндр");
            System.out.print("Тандоо (1 же 2): ");
            int figureChoice = Integer.parseInt(scanner.nextLine());

            if (figureChoice == 1) {
                System.out.print("Параллелепипеддин узундугун киргизиңиз: ");
                double length = Double.parseDouble(scanner.nextLine());
                System.out.print("Параллелепипеддин туурасын киргизиңиз: ");
                double width = Double.parseDouble(scanner.nextLine());
                System.out.print("Параллелепипеддин бийиктигин киргизиңиз: ");
                double height = Double.parseDouble(scanner.nextLine());

                if (length <= 0 || width <= 0 || height <= 0) {
                    throw new IllegalArgumentException("Бардык параметрлер оң сан болушу керек.");
                }

                double area = Parallelepiped.calculateArea(length, width, height);
                double volume = Parallelepiped.calculateVolume(length, width, height);

                System.out.println("Параллелепипеддин аянты: " + area);
                System.out.println("Параллелепипеддин колому: " + volume);
            } else if (figureChoice == 2) {
                System.out.print("Цилиндрдин радиусун киргизиңиз: ");
                double radius = Double.parseDouble(scanner.nextLine());
                System.out.print("Цилиндрдин бийиктигин киргизиңиз: ");
                double height = Double.parseDouble(scanner.nextLine());

                if (radius <= 0 || height <= 0) {
                    throw new IllegalArgumentException("Радиус жана бийиктик оң сан болушу керек.");
                }

                double area = Cylinder.calculateArea(radius, height);
                double volume = Cylinder.calculateVolume(radius, height);

                System.out.println("Цилиндрдин аянты: " + area);
                System.out.println("Цилиндрдин колому: " + volume);
            } else {
                System.out.println("Таңдалган фигура туура эмес.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Киргизилген маалымат сан эмес! Текшерип кайра киргизиңиз.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ката: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Жөнүндө ката пайда болду: " + e.getMessage());
        }
    }
}


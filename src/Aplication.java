import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Aplication {
    public static void main(String[] args) {
        Goverment goverment = new Goverment();

        while (true) {
            menu();

            Scanner scanner = new Scanner(System.in);
            switch (scanner.next()) {
                case "1" :
                    goverment.addFraction();
                    break;
                case "2" :
                    goverment.deleteFraction();
                    break;
                case "3" :
                    goverment.showFractions();
                    break;
                case "4" :
                    goverment.clearFraction();
                    break;
                case "5" :
                    goverment.getFraction();
                    break;
                case "6" :
                    goverment.fractionAddDeputata();
                    break;
                case "7" :
                    goverment.deletedDeputatFraction();
                    break;
                case "8" :
                    goverment.showAllBribers();
                    break;
            }
        }
    }
    public static void menu() {
        System.out.println("ВВедіть 1 щоб додати фракцію");
        System.out.println("ВВедіть 2 щоб видалити конкретну фракцію");
        System.out.println("Введіть 3 щоб вивести усі фракції");
        System.out.println("ВВедіть 4 щоб очистити конкретну фракцію");
        System.out.println("Введіть 5 щоб вивести конкретну фракцію");
        System.out.println("Введіть 6 щоб добавити депутата в фракцію");
        System.out.println("Введіть 7 щоб видалити депутата з фракції");
        System.out.println("Введіть 8 щоб вивести список хабарників");
    }
}
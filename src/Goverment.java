import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Goverment {

    List<Fraction> fractionList = new ArrayList<>();

    public Goverment(){
    }
    public void addFraction(){
        System.out.println("ВВедіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFraction = scanner.next();
        Fraction newFraction = new Fraction (nameFraction);
        fractionList.add(newFraction);
        System.out.println("фракція  "+nameFraction+ "  добавлена");
    }
    public void showFractions(){
        System.out.println(fractionList);
    }

    public void deleteFraction(){
        showFractions();
        System.out.println("ВВедіть індекс фракції яку ви хочете видалити починаючи з 0");
        Scanner scanner = new Scanner(System.in);
        int deleteIndex = scanner.nextInt();
        fractionList.remove(deleteIndex);
    }

    public void getFraction(){
        showFractions();
        System.out.println("ВВедіть індекс фракції яку ви хочете вивсети починаючи з 0");
        Scanner scanner = new Scanner(System.in);
        int getIndex = scanner.nextInt();
        fractionList.get(getIndex);
    }
    public void fractionAddDeputata(){
        System.out.println("Введіть будь ласка індекс фракції в яку ви хочете добавити депутата");
        Scanner scanner = new Scanner(System.in);
        int inndex = scanner.nextInt();
        fractionList.get(inndex).addDeputat();
    }

    public void clearFraction(){
        System.out.println("ВВедіть індекс фракції яку ви хочете почистити починаючи з 0");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        fractionList.get(index).deleteAllDeputativ();
    }

    public void deletedDeputatFraction(){
        System.out.println("Введіть індекс депутата якого ви хочете видалити з фракції починаючи з 0");
        Scanner scanner = new Scanner(System.in);
        int deputatIndex = scanner.nextInt();
        fractionList.get(deputatIndex).deleteDeputata();
    }

    public void showAllBribers(){
        System.out.println("Введіть номер фракції в якій буде список хабарників");
        Scanner scanner = new Scanner(System.in);
        int fractionIndex = scanner.nextInt();
        fractionList.get(fractionIndex).showBribers();
    }



}

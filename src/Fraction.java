import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fraction {
        public String nameFraction;
        List<Depytat> depytatList = new ArrayList<>();
        List<Depytat> bribers = new ArrayList<>();

    public Fraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    public Fraction(){
    }

    public void addDeputat(){
        System.out.println("введіть вагу ");
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        System.out.println("Введіть ріст ");
        scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        System.out.println("Введіть Імя");
        scanner = new Scanner(System.in);
        String firstName = scanner.next();

        System.out.println("ВВедіть Фамілію");
        scanner = new Scanner(System.in);
        String secondName = scanner.next();

        System.out.println("Кількість років");
        scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("Чи бере депутат взятки true або false");
        scanner = new Scanner(System.in);
        Boolean bribe = scanner.nextBoolean();
        Depytat addDepytaty = new Depytat(weight, height, firstName, secondName, age, bribe);

        depytatList.add(addDepytaty);
        System.out.println(addDepytaty);
    }
    public void showDeputats(){
        System.out.println(depytatList);
    }

    public void deleteDeputata(){
        showDeputats();
        System.out.println("ВВедіть індекс депутата якого ви хочете видалити");
        Scanner scanner = new Scanner(System.in);
        int deleteIndex = scanner.nextInt();
        depytatList.remove(deleteIndex);
    }
    public void showBribers(){
        for(Depytat depytatRun:depytatList){
            if(depytatRun.isBribe()){
                bribers.add(depytatRun);
            }
        }
        System.out.println(bribers);
    }

    public void deleteAllDeputativ() {
        depytatList.clear();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "nameFraction='" + nameFraction + '\'' +
                ", depytatList=" + depytatList +
                ", bribers=" + bribers +
                '}';
    }
}

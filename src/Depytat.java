public class Depytat extends Human{

    private String firstName;
    private String secondName;
    private int age;
    private boolean bribe;

    public Depytat(int weight, int height, String firstName, String secondName, int age, boolean bribe) {
        super(weight,height);
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.bribe = bribe;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    @Override
    public String toString() {
        return "Depytat{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                '}';
    }
}

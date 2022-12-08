package domJivot;

public class Popugay {
    int age;
    String name;
    String breed;
    String ownerName;

    public Popugay(int age, String name, String breed, String ownerName) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
    }

    public Popugay() {
    }

    @Override
    public String toString() {
        return "Popugay{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

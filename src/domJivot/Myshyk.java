package domJivot;

public class Myshyk {
    int age;
    String name;
    String breed;
    String ownerName;

    public Myshyk(int age, String name, String breed, String ownerName) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
    }

    public Myshyk() {
    }

    @Override
    public String toString() {
        return "Myshyk{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

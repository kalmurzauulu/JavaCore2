package domJivot;

public class Balyk {
     int age;
     String name;
     String breed;
     String ownerName;

    public Balyk(int age, String name, String breed, String ownerName) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
    }

    public Balyk() {
    }

    @Override
    public String toString() {
        return "Balyk{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

package farm;

public class Horse extends DomesticAnimals {

    public String color;

    public Horse(int weight, int age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

}

package person;

public class Singer extends Person{
    private String gruppname;

    public Singer(String name, String designation, String gruppname) {
        super(name, designation);
        this.gruppname = gruppname;
    }

    public void sing(){

        System.out.println("singing");
    }
    public void playGitar(){
        System.out.println("playGitar");
    }

    public String getGruppname() {
        return gruppname;
    }

    public void setGruppname(String gruppname) {
        this.gruppname = gruppname;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name=" + getName()+
                ", designation=" + getDesignation()+
                ", gruppname='" + gruppname + '\'' +
                '}';
    }
}

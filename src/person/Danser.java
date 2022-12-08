package person;

public class Danser extends Person{
    private String bandname;

    public Danser(String name, String designation, String bandname) {
        super(name, designation);
        this.bandname = bandname;
    }

    public void dance(){
        System.out.println("dancing");
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }

    @Override
    public String toString() {
        return "Danser{" +
                "name=" + getName()+
                ", designation=" + getDesignation()+
                ", bandname='" + bandname + '\'' +
                '}';
    }
}

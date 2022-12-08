package farm;

import farm.Cow;
import farm.Horse;
import farm.Sheep;

import java.util.Arrays;

public class Farm {
private String address;
private String ownerName;
private Sheep[] sheeps;
private Cow [] cows;
private Horse[] horses;

    public Farm(String address, String ownerName, Sheep[] sheeps, Cow[] cows, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.sheeps = sheeps;
        this.horses = horses;
        this.cows = cows;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}

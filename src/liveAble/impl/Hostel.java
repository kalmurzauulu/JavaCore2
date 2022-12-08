package liveAble.impl;

import liveAble.PayRent;
import liveAble.PayUtilities;
import liveAble.model.Family;
import liveAble.LiveAble;
import liveAble.model.Person;

public class Hostel implements LiveAble, PayRent {
    public Hostel() {
    }

    @Override
    public void payRent() {
        System.out.println("Jiteli obshejitiya platyat za arendu");
    }

    @Override
    public void live() {
        Person person1 = new Person("Ymangazy","Pazylov",23,"2-Ak-buura");
        Person person2 = new Person("Bekgazy","Pazylov",21,"2-Ak-buura");
        Person person3 = new Person("Mamatgazy","Pazylov",27,"2-Ak-buura");

        Person[] people = {person1,person2,person3};
        Family family = new Family(people);
        System.out.println("V obshejitie jivut " + people.length + " lyudey: "+ family);
    }

}

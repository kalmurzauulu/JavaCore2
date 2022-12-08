package liveAble.impl;

import liveAble.PayRent;
import liveAble.PayUtilities;
import liveAble.model.Family;
import liveAble.LiveAble;
import liveAble.model.Person;

public class Flat implements LiveAble, PayUtilities {
    public Flat() {
    }
    @Override
    public void live() {
        Person person1 = new Person("Shergazy","Alimbaev",25,"Masaliev 91/7");
        Person person2 = new Person("Nurgazy", "Alimbaev", 28,"Masaliev 91/7");
        Person person3 = new Person("Mirgazy", "Alimbaev", 20,"Masaliev 91/7");

        Person[] people = {person1,person2,person3};
        Family family = new Family(people);
        System.out.println("V kvartire jivut " + people.length + " lyudey: "+ family);
    }
    @Override
    public void payUtilities() {
        System.out.println("Jitely kvartiry platyat za kom.uslugi");
    }
}

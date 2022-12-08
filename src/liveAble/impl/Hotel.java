package liveAble.impl;

import liveAble.PayRent;
import liveAble.PayUtilities;
import liveAble.model.Family;
import liveAble.LiveAble;
import liveAble.model.Person;

public class Hotel implements LiveAble, PayRent {
    public Hotel() {
    }
    @Override
    public void live() {
        Person person1 = new Person("Baygazy","Aydarkulov",24,"Achuk Asman 25");
        Person person2 = new Person("Amirgazy","Aydarkulov",26,"Achuk Asman 25");
        Person person3 = new Person("Kurmangazy","Aydarkulov",23,"Achuk Asman 25");

        Person[] people = {person1,person2,person3};
        Family family = new Family(people);
        System.out.println("V otele jivut " +people.length + " lyudey: " + family);
    }
    @Override
    public void payRent() {
        System.out.println("Jiteli otelya platyat za arendu");
    }

}

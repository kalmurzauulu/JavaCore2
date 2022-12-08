import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Mouse;

public class Main {
    public static void main(String[] args) {
//        Cat cat2 = new Cat();
//        cat2.voice();
//        cat2.age=15;
//        cat2.breed="Angora";
//        cat2.weight=100;
//        cat2.name="Taygan";
//        System.out.println(cat2.breed);
//        System.out.println(cat2.age);
//        System.out.println(cat2.weight);
//        System.out.println(cat2.name);

//        Cat cat1 = new Cat();
//        cat1.voice();
//        cat1.age=15;
//        cat1.breed="Angora";
//        cat1.weight=100;
//        cat1.name="Taygan";
//        System.out.println(cat1.breed);
//        System.out.println(cat1.age);
//        System.out.println(cat1.weight);
//        System.out.println(cat1.name);

//        tikBurch.TikBurch tikBurch = new tikBurch.TikBurch();
//        tikBurch.setUzunu(15);
//        tikBurch.setTuurasy(25);
//        tikBurch.ayant();
//        System.out.println(tikBurch.ayant());

//        Kurs kurs = new Kurs();
//        Student student = new Student();
//        student.setName("Sher");
//        student.setSurname("Nur");
//        student.setAge(8);
//        student.setTuulganKun(LocalDate.of(1998,01,02));
//
//        kurs.setName("Java");
//        kurs.setId(1);
//        kurs.setTeacherName("Asan");
//        kurs.setBashtalganKun(LocalDate.of(2021,10,01));
//        System.out.println(kurs);
//        System.out.println(student);

//        Balyk balyk = new domJivot.Balyk(12,"Nemo","Kloun","Sher");
//        Popugay popugay = new domJivot.Popugay(12,"alaChymchyk","volnystyy","Sher");
//        Myshyk myshyk = new domJivot.Myshyk(12,"Taygan","Angora","Sher");
//
//        System.out.println(balyk);
//        System.out.println(popugay);
//        System.out.println(myshyk);

//        Klass klass = new catKlass.Klass(new String[]{"besh", "adfjfdg", "djvadjdvj"}, new int[]{25, 58, 256, 79631});
//        System.out.println(klass);

//        Д/З № 16
//        Circle.radius=3;
//        System.out.println(Circle.area());
//        System.out.println(Circle.circumreference());

//      Д/З 17.2
//        Sheep sheep1 = new Sheep(15,11,'m',"Kashka");
//        Sheep sheep2 = new Sheep(18,18,'f',"Mers");
//        Sheep sheep3 = new Sheep(11,14,'m',"Audi");
//        Sheep sheep4 = new Sheep(16,7,'f',"Mars");
//        Horse horse1 = new Horse(75,3,'m',"Bashka","toru");
//        Horse horse2 = new Horse(73,9,'f',"Rashka","kok");
//        Horse horse3 = new Horse(79,7,'m',"Pushka","boz");
//        Cow cow1 = new Cow(90,8,'m',"Bereke");
//        Cow cow2 = new Cow(90,1,'f',"Kut");
//        Cow cow3 = new Cow(90,4,'m',"At");
//        Cow cow4 = new Cow(90,7,'f',"Taygan");
//        Cow cow5 = new Cow(90,5,'m',"Yrusky");
//        Cow cow6 = new Cow(90,5,'f',"Alabay");
//
//        Cow[] cows1 ={cow1,cow2,cow3,cow4,cow5};
//        Cow[] cows2 ={cow6};
//        Sheep[] sheeps1 = {sheep1,sheep2,sheep3};
//        Sheep[] sheeps2 = {sheep4};
//        Horse[] horses1 = {horse1,horse2};
//        Horse[] horses2 = {horse3};
//        Farm farm1 = new farm.Farm("Masaliev 91/7","Sher",sheeps1,cows1,horses1);
//        Farm farm2 = new farm.Farm("2-Ak-Buura 14","Sher",sheeps2,cows2,horses2);
//        System.out.println("Farm1: "+ farm1);
//        System.out.println("Farm2: "+ farm2);

//        Д/З № 17,1
//        Programmer programmer = new Programmer("Sher","programmer","Sher&Co");
//        Danser danser = new Danser("Sher","danser","Sher's band");
//        Singer singer = new Singer("Sher","singer","Sher's grupp");
//        System.out.println(singer);
//        singer.sing();
//        singer.learn();
//        singer.eat();
//        singer.walk();
//        singer.playGitar();
//        System.out.println(programmer);
//        System.out.println(danser);
//
//        BakAble cake = new Cake();
//        BakAble bread = new Bread();
//        BakAble bun = new Bun();
//        bun.baked();
//        cake.baked();
//        bread.baked();

//        Д/З 18.1
//        FlyAble kanattuu = new Kanattuu();
//        FlyAble jarganat = new Jarganat();
//        FlyAble samolet = new Samolet();
//
//        samolet.functional();
//        jarganat.functional();
//        kanattuu.functional();

//        Д/З 18.2
//        Hostel hostel = new Hostel();
//        Hotel hotel = new Hotel();
//        Flat flat = new Flat();
//
//        flat.live();
//        flat.payUtilities();
//        hostel.live();
//        hostel.payRent();
//        hotel.live();
//        hotel.payRent();
//
//        Д/З 19
//        Animal dog1 = new Dog();
//        Animal dog2 = new Dog();
//        Animal cat1 = new Cat();
//        Animal cat2 = new Cat();
//        Animal mouse1 = new Mouse();
//        Animal mouse2 = new Mouse();
//
//        Dog[] dogs = new Dog[2];
//        Cat[] cats = new Cat[2];
//        Mouse[] mouse = new Mouse[2];
//
//        int a= 0;
//        int b= 0;
//        int c= 0;
//
//        Animal[] animals = {dog1,dog2,mouse1,cat2,cat1,mouse2};
//        for (Animal an :animals) {
//            if (an instanceof Dog){
//                ((Dog) an).attackCat();
//                dogs[a]= (Dog) an;
//                a++;
//            } else if (an instanceof Cat) {
//                ((Cat) an).attackMouse();
//                cats[b]= (Cat) an;
//                b++;
//            }else if(an instanceof Mouse){
//                ((Mouse) an).eatChees();
//                mouse[c]=(Mouse) an;
//                c++;
//            }
//        }
//
//        for (Dog d:dogs) {
//            System.out.println(d);
//        }
//        for (Cat n : cats) {
//            System.out.println(n);
//        }
//        for (Mouse m : mouse) {
//            System.out.println(m);
//        }


    }
}
package at.htlleonding.person;

import java.time.LocalDate;
import java.time.Month;


public class MainClass  {

    public static void main(String[] args) {

//        Person person = new Person();
//
//        Person hansi = new Person("Hansi", "Müller");
//        hansi.setCity("Marchtrenk");
//
//        System.out.println(hansi);


        Person seppl = new Person(
                "Almin",
                "Mahmutovic",
                2006,
                9,
                15,
                4481,
                "Asten",
                Gender.MALE
        );

        int age = seppl.age();
        System.out.println(age);

        Person hanan = new Person(
                "Hanan",
                "Mahic",
                2007,
                8,
                14,
                4020,
                "Linz",
                Gender.MALE
        );

        int hananage = hanan.age();
        System.out.println(hananage);
    }


}
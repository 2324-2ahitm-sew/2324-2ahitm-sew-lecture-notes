package at.htlleonding.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("A");
        liste.add("B");
        liste.add("C");
        System.out.println(liste);
        System.out.println(liste.get(1));

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(i + ": " + liste.get(i));
        }

    }

}

package at.htlleonding;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonTest {

    @Order(1000)
    @Test
    void createPerson() {

        Person hansi = new Person("hansi");

        hansi.incrKlassenVariable();
        hansi.incrObjektVariable();

        System.out.println(hansi);

        Person susi = new Person("Susi");
        susi.incrObjektVariable();
        susi.incrKlassenVariable();

        System.out.println(susi);

        Person seppl = new Person("Chipmunk");
        seppl.incrKlassenVariable();
        seppl.incrObjektVariable();

        System.out.println(seppl);

    }
}
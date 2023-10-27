//package at.htlleonding.person;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//
//import java.time.LocalDate;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
///*
//        <dependency>
//            <groupId>org.assertj</groupId>
//            <artifactId>assertj-core</artifactId>
//            <version>3.24.2</version>
//            <scope>test</scope>
//        </dependency>
// */
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class PersonTest {
//
//    @Order(1000)
//    @Test
//    void isDefaultConstructorAvailable() {
//
//        var person = new Person();
//        assertThat(person).isNotNull();
//
//    }
//
//
//    @Order(1010)
//    @Test
//    void isConstructorWithAllAttributes() {
//
//        var person = new Person("Mickey", "Mouse", 1950, 04, 01, 4060, "Leonding", Gender.MALE);
//
//        assertThat(person)
//                .extracting(
//                        Person::getFirstName,
//                        Person::getSurName,
//                        Person::getDobYear,
//                        Person::getDobMonth,
//                        Person::getDobDay,
//                        Person::getZipCode,
//                        Person::getCity,
//                        Person::getGender
//                )
//                .containsExactly(
//                        "Mickey",
//                        "Mouse",
//                        1950,
//                        04,
//                        01,
//                        4060,
//                        "Leonding",
//                        Gender.MALE
//                );
//    }
//
//    @Order(1020)
//    @Test
//    void isConstructorWithFirstNameAndLastName() {
//
//        var person = new Person("Mickey", "Mouse");
//
//        assertThat(person)
//                .extracting(
//                        Person::getFirstName,
//                        Person::getSurName,
//                        Person::getDobYear,
//                        Person::getDobMonth,
//                        Person::getDobDay,
//                        Person::getZipCode,
//                        Person::getCity,
//                        Person::getGender
//                )
//                .containsExactly(
//                        "Mickey",
//                        "Mouse",
//                        0,
//                        0,
//                        0,
//                        0,
//                        null,
//                        null
//                );
//    }
//
//    @Order(1030)
//    @Test
//    void testAge() {
//
//        var person = new Person(
//                "Mickey",
//                "Mouse",
//                LocalDate.now().getYear() - 1,
//                LocalDate.now().getMonthValue(),
//                LocalDate.now().getDayOfMonth(),
//                4060,
//                "Leonding",
//                Gender.MALE);
//
//        System.out.println(person.age());
//        assertThat(person.age()).isEqualTo(1);
//    }
//
//    @Order(1040)
//    @Test
//    void testAgeWithParameter() {
//
//        var person = new Person(
//                "Mickey",
//                "Mouse",
//                1950,
//                4,
//                1,
//                4060,
//                "Leonding",
//                Gender.MALE);
//
//        assertThat(person.age(1952,10,01)).isEqualTo(2);
//        assertThat(person.age(1952,1,01)).isEqualTo(1);
//    }
//
//    @Order(1050)
//    @Test
//    void testToString() {
//
//        var person = new Person(
//                "Mickey",
//                "Mouse",
//                1950,
//                04,
//                01,
//                4060,
//                "Leonding",
//                Gender.MALE);
//
//        assertThat(person.toString()).isEqualToIgnoringWhitespace("Mickey Mouse, wohnhaft in 4060 Leonding, geboren am 1. April 1950");
//
//    }
//
//    @Order(1060)
//    @Test
//    void testGetDate() {
//
//        var person = new Person(
//                "Mickey",
//                "Mouse",
//                1950,
//                04,
//                01,
//                4060,
//                "Leonding",
//                Gender.MALE);
//
//        assertThat(person.getDate()).isEqualTo("1950-04-01");
//
//
//    }
//
//}
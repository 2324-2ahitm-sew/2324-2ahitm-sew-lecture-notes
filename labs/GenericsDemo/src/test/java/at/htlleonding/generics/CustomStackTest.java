package at.htlleonding.generics;

import org.junit.jupiter.api.Test;

class CustomStackTest {

    @Test
    void pushElement() {

        CustomStack<Person> personStack = new CustomStack<Person>();

        System.out.println(personStack.push(new Person("Simone")));
        System.out.println(personStack.push(new Person("Susi")));
        System.out.println();
    }

    @Test
    void popElement() {
        CustomStack<Person> personStack = new CustomStack<Person>();

        System.out.println(personStack.push(new Person("Simone")));
        System.out.println(personStack.push(new Person("Susi")));

        System.out.println(personStack.pop());

    }

    @Test
    void popOnEmptyStack() {
        CustomStack<Person> personStack = new CustomStack<Person>();


        System.out.println(personStack.pop());

    }

    @Test
    void createStringStack() {
        CustomStack<String> stringStack = new CustomStack<String>();

        stringStack.push("unten");
        stringStack.push("mitte");
        stringStack.push("oben");

        System.out.println();


    }

    @Test
    void createStackWithStudent() {
        var mystack = new CustomStack<Person>();

        mystack.push(new Student());
        mystack.push(new Person("Bertl"));
    }
}
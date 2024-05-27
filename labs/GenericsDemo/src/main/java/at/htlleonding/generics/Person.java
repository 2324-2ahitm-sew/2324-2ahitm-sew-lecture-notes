package at.htlleonding.generics;

public class Person {

    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}

package at.htlleonding.person;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String surName;
    private int dobYear;
    private int dobMonth;
    private int dobDay;
    private int zipCode;
    private String city;
    private Gender gender;

    //region Constructors
    public Person() {
    }

    public Person(String firstName, String surName, int dobYear, int dobMonth, int dobDay, int zipCode, String city, Gender gender) {
        this.firstName = firstName;
        this.surName = surName;
        this.dobYear = dobYear;
        this.dobMonth = dobMonth;
        this.dobDay = dobDay;
        this.zipCode = zipCode;
        this.city = city;
        this.gender = gender;
    }

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    //endregion

    //region getter and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getDobYear() {
        return dobYear;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public int getDobDay() {
        return dobDay;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    //endregion

    /**
     *
     *
     *
     * @return the age of the person in whole years
     */
    public int age() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();


        return age(year, month, day);
    }

    public int age(int year, int month, int day) {

        int age = year - dobYear;

        if (month < dobMonth) {
            age--;
        }

        if (month == dobMonth) {
            if (day < dobDay) {
                age--;
            }
        }
        return age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", year=" + dobYear +
                ", month=" + dobMonth +
                ", day=" + dobDay +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                ", gender=" + gender +
                '}';
    }
}

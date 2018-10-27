package com.company;

public class Person {

    private String name;
    private String surname;
    private Gender gender;


    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(Gender sex) {
        this.gender = sex;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +

                '}';
    }

    @Override
    public boolean equals(Object secondObject) {

        Person otherPerson = (Person) secondObject;
        return this.name.equals(otherPerson.name) &&
                this.surname.equals(otherPerson.surname) &&
                this.gender.equals(otherPerson.gender);

    }

}

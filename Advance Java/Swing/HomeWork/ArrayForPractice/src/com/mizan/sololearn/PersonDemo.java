package com.mizan.sololearn;

public class PersonDemo {

    private String name;

    public PersonDemo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PersonDemo person; // 1
        person = new PersonDemo("Bazlur"); // 2
        System.out.println(""+ person.name);
        changePersonName(person); // 3
        person.changePersonName(person);
        System.out.println(" "+person.name);
    }

    public static void changePersonName(PersonDemo copyOfTheReferenceOfPersonObject) {
        copyOfTheReferenceOfPersonObject.setName("Rahman");
    }
}

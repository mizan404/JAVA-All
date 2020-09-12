/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.propractise;

/**
 *
 * @author mohdm
 */
public class PersonDemo {

    public static void main(String[] args) {
//        What is object cloning in java?
        Person person1 = new Person("Mizan", "Rahman", 25);
        System.out.println(""+ person1.getFirstName()+ " "+ person1.getLastName()+ " and age: "+ person1.getAge());
        try {
            Person clone = (Person) person1.clone();
            String firstName = clone.getFirstName();
            String lastName = clone.getLastName();
            int age = clone.getAge();
            System.out.println("name: " + firstName + " " + lastName + " and age: " + age);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}

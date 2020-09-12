/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

/**
 *
 * @author mohdm
 */
public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public static void main(String[] args) {
        Employee em1 = new Employee("A", 101);
        Employee em2 = new Employee("B", 102); 
        System.out.println(em1.name+" "+em1.id);
        System.out.println(em2.name+" "+em2.id);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author ACER
 */
public class Person {

    String name;

    public Person() {
        this.name = null;
        System.out.println("kişi nesnesi oluşturuldu");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

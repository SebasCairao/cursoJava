/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Seba
 */
public  class Animal {

    protected String name;
    protected String food;
    protected Integer age;
    protected String raza;

    public Animal(String name, String food, Integer age, String raza) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.raza = raza;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public Integer getAge() {
        return age;
    }

    public String getRaza() {
        return raza;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    


public void alimento (){

    System.out.println("se alimenta de " +this.food);
}
}
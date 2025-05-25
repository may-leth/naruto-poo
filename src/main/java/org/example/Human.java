package org.example;

import Interfaces.Introduce;

public class Human implements Introduce {
    protected String name;
    protected String aldea;
    protected String occupation;
    protected int age;

    public Human(String aldea, String occupation, String name, int age) {
        this.aldea = aldea;
        this.occupation = occupation;
        this.name = name;
        this.age = age;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", aldea='" + aldea + '\'' +
                ", occupation='" + occupation + '\'' +
                ", edad=" + age +
                '}';
    }

    @Override
    public String presentation() {
        return "Hola, mi nombre es " + this.name + ", tengo " + this.age + " años, soy " + this.occupation + " en " + this.aldea + ".";
    }
}

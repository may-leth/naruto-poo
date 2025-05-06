package org.example;

public class Human {
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

    public int getEdad() {
        return age;
    }

    public void setEdad(int edad) {
        this.age = edad;
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
}

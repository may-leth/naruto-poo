package org.example;

public class Human {
    protected String name;
    protected String aldea;
    protected String occupation;
    protected int edad;

    public Human(String aldea, String occupation, String name, int edad) {
        this.aldea = aldea;
        this.occupation = occupation;
        this.name = name;
        this.edad = edad;
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
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", aldea='" + aldea + '\'' +
                ", occupation='" + occupation + '\'' +
                ", edad=" + edad +
                '}';
    }
}

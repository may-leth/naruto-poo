package org.example;

import Interfaces.ChakraUser;
import Interfaces.Introduce;

public class Ninja extends Human implements Introduce, ChakraUser {
    protected String clan;
    protected String ninjaLevel;
    protected String summoning;
    protected String chakraType;

    public Ninja(String aldea, String occupation, String name, int age, String clan, String ninjaLevel, String summoning, String chakraType) {
        super(aldea, occupation, name, age);
        this.clan = clan;
        this.ninjaLevel = ninjaLevel;
        this.summoning = summoning;
        this.chakraType = chakraType;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getNinjaLevel() {
        return ninjaLevel;
    }

    public void setNinjaLevel(String ninjaLevel) {
        this.ninjaLevel = ninjaLevel;
    }

    public String getSummoning() {
        return summoning;
    }

    public void setSummoning(String summoning) {
        this.summoning = summoning;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", clan='" + clan + '\'' +
                ", ninjaLevel='" + ninjaLevel + '\'' +
                ", summoning='" + summoning + '\'' +
                ", chakraType='" + chakraType + '\'' +
                ", aldea='" + aldea + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String presentation(){
        return "Hola, soy " + super.name + " del clan " + this.clan + ", un ninja de nivel " + this.ninjaLevel +
                " de la aldea " + this.aldea + ". Mi técnica de invocación está relacionada con " + this.summoning +
                ". ¡Estoy siempre listo para proteger a mi gente con todo mi poder!";
    }

    @Override
    public String chakraNature() {
        return "Mi tipo de chakra en afín al estilo elemental: " + this.chakraType;
    }

    public void summon(Animal animal){
        System.out.println(this.name + " ha invocado a " + animal.getAnimal() + ".");
        System.out.println(animal.presentation());
    }
}

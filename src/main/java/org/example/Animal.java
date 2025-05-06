package org.example;

public class Animal {
    protected String animal;
    protected String lifeStage;
    protected boolean isBiju;
    protected String chakraType;

    public Animal(String animal, String lifeStage, boolean isBiju, String chakraType) {
        this.animal = animal;
        this.lifeStage = lifeStage;
        this.isBiju = isBiju;
        this.chakraType = chakraType;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getLifeStage() {
        return lifeStage;
    }

    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    public boolean getIsBiju() {
        return isBiju;
    }

    public void setIsBiju(boolean isBiju) {
        this.isBiju = isBiju;
    }

    public String getChakraType() {
        return chakraType;
    }

    public void setChakraType(String chakraType) {
        this.chakraType = chakraType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + animal + '\'' +
                ", lifeStage='" + lifeStage + '\'' +
                ", biju=" + isBiju +
                ", chakraType='" + chakraType + '\'' +
                '}';
    }
}

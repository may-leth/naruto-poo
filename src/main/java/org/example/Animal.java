package org.example;

public class Animal {
    protected String animal;
    protected String lifeStage;
    protected boolean biju;
    protected String chakraType;

    public Animal(String animal, String lifeStage, boolean biju, String chakraType) {
        this.animal = animal;
        this.lifeStage = lifeStage;
        this.biju = biju;
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

    public boolean isBiju() {
        return biju;
    }

    public void setBiju(boolean biju) {
        this.biju = biju;
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
                "animal='" + animal + '\'' +
                ", lifeStage='" + lifeStage + '\'' +
                ", biju=" + biju +
                ", chakraType='" + chakraType + '\'' +
                '}';
    }
}

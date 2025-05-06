package org.example;

public class Ninja extends Human {
    protected String clan;
    protected String ninjaLevel;
    protected String summoning;

    public Ninja(String aldea, String occupation, String name, int age, String clan, String ninjaLevel, String summoning) {
        super(aldea, occupation, name, age);
        this.clan = clan;
        this.ninjaLevel = ninjaLevel;
        this.summoning = summoning;
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
                "clan='" + clan + '\'' +
                ", ninjaLevel='" + ninjaLevel + '\'' +
                ", summoning='" + summoning + '\'' +
                ", name='" + name + '\'' +
                ", aldea='" + aldea + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                '}';
    }
}

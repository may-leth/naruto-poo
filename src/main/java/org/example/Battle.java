package org.example;

public class Battle {
    public static void fight(Ninja one, Ninja two) {
        System.out.println(one.getName() + " vs " + two.getName());
        if (one.getNinjaLevel().equalsIgnoreCase("jounin") && !two.getNinjaLevel().equalsIgnoreCase("jounin")) {
            System.out.println(one.getName() + " gana por experiencia.");
        } else {
            System.out.println("¡Es una pelea reñida!");
        }
    }

    public static void start(Ninja ninja, Animal animal) {
        System.out.println("¡Comienza la batalla!");
        System.out.println(ninja.getName() + " invoca a " + animal.getAnimal());
        System.out.println("Elemento del ninja: " + ninja.getChakraType());
        System.out.println("Elemento del animal invocado: " + animal.getChakraType());

        if (ninja.getChakraType().equalsIgnoreCase(animal.getChakraType())) {
            System.out.println("¡Gran sinergia de chakras! El ataque es devastador.");
        } else {
            System.out.println("La combinación de chakras no es perfecta, pero funciona.");
        }
    }
}

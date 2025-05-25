package org.example;

import Interfaces.Introduce;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("🌀 BIENVENIDO AL MUNDO NINJA 🌀\n");

        Human teuchi = new Human("Konoha", "chef", "Teuchi", 47);
        Ninja naruto = new Ninja("Konoha", "ninja", "Naruto", 17, "Uzumaki", "chunin", "sapos", "aire");
        Animal gamabunta = new Animal("sapo", "adulto-nodefinido", false, "agua");
        Animal kyubi = new Animal("zorro", "adulto", true, "fuego");
        Ninja sasuke = new Ninja("Konoha", "ninja renegado", "Sasuke", 17, "Uchiha", "genin", "serpientes", "rayo");

        //Human information
        System.out.println("👤 HUMANOS:");
        System.out.println(teuchi);
        teuchi.setAge(48);
        System.out.println("Edad actualizada: " + teuchi.getAge() + "\n");

        //Animal information
        System.out.println("🦊 ANIMALES:");
        System.out.println(gamabunta);
        System.out.println(kyubi + "\n");

        //presentations
        System.out.println("🌀 Conoce a nuestros aldeanos 🌀");
        System.out.println(teuchi.presentation());
        List<Introduce> characters = Arrays.asList(naruto, sasuke, gamabunta, kyubi);
        introduceCharacter(characters);
        System.out.println();

        //Summons
        System.out.println("🐸 Invocación: ");
        naruto.summon(gamabunta);
        System.out.println();

        //start a battle
        System.out.println("⚔️ BATALLA CON INVOCACIÓN:");
        Battle.start(naruto, gamabunta);
        System.out.println();

        System.out.println("🔥 DUELO NINJA:");
        Battle.fight(naruto, sasuke);

    }

    public static void introduceCharacter(List<Introduce> list) {
        for(Introduce p : list){
            System.out.println("- " + p.presentation());
        }
    }
}
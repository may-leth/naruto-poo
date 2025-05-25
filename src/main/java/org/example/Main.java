package org.example;

import Interfaces.Introduce;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human teuchi = new Human("konoha","chef","Teuchi",47);
        Ninja naruto = new Ninja("Konoha", "ninja", "Naruto", 17, "Uzumaki","chunin", "sapos", "aire");
        Animal gamabunta = new Animal("sapo", "adulto-nodefinido",false, "agua");

        System.out.println(teuchi.toString());
        teuchi.setAge(48);
        System.out.println(teuchi.getAge());

        Animal kyubi = new Animal("zorro", "adulto", true, "fuego");
        System.out.println(kyubi.toString());

        Ninja sasuke = new Ninja("konoha", "ninja renegado", "Sasuke", 17, "Uchiha", "genin", "serpientes", "rayo");

        //presentations
        System.out.println(teuchi.presentation());
        List<Introduce> character = Arrays.asList(naruto, sasuke, gamabunta, kyubi);
        introduceCharacter(character);

        //Summons
        naruto.summon(gamabunta);

        //start a battle
        Battle.start(naruto, gamabunta);
        Battle.fight(naruto, sasuke);


    }

    public static void introduceCharacter(List<Introduce> list) {
        for(Introduce p : list){
            System.out.println(p.presentation());
        }
    }
}
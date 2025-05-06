package org.example;

public class Main {
    public static void main(String[] args) {
        Human teuchi = new Human("konoha","chef","Teuchi",47);
        Ninja naruto = new Ninja("Konoha", "ninja", "naruto", 17, "uzumaki","chunin", "sapos");
        Animal gamabunta = new Animal("sapo", "adulto-nodefinido",false, "agua");

        System.out.println(teuchi.toString());
        System.out.println(naruto.toString());
        System.out.println(gamabunta.toString());

        teuchi.setAge(48);
        System.out.println(teuchi.getAge());

        Animal kyubi = new Animal("zorro", "adulto", true, "fuego");
        System.out.println(kyubi.toString());
        System.out.println(kyubi.presentation());
    }
}
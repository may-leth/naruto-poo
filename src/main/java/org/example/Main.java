package org.example;

public class Main {
    public static void main(String[] args) {
        Human teuchi = new Human("konoha","chef","Teuchi",47);
        Ninja naruto = new Ninja("Konoha", "ninja", "naruto", 17, "uzumaki","shunin", "sapos");

        System.out.println(teuchi.toString());
        System.out.println(naruto.toString());
    }
}
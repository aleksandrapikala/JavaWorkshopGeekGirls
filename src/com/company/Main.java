package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Dicer dice = new Dicer(4);
        dice.rzut(1,6);

        Dicer dice1 = new Dicer(3);
        dice1.throwDices();

        Person ola = new Person("Ola", "Pikala", Gender.FEMALE);
        Person ola1 = new Person("Ola", "Pikala", Gender.FEMALE);
        System.out.println(ola);

        String a = new String("Java");
        String b = new String("Java");
        String c = "java";
        String d = "java";
        System.out.println(a.equals(b));
        System.out.println(ola.equals(ola1));
    }
}

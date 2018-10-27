package com.company;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        String[] table = {"Monika", "Ola", "Maciek", "Stefa"};

        int sum = 0;

        for(int i=0; i < table.length; i++ ){
            System.out.println(table[i].toLowerCase());
            System.out.println(table[i].length());

            sum += table[i].length();

        }
        System.out.println(sum);



    }

}

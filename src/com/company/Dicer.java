package com.company;

import java.util.Random;

public class Dicer {

    private int noOfDices;



    public Dicer(int noOfDices) {
        this.noOfDices = noOfDices;
    }

    public void rzut(int min, int max) {

        int range = max-min + 1;

        int[] result = new int[this.getNoOfDices()];


        for (int i = 1; i <= this.getNoOfDices(); i++){

            int number = (int)(Math.random()*6) + min;

            result[i-1] = number;

        }

        for (int i = 0; i<result.length; i++){
            System.out.print(result[i]+",");
        }
        System.out.println();

    }

    public void throwDices(){


        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < this.getNoOfDices();i++){
            stringBuilder.append(random.nextInt(6) + 1).append(",");
        }

        stringBuilder.delete(stringBuilder.lastIndexOf(","),stringBuilder.length());
        stringBuilder.append("}");

        System.out.println(stringBuilder.toString());
    }


    public int getNoOfDices() {
        return noOfDices;
    }

    public void setNoOfDices(int noOfDices) {
        this.noOfDices = noOfDices;
    }


}

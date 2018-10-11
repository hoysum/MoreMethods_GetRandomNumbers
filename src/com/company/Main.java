package com.company;
//Print a 5 random numbers given a bound.

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Methods - Get 5 random numbers, Print them

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        getRandomNumbers(num);


    }

    public static int getRandomNumbers(int num) {
        Random ran = new Random();

        int index =0;

        System.out.println("Generate 5 random numbers");
        for (int counter = 1; counter <= 5; counter++) {
            index = ran.nextInt(num);
            System.out.println(index);
        }
        return  index;
    }
}





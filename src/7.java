package com.example;

import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("The random number is: " + randomNumber);
    }
}
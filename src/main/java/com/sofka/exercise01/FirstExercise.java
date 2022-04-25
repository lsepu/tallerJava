package com.sofka.exercise01;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        int firstNumber = 30;
        int secondNumber = 20;

        switch (Integer.compare(firstNumber, secondNumber)){
            case 1:
                System.out.println("el numero mayor es: " + firstNumber);
                break;
            case -1:
                System.out.println("el número mayor es: " + secondNumber);
                break;
            case 0:
                System.out.println("Los números son iguales");
                break;
        }

    }
}

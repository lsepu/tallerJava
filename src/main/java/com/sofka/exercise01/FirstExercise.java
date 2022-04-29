package com.sofka.exercise01;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        int firstNumber = 30;
        int secondNumber = 40;

        compareNumbers(firstNumber, secondNumber);
    }

    public static void compareNumbers(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            System.out.println("Números iguales");
        } else {
            System.out.println("El número mayor es: " + getBiggerNumber(firstNumber, secondNumber));
        }
    }

    public static int getBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

}

package com.sofka.exercise02;

import java.util.Scanner;

public class SecondExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int firstNumber = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int secondNumber = sc.nextInt();

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

package com.sofka.exercise02;

import java.util.Scanner;

public class SecondExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int firstNumber = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int secondNumber = sc.nextInt();

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

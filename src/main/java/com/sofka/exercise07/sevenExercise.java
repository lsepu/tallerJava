package com.sofka.exercise07;

import java.util.Scanner;

public class sevenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese el numero: ");
            num = sc.nextInt();
        } while( num < 0 );
        System.out.println("El numero es: "+ num);
    }
}

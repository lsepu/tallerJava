package com.sofka.exercise04;

import java.util.Scanner;

public class fourthExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto (pesos)");
        Double price = sc.nextDouble();
        System.out.println("El IVA es: " + price * 0.21 + " pesos");

    }



}

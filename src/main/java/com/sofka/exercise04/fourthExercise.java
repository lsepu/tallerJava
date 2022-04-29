package com.sofka.exercise04;

import java.util.Scanner;

public class fourthExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto (pesos)");
        Double price = sc.nextDouble();
        System.out.println("El precio con IVA es: " + totalPrice(price) + " pesos");
    }

    //calculate price with IVA
    public static Double totalPrice(Double price){
        Double priceIva = (price * 0.21);
        return price + priceIva;
    }



}

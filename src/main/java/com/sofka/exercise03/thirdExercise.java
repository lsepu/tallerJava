package com.sofka.exercise03;

import java.util.Scanner;

public class thirdExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("El área del círculo es: " + circleArea(radius));

    }

    public static Double circleArea(double radius) {
        //pi * r^2
        return Math.PI * Math.pow(radius, 2);
    }

}

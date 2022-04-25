package com.sofka.exercise08;

import java.util.Scanner;

public class eigthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana");
        String day = sc.nextLine();
        switch (day){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Día laboral");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("No es día laboral");
                break;
            default:
                System.out.println("No ingreso un día");
                break;
        }
    }
}

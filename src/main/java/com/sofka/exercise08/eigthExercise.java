package com.sofka.exercise08;

import java.util.Scanner;

public class eigthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana");
        String day = sc.nextLine().toLowerCase();

        checkWorkingDay(day);
    }

    public static void checkWorkingDay(String day){
        switch (day){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Día laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("No es día laboral");
                break;
            default:
                System.out.println("No ingreso un día");
                break;
        }
    }

}

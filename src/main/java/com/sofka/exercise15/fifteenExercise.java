package com.sofka.exercise15;

import java.util.Scanner;

public class fifteenExercise {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option!=8){
            printOtions();
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Nuevo actor");
                    break;
                case 2:
                    System.out.println("Buscar actor...");
                    break;
                case 3:
                    System.out.println("Eliminar actor...");
                    break;
                case 4:
                    System.out.println("Modificar actor");
                    break;
                case 5:
                    System.out.println("Ver todos los actores...");
                    break;
                case 6:
                    System.out.println("Ver peliculas de los actores...");
                    break;
                case 7:
                    System.out.println("Ver categoria de las peliculas de los actores...");
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }

    public static void printOtions(){
        System.out.println("****** GESTION CINEMATOGRAFICA ********");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6- VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");
    }
}

package com.sofka.exercise10;

import java.util.Scanner;

public class TenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String phrase = sc.nextLine();
        System.out.println("Frase sin espacios: " + removeSpaces(phrase));
    }

    public static String  removeSpaces(String phrase){
        return phrase.replace(" ","");
    }

}

package com.sofka.exercise12;

import java.util.Scanner;

public class twelveExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra");
        String firstWord = sc.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String secondWord = sc.nextLine();

        if(firstWord.equals(secondWord)){
            System.out.println("Palabras iguales");
        } else{

            //StringUtils.difference(firstWord, secondWord);
        }

    }


}

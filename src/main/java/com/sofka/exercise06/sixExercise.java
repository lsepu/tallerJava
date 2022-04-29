package com.sofka.exercise06;

public class sixExercise {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            checkEvenOrOdd(i);
        }
    }

    public static void checkEvenOrOdd(int num){
        String message = num % 2 == 0 ? "Número par" : "Número impar";
        System.out.println(num + ": " + message);
    }
}

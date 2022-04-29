package com.sofka.exercise05;

public class fifthExercise {
    public static void main(String[] args) {
        int num = 0;
        while (num < 100){
            num++;
            checkEvenOrOdd(num);
        }
    }

    public static void checkEvenOrOdd(int num){
        String message = num % 2 == 0 ? "Número par" : "Número impar";
        System.out.println(num + ": " + message);
    }

}

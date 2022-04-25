package com.sofka.exercise05;

public class fifthExercise {
    public static void main(String[] args) {
        int num = 1;
        while (num < 100){
            if ( num % 2 == 0){
                System.out.println("el " + num + " es un numero par\n");
            } else {
                System.out.println("el " + num + " es un numero impar\n");
            }
            num++;
        }
    }
}

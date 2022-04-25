package com.sofka.exercise14;

import java.util.Scanner;

public class fourteenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int cont = (num % 2 == 0) ? 1000 : 999;
        int newNum = num;

        while (newNum <= cont) {
            System.out.println(newNum);
            newNum = newNum+2;
        }

    }
}

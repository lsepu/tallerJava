package com.sofka.exercise16;

import java.util.Scanner;

public class sixteeenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese su Edad");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese su Sexo (H = hombre, M = mujer)");
        String text = sc.nextLine();
        char gender = text.charAt(0);
        System.out.println("Ingrese su Peso (kg) ");
        double weight = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese su Altura (mt)");
        double height = Double.parseDouble(sc.nextLine());

        Persona persona1 = new Persona(name, age, gender, weight, height);

        Persona persona2 = new Persona(name, age, gender);
        persona2.setPeso(weight);
        persona2.setAltura(height);

        Persona persona3 = new Persona();
        persona3.setNombre(name);
        persona3.setEdad(age);
        persona3.setSexo(gender);
        persona3.setPeso(weight);
        persona3.setAltura(height);

        //Operaciones objeto 1
        mostrarPeso(persona1);
        esMayordeEdad(persona1);
        System.out.println(persona1.toString());

        //Operaciones objeto
        mostrarPeso(persona2);
        esMayordeEdad(persona2);
        System.out.println(persona2.toString());


        //Operaciones objeto 3
        mostrarPeso(persona3);
        esMayordeEdad(persona3);
        System.out.println(persona3.toString());

    }

    public static void mostrarPeso(Persona persona) {
        int IMC = persona.calcularIMC();
        switch (IMC) {
            case Persona.PESO_INFERIOR:
                System.out.println("Peso Inferior");
                break;
            case Persona.PESO_IDEAL:
                System.out.println("Peso ideal");
                break;
            case Persona.PESO_SOBREPESO:
                System.out.println("Sobrepeso");
                break;
        }
    }

    public static void esMayordeEdad(Persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

    }
}

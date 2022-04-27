package com.sofka.exercise17;

public class seventeenExercise {
    public static void main(String[] args) {
        Lavadora lavadoraUno = new Lavadora();
        Lavadora lavadoraDos = new Lavadora(25.0, 10.0);
        Lavadora lavadoraTres = new Lavadora(10.0, 10.0, 15.0, "White", 'F' );

        Television televisionUno = new Television();
        Television televisionDos = new Television(25.0, 10.0);
        Television televisionTres = new Television(10.0, true, 15.0, 10.0, "White", 'F' );

        Electrodomestico electrodomesticoUno = new Electrodomestico();
        Electrodomestico electrodomesticoDos = new Electrodomestico(25.0, 10.0);
        Electrodomestico electrodomesticoTres = new Electrodomestico( 10.0, 15.0, "White", 'F' );
        Electrodomestico electrodomesticoCuatro = new Electrodomestico(20.0,13.0);

        Electrodomestico[] electrodomesticos = new Electrodomestico[]{
                lavadoraUno,
                lavadoraDos,
                lavadoraTres,
                televisionUno,
                televisionDos,
                televisionTres,
                electrodomesticoUno,
                electrodomesticoDos,
                electrodomesticoTres,
                electrodomesticoCuatro
        };

        calcularPrecios(electrodomesticos);

    }




    public static void calcularPrecios(Electrodomestico[] electrodomesticos){

        double precioElectrodomestico = 0.0;
        double precioLavadora = 0.0;
        double precioTelevision = 0.0;

        for (Electrodomestico electrodomestico: electrodomesticos) {
            if (electrodomestico instanceof Lavadora){
                precioLavadora+=electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Television){
                precioTelevision+=electrodomestico.precioFinal();
            } else {
                precioElectrodomestico+=electrodomestico.precioFinal();
            }
        }

        System.out.println("Precio final Lavadoras: " + precioLavadora);
        System.out.println("Precio final Televisores: " + precioTelevision);
        System.out.println("Precio final Electrodomesticos: " + precioElectrodomestico);
        System.out.println("Precio total: " + (precioLavadora + precioTelevision + precioElectrodomestico));

    }
}

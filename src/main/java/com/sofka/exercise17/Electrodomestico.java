package com.sofka.exercise17;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class Electrodomestico {

    private Double basePrice;
    private String color;
    private char energyConsumption;
    private Double weight;

    private static final Double DEFAULT_PRICE = 100.0;
    private static final String DEFAULT_COLOR = "blanco";
    private static final Double DEFAULT_WEIGHT = 5.0;
    private static final char DEFAULT_ENERGY_CONSUMPTION = 'F';

    public Electrodomestico() {
        this.basePrice = DEFAULT_PRICE;
        this.color = DEFAULT_COLOR;
        this.weight = DEFAULT_WEIGHT;
        this.energyConsumption = DEFAULT_ENERGY_CONSUMPTION;
    }

    public Electrodomestico(Double basePrice, Double weight) {
        this.basePrice = basePrice;
        this.weight = weight;
        this.energyConsumption = DEFAULT_ENERGY_CONSUMPTION;
        this.color = DEFAULT_COLOR;
    }

    public Electrodomestico(Double basePrice, Double weight, String color, char energyConsumption) {
        this.basePrice = basePrice;
        this.weight = weight;
        this.color = color;
        comprobarConsumoEnergetico(energyConsumption);
        comprobarColor(color);
    }

    public void comprobarConsumoEnergetico(char letra) {
        this.energyConsumption = verificarLetra(letra) ? letra : DEFAULT_ENERGY_CONSUMPTION;
    }

    public void comprobarColor(String color) {
        this.color = verificarColor(color) ? color : DEFAULT_COLOR;
    }

    public double precioFinal(){
        double energyPrice = addEnergyPrice();
        double weigthPrice = addWeigthPrice();

        return (this.basePrice + energyPrice + weigthPrice);
    }

    public double addEnergyPrice(){
        HashMap<Character, Double> energyPrices = new HashMap<Character, Double>();
        energyPrices.put('A', 100.0);
        energyPrices.put('B', 80.0);
        energyPrices.put('C', 60.0);
        energyPrices.put('D', 50.0);
        energyPrices.put('E', 30.0);
        energyPrices.put('F', 10.0);
        return energyPrices.get(this.energyConsumption);
    }

    public double addWeigthPrice(){
        if (this.weight >=0 && this.weight <= 19) {
            return 10;
        } else if(this.weight >=20 && this.weight <= 49){
            return 50;
        } else if (this.weight >=50 && this.weight <= 79){
            return 80;
        } else if (this.weight >= 80){
            return 100;
        }
        return 0;
    }



    public boolean verificarColor(String color) {
        String[] colors = new String[]{"blanco", "negro", "azul", "rojo"};
        for (String Acolor : colors) {
            if (Acolor.equals(color)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarLetra(char letter) {
        char[] letters = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        for (char Aletter : letters) {
            if (Aletter == letter) {
                return true;
            }
        }
        return false;
    }


}

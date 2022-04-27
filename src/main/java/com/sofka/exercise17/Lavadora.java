package com.sofka.exercise17;

public class Lavadora extends Electrodomestico {
    private Double burden;
    private static final Double DEFAULT_BURDEN = 5.0;

    public Lavadora() {
        super();
        this.burden = DEFAULT_BURDEN;
    }

    public Lavadora(Double basePrice, Double weight) {
        super(basePrice, weight);
        this.burden = DEFAULT_BURDEN;
    }

    public Lavadora(Double burden, Double basePrice, Double weight, String color, char energyConsumption) {
        super(basePrice, weight, color, energyConsumption);
        this.burden = burden;
    }

    @Override
    public double precioFinal() {
        Double price = super.precioFinal();
        if (this.burden > 30) {
            price += 50.0;
        }
        return price;
    }

    public Double getBurden() {
        return burden;
    }
}

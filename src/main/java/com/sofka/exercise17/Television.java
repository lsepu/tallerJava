package com.sofka.exercise17;

import java.util.Date;

public class Television extends Electrodomestico{
    private Double resolution;
    private Boolean TDT;

    private static final Double DEFAULT_RESOLUTION = 20.0;
    private static final Boolean DEFAULT_TDT = false;

    public Television(){
        super();
        this.resolution = DEFAULT_RESOLUTION;
        this.TDT = DEFAULT_TDT;
    }

    public Television(Double basePrice, Double weight){
        super(basePrice, weight);
        this.resolution = DEFAULT_RESOLUTION;
        this.TDT = DEFAULT_TDT;
    }

    public Television(Double resolution, boolean TDT, Double basePrice, Double weight, String color, char energyConsumption) {
        super(basePrice, weight, color, energyConsumption);
        this.TDT = TDT;
        this.resolution = resolution;
    }

    public Double getResolution() {
        return resolution;
    }

    public Boolean getTDT() {
        return TDT;
    }

    @Override
    public double precioFinal() {
        Double price = super.precioFinal();
        if (this.resolution > 40) {
            price+=30.0;
        }
        if(this.TDT){
            price+=50.0;
        }
        return price;
    }


}

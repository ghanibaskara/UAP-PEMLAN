package models;

import bases.Shape;
import interfaces.MassCalculable;
import interfaces.MassConverter;
import interfaces.PiRequired;
import interfaces.ShippingCostCalculator;
import interfaces.ThreeDimensional;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere(){}

    public Sphere(double radius){
        this.radius = radius;
    }

    public double getVolume(){
        return ((double)4/3)*PI*Math.pow(radius,3);
    }

    public double getSurfaceArea(){
        return 4*PI*Math.pow(radius,2);
    }

    public double getMass(){
        return DENSITY*getSurfaceArea()*THICKNESS;
    }

     public void printInfo(){
        System.out.printf("%-20s: %.2f\n","Volume", getVolume());
        System.out.printf("%-20s: %.2f\n","Luas Permukaan", getSurfaceArea());
        System.out.printf("%-20s: %.2f\n","Massa", getMass());
        System.out.printf("%-20s: %.2f","Massa dalam KG", gramToKilogram());
    }

    public double gramToKilogram(){
        return getMass()/DENOMINATOR;
    }

    public double calculateCost(){
        return gramToKilogram()*PRICE_PER_KG;
    }
}

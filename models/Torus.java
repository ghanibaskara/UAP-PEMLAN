package models;

import bases.Shape;
import interfaces.MassCalculable;
import interfaces.MassConverter;
import interfaces.PiRequired;
import interfaces.ShippingCostCalculator;
import interfaces.ThreeDimensional;

public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus(){}

    public Torus(double majorRadius,double minorRadius){
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getVolume(){
        return 2*Math.pow(PI,2)*majorRadius*Math.pow(minorRadius,2);
    }

    public double getSurfaceArea(){
        return 4*Math.pow(PI,2)*majorRadius*minorRadius;
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
        return getMass()/(double)DENOMINATOR;
    }

    public double calculateCost(){
        return Math.ceil(gramToKilogram()*PRICE_PER_KG);
    }

}

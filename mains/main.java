package mains;

import java.util.Scanner;

import models.Sphere;
import models.Torus;

public class main {

    public static void main(String[] args) {
        Torus torus = new Torus(7,3.5);
        Sphere sphere = new Sphere(21);
        Scanner input = new Scanner(System.in);

        

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.printf("%-10s : GHANI BASKARA SYAH\n", "NAMA");
        System.out.printf("%-10s : 245150700111008\n", "NIM");
        System.out.println("=============================================");
        System.out.println("DONAT DENGAN LUBANG");
        System.out.println("=============================================");
        System.out.printf("%-10s : 7", "Isikan Radius");
        System.out.printf("\n%-10s : 3.5", "Isikan Radius");
        System.out.println("\n=============================================");
        torus.printInfo();
        System.out.printf("\n%-20s: Rp.%,.0f,00", "Biaya Kirim",torus.calculateCost());
         System.out.println("DONAT TANPA LUBANG");
        System.out.println("=============================================");
        System.out.printf("%-10s : 7", "Isikan Radius");
        System.out.printf("\n%-10s : 3.5", "Isikan Radius");
        System.out.println("\n=============================================");
        sphere.printInfo();
        System.out.printf("\n%-20s: Rp.%,.0f,00", "Biaya Kirim",sphere.calculateCost());
        System.out.println("\n=============================================");

    }
}
package org.example.section8.application;

import org.example.section8.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangle = new Rectangle();
        System.out.println("Enter rectangle respectively width and height : ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();
        System.out.printf("AREA: %.2f%n", retangle.returnArea());
        System.out.printf("PERIMETER: %.2f%n", retangle.returnPerimeter());
        System.out.printf("DIAGONAL: %.2f%n", retangle.returnDiagonal());
    }
}

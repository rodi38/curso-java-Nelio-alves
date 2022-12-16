package org.example.section8.application;

import org.example.section8.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();


        System.out.println("Enter the product data: ");

        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: ");
        product.price = Double.parseDouble(scanner.nextLine());
        System.out.print("Quantity in stock: ");
        product.addProducts(Integer.parseInt(scanner.nextLine()));

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(Integer.parseInt(scanner.nextLine()));
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(Integer.parseInt(scanner.nextLine()));
        System.out.println("Updated data: " + product);


    }
}

package org.example.section8.entities;

public class Rectangle {
    public double width;
    public double height;

    public double returnArea(){
        return width * height;
    }

    public double returnPerimeter(){
        return (width + height) * 2;
    }

    public double returnDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}

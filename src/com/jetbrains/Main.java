package com.jetbrains;

public class Main {
    public static void main(String[] args) {


    CircleFromGeometricObject circle = new CircleFromGeometricObject(1);

        System.out.println("A circle "+circle.toString());
        System.out.println("The color is "+circle.getColor());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The diameter is "+circle.getDiameter());
}}

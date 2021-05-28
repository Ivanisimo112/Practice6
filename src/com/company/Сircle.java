package com.company;

public class Сircle extends GeometricFigure{
    int radius;

    public Сircle(int radius) {
        this.radius = radius;
    }

    @Override
    public int perimeter() {
        return (int)(2*Math.PI*radius);
    }

    @Override
    public int area() {
        return (int)(Math.PI*radius*radius);
    }
}

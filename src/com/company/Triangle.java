package com.company;

public class Triangle extends GeometricFigure {
    int a;
    int b;
    int c;
    int heightA;

    Triangle(int a, int b, int c, int heightA) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.heightA = heightA;
    }

    @Override
    public int perimeter() {
        return a + b + c;
    }

    @Override
    public int area() {
        return heightA * (a / 2);
    }
}

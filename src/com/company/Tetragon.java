package com.company;

public class Tetragon extends GeometricFigure{
    double sinBetweenDiagonals;
    int diagonal1;
    int diagonal2;
    int a;
    int b;
    int c;
    int d;

    public Tetragon(double sinBetweenInRadian, int diagonal1, int diagonal2, int a, int b, int c, int d) {
        this.sinBetweenDiagonals = sinBetweenInRadian;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public int perimeter() {
        return a+b+c+d;
    }

    @Override
    public int area() {
        return (int)(diagonal1 * diagonal2 * Math.sin(sinBetweenDiagonals)/2);
    }
}

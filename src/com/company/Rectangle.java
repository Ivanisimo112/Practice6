package com.company;

public class Rectangle extends Tetragon {

    public Rectangle(double sinBetweenInRadian, int diagonal1, int diagonal2, int a, int b, int c, int d) {
        super(sinBetweenInRadian, diagonal1, diagonal2, a, b, c, d);
    }

    @Override
    public int perimeter() {
        return super.a + super.b + super.c + super.d;
    }

    @Override
    public int area() {
        return super.a * super.b;
    }
}

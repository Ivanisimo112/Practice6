package com.company;

public class Main {

    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle(8,5,5,3);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        GeometricFigure tetragon = new Tetragon(1.5708,5,5,4,3,4,3);
        System.out.println(tetragon.area());
        System.out.println(tetragon.perimeter());

        GeometricFigure rectangle = new Rectangle(1.5708,5,   5,4,3,4,3);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        GeometricFigure circle = new Сircle(5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}

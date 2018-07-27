package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(0, 0);
		Point b = new Point(1, 1);
		Point c = new Point(0, 1);
		Triangle triangle = new Triangle(a, b, c);
		Circle circle = new Circle(a, c);
		Square square = new Square(a, c);
		System.out.println(triangle);
		System.out.println(circle);
		System.out.println(square);
		System.out.println();

		Board one = new Board();
		one.addFigure(1, triangle);
		one.addFigure(2, circle);
		one.addFigure(3, square);
		one.addFigure(4, square);
		System.out.println(one);
		one.deleteFigure(3);
		System.out.println();
		System.out.println(one);
	}

}

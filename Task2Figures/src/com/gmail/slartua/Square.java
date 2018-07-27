package com.gmail.slartua;

public class Square extends Shape{
	private Point a;
	private Point b;
	public Square(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	double getPerimetr() {
		return 4*a.length(b);
	}
	@Override
	double getArea() {
		return Math.pow(a.length(b), 2);
	}
	@Override
	public String toString() {
		return "Square [a=" + a + ", b=" + b + ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
	}
	
	
}

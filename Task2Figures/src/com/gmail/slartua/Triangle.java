package com.gmail.slartua;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double getPerimetr() {
		return a.length(b) + b.length(c) + c.length(a);
	}

	@Override
	double getArea() {
		double p = getPerimetr() / 2;
		return p * (p - a.length(b)) * (p - b.length(c)) * (p - c.length(a));
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", getPerimetr()=" + getPerimetr() + ", getArea()="
				+ getArea() + "]";
	}

}

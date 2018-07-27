package com.gmail.slartua;

public class Triangle {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double findSquare() {
		double s = 0;
		if (a + b > c && a + c > b && c + b > a) {
			double p = (a + b + c) / 2;
			s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}
		return s;
	}

	@Override
	public String toString() {
		if (findSquare() == 0) {
			return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "] Such triangle can not exist";
		} else {
			return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "] Square S = " + findSquare();
		}

	}

}

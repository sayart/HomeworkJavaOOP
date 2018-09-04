package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector3d a = new Vector3d(1.2, 3.5, 1.8);
		Vector3d b = new Vector3d(1.5, 3.9, -6.8);
		
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println("Scalar multiplication = "+a.scalarMultiplication(b));
		System.out.println("Vectors sum " +a.vectorsSum(b));
		System.out.println("Vectors multiplication " +a.vectorsMultiplication(b));
	}

}

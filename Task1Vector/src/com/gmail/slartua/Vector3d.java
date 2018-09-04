package com.gmail.slartua;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d vectorsSum(Vector3d vector) {
		return new Vector3d(this.getX() + vector.getX(), this.getY() + vector.getY(), this.getZ() + vector.getZ());
	}

	public double scalarMultiplication(Vector3d vector) {
		return this.getX() * vector.getX() + this.getY() * vector.getY() + this.getZ() + vector.getZ();
	}

	public Vector3d vectorsMultiplication(Vector3d vector) {
		double resultX = this.getY() * vector.getZ() - this.getZ() * vector.getY();
		double resultY = this.getZ() * vector.getX() - this.getX() * vector.getZ();
		double resultZ = this.getX() * vector.getY() - this.getY() * vector.getX();
		return new Vector3d(resultX, resultY, resultZ);
	}

	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ", z=" + z + ")";
	}

}

package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		Network life = new Network();

		Phone one = new Phone(661234567, "Nokia");
		Phone two = new Phone(662345678, "Samsung");
		Phone three = new Phone(663456789, "Apple");
		Phone four = new Phone(664567890, "HTC");

		one.registerInNetwork(life);
		two.registerInNetwork(life);
		three.registerInNetwork(life);

		one.call(662345678);
		one.call(664567890);
		four.call(132);
		
		double a = 25.5532;
		int b = 25;
		a=a%10;
		b=b%10;
		System.out.println(a+" "+b);
		System.out.println(b);
	}

}

package com.gmail.slartua;

public class Phone {
	private long phoneNumber;
	private String model;
	private Network network;

	public Phone(long phoneNumber, String model) {
		super();
		this.phoneNumber = phoneNumber;
		this.model = model;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", model=" + model + "]";
	}

	public void registerInNetwork(Network network) {
		this.network = network;
		if (!this.network.addToNetwork(this)) {
			this.network = null;
		}
	}

	public void call(long number) {
		if (this.network == null) {
			System.out.println("Please registered to network");
			return;
		}
		Phone phoneToCall = new Phone(number, "");
		if (this.network.checkInNetwork(phoneToCall) == true) {
			System.out.println("dzin-dzin");
		} else {
			System.out.println("Wrong number");
		}

	}

}

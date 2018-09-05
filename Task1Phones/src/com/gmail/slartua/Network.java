package com.gmail.slartua;

public class Network {
	private Phone[] network = new Phone[0];

	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean addToNetwork(Phone phone) {
		if (checkInNetwork(phone) == true) {
			System.out.println(phone.getPhoneNumber() + " this phone already registered");
			return false;
		}
		Phone[] temp = new Phone[network.length + 1];
		System.arraycopy(network, 0, temp, 0, network.length);
		temp[temp.length - 1] = phone;
		network = temp;
		return true;
	}

	public boolean checkInNetwork(Phone phone) {
		for (int i = 0; i < network.length; i++) {
			if (network[i].getPhoneNumber() == phone.getPhoneNumber()) {
				return true;
			}
		}
		return false;
	}

}

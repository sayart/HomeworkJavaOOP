package com.gmail.slartua;

import java.util.Arrays;

public class Network {
	private Phone[] network = new Phone[0];

	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addToNetwork(Phone phone) {
		for (int i = 0; i < network.length - 1; i++) {
			if (network[i] == null) {
				network[i] = phone;
				break;
			} else {
				Phone[] temp = Arrays.copyOf(network, network.length+1);
				
			}
		}

	}

}

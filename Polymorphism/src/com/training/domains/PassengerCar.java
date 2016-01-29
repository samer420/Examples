package com.training.domains;

import com.training.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrie() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "I10";
	}

}

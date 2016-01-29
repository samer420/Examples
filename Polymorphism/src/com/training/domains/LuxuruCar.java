package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxuruCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrie() {
		// TODO Auto-generated method stub
		return 10000000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW";
	}

}

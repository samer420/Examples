package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Orange";
	}

	@Override
	public double getPrie() {
		// TODO Auto-generated method stub
		return 300000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "R15";
	}

}

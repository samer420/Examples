package com.training.domains;

import com.training.ifaces.Automobile;

public class ShowRoom  {

	public Automobile getItem(int key)
	{
		switch (key)
		{
		case 1:
			return new PassengerCar();
		case 2:
			return new LuxuruCar();
		case 3:
			return new SportsCar();
		default :
			return null;
		}

}
	public void printQuote(Automobile polyAuto){
		System.out.println("====Quatation=====");
		System.out.println("Model =" + polyAuto.getModel());
		System.out.println("Price =" + polyAuto.getPrie());
		System.out.println("Color =" + polyAuto.getColor());
	}
}
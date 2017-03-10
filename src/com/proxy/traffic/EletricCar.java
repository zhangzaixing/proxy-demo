package com.proxy.traffic;

public class EletricCar implements Rechargeable, Vehicle {

	@Override
	public void driver() {
		System.out.println("Electric Car is Moving silently...");  
	}

	@Override
	public void recharge() {
		System.out.println("Electric Car is Recharging...");  
	}

}

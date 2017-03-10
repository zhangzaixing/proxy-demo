package com.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.proxy.traffic.EletricCar;
import com.proxy.traffic.InvocationHandlerImpl;
import com.proxy.traffic.Rechargeable;
import com.proxy.traffic.Vehicle;

public class JDKProxyTest {
	public static void main(String[] args) {
		EletricCar car = new EletricCar();
		ClassLoader classLoader = car.getClass().getClassLoader();
		Class[] interfaces = car.getClass().getInterfaces();
		
		InvocationHandler handler  = new InvocationHandlerImpl(car);
		Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);
		Vehicle vehicle = (Vehicle) o;
		vehicle.driver();
		
		Rechargeable rechargeable = (Rechargeable)o;
		rechargeable.recharge();
		
	}
}

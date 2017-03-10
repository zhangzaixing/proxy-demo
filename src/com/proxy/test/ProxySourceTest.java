package com.proxy.test;

import com.proxy.traffic.EletricCar;
import com.proxy.traffic.ProxyUtils;

public class ProxySourceTest {
	public static void main(String[] args) {
		ProxyUtils.generateClassFile(EletricCar.class, "ElectricCarProxy");
	}
}

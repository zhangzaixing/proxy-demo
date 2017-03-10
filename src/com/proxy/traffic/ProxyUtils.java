package com.proxy.traffic;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class ProxyUtils {
	public static void generateClassFile(Class clazz, String proxyName) {
		//根据类信息和提供代理类名臣，生成字节码
		byte[] classFile = ProxyGenerator.generateProxyClass(proxyName, clazz.getInterfaces());
		String paths = clazz.getResource(".").getPath();
		System.out.println(paths);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(paths+proxyName+".class");
			out.write(classFile);
			out.flush();
			out.close();
		} catch (Exception e) {
			try {
				out.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	
	}
}

package com.proxy.classLoader;

public class MyClassLoader extends ClassLoader{
	public Class<?> defineMyClass(byte[] b, int off, int len){
		return super.defineClass(null,b, off, len);
	}
}

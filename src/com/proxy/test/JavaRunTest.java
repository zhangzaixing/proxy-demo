package com.proxy.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.proxy.classLoader.MyClassLoader;

public class JavaRunTest {
	public static void main(String[] args) throws Exception {
		File file = new File(".");
		InputStream input = new FileInputStream(file.getCanonicalFile() + "\\bin\\com\\proxy\\bean\\Programmer2.class");
		
		byte[] result = new byte[input.available()];
		
		int count = input.read(result);
		System.out.println(result.length);
		
		//使用自定义的类加载将byte字节码数组转换为对应的class对象
		MyClassLoader loader = new MyClassLoader();
		Class clazz  = loader.defineMyClass(result, 0, count);
		//测试加载是否成功，打印class对象的名称
		System.out.println(clazz.getCanonicalName());
		
		//实例化一个Programmer对象
		Object o = clazz.newInstance();
		clazz.getMethod("code", null).invoke(o, null);
		
		input.close();
		
	}
}

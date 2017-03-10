package com.proxy.test;

import java.io.File;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class MyGenertor {

	public static void main(String[] args) throws Exception {
		ClassPool pool = ClassPool.getDefault();
		//创建Programer类
		CtClass cc = pool.makeClass("com.proxy.bean.Programmer2");
		//定义code方法
		CtMethod method = CtMethod.make("public void code(){}", cc);
		//插入方法代码
		method.insertAfter("System.out.println(\"I am a Programmer2\");");
		cc.addMethod(method);
		//保存生成字节码
		File file = new File(".");
		cc.writeFile(file.getCanonicalPath() + "\\bin\\");
		
	}

}

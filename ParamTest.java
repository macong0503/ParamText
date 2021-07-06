package com.fs.test;

public class ParamTest {
	
	/**
	 * 局部变量：
	 * 1、定义在方法或代码块内部的变量，方法的参数也是局部变量
	 * 2、局部变量的作用域范围只在定义它的方法内部有效
	 * 3、使用前必须先初始化
	 */
	public void aMethod(int i){
		int a = 10;//声明变量并初始化
		
		int b;
		b=10;//先声明变量并初始化
		
		System.out.println("a+b="+(a+b));
		
//		int c;
//		System.out.println(c);局部变量在使用前必须先初始化
	}
	
	
	/**
	 * 成员变量（全局变量）
	 * 1、不在方法内部或代码块内部定义变量
	 * 2、作用域范围是整个类的所有方法中
	 * 3、成员变量不用初始化也可以使用
	 */
	int x = 10;
	int y = 200;
	public void cMethod(){
		System.out.println("x*y="+x*y);
	}
	//成员变量都有默认值
	int i;//0
	float f;//0.0
	char c;//空字符
	boolean b;//false
	String s;//null 引用数据类型
	

	public static void main(String[] args) {
		ParamTest pt = new ParamTest();
		pt.aMethod(1);
		
		pt.cMethod();
		
		System.out.println("i="+pt.i);
		System.out.println("f="+pt.f);
		System.out.println("c="+pt.c);
		System.out.println("b="+pt.b);
		System.out.println("s="+pt.s);

	}

}

package com.fs.test;

public class ParamTest {
	
	/**
	 * �ֲ�������
	 * 1�������ڷ����������ڲ��ı����������Ĳ���Ҳ�Ǿֲ�����
	 * 2���ֲ�������������Χֻ�ڶ������ķ����ڲ���Ч
	 * 3��ʹ��ǰ�����ȳ�ʼ��
	 */
	public void aMethod(int i){
		int a = 10;//������������ʼ��
		
		int b;
		b=10;//��������������ʼ��
		
		System.out.println("a+b="+(a+b));
		
//		int c;
//		System.out.println(c);�ֲ�������ʹ��ǰ�����ȳ�ʼ��
	}
	
	
	/**
	 * ��Ա������ȫ�ֱ�����
	 * 1�����ڷ����ڲ��������ڲ��������
	 * 2��������Χ������������з�����
	 * 3����Ա�������ó�ʼ��Ҳ����ʹ��
	 */
	int x = 10;
	int y = 200;
	public void cMethod(){
		System.out.println("x*y="+x*y);
	}
	//��Ա��������Ĭ��ֵ
	int i;//0
	float f;//0.0
	char c;//���ַ�
	boolean b;//false
	String s;//null ������������
	

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

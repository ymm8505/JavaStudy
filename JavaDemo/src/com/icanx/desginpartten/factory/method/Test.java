package com.icanx.desginpartten.factory.method;

public class Test {

	public static void main(String[] args) throws BadFruitExeption {
		/*�Ѿ�����߼��жϷŵ���ʵ������ȥ��ɣ�������չ*/
		FruitGardener fruitGardener = new AppleGardener();
		Apple apple = (Apple) fruitGardener.factory();
		apple.plant();		
		apple.grow();
		apple.harvest();
		
		
		FruitGardener orangeGardener = new OrangeGardener();
		orangeGardener.factory();
		
	}
}

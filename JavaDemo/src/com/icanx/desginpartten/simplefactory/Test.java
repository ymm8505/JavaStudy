package com.icanx.desginpartten.simplefactory;

public class Test {
	/*�򵥹��� �ǰ��߼��ŵ���һ��������Ĺ�����������ȥ�ж�*/
	public static void main(String[] args) throws BadFruitExeption {
		FruitGardener.factory("Apple");
		Grape grape = (Grape) FruitGardener.factory("Grape");
		grape.setSeedless(false);
		grape.plant();
		grape.grow();
		grape.harvest();
		System.out.println(grape.toString());
		FruitGardener.factory("Strawberry");
	}
}

package com.icanx.desginpartten.simplefactory;

public class Test {
	/*简单工厂 是把逻辑放到了一个超级大的工厂方法里面去判断*/
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

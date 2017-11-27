package com.icanx.desginpartten.factory.method;


public class AppleGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new Apple();
	}
}

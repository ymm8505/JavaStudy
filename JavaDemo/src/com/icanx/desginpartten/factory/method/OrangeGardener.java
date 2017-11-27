package com.icanx.desginpartten.factory.method;


public class OrangeGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new Orange();
	}
}

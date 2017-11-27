package com.icanx.desginpartten.factory.method;


public class StrawberryGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new Grape();
	}
}

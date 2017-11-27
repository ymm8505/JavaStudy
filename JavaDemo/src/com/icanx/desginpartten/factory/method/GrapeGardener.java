package com.icanx.desginpartten.factory.method;


public class GrapeGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new Grape();
	}
}

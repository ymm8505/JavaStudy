package com.icanx.desginpartten.factory.method;

public class Test {

	public static void main(String[] args) throws BadFruitExeption {
		/*把具体的逻辑判断放到了实现类里去完成，方便扩展*/
		FruitGardener fruitGardener = new AppleGardener();
		Apple apple = (Apple) fruitGardener.factory();
		apple.plant();		
		apple.grow();
		apple.harvest();
		
		
		FruitGardener orangeGardener = new OrangeGardener();
		orangeGardener.factory();
		
	}
}

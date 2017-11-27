package com.icanx.desginpartten.simplefactory;


public class FruitGardener {

	public static Fruit factory(String fruit) throws BadFruitExeption{
		//核心在这里   判断入参 来创建 Fruit的实现类 对象 返回。
		if(fruit.equals("Apple")){
			return new Apple();
		}else if(fruit.equals("Grape")){
			return new Grape();
		}else if(fruit.equals("Strawberry")){
			return new Strawberry();
		}else{
			throw new BadFruitExeption("Bad fruit request");
		}
	}
}

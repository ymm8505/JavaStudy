package com.icanx.desginpartten.simplefactory;


public class FruitGardener {

	public static Fruit factory(String fruit) throws BadFruitExeption{
		//����������   �ж���� ������ Fruit��ʵ���� ���� ���ء�
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

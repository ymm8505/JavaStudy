package com.icanx.desginpartten.simplefactory;

public class Strawberry implements Fruit {
	public Strawberry() {
		log("Strawberry is Constructoring");
	}
	@Override
	public void grow() {
		log("Strawberry is Growing");
	}

	@Override
	public void plant() {
		log("Strawberry is Planting");
	}

	@Override
	public void harvest() {
		log("Strawberry is Harvest");
	}

	public static void log(String msg){
		System.out.println(msg);
	}
}

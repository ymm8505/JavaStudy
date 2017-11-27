package com.icanx.desginpartten.factory.method;

public class Orange implements Fruit {
	
	public Orange() {
			log("Orange is Constructoring");
	}
	@Override
	public void grow() {
		log("Orange is Growing");
	}

	@Override
	public void plant() {
		log("Orange is Planting");
	}

	@Override
	public void harvest() {
		log("Orange is Harvest");
	}

	public static void log(String msg){
		System.out.println(msg);
	}

}

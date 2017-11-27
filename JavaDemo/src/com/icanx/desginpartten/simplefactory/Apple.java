package com.icanx.desginpartten.simplefactory;

public class Apple implements Fruit {

	private int treeAge;
	
	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}
	public Apple() {
		log("Apple is Constructoring");
	}
	
	
	
	@Override
	public void grow() {
		log("Apple is Growing");
	}

	@Override
	public void plant() {
		log("Apple is Planting");
	}

	@Override
	public void harvest() {
		log("Apple is Harvest");
	}
	
	public static void log(String msg){
		System.out.println(msg);
	}

}

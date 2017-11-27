package com.icanx.desginpartten.simplefactory;

public class Grape implements Fruit {
	private boolean seedless;
	public Grape() {
			log("Grape is Constructoring");
	}
	@Override
	public void grow() {
		log("Grape is Growing");
	}

	@Override
	public void plant() {
		log("Grape is Planting");
	}

	@Override
	public String toString() {
		return "Grape [seedless=" + seedless + ", isSeedless()=" + isSeedless()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public boolean isSeedless() {
		return seedless;
	}

	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}

	@Override
	public void harvest() {
		log("Grape is Harvest");
	}

	public static void log(String msg){
		System.out.println(msg);
	}

}

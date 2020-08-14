package com.practice;

public class CatPolyMorphims extends AnimalPolyMor {

	
	@Override
	public void sound() {
		System.out.println("Cat has MEWWW sound");
		
	}
	
	
	public static void main(String[] args) {
		
		AnimalPolyMor an = new CatPolyMorphims();
		an.sound();
		
	}
	
	
}

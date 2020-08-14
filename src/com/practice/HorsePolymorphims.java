package com.practice;

public class HorsePolymorphims extends AnimalPolyMor {
	
	
@Override
public void sound() {
	
	System.out.println("Horse has such a beautiful Angirus sound");
	
}
	
	
	public static void main(String[] args) {
		
		AnimalPolyMor an = new HorsePolymorphims();
		
		an.sound();

	}

}

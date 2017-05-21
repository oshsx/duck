package model;

public class FlyWithRocket implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("飞行行为是喷射");
		
	}

}

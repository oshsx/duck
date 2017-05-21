package model;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("发声行为是呱呱声");
		
	}
	
}

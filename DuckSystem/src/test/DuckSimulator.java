package test;

import model.Duck;
import model.FlyWithWings;
import model.MallardDuck;
import model.Quack;

public class DuckSimulator {
	public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.setQuackBehavior(new Quack());
        System.out.println("发声行为是呱呱叫");
        mallard.setFlyBehavior(new FlyWithWings());
        System.out.println("飞行行为是拍翅膀");

    }
}

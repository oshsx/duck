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
        System.out.println("������Ϊ�����ɽ�");
        mallard.setFlyBehavior(new FlyWithWings());
        System.out.println("������Ϊ���ĳ��");

    }
}

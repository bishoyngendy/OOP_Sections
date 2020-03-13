package ducks;

import ducks.behaviours.FlyWithWings;
import ducks.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am green!");
    }
}

package ducks;

import ducks.behaviours.FlyWithWings;
import ducks.behaviours.Quack;

public class RedNeckDuck extends Duck {

    public RedNeckDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am red!");
    }
}

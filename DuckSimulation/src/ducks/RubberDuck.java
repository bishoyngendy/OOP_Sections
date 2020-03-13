package ducks;

import ducks.behaviours.CannotFly;
import ducks.behaviours.Mute;
import ducks.behaviours.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehaviour = new CannotFly();
        this.quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am yellow");
    }
}

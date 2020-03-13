package ducks;

import ducks.behaviours.CannotFly;
import ducks.behaviours.Mute;
import ducks.behaviours.Squeak;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.flyBehaviour = new CannotFly();
        this.quackBehaviour = new Mute();
    }

    @Override
    public void display() {
        System.out.println("I am wooden and brown");
    }
}

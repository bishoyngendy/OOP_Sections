package ducks;

import ducks.behaviours.IFlyBehaviour;
import ducks.behaviours.IQuackBehaviour;

public abstract class Duck {

    IQuackBehaviour quackBehaviour;
    IFlyBehaviour flyBehaviour;

    public void quack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public abstract void display();

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}

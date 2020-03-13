package ducks.behaviours;

public class CannotFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

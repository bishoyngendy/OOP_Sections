package ducks.behaviours;

public class FlyWithWings implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I believe I can fly with wings");
    }
}

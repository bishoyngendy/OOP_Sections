package ducks.behaviours;

public class Mute implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}

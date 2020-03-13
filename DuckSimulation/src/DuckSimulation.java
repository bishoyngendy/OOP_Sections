import ducks.*;
import ducks.behaviours.FlyWithRocket;

public class DuckSimulation {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redNeck = new RedNeckDuck();
        Duck decoy = new DecoyDuck();
        Duck rubber = new RubberDuck();

        simulateDuck(mallard);
        simulateDuck(redNeck);
        simulateDuck(decoy);
        simulateDuck(rubber);

        rubber.setFlyBehaviour(new FlyWithRocket());

        simulateDuck(rubber);
    }

    public static void simulateDuck(Duck duck) {
        System.out.println(duck.getClass().getSimpleName());
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
        System.out.println("-------------------------------------");
    }
}

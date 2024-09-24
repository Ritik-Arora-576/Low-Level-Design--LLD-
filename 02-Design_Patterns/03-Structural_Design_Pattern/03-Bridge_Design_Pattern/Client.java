import Abstraction.*;
import Implementer.*;

public class Client {
    public static void main(String[] args) {
        Creature human = new Human(new BreathingOnLand());
        human.breathe();

        Creature fish = new Fish(new BreathingInWater());
        fish.breathe();

        Creature tree = new Tree(new BreathingThroughLeaf());
        tree.breathe();
    }
}

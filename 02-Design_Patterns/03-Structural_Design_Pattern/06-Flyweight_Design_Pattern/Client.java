

import With_Flyweight.Robot;
import With_Flyweight.RobotFactory;

public class Client {
    public static void main(String[] args) {
        Robot humanoid1 = RobotFactory.createRobot("Human");
        humanoid1.display(0, 0);

        // instance would be same but we set the extrinsic value of location by user
        Robot humanoid2 = RobotFactory.createRobot("Human");
        humanoid2.display(10, 7);

        Robot robodog = RobotFactory.createRobot("Dog");
        robodog.display(11, 78);
    }
}

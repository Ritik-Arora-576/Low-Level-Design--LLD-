package Without_Flyweight;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<5000000;i++){
            // placing robots
            Robot humanRobot = new Robot(i,i,"Human",new Sprites());
            // displaying robots position
            humanRobot.display();
        }

        for(int i=0;i<5000000;i++){
            // placing robots
            Robot robodog = new Robot(i,i,"Dog",new Sprites());
            // displaying robots position
            robodog.display();
        }
    }
}

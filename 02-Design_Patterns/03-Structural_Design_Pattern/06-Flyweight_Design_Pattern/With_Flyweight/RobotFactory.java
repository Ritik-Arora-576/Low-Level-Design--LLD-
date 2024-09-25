package With_Flyweight;
import java.util.HashMap;

public class RobotFactory {
    private static HashMap<String, Robot> robotCache = new HashMap<>();

    public static Robot createRobot(String type){
        if(robotCache.containsKey(type)) return robotCache.get(type);

        else if(type.equalsIgnoreCase("Human")){
            Robot humanoid = new Humanoid(type, new Sprites());
            robotCache.put("Human", humanoid);
            return humanoid;
        }

        else if(type.equalsIgnoreCase("Dog")){
            Robot robodog = new Robodog(type, new Sprites());
            robotCache.put("Human", robodog);
            return robodog;
        }

        return null;
    }
}

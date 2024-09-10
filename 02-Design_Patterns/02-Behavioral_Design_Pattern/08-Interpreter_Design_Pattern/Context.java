import java.util.HashMap;

public class Context{
    private HashMap<Character, Integer> map = new HashMap<>();

    public Context(){}

    public Integer get(Character ch){
        return map.get(ch);
    }

    public void put(Character ch, Integer value){
        map.put(ch, value);
    }
}
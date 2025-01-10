public class Player {
    public int id;
    public String name;
    public int position;

    public Player(int id, String name){
        this.id = id;
        this.name = name;
        this.position = 1;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

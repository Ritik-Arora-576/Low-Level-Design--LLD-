package Without_Flyweight;

public class Robot{
    // extrinsic properties
    public int row;
    public int col;
    // intrinsic properties
    public String type;
    public Sprites body; // small 2D bitmap graphic design element

    public Robot(int row, int col, String type, Sprites body){
        this.row = row;
        this.col = col;
        this.type = type;
        this.body = body;
    }

    // method to show position of Robot
    public void display(){
        System.out.println("Robot "+type+"placed at "+row+","+col);
    }
}
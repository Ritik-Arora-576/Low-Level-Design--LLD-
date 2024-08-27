package Example_2;

import Example_2.Keyboard.Keyboard;
import Example_2.Mouse.Mouse;

// this class is dependent upon interface so that class Macbook would be easily costumizable
public class MacBook {
    public Keyboard keyboard;
    public Mouse mouse;

    public MacBook(Mouse mouse, Keyboard keyboard){
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}

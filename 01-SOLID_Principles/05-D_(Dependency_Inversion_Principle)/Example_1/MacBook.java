package Example_1;

import Example_1.Keyboard.WiredKeyboard;
import Example_1.Mouse.WiredMouse;

// this class is dependent upon concrete classes
public class MacBook {
    public WiredKeyboard wiredKeyboard;
    public WiredMouse wiredMouse;

    public MacBook(){
        this.wiredKeyboard = new WiredKeyboard();
        this.wiredMouse = new WiredMouse();
    }
}

# Dependency Inversion Principle

This principle states that, a class should be dependent upon interfaces rather than concrete classes.

**Mouse(Interface)** is implemented by **WiredMouse(Concrete Class)** and **BluetoothMouse(Concrete Class)** and **Keyboard(Interface)** is implemented by **WiredKeyboard(Concrete Class)** and **BluetoothKeyboard(Concrete Class)**.

In **Example-1**, class **MacBook** is dependent upon concrete class i.e **WiredMouse** and **WiredKeyboard**. In this manner we hard coded the class. If in future we wanted to costumize it for **Bluetooth** setup then we can't. So we need to use interface in order to make our class costumizable which is implemented in **Example-2**.
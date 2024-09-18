# State Design Pattern

State Design Pattern is a behavioral design pattern which allows an object to alter its behavior when its internal state changes.

We encapsulates the behavior for different states within different classes and objects alter its behvaior dynamically when changes its state. In this example, we implemented the functionality of vending machine in which a single object posses different behavior when changes its state.

## Vending Machine States

* **State-1:** Idle State
* **State-2:** Collect Coin State
* **State-3:** Entering Product Code State
* **State-4:** Dispense State

## Statewise Explaination

### State-1 (Idle State):
In this state if a user presses **Press Coin Button** then it's state changes to **Collect Coin State**.

### State-2 (Collect Coin State):
In this state, user enters the coins inside Vending Machine until user doesn't press **Deposit Coin Button**. If user presses **Cancel Button** before pressing **Deposit Coin Button** then vending machine went back to **Idle State** by refunding all coins deposited otherwise it will get passes to next state which is **Entering Product Code State**.

### State-3 (Entering Product Code State):
In this state, user enters a product code and then presses **Enter Code Button**. If user presses (**Cancel Button** before pressing **Enter Code Button**) or (Product code is wrong) or (there is insufficient amount entered) or (**Product Inventory** is out of stock) then vending machine went back to **Idle State** by refunding all coins deposited otherwise it will get passes to next state which is **Dispense State**.

### State-4 (Dispense State):
In this state, product will get dispense out from **Vending Machine** and **Product Inventory** will get update and it will went back to **Idle State**.
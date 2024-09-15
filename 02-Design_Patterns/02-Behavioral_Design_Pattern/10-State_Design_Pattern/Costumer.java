import Vending_Machine.*;
import Vending_Machine_States.*;

public class Costumer {
    public static void main(String[] args) {

        try{
            // create vending machine object
            VendingMachine vendingMachine = new VendingMachine();
            vendingMachine.productList();

            // pressing Collect coin button (State-1)
            State state = vendingMachine.getState();
            state.pressCollectCoinButton(vendingMachine);

            // entering coins in vending machine (State-2)
            state = vendingMachine.getState();
            state.collectCoins(vendingMachine, 10);
            state.collectCoins(vendingMachine, 20);
            state.pressDepositCoinsButton(vendingMachine);

            // entering code in vending machine to dispense product (State-3)
            state = vendingMachine.getState();
            int code = 102;
            state.enteringProductCode(vendingMachine, code);

            // dispense product and get refund (State-4)
            state = vendingMachine.getState();
            state.pressDispenseButton(vendingMachine, code);

            // see product list
            vendingMachine.productList();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}

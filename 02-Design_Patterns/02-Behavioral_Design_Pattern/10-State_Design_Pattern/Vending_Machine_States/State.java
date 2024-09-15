package Vending_Machine_States;
import Vending_Machine.VendingMachine;

public abstract class State {
    public void pressCollectCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Collect coin button can't be functional in this state");
    }

    public void collectCoins(VendingMachine vendingMachine, int amount) throws Exception{
        throw new Exception("Coins can't be collect in this state");
    }

    public void pressDepositCoinsButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Coins can't be deposit in this state");
    }

    public void enteringProductCode(VendingMachine vendingMachine, int code) throws Exception{
        throw new Exception("Product code can't be enter in this state");
    }

    public void pressDispenseButton(VendingMachine vendingMachine, int code) throws Exception{
        throw new Exception("Product can't be dispense in this state");
    }

    public void pressCancelButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("You can't cancel the process in this state.");
    }
}

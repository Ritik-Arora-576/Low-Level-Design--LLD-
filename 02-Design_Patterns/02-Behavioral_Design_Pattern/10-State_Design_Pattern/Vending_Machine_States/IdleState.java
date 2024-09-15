package Vending_Machine_States;
import Vending_Machine.*;

public class IdleState extends State{
    @Override
    public void pressCollectCoinButton(VendingMachine vendingMachine){
        // pressing collect coin button will change the state to collecting coin state
        vendingMachine.setState(new CollectCoinState());
    }

    @Override
    public void pressCancelButton(VendingMachine vendingMachine){
        // pressing cancel button will change the state to idle
        vendingMachine.setState(new IdleState());
    }
}

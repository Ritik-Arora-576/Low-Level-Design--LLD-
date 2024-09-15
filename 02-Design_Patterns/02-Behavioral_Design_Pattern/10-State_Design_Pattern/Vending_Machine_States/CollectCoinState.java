package Vending_Machine_States;
import Vending_Machine.*;

public class CollectCoinState extends State{
    @Override
    public void collectCoins(VendingMachine vendingMachine, int amount){
        // collecting coins
        vendingMachine.addAmount(amount);
    }

    @Override
    public void pressDepositCoinsButton(VendingMachine vendingMachine){
        // on pressing this button it will change the current state to entering product code state
        vendingMachine.setState(new EnteringProductCodeState());
    }

    @Override
    public void pressCancelButton(VendingMachine vendingMachine){
        // pressing cancel button will refund the full amount change the state to idle
        int refund = vendingMachine.getAmount();
        if(refund>0) System.out.println("Amount of Rs."+refund+" has been refunded");
        vendingMachine.setAmount(0); 
        vendingMachine.setState(new IdleState());
    }
}

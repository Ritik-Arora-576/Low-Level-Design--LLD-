package Vending_Machine_States;
import Vending_Machine.*;

public class DispenseState extends State{
    @Override
    public void pressDispenseButton(VendingMachine vendingMachine, int code){
        // dispense the product
        // refund the remaining amount
        // set state to idle state
        Product product = vendingMachine.getProduct(code);
        vendingMachine.dispenseProduct(code);
        System.out.println("Remaining balance of Rs."+(vendingMachine.getAmount()-product.getCost())+" has been refunded.");
        vendingMachine.setAmount(0);
        vendingMachine.setState(new IdleState());
    }
}

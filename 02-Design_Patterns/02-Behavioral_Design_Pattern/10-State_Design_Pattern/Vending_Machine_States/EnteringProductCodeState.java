package Vending_Machine_States;
import Vending_Machine.*;

public class EnteringProductCodeState extends State{
    @Override
    public void enteringProductCode(VendingMachine vendingMachine, int code){
        Product product = vendingMachine.getProduct(code);
        // if product is not available or amount is insufficient then refund the full amount and return back to idle state
        if(product==null || vendingMachine.getAmount()<product.getCost()) this.pressCancelButton(vendingMachine);
        // other set state to dispense state
        else vendingMachine.setState(new DispenseState());
    }

    @Override
    public void pressCancelButton(VendingMachine vendingMachine){
        int refund = vendingMachine.getAmount();
        System.out.println("Refund of Rs."+refund+" has been refunded.");
        vendingMachine.setAmount(0);
        vendingMachine.setState(new IdleState());
    }
}

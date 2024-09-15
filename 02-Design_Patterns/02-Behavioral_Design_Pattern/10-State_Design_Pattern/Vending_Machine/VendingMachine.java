package Vending_Machine;
import java.util.HashMap;
import java.util.Map;

import Vending_Machine_States.*;

public class VendingMachine{
    private State state;
    private Map<Integer, Product> products = new HashMap<>();
    private int amount;

    public VendingMachine(){
        // by default Vending Machine would be in Idle state
        this.state = new IdleState();

        // filling up products in vending machine
        // here key is code and value is Product which has members like name, cost and quantity
        this.addProduct(101, new Product("Juice", 20, 4));
        this.addProduct(102, new Product("Coke", 25, 1));
        this.addProduct(103, new Product("Chips", 10, 3));
        this.addProduct(104, new Product("Chocolate", 15, 7));
        this.addProduct(105, new Product("Water", 10, 5));

        // by default deposited amount would be 0
        this.amount = 0;
    }

    // add product into vending machine
    public void addProduct(int code, Product product){
        if(!this.products.containsKey(code)) this.products.put(code, product);
        else System.out.println("Product is already added into vending machine.");
    }

    // remove product from vending machine
    public void removeProduct(int code){
        if(this.products.containsKey(code)){
            this.products.remove(code);
        }
        else System.out.println("This product is not in vending machine");
    }

    // decrease the quantity of product by one after dispensing it from vending machine
    public void dispenseProduct(int code){
        this.products.get(code).setQuantity(this.products.get(code).getQuantity()-1);
        if(this.products.get(code).getQuantity()==0) this.removeProduct(code);
    }

    // function to check whether product is available in vending machine or not
    public Product getProduct(int code){
        if(this.products.containsKey(code)) return this.products.get(code);
        return null;
    }

    // get product list
    public void productList(){
        for(int code:products.keySet()){
            System.out.println("Product code "+code+": "+this.products.get(code));
        }
    }

    // set state of vending machine
    public void setState(State state){
        this.state = state;
    }

    // get state of vending machine
    public State getState(){
        return this.state;
    }

    // add amount into vending machine
    public void addAmount(int amount){
        this.setAmount(this.amount+amount);
    }

    // set amount of vending machine
    public void setAmount(int amount){
        this.amount=amount;
    }

    // get amount deposit in vending machine
    public int getAmount(){
        return this.amount;
    }
}
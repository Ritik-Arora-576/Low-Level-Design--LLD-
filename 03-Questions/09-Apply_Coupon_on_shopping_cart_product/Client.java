public class Client {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 100000, ProductType.ELECTRONICS);
        Product product2 = new Product(2, "Saree", 15000, ProductType.FASHION);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.getInvoice();
    }
}

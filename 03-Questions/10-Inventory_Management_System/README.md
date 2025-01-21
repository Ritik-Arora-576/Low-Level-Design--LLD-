# Inventory Management System

1. A user comes to an application
2. User add product to cart
3. User will place the order
4. Payment would be done
5. Generate the invoice

### Objects
1. User
2. Product
3. Cart
4. Order
5. Invoice
6. Payment -> Strategy Design Patter
7. Inventory
8. Location
9. Warehouse
10. ApplicationDemo
11. WarehouseSelectionStrategy -> Strategy Design Pattern
12. WarehouseController
13. OrderController
14. UserController

### User
1. int id -> getter
2. String name -> getter and setter
3. int ph_no -> getter and setter
4. String email -> getter and setter
5. Location location -> getter and setter
6. List(Order) order_history -> getter
7. Cart cart -> getter
8. WarehouseSelectionStrategy strategy -> getter and setter
9. void addOrder(Order order)
10. void addProductToCart(Product product, int count)
11. void removeProductFromCart(Product product, int count)
12. void placeOrder()
13. void findWarehouse()
14. void cancelOrder(Order order)
15. void returnOrder(Order order)

### Location
1. int pincode -> getter and setter
2. String city -> getter and setter
3. String state -> getter and setter
4. String country -> getter and setter

### Product
1. int id -> getter
2. String name -> getter and setter
3. String description -> getter and setter
4. ProductType type -> getter
5. double price -> getter and setter

### ProductType (Enum)
1. ELECTRONICS
2. FASHION
3. FURNITURE

### Inventory
1. Map(Product, Integer) products -> getter (Concurrent Map)
2. void addProduct(Product product, int count)
3. void removeProduct(Product product, int count)
4. boolean canPlace(Cart cart)

### Warehouse
1. int id -> getter
2. Inventory inventory
3. Location location -> getter and setter
4. List(Order) orders -> getter
5. void addProductToInventory(Product product, int count)
6. void removeProductFromInventory(Product product, int count)
7. void addOrder(Order order)

### Cart
1. Map(Product, Integer) products -> getter (Concurrent Map)
2. void addProductToCart(Product product, int count)
3. void removeProductFromCart(Product product, int count)

### Order
1. int id -> getter
2. Cart cart -> getter
3. Invoice invoice -> getter
4. OrderStatus status -> getter and setter
5. Location deliveryLocation -> getter and setter
6. Location pickUpLocation -> getter and setter
7. double getTotalPrice()
8. void generateInvoice()

### OrderStatus (enum)
1. PENDING
2. PLACED
3. DISPATCHED
4. DELIVERED
5. RETURNED
6. CANCELLED

### Invoice
1. int id -> getter
2. Date order_date -> getter
3. double total_bill -> getter
4. Cart cart -> getter

### PaymentStrategy (interface) -> UPIPaymentStrategy, CardPaymentStrategy
1. void doPayment(int amount)
2. void refundPayment(int amount)

### PaymentStatus
1. PENDING
2. FAILED
3. COMPLETED
4. REFUNDED
# Zoom Car Design

### Objects
1. User
2. Vehicle (It's an interface to which we can extend to Car, Bike etc.) (We can use Factory Design Pattern too)
3. Store
4. VehicleInventory
5. Reservation
6. Payment (Strategy Design Pattern)
7. ZoomCarController (Singleton Design Pattern)
8. Location

### User
1. int id -> getter
2. String name -> getter and setter
3. Location location -> getter and setter
4. String ph_no -> getter
5. String email -> getter and setter
6. List(Reservation) reservations -> getter
7. void addReservaton(Reservation reservation)

### Location
1. String city
2. String state
3. String country
4. int pincode

### Vehicle
1. int id -> getter
2. String model_name -> getter
3. int price_per_hour -> getter and setter
4. Store store -> getter and setter
5. Treeset(Int) slots -> getter
6. VehicleType type -> getter
7. boolean isAvailableSlot(int startSlot, int endSlot)
8. void addSlot(int startSlot, int endSlot)

### VehicleType
1. CAR
2. BIKE
3. CYCLE

### Store
1. int id -> getter
2. VehicleInventory inventory
3. Location location -> getter and setter
4. List(Reservation) reservation -> getter
5. void addVehicle(Vehicle vehicle)
6. void removeVehicle(Vehicle vehicle)
7. void makeReservation(User user, Vehicle vehicle, int startSlot, int endSlot)
8. int calculateBill(int per_hour_price, int startSlot, int endSlot)
9. void cancelReservation(Reservation reservation)

### VehicleInventory
1. List(Vehicle) vehicles
2. void addVehicle(Vehicle vehicle)
3. void removeVehicle(Vehicle vehicle)

### Reservation
1. int id -> getter
2. User user -> getter
3. Vehicle vehicle -> getter
4. int startSlot -> getter
5. int endSlot -> getter
6. int totalBill -> getter and setter
7. ReservationStatus status -> getter and setter

### ReservationStatus
1. PENDING
2. CONFIRMED
3. CANCELLED

### Payment
1. PaymentStatus status -> getter and setter
2. void doPayment(int bill)
3. void refund(int bill)

### PaymentStatus
1. PENDING
2. COMPLETED
3. REFUNDED
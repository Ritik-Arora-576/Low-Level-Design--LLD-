# Parking Lot System

### Rough Flow

**Vehicle -> Entry (Collects Ticket) -> Park Vehicle -> Exit (Payment)**

Vehicle enters through an entrance gate collects the ticket and park the vehicle at parking spot then after certain time driver unpark the vehicle and takes an exit by paying the parking amount.

### Requirement Clarification
1. Parking Spot should be nearest (Parking Strategy)
2. How many entrances and exits
3. How many parking lot levels
4. Different types of vehicles and parking spots
5. Different types of payment methods (Strategy Design Pattern)

### Objects
1. Vehicle
2. Ticket
3. Entrance Gate
4. Parking Spot
5. Exit Gate
6. Payment

### Vehicle

Data Members:
1. Vehicle Number
2. Vehicle Type (Enum)

### Vehicle Type (Enum)
It contains two types of vehicle which are Two-wheeler, Four-wheeler. (Scalable)

### Ticket

Data Members:
1. Entrance Time
2. Parking Spot (Class)
3. Vehicle (Class)

### Entrance Gate:

Methods:
1. Find Parking Spot
2. Update Parking Spot
3. Generate Ticket

### Parking Spot

Data Members:
1. id
2. Vehicle
3. Vehicle Type
4. Price

Methods:
1. Park Vehicle
2. Remove Vehicle
3. Get Price

Child Classes (Extend the Get Price method):
1. two wheeler spots (i.e return 20)
2. four wheeler spots (i.e return 40)

Methods:
1. isEmpty

### Parking Spot Manager

Data Members:
1. List of Parking Spots
2. Parking Strategy object (i.e PS)

Methods:
1. Find Parking Spot (return PS.findParkingSpot())
2. Add Parking Spot
3. Remove Parking Spot
4. Park Vehicle
5. Remove Vehicle

Child Classes:
1. Two wheeler parking manager (Contain List of Parking Spots for Two Wheeler and Parking Strategy Object)
2. Four wheeler parking manager (Contain List of Parking Spots for Two Wheeler and Parking Strategy Object)

### Parking Strategy
1. Nearest To Enterance (contain a method findParkingSpot())
2. Nearest To Exit (contain a method findParkingSpot())
3. Nearest To Enterance and Elevator (contain a method findParkingSpot())
4. Default (contain a method findParkingSpot())

### Parking Spot Manager Factory

Methods:
1. getParkingSpotObject(VehicleType) (On the basis of Vehicle Type this class return required object)

### Exit Gate

Data Members:
1. Exit Time
2. Cost computation object
3. Payment Strategy object
4. Parking Spot Manager object

Methods:
1. Cost Computation
2. Do Payment
3. Remove Vehicle

### Cost Computation

Data Members:
1. Pricing Strategy Object

Methods:
1. getPrice

Child classes:
1. Two Wheeler Cost computation
2. Four Wheeler Cost computation

### Pricing Strategy
1. Hourly based pricing strategy (take ticket as a parameter)
2. Minute based pricing strategy (take ticket as a parameter)

### Payment Strategy
1. Cash Payment
2. UPI Payment
3. Card Payment

Method:
1. doPayment
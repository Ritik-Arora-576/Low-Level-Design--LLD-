# Payment Gateway

In this application, user will register into the application and link their profile with Instruments (i.e Bank, Card etc.). User will pay the amount to another user via their selected instrument and enter the amount in order to pay. Once the amount will be pay then debit notification will be triggered to sender's mobile and credit notification will be triggered to reciever's mobile. And transaction history will be stored.

### Objects
1. User
2. Instrument (Bank, Card etc) -> BankIntrument, CardInstrument
3. Transaction
4. Notification
5. Processor
6. UserController
7. InstrumentController -> BankInstrumentController, CardInstrumentController
8. InstrumentFactory (Factory Design Pattern)
9. TransactionController -> BankTransactionController, CardTransactionController
10. TransactionFactory
11. PaymentGateway

### User
1. int id -> getter
2. String name -> getter and setter
3. String email  -> getter and setter
4. int phone_number  -> getter and setter
5. List(Instrument) instruments -> getter
6. void addInstrument(Intrument intrument)
7. void removeInstrument(Instrument instrument)
8. List(Transaction) transaction_history -> getter
9. void addTransaction(Transaction transaction)

### UserController
1. Map(Integer, User) users -> getter
2. void addUser(User user)
3. void remove(int id)
4. User getUserByID(int id)

### Instrument (Abstract Class)
1. int id -> getter
2. InstrumentType type -> getter
3. int userID -> getter
4. double balance -> getter and setter

### InstrumentType (enum)
1. Bank
2. Card

### BankInstrument (Sub-class of Instrument)
1. String account_number -> getter
2. String ifsc -> getter

### CardInstrument (Sub-class of Instrument)
1. String card_number -> getter
2. int cvv -> getter
3. String valid_from -> getter
4. String valid_till -> getter
5. int pincode -> getter

### InstrumentController (Abstract class) -> BankInstrumentController, CardInstrumentController
1. Map(Integer, Instrument) instruments -> getter
2. void addInstrument(Instrument instrument)
3. void removeInstrument(int id)
4. Intrument getInstrumentByID(int id)

### InstrumentFactory
1. static IntrumentController getInstrumentController(String str)

### Transaction
1. int id -> getter
2. Date txn_date -> getter
3. TransactionStatus status -> getter and setter
4. int sender_user_id -> getter
5. int receiver_user_id -> getter
6. int txn_amount -> getter
7. int sender_transaction_id -> getter
8. int receiver_transaction_id -> getter

### TransactionStatus
1. PENDING
2. COMPLETED
3. FAILED

### TransactionController
1. Map(Integer, Transaction) transactions
2. void addTransaction(Transaction txn)
3. void performTransaction(Transaction txn)

### PaymentGateway
1. UserController userController
2. TransactionController BankTransactionController
3. InstrumentController CardInstrumentController
4. TransactionController BankTransactionController
3. InstrumentController CardInstrumentController

### Notification
1. void sendNotification(User sender_user, User reciever_user)
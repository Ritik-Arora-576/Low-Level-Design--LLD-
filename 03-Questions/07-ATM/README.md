# ATM

### Rough Flow
1. Initially, machine will be in idle state
2. Insert card and authenticate the PIN
3. Once the pin has been authenticated then certain operations will display
4. User will select the operation (Cash Withdrawal, Cash deposit, Change PIN, Check Balance etc.)
5. Once operation will be done then machine will again get back into idle state

In order to design ATM we will use State Design Pattern and Chain of responsiblity design pattern for performing certain operations in different states and in order to handle cash withdrawal.

### Objects
1. ATMState (abstract class) -> State Design Pattern
2. ATM
3. Card
4. User
5. BankAccount
6. Location
7. WithdrawalProcessor -> Chain of Responsiblity Design Pattern
8. ATMDemo

### ATMState (Abstract Class)
1. insertCard(ATM atm, Card card) -> idleState
2. authenticatePIN(ATM atm, Card card, int entered_pin) -> hasCardState
3. selectOperation(ATM atm, Card card, OperationType operation) -> selectOperationState
4. if (opertaion == OperationType.CASHWITHDRAWAL) -> cashWithdrawal(ATM atm, Card card) -> cashWithdrawalState
5. if (opertaion == OperationType.CHECKBALANCE) -> checkBalance(Card card) -> checkBalanceState
6. pressCancellButton(ATM atm) -> hasCardState, selectOperationState, cashWithdrawalState, checkBalanceState

### OperationType (enum)
1. CASHWITHDRAWAL
2. CHECKBALANCE

### ATM
1. ATMState state -> getter and setter
2. int id -> getter
3. int n_2000 -> getter and setter
4. int n_500 -> getter and setter
5. int n_100 -> getter and setter

### BankAccount
1. int account_number -> getter
2. int balance -> getter and setter
3. int ifsc -> getter
4. Location location -> getter and setter

### Location
1. String district -> getter
2. String city -> getter
3. String State -> getter
4. String country -> getter
5. int pincode -> getter

### Card
1. int card_number -> getter
2. int cvv -> getter
3. String valid_from -> getter
4. String valid_till -> getter
5. User user
6. int pin_number -> getter and setter

### User
1. int id -> getter
2. String name -> getter and setter
3. BankAccount account -> getter and setter
4. List(Card) cards -> getter
5. void addCard(Card card)
6. void RemoveCard(Card card)

### WithdrawalProcessor
1. TwoThousandWithdrawalProcessor (sub-class)
2. FiveHundredWithdrawalProcessor (sub-class)
3. OneHundredWithdrawalProcessor (sub-class)
4. withdrawal(int balance)

### ATMDemo
1. ATM atm
2. List(User) users
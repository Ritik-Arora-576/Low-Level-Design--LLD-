# Splitwise

### Flow
User will register into the app and in order to keep the track of the expense it will create the group and within the group expense will be added which will shared among the friends wisely.

### Objects
1. User
2. Group
3. Expense 
4. SplitStrategy -> Strategy Design Pattern (Equal Split, Percentage wise split, Unequal Split)
5. BalanceSheet
6. Splitwise
7. UserController
8. GroupController
9. ExpenseController

### Expense
1. int id -> getter
2. String title -> getter and setter
3. double amount -> getter and setter
4. User paidBy -> getter and setter
5. ExpenseType type -> getter and setter (enum)
6. Map(Integer, Double) userIDvsSplit -> getter and setter
7. void computeExpense()
8. void splitAmountEqually()
9. void splitAmountUnequally()
10. void splitAmountByPercentage()

### ExpenseType
1. EQUAL 
2. UNEQUAL 
3. PERCENTAGE 

### User
1. int id -> getter
2. String name -> getter and setter
3. List(Group) groups -> getter
4. BalanceSheet sheet -> getter and setter
5. List(Expense) expense -> getter
6. void addGroup(Group group)
7. void addExpense(Expense expense)

### UserController
1. List(User) users -> getter
2. void addUser(User user)
3. void removeUser(int userId) 
4. void getUserByID(int id)

### Splitwise
1. UserController userController -> getter

### Group
1. int id -> getter
2. String name -> getter and setter
3. List(User) users -> getter
4. ExpenseController expenseController -> getter
5. void addUser(User user)
6. void removeUser(int userId)

### ExpenseController
1. List(Expense) expenses -> getter
2. BalanceSheet balanceSheet -> getter and setter
3. void addExpense(Expense expense)
4. void removeExpense(Expense expense)
5. void updateBalanceSheet()

### BalanceSheet
1. Map(UserID, double) friendsVsExpense -> getter and setter
2. double youOwe -> getter and setter
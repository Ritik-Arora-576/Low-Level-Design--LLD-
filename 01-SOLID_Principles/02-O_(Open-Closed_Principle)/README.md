# Open/Closed Principle

According to this principle, a class should be open for extension and closed for modification.

In **Example-1** if a class is live and tested then if we add a function **"saveToFile()"** in a class this would lead it to bugs prone which crashes the software, so in order to make system bug free and also make more flexible for features expansion we would make an interface in order to extend the functionality rather than modifying the class. You can refer **Example-2** which follows this principle.

In **Example-2** we have created an interface **InvoiceDAO** whose functionality has been implemented by class **DatabaseInvoiceDAO** which stores invoice in Database and **LocalInvoiceDAO** which stores invoice in Local storage. In this case, we are extending the class rather than modifying a class.
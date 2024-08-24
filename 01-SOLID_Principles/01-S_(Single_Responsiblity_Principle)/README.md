# Single Responsiblity Principle

This principle says that a class should have only one responsiblity and only one reason to be changed.

**Example-1** doesn't follow a Single Responsiblity Principle because **class Invoice** has two responsiblities:
1. Calculate total cost of marker
2. Save Invoice into database

So in order to follow this principle, we have to break **class Invoice** into **class CalculateInvoice** which handles the responsiblity to calculate the total cost of marker and **class InvoiceDAO** which handles the responsiblity to save invoice into database. Implementation is mentioned in **Example-2**.
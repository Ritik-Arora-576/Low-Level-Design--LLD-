# Chain Of Responsiblity Design Pattern

Chain of Responsiblity Design Pattern is a behavioral design pattern in which we allows an object to pass a request to series of handlers without having any prior information about which handler will fulfill a request.

If handler fulfill that request then it will return a response to client without passing a request to next handler otherwise it will pass a request to next handler until it touches NULL. If none of handler fulfill a request then overall request would not be fulfill.

This design pattern resembles with linked list data structure in which an object contains next object of their own kind. This kind of design pattern frequently used in designing for **ATM**, **Vending Machine**, **LogProcessor** and etc.

### Example

In **Client.java**, there is a code (**LogProcessor logProcessor = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));**) which means if a request doesn't fulfilled by **InfoProcessor** then a request goes to **DebugProcessor** then to **ErrorProcessor** and so on until the request wouldn't be fulfill or **nextProcessor** wouldn't be **NULL**.
public class Client {
    public static void main(String[] args) {
        // Context is a class which contains the set of rules or grammar
        Context context = new Context();
        
        // putting some contexts
        context.put('a', 5);
        context.put('b', 7);
        context.put('c', 10);

        // evaluating an expression: (a+b)*(b-c)
        // Expression is used to interpret the expression by using grammar stored in context object
        Expression expression = new OperatorNonTerminalExpression(
            new OperatorNonTerminalExpression(new NumberTerminalExpression('a'), new NumberTerminalExpression('b'), '+'),
            new OperatorNonTerminalExpression(new NumberTerminalExpression('b'), new NumberTerminalExpression('c'), '-'), 
            '*');

        System.out.println("Evaluation ans is: "+expression.interpret(context));
    }
}

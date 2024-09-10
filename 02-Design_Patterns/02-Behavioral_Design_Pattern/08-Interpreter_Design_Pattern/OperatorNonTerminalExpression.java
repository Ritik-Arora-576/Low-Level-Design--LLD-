public class OperatorNonTerminalExpression implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private Character op;

    public OperatorNonTerminalExpression(Expression leftExpression, Expression rightExpression, Character op){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }

    public int interpret(Context context){
        if(op=='+') return this.leftExpression.interpret(context) + this.rightExpression.interpret(context);
        else if(op=='*') return this.leftExpression.interpret(context) * this.rightExpression.interpret(context);
        else if(op=='/') return this.leftExpression.interpret(context) / this.rightExpression.interpret(context);
        else return this.leftExpression.interpret(context) - this.rightExpression.interpret(context);
    }
}

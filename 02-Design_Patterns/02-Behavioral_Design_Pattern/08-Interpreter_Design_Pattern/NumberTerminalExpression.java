public class NumberTerminalExpression implements Expression{
    Character ch;

    public NumberTerminalExpression(Character ch){
        this.ch = ch;
    }

    public int interpret(Context context){
        return context.get(ch);
    }
}

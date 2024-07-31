package Classes;

public class ExprStmt {

    Expression expression;
    public void PrintAst() {

        if (expression != null) {
            expression.PrintAst();
        }
    }
    public String generate() {
        String s = "";
        s += expression.generate();
        return s;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}

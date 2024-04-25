package Classes;

public class ReturnStmt {


    String RETURN;
    Expression expression;


    public void PrintAst() {

        if (RETURN != null) {
            System.out.println(RETURN);
        }

        if (expression != null) {
            expression.PrintAst();
        }
    }

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}

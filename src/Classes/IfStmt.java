package Classes;

public class IfStmt {

    String IF;
    Expression  expression;
    Statement statement1;
    String ELSE;
    Statement statement2;

    public void PrintAst() {


        if (IF != null) {
            System.out.println(IF);
        }
        if (expression != null) {
            expression.PrintAst();
        }
        if (statement1 != null) {
            statement1.PrintAst();
        }

        if (ELSE != null) {
            System.out.println(ELSE);
        }
        if (statement2 != null) {
            statement2.PrintAst();
        }
    }
    public String generate() {
        String s = "";

        s += expression.generate();
        s += statement1.generate();
        s += statement2.generate();


        return s;
    }

    public String getIF() {
        return IF;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Statement getStatement1() {
        return statement1;
    }

    public void setStatement1(Statement statement1) {
        this.statement1 = statement1;
    }

    public String getELSE() {
        return ELSE;
    }

    public void setELSE(String ELSE) {
        this.ELSE = ELSE;
    }

    public Statement getStatement2() {
        return statement2;
    }

    public void setStatement2(Statement statement2) {
        this.statement2 = statement2;
    }
}

package Classes;

public class Expression {

     String IDENTIFIER1;
     int DECIMAL_INTEGER_LITERAL;
    String NULL;
    Expression expression1;
    Operatorr operator;
    Expression expression2;
    String IDENTIFIER2;
    Args  args;


    public String getIDENTIFIER1() {
        return IDENTIFIER1;
    }

    public void setIDENTIFIER1(String IDENTIFIER1) {
        this.IDENTIFIER1 = IDENTIFIER1;
    }

    public int getDECIMAL_INTEGER_LITERAL() {
        return DECIMAL_INTEGER_LITERAL;
    }

    public void setDECIMAL_INTEGER_LITERAL(int DECIMAL_INTEGER_LITERAL) {
        this.DECIMAL_INTEGER_LITERAL = DECIMAL_INTEGER_LITERAL;
    }

    public String getNULL() {
        return NULL;
    }

    public void setNULL(String NULL) {
        this.NULL = NULL;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public Operatorr getOperator() {
        return operator;
    }

    public void setOperator(Operatorr operator) {
        this.operator = operator;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    public String getIDENTIFIER2() {
        return IDENTIFIER2;
    }

    public void setIDENTIFIER2(String IDENTIFIER2) {
        this.IDENTIFIER2 = IDENTIFIER2;
    }

    public Args getArgs() {
        return args;
    }

    public void setArgs(Args args) {
        this.args = args;
    }



    public void PrintAst() {


        if (IDENTIFIER1 != null) {
            System.out.println(IDENTIFIER1);
        }
        System.out.println(DECIMAL_INTEGER_LITERAL);


        if (NULL != null) {
            System.out.println(NULL);
        }

        if (expression1 != null) {
            expression1.PrintAst();
        }
        if (operator != null) {
            operator.PrintAst();
        }
        if (expression2 != null) {
            expression2.PrintAst();
        }
        if (IDENTIFIER2 != null) {
            System.out.println(IDENTIFIER2);
        }

        if (args != null) {
            args.PrintAst();
        }



    }






}

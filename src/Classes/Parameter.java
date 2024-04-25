package Classes;

public class Parameter {

   String IDENTIFIER;
   String NULLL;
    int DECIMAL_INTEGER_LITERAL;

    public void PrintAst() {

        if (IDENTIFIER != null) {
            System.out.println(IDENTIFIER);
        }


            if (NULLL != null) {
                System.out.println(NULLL);
            }
        System.out.println(DECIMAL_INTEGER_LITERAL);

    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getNULLL() {
        return NULLL;
    }

    public void setNULLL(String NULLL) {
        this.NULLL = NULLL;
    }

    public int getDECIMAL_INTEGER_LITERAL() {
        return DECIMAL_INTEGER_LITERAL;
    }

    public void setDECIMAL_INTEGER_LITERAL(int DECIMAL_INTEGER_LITERAL) {
        this.DECIMAL_INTEGER_LITERAL = DECIMAL_INTEGER_LITERAL;
    }
}

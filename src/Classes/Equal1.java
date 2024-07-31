package Classes;

public class Equal1 {

    String IDENTIFIER;
    String  STRING_LITERAL;
   int  DECIMAL_INTEGER_LITERAL;
   float  FLOAT_LITERAL;
    String IDENTIFIER1;

   public void PrintAst(){

       if (IDENTIFIER!=null)
       {
           System.out.println(IDENTIFIER);
       }
       if (IDENTIFIER1!=null)
       {
           System.out.println(IDENTIFIER1);
       }
       if (STRING_LITERAL!=null)
       {
           System.out.println(STRING_LITERAL);
       }
       System.out.println(DECIMAL_INTEGER_LITERAL);
       System.out.println(FLOAT_LITERAL);


   }
    @Override
    public String toString() {
        String s = "";
          s+="var"+IDENTIFIER+'='+DECIMAL_INTEGER_LITERAL;
        return s;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getSTRING_LITERAL() {
        return STRING_LITERAL;
    }

    public void setSTRING_LITERAL(String STRING_LITERAL) {
        this.STRING_LITERAL = STRING_LITERAL;
    }

    public int getDECIMAL_INTEGER_LITERAL() {
        return DECIMAL_INTEGER_LITERAL;
    }

    public void setDECIMAL_INTEGER_LITERAL(int DECIMAL_INTEGER_LITERAL) {
        this.DECIMAL_INTEGER_LITERAL = DECIMAL_INTEGER_LITERAL;
    }

    public float getFLOAT_LITERAL() {
        return FLOAT_LITERAL;
    }

    public void setIDENTIFIER1(String IDENTIFIER1) {
        this.IDENTIFIER1 = IDENTIFIER1;
    }

    public String getIDENTIFIER1() {
        return IDENTIFIER1;
    }

    public void setFLOAT_LITERAL(float FLOAT_LITERAL) {
        this.FLOAT_LITERAL = FLOAT_LITERAL;
    }
}

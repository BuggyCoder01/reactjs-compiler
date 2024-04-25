package Classes;

public class Function_call {
     String IDENTIFIER;
     ParameterList parameterList;

    public void PrintAst() {

        if (IDENTIFIER != null) {
            System.out.println(IDENTIFIER);
        }

        if (parameterList != null) {
            parameterList.PrintAst();
        }
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }
}

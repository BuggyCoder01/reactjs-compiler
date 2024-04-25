package Classes;

public class Function {

    String FUNCTION;
    String  IDENTIFIER;
    ParameterList parameterList;
    Function_body  function_body;

    public void PrintAst() {

        if (IDENTIFIER != null) {
            System.out.println(IDENTIFIER);
        }

        if (FUNCTION != null) {
            System.out.println(FUNCTION);
        }




        if (parameterList != null) {
            parameterList.PrintAst();
        }
        if (function_body != null) {
            function_body.PrintAst();
        }

    }

    public String getFUNCTION() {
        return FUNCTION;
    }

    public void setFUNCTION(String FUNCTION) {
        this.FUNCTION = FUNCTION;
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

    public Function_body getFunction_body() {
        return function_body;
    }

    public void setFunction_body(Function_body function_body) {
        this.function_body = function_body;
    }
}

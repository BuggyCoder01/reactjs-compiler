package Classes;

public class Equal2 {

    String IDENTIFIER1;
    String IDENTIFIER2;

    Function_call function_call;


    public void PrintAst(){

        if (IDENTIFIER1!=null)
        {
            System.out.println(IDENTIFIER1);
        }
        if (IDENTIFIER2!=null)
        {
            System.out.println(IDENTIFIER2);
        }
        if (function_call!=null)
        {
            function_call.PrintAst();
        }




    }

    public String generate() {
        String s = "";
        s+="const"+'['+IDENTIFIER1+','+IDENTIFIER2+']'+'=';
        s += function_call.generate();
        s+=';';

        return s;
    }


    public String getIDENTIFIER1() {
        return IDENTIFIER1;
    }

    public void setIDENTIFIER1(String IDENTIFIER1) {
        this.IDENTIFIER1 = IDENTIFIER1;
    }

    public String getIDENTIFIER2() {
        return IDENTIFIER2;
    }

    public void setIDENTIFIER2(String IDENTIFIER2) {
        this.IDENTIFIER2 = IDENTIFIER2;
    }

    public Function_call getFunction_call() {
        return function_call;
    }

    public void setFunction_call(Function_call function_call) {
        this.function_call = function_call;
    }
}

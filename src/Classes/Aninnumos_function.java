package Classes;

import generation.Generator;

public class Aninnumos_function {

    ParameterList parameterList;
    JsxElement jsxElement;
    Function_call function_call;

    public void PrintAst() {

        if (parameterList != null) {
            parameterList.PrintAst();
        }
        if (jsxElement != null) {
            jsxElement.PrintAst();
        }
        if (function_call != null) {
            function_call.PrintAst();
        }
    }
//    aninnumos_function: OPEN_PAREN (parameterList ?) CLOSE_PAREN ARROW OPEN_BRACE (jsxElement?) (function_call?) CLOSE_BRACE;

    public String generate() {
        String s = "";
        s+='(';
        s += parameterList.generate();
        s+=')'+'='+'>'+'{';

       s+=jsxElement.generate();

        if(function_call!=null)
        {
            s += function_call.generate();
        }
        s+='}';


        return s;
    }


    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Function_call getFunction_call() {
        return function_call;
    }

    public void setFunction_call(Function_call function_call) {
        this.function_call = function_call;
    }
}

package Classes;

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

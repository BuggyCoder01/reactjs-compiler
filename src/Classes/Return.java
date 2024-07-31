package Classes;

public class Return {

    String RETURN;
    JsxElement jsxElement;








    public void PrintAst() {
        if (RETURN != null) {
            System.out.println(RETURN);
        }
        if (jsxElement != null) {
            jsxElement.PrintAst();
        }

    }
    public String generate() {
        String s = "";
        s+="return"+'(';
        s += jsxElement.generate();
        s+=')';
        return s;
    }
    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }
}

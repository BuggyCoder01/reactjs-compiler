package Classes;

public class Sss {

    String IDENTIFIER;
    String LOGICAL_AND1;
    String LOGICAL_AND2;
    JsxSelfClosing jsxSelfClosing;


    public void PrintAst() {

        if (IDENTIFIER != null) {
            System.out.println(IDENTIFIER);
        }
        if (LOGICAL_AND1 != null) {
            System.out.println(LOGICAL_AND1);
        }
        if (LOGICAL_AND2 != null) {
            System.out.println(LOGICAL_AND2);
        }
        if (jsxSelfClosing != null) {
            jsxSelfClosing.PrintAst();
        }




    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getLOGICAL_AND1() {
        return LOGICAL_AND1;
    }

    public void setLOGICAL_AND1(String LOGICAL_AND1) {
        this.LOGICAL_AND1 = LOGICAL_AND1;
    }

    public String getLOGICAL_AND2() {
        return LOGICAL_AND2;
    }

    public void setLOGICAL_AND2(String LOGICAL_AND2) {
        this.LOGICAL_AND2 = LOGICAL_AND2;
    }

    public JsxSelfClosing getJsxSelfClosing() {
        return jsxSelfClosing;
    }

    public void setJsxSelfClosing(JsxSelfClosing jsxSelfClosing) {
        this.jsxSelfClosing = jsxSelfClosing;
    }
}

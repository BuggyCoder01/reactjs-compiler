package Classes;

public class Closeingt {

    JsxElementName jsxElementName;

    public void PrintAst() {

        if (jsxElementName != null) {
            jsxElementName.PrintAst();
        }
    }
    public String generate() {
        String s = "";

        s += jsxElementName.toString();

        return s;
    }
    public JsxElementName getJsxElementName() {
        return jsxElementName;
    }

    public void setJsxElementName(JsxElementName jsxElementName) {
        this.jsxElementName = jsxElementName;
    }
}

package Classes;
import java.util.ArrayList;
import java.util.List;
public class JsxSelfClosing {

    JsxElementName jsxElementName;
    JsxAttributes jsxAttribute;
    JsxElementChildren jsxElementChildren;
    List<JsxSelfClosing> jsxSelfClosing =new ArrayList<JsxSelfClosing>();
    Closeingt closeingt;

    public void PrintAst() {

        if (jsxElementName != null) {
            jsxElementName.PrintAst();
        }
        if (jsxAttribute != null) {
            jsxAttribute.PrintAst();
        }
        if (jsxElementChildren != null) {
            jsxElementChildren.PrintAst();
        }

        if (jsxSelfClosing != null) {
            for (int i = 0; i < jsxSelfClosing.size(); i++) {
                jsxSelfClosing.get(i).PrintAst();
            }
        }

        if (closeingt != null) {
            closeingt.PrintAst();
        }
    }

    public JsxElementName getJsxElementName() {
        return jsxElementName;
    }

    public void setJsxElementName(JsxElementName jsxElementName) {
        this.jsxElementName = jsxElementName;
    }

    public JsxAttributes getJsxAttribute() {
        return jsxAttribute;
    }

    public void setJsxAttribute(JsxAttributes jsxAttribute) {
        this.jsxAttribute = jsxAttribute;
    }

    public JsxElementChildren getJsxElementChildren() {
        return jsxElementChildren;
    }

    public void setJsxElementChildren(JsxElementChildren jsxElementChildren) {
        this.jsxElementChildren = jsxElementChildren;
    }

    public List<JsxSelfClosing> getJsxSelfClosing() {
        return jsxSelfClosing;
    }

    public void setJsxSelfClosing(List<JsxSelfClosing> jsxSelfClosing) {
        this.jsxSelfClosing = jsxSelfClosing;
    }

    public Closeingt getCloseingt() {
        return closeingt;
    }

    public void setCloseingt(Closeingt closeingt) {
        this.closeingt = closeingt;
    }
}

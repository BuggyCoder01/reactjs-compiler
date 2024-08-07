package Classes;
import java.util.ArrayList;
import java.util.List;

public class JsxElement {

    List<JsxSelfClosing> jsxSelfClosing =new ArrayList<JsxSelfClosing>();

    public void PrintAst() {
        if (jsxSelfClosing != null) {
            for (int i = 0; i < jsxSelfClosing.size(); i++) {
                jsxSelfClosing.get(i).PrintAst();
            }
        }
    }
    public String generate() {
        String s = "";

        for (int i = 0; i < jsxSelfClosing.size(); i++) {
            s += jsxSelfClosing.get(i).generate();

        }
        return s;
    }
    public List<JsxSelfClosing> getJsxSelfClosing() {
        return jsxSelfClosing;
    }

    public void setJsxSelfClosing(List<JsxSelfClosing> jsxSelfClosing) {
        this.jsxSelfClosing = jsxSelfClosing;
    }
}

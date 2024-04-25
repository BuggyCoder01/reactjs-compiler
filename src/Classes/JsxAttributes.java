package Classes;
import java.util.ArrayList;
import java.util.List;
public class JsxAttributes {

    List<JsxAttribute> jsxAttribute =new ArrayList<JsxAttribute>();

    public void PrintAst() {
        if (jsxAttribute != null) {
            for (int i = 0; i < jsxAttribute.size(); i++) {
                jsxAttribute.get(i).PrintAst();
            }
        }
    }

    public List<JsxAttribute> getJsxAttribute() {
        return jsxAttribute;
    }

    public void setJsxAttribute(List<JsxAttribute> jsxAttribute) {
        this.jsxAttribute = jsxAttribute;
    }
}

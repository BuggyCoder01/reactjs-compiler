package Classes;
import java.util.ArrayList;
import java.util.List;
public class JsxElementChildren {
    List<Jsx11> jsx11 =new ArrayList<Jsx11>();
    List<Sss> sss =new ArrayList<Sss>();

    public void PrintAst() {
        if (jsx11 != null) {
            for (int i = 0; i < jsx11.size(); i++) {
                jsx11.get(i).PrintAst();
            }
        }
        if (sss != null) {
            for (int i = 0; i < sss.size(); i++) {
                sss.get(i).PrintAst();
            }
        }
    }

    public List<Jsx11> getJsx11() {
        return jsx11;
    }

    public void setJsx11(List<Jsx11> jsx11) {
        this.jsx11 = jsx11;
    }

    public List<Sss> getSss() {
        return sss;
    }

    public void setSss(List<Sss> sss) {
        this.sss = sss;
    }
}

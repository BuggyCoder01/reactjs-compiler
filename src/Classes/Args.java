package Classes;

import java.util.ArrayList;
import java.util.List;
public class Args {

    List<Expression> expressions =new ArrayList<Expression>();

    public String generate() {
        String s = "";

        for (int i = 0; i < expressions.size(); i++) {
            s += expressions.get(i).generate();
        }
        return s;
    }
    public void PrintAst() {
        if (expressions != null) {
            for (int i = 0; i < expressions.size(); i++) {
                expressions.get(i).PrintAst();
            }
        }
    }


    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}

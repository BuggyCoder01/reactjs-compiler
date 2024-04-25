package Classes;

import java.util.ArrayList;
import java.util.List;
public class Args {

    List<Expression> expressions =new ArrayList<Expression>();


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

package Classes;
import java.util.ArrayList;
import java.util.List;

public class Function_body {

    List<Statement> statement =new ArrayList<Statement>();

    public void PrintAst() {
        if (statement != null) {
            for (int i = 0; i < statement.size(); i++) {
                statement.get(i).PrintAst();
            }
        }
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }
}

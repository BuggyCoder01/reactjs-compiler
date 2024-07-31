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
    public String generate() {
        String s = "";
        for (int i = 0; i < statement.size(); i++) {
            s += statement.get(i).generate();

        }
        return s;
    }
    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }
}

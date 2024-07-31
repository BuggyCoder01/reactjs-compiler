package Classes;

import java.util.ArrayList;
import java.util.List;

public class Body {

    Branch_component1 branch_component1;
    List<Equaletion> equaletion =new ArrayList<Equaletion>();
    List<Statement> statements=new ArrayList<>();


    public void PrintAst() {
        if (statements != null) {
            for (int i = 0; i < statements.size(); i++) {
                statements.get(i).PrintAst();
            }
        }

        if (equaletion != null) {
            for (int i = 0; i < equaletion.size(); i++) {
                equaletion.get(i).PrintAst();
            }
        }

        if (branch_component1 != null) {
            branch_component1.PrintAst();
        }
    }
    public String generate() {
        String s = "";

        s += branch_component1.generate();

        for (int i = 0; i < equaletion.size(); i++) {
            s += equaletion.get(i).generate();

        }
        for (int i = 0; i < statements.size(); i++) {
            s += statements.get(i).generate();

        }
        return s;
    }
    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setEqualetion(List<Equaletion> equaletion) {
        this.equaletion = equaletion;
    }

    public List<Equaletion> getEqualetion() {
        return equaletion;
    }

    public Branch_component1 getBranch_component1() {
        return branch_component1;
    }

    public void setBranch_component1(Branch_component1 branch_component1) {
        this.branch_component1 = branch_component1;
    }
}

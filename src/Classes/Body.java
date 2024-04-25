package Classes;

public class Body {

    Equaletion  equaletion;
    Branch_component1 branch_component1;

    public void PrintAst() {

        if (equaletion != null) {
            equaletion.PrintAst();
        }

        if (branch_component1 != null) {
            branch_component1.PrintAst();
        }
    }

    public Equaletion getEqualetion() {
        return equaletion;
    }

    public void setEqualetion(Equaletion equaletion) {
        this.equaletion = equaletion;
    }

    public Branch_component1 getBranch_component1() {
        return branch_component1;
    }

    public void setBranch_component1(Branch_component1 branch_component1) {
        this.branch_component1 = branch_component1;
    }
}

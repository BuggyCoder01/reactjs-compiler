package Classes;

public class Equaletion {

    Equal1 equal1;
    Equal2 equal2;

    public void PrintAst() {

        if (equal1 != null) {
            equal1.PrintAst();
        }
        if (equal2 != null) {
            equal2.PrintAst();
        }
    }

    public Equal1 getEqual1() {
        return equal1;
    }

    public void setEqual1(Equal1 equal1) {
        this.equal1 = equal1;
    }

    public Equal2 getEqual2() {
        return equal2;
    }

    public void setEqual2(Equal2 equal2) {
        this.equal2 = equal2;
    }
}

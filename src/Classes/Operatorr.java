package Classes;

public class Operatorr {
    String OPERATOR;


    public void PrintAst() {

        if (OPERATOR != null) {
            System.out.println(OPERATOR);
        }
    }


    public String getOPERATOR() {
        return OPERATOR;
    }

    public void setOPERATOR(String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }
}

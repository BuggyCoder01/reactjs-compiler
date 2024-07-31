package Classes;

public class Operatorr {
    String OPERATOR;


    public void PrintAst() {

        if (OPERATOR != null) {
            System.out.println(OPERATOR);
        }
    }
    @Override
    public String toString() {
        String s = "";
         s+=OPERATOR;
        return s;
    }

    public String getOPERATOR() {
        return OPERATOR;
    }

    public void setOPERATOR(String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }
}

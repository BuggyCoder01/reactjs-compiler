package Classes;

public class Jsx11 {

    String IDENTIFIER1;
    String DOT;
    String IDENTIFIER2;
    Aninnumos_function aninnumos_function;

    public void PrintAst() {

        if (IDENTIFIER1 != null) {
            System.out.println(IDENTIFIER1);
        }
        if (DOT != null) {
            System.out.println(DOT);
        }
        if (IDENTIFIER2 != null) {
            System.out.println(IDENTIFIER2);
        }


        if (aninnumos_function != null) {
            aninnumos_function.PrintAst();
        }

}
//    jsx11:  OPEN_BRACE IDENTIFIER DOT IDENTIFIER OPEN_PAREN aninnumos_function? CLOSE_PAREN CLOSE_BRACE    ;

    public String generate() {
        String s = "";
        s+='{'+IDENTIFIER1+'.'+IDENTIFIER2+'(';
        s += aninnumos_function.generate();
        s+=')'+'}';
        return s;
    }


    public String getIDENTIFIER1() {
        return IDENTIFIER1;
    }

    public void setIDENTIFIER1(String IDENTIFIER1) {
        this.IDENTIFIER1 = IDENTIFIER1;
    }

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public String getIDENTIFIER2() {
        return IDENTIFIER2;
    }

    public void setIDENTIFIER2(String IDENTIFIER2) {
        this.IDENTIFIER2 = IDENTIFIER2;
    }

    public Aninnumos_function getAninnumos_function() {
        return aninnumos_function;
    }

    public void setAninnumos_function(Aninnumos_function aninnumos_function) {
        this.aninnumos_function = aninnumos_function;
    }
}

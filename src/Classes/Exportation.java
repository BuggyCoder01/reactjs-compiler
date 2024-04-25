package Classes;

public class Exportation {

    String EXPORT;
    String DEFAULT;
    String IDENTIFIER;


    public void PrintAst() {

        if (EXPORT != null) {
            System.out.println(EXPORT);
        }
        if (DEFAULT != null) {
            System.out.println(DEFAULT);
        }
        if (IDENTIFIER != null) {
            System.out.println(IDENTIFIER);
        }
    }

    public String getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(String EXPORT) {
        this.EXPORT = EXPORT;
    }

    public String getDEFAULT() {
        return DEFAULT;
    }

    public void setDEFAULT(String DEFAULT) {
        this.DEFAULT = DEFAULT;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
}

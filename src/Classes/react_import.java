package Classes;

public class    react_import {

    String IMPORT;
    String IDENTIFIER1;

    String IDENTIFIER2;

    String IDENTIFIER3;

    public void PrintAst(){

        if(IMPORT!=null)
        {
            System.out.println(IMPORT);
        }
        if(IDENTIFIER1!=null)
        {
            System.out.println(IDENTIFIER1);
        }
        if(IDENTIFIER2!=null)
        {
            System.out.println(IDENTIFIER2);
        }
        if(IDENTIFIER3!=null)
        {
            System.out.println(IDENTIFIER3);
        }

    }

    @Override
    public String toString() {
        return "import" + " " + IDENTIFIER1 + ',' + '{' + IDENTIFIER2 + "}" + "from" + "react"+";";
    }

    public void setIMPORT(String IMPORT) {
        this.IMPORT = IMPORT;
    }

    public void setIDENTIFIER1(String IDENTIFIER1) {
        this.IDENTIFIER1 = IDENTIFIER1;
    }

    public void setIDENTIFIER2(String IDENTIFIER2) {
        this.IDENTIFIER2 = IDENTIFIER2;
    }

    public void setIDENTIFIER3(String IDENTIFIER3) {
        this.IDENTIFIER3 = IDENTIFIER3;
    }

    public String getIMPORT() {
        return IMPORT;
    }

    public String getIDENTIFIER1() {
        return IDENTIFIER1;
    }

    public String getIDENTIFIER2() {
        return IDENTIFIER2;
    }

    public String getIDENTIFIER3() {
        return IDENTIFIER3;
    }
}

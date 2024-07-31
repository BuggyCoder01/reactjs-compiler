package Classes;

public class JsxElementName {

   String DIV;
   String   SPAN;
   String A;
   String   HEAD2;
   String PARAG;
   String IMG;
   String BUTTON;



    public void PrintAst() {


        if (DIV != null) {
            System.out.println(DIV);
        }
        if (SPAN != null) {
            System.out.println(SPAN);
        }
        if (A != null) {
            System.out.println(A);
        }
        if (HEAD2 != null) {
            System.out.println(HEAD2);
        }
        if (PARAG != null) {
            System.out.println(PARAG);
        }
        if (IMG != null) {
            System.out.println(IMG);
        }
        if (BUTTON != null) {
            System.out.println(BUTTON);
        }
    }
    @Override
    public String toString() {
        String s = "";
        if (DIV != null) {
           s+= DIV;
        }
        if (SPAN != null) {
            s+= SPAN;
        }
        if (A != null) {
            s+= A;
        }
        if (HEAD2 != null) {
            s+= HEAD2;
        }
        if (PARAG != null) {
            s+= PARAG;
        }
        if (IMG != null) {
            s+= IMG;
        }
        if (BUTTON != null) {
            s+= BUTTON;
        }

        return s;
    }

    public String getDIV() {
        return DIV;
    }

    public void setDIV(String DIV) {
        this.DIV = DIV;
    }

    public String getSPAN() {
        return SPAN;
    }

    public void setSPAN(String SPAN) {
        this.SPAN = SPAN;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getHEAD2() {
        return HEAD2;
    }

    public void setHEAD2(String HEAD2) {
        this.HEAD2 = HEAD2;
    }

    public String getPARAG() {
        return PARAG;
    }

    public void setPARAG(String PARAG) {
        this.PARAG = PARAG;
    }

    public String getIMG() {
        return IMG;
    }

    public void setIMG(String IMG) {
        this.IMG = IMG;
    }

    public String getBUTTON() {
        return BUTTON;
    }

    public void setBUTTON(String BUTTON) {
        this.BUTTON = BUTTON;
    }
}

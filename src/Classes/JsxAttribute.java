package Classes;

public class JsxAttribute {

    String CLASSNAME;
    String STRING_LITERAL;
    JsxAttribute jsxAttribute1;
    String KEY;
    String IDENTIFIER1;
    String  DOT1;
    String IDENTIFIER2;
    String SRC;

    String DOT2;

    String ALT;

    String DOT3;

    JsxAttribute jsxAttribute2;

    String DOLLAR;

    String DOT4;

    JsxElementName jsxElementName;
    JsxAttribute jsxAttribute3;
    JsxElementevents jsxElementevent1;
    Aninnumos_function aninnumos_function;
    String   SHOWDETAILS;
    JsxAttribute jsxAttribute4;
    JsxElementevents jsxElementevent2;

    String LOGICAL_AND;

//          <div className="product" key={product.id}>
//
//    jsxAttribute: (CLASSNAME EQUAL STRING_LITERAL )                                                                                                                # ATRIBUTE_CLASS
//              | jsxAttribute (KEY EQUAL OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE)                                                                    # ATRIBUTE_key
//              |  (SRC EQUAL OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE  ALT  EQUAL OPEN_BRACE IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE )                 # ATRIBUTE_IMG
//              |  jsxAttribute  CLOSETAG? (IDENTIFIER? COLON? DOLLAR? OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE) OPENTAG SLASH jsxElementName CLOSETAG # ATRIBUTE_DOLLAR
//              |   CLOSETAG? (IDENTIFIER? COLON? DOLLAR? OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE) OPENTAG SLASH jsxElementName CLOSETAG              # ELEMENT
//              |  jsxAttribute jsxElementevents EQUAL OPEN_BRACE aninnumos_function?  CLOSE_BRACE  CLOSETAG SHOWDETAILS                                         # FUNC_ELEMNT
//              |  jsxAttribute jsxElementevents EQUAL OPEN_BRACE  IDENTIFIER   CLOSE_BRACE CLOSETAG LOGICAL_AND IDENTIFIER SEMICOLON


    public String generate() {
        String s = "";


        if(jsxAttribute1!=null)
        {
            s += jsxAttribute1.generate();
        }        s+="key"+'='+'{'+IDENTIFIER1+'.'+IDENTIFIER2+'}';

        s+=CLASSNAME+'='+STRING_LITERAL;
        if(jsxElementName!=null)
        {
            s += jsxElementName.toString();
        }
        s+="src"+'='+'{'+"product"+'.'+"imageUrl"+'}'+' '+"alt"+'='+'{'+"product"+'.'+"name"+'}'+' '+'/';
        s+='/'+"div";

        s+=CLASSNAME+'='+"product-details";


        s+="h2 className=\"product-name\">{product.name}</h2";
        s+="p className=\"product-price\">${product.price}</p";
        s+="      <button\n" +
                "              className=\"show-details\"\n" +
                "              onClick={ ()=>{ showProductDetails(product)}\n" +
                "\n" +
                "              }\n" +
                "              >\n" +
                "                 Show Details\n" +
                "                  </button>\n" +
                "\n" +
                "                   </div>\n" +
                "        </div>";


        return s;
    }
    public void PrintAst() {


        if (CLASSNAME != null) {
            System.out.println(CLASSNAME);
        }
        if (STRING_LITERAL != null) {
            System.out.println(STRING_LITERAL);
        }

        if (jsxAttribute1 != null) {
            jsxAttribute1.PrintAst();
        }
        if (KEY != null) {
            System.out.println(KEY);
        }if (ALT != null) {
            System.out.println(ALT);
        }

        if (IDENTIFIER1 != null) {
            System.out.println(IDENTIFIER1);
        }if (SRC != null) {
            System.out.println(SRC);
        }
        if (DOT1 != null) {
            System.out.println(DOT1);
        }
        if (IDENTIFIER2 != null) {
            System.out.println(IDENTIFIER2);
        }


        if (DOT2 != null) {
            System.out.println(DOT2);
        }



        if (DOT3 != null) {
            System.out.println(DOT3);
        }


        if (jsxAttribute2 != null) {
            jsxAttribute2.PrintAst();
        }

        if (DOLLAR != null) {
            System.out.println(DOLLAR);
        }

        if (DOT4 != null) {
            System.out.println(DOT4);
        }

        if (jsxElementName != null) {
            jsxElementName.PrintAst();
        }
        if (jsxAttribute3 != null) {
            jsxAttribute3.PrintAst();
        }
        if (jsxElementevent1 != null) {
            jsxElementevent1.PrintAst();
        }
        if (aninnumos_function != null) {
            aninnumos_function.PrintAst();
        }
        if (SHOWDETAILS != null) {
            System.out.println(SHOWDETAILS);
        }
        if (jsxAttribute4 != null) {
            jsxAttribute4.PrintAst();
        }
        if (jsxElementevent2 != null) {
            jsxElementevent2.PrintAst();
        }

        if (LOGICAL_AND != null) {
            System.out.println(LOGICAL_AND);
        }


    }

    public String getCLASSNAME() {
        return CLASSNAME;
    }

    public void setCLASSNAME(String CLASSNAME) {
        this.CLASSNAME = CLASSNAME;
    }

    public String getSTRING_LITERAL() {
        return STRING_LITERAL;
    }

    public void setSTRING_LITERAL(String STRING_LITERAL) {
        this.STRING_LITERAL = STRING_LITERAL;
    }

    public JsxAttribute getJsxAttribute1() {
        return jsxAttribute1;
    }

    public void setJsxAttribute1(JsxAttribute jsxAttribute1) {
        this.jsxAttribute1 = jsxAttribute1;
    }

    public String getKEY() {
        return KEY;
    }

    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

    public String getIDENTIFIER1() {
        return IDENTIFIER1;
    }

    public void setIDENTIFIER1(String IDENTIFIER1) {
        this.IDENTIFIER1 = IDENTIFIER1;
    }

    public String getDOT1() {
        return DOT1;
    }

    public void setDOT1(String DOT1) {
        this.DOT1 = DOT1;
    }

    public String getIDENTIFIER2() {
        return IDENTIFIER2;
    }

    public void setIDENTIFIER2(String IDENTIFIER2) {
        this.IDENTIFIER2 = IDENTIFIER2;
    }

    public String getSRC() {
        return SRC;
    }

    public void setSRC(String SRC) {
        this.SRC = SRC;
    }





    public String getDOT2() {
        return DOT2;
    }

    public void setDOT2(String DOT2) {
        this.DOT2 = DOT2;
    }



    public String getALT() {
        return ALT;
    }

    public void setALT(String ALT) {
        this.ALT = ALT;
    }



    public String getDOT3() {
        return DOT3;
    }

    public void setDOT3(String DOT3) {
        this.DOT3 = DOT3;
    }



    public JsxAttribute getJsxAttribute2() {
        return jsxAttribute2;
    }

    public void setJsxAttribute2(JsxAttribute jsxAttribute2) {
        this.jsxAttribute2 = jsxAttribute2;
    }



    public String getDOLLAR() {
        return DOLLAR;
    }

    public void setDOLLAR(String DOLLAR) {
        this.DOLLAR = DOLLAR;
    }


    public String getDOT4() {
        return DOT4;
    }

    public void setDOT4(String DOT4) {
        this.DOT4 = DOT4;
    }



    public JsxElementName getJsxElementName() {
        return jsxElementName;
    }

    public void setJsxElementName(JsxElementName jsxElementName) {
        this.jsxElementName = jsxElementName;
    }

    public JsxAttribute getJsxAttribute3() {
        return jsxAttribute3;
    }

    public void setJsxAttribute3(JsxAttribute jsxAttribute3) {
        this.jsxAttribute3 = jsxAttribute3;
    }

    public JsxElementevents getJsxElementevent1() {
        return jsxElementevent1;
    }

    public void setJsxElementevent1(JsxElementevents jsxElementevent1) {
        this.jsxElementevent1 = jsxElementevent1;
    }

    public Aninnumos_function getAninnumos_function() {
        return aninnumos_function;
    }

    public void setAninnumos_function(Aninnumos_function aninnumos_function) {
        this.aninnumos_function = aninnumos_function;
    }

    public String getSHOWDETAILS() {
        return SHOWDETAILS;
    }

    public void setSHOWDETAILS(String SHOWDETAILS) {
        this.SHOWDETAILS = SHOWDETAILS;
    }

    public JsxAttribute getJsxAttribute4() {
        return jsxAttribute4;
    }

    public void setJsxAttribute4(JsxAttribute jsxAttribute4) {
        this.jsxAttribute4 = jsxAttribute4;
    }

    public JsxElementevents getJsxElementevent2() {
        return jsxElementevent2;
    }

    public void setJsxElementevent2(JsxElementevents jsxElementevent2) {
        this.jsxElementevent2 = jsxElementevent2;
    }



    public String getLOGICAL_AND() {
        return LOGICAL_AND;
    }

    public void setLOGICAL_AND(String LOGICAL_AND) {
        this.LOGICAL_AND = LOGICAL_AND;
    }


}

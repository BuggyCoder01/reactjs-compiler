package Classes;

public class JsxElementevents {
String ONCLICK;

public void PrintAst(){
    if (ONCLICK!=null)
        System.out.println(ONCLICK);

}

    @Override
    public String toString() {
        String s = "";
        s+=ONCLICK;
        return s;
    }
    public String getONCLICK() {
        return ONCLICK;
    }

    public void setONCLICK(String ONCLICK) {
        this.ONCLICK = ONCLICK;
    }
}

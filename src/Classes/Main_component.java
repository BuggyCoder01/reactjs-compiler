package Classes;

public class Main_component {

    String IDENTIFIER;
    Body body;
    Return returnn;


    public void PrintAst(){
        if (IDENTIFIER!=null)
        {
            System.out.println(IDENTIFIER);
        }

        if (body!=null)
        {
            body.PrintAst();
        }
        if (returnn!=null)
        {
            returnn.PrintAst();
        }



    }
   // const ProductPage = () => {
    public String generate() {
        String s = "";
        s+="const"+IDENTIFIER+'='+'('+')'+'='+'>'+'{';
        s += body.generate();
        s += returnn.generate();
        s+='}';
        return s;
    }


    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setReturnn(Return returnn) {
        this.returnn = returnn;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public Body getBody() {
        return body;
    }

    public Return getReturnn() {
        return returnn;
    }
}

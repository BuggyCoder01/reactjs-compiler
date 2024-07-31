package Classes;

public class Descreption {


    String description;

    public void PrintAst(){
        if (description !=null)
        {
            System.out.println(description);
        }

    }
    @Override
    public String toString() {
        return
                "description:'" + +'"'+description+'"'+',' ;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

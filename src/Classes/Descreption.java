package Classes;

public class Descreption {


    String description;

    public void PrintAst(){
        if (description !=null)
        {
            System.out.println(description);
        }

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

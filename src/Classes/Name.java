package Classes;

public class Name {
    String name;

    public void PrintAst(){
        if (name!=null)
        {
            System.out.println(name);
        }

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

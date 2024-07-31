package Classes;

public class Id {

      int id;


    public void PrintAst(){

        System.out.println(id);

    }
    @Override
    public String toString() {
        String s="";
        s="id:'" + id;
        return s;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

package Classes;
import java.util.ArrayList;
import java.util.List;

public class Branch_component1 {

    List<Function> functions =new ArrayList<Function>();


    public void PrintAst() {


        if (functions != null) {
            for (int i = 0; i < functions.size(); i++) {
                functions.get(i).PrintAst();
            }
        }
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }
}

package Classes;

import java.util.ArrayList;
import java.util.List;
public class ParameterList {

    List<Parameter> parameter =new ArrayList<Parameter>();

    public void PrintAst() {
        if (parameter != null) {
            for (int i = 0; i < parameter.size(); i++) {
                parameter.get(i).PrintAst();
            }
        }
    }
    public String generate() {
        String s = "";


        for (int i = 0; i < parameter.size(); i++) {
            s += parameter.get(i).toString();
        }
        return s;
    }

    public List<Parameter> getParameter() {
        return parameter;
    }

    public void setParameter(List<Parameter> parameter) {
        this.parameter = parameter;
    }
}

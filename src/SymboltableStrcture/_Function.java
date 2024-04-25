package SymboltableStrcture;

import java.util.HashMap;

public class _Function extends Details {

    public String DataType ;
    public String value;
    public HashMap < String , Details> parameter = new HashMap<>();
    public Scope scope = new Scope();


    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HashMap<String, Details> getParameter() {
        return parameter;
    }

    public void setParameter(HashMap<String, Details> parameter) {
        this.parameter = parameter;
    }

    public HashMap<String, Details> getScope() {
        return this.scope.getScope();
    }


}

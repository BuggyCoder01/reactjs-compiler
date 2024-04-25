package SymboltableStrcture;

import java.util.HashMap;

public class Scope {
    public HashMap< String , Details> Scope = new HashMap<>() ;


    public HashMap<String, Details> getScope() {
        return this.Scope;
    }

    public void setScope(HashMap<String, Details> scope) {
        Scope = scope;
    }
}

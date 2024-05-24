package AST.Node.Declare;

import AST.Node.Node;

import java.util.ArrayList;

public class Declaration extends Node {

    private ArrayList<String> IDs;

    private boolean isConst;

    private String baseClassID, objetID,deffinationClassID;
    public Declaration() {
        this.IDs = new ArrayList<>();

    }

    public String getObjetID() {
        return objetID;
    }

    public ArrayList<String> getIDs() {
        return IDs;
    }


    public void setObjetID(String objetID) {
        this.objetID = objetID;
    }




    public boolean isConst() {
        return isConst;
    }

    public void setConst(boolean aConst) {
        isConst = aConst;
    }
    public void addID(String ID){
        this.IDs.add(ID);
    }



    public String getBaseClassID() {
        return baseClassID;
    }

    public void setBaseClassID(String baseClassID) {
        this.baseClassID = baseClassID;
    }

    public String getDeffinationClassID() {
        return deffinationClassID;
    }

    public void setDeffinationClassID(String deffinationClassID) {
        this.deffinationClassID = deffinationClassID;
    }


}

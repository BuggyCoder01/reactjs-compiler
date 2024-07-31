package Classes;

import generation.Generator;

import java.util.ArrayList;
import java.util.List;

public class Start_compiler {
    List<react_import> react_importList = new ArrayList<react_import>();
    List<Products> productsList = new ArrayList<Products>();
    Main_component mainComponent;
    Exportation export;
    public void PrintAst() {
        if (react_importList != null) {
            for (int i = 0; i < react_importList.size(); i++) {
                react_importList.get(i).PrintAst();
            }
        }
        if (productsList != null) {
            for (int i = 0; i < productsList.size(); i++) {
                productsList.get(i).PrintAst();
            }
        }
        if (mainComponent != null) {
            mainComponent.PrintAst();
        }

        if (export != null) {
            export.PrintAst();
        }

    }
    public String generate() {
        String s = "";
        for (int i = 0; i < react_importList.size(); i++) {
            s += react_importList.get(i).toString();
        }
        for (int i = 0; i < productsList.size(); i++) {
            s += productsList.get(i).generate();
        }
        s += mainComponent.generate();
        s += export.toString();

        return s;
    }


    public void setReact_importList(List<react_import> react_importList) {
        this.react_importList = react_importList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public void setMainComponent(Main_component mainComponent) {
        this.mainComponent = mainComponent;
    }

    public void setExport(Exportation export) {
        this.export = export;
    }

    public List<react_import> getReact_importList() {
        return react_importList;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public Main_component getMainComponent() {
        return mainComponent;
    }

    public Exportation getExport() {
        return export;
    }


}

package Classes;

public class Statement {
    ExprStmt exprStmt;
    ReturnStmt returnStmt;
    IfStmt ifStmt;
    Block block;


    public void PrintAst() {

        if (exprStmt != null) {
            exprStmt.PrintAst();
        }
        if (returnStmt != null) {
            returnStmt.PrintAst();
        }
        if (ifStmt != null) {
            ifStmt.PrintAst();
        }
        if (block != null) {
            block.PrintAst();
        }

    }
    public String generate() {
        String s = "";

        s += exprStmt.generate();
        if(returnStmt!=null)
        {
            s += returnStmt.toString();
        }
        if(ifStmt!=null)
        {
            s += ifStmt.toString();
        }
        if(block!=null)
        {
            s += block.toString();
        }


        return s;
    }

    public ExprStmt getExprStmt() {
        return exprStmt;
    }

    public void setExprStmt(ExprStmt exprStmt) {
        this.exprStmt = exprStmt;
    }

    public ReturnStmt getReturnStmt() {
        return returnStmt;
    }

    public void setReturnStmt(ReturnStmt returnStmt) {
        this.returnStmt = returnStmt;
    }

    public IfStmt getIfStmt() {
        return ifStmt;
    }

    public void setIfStmt(IfStmt ifStmt) {
        this.ifStmt = ifStmt;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}

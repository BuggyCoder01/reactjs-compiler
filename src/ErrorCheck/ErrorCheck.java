package ErrorCheck;



import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import AST.Node.Node;
import SymbolTable.SymbolTable;

import java.util.Stack;

public class ErrorCheck {

    /////////////////////////


    public static void NotDefineInCurrentScope(String symbol1, int line, int id) {
        Stack<Scope> s = Main.symbolTable.getScopeStack();
        if (SymbolTable.searchForClass(symbol1) || SymbolTable.searchInSpecialFuncations(symbol1)) {
            System.out.println("test true");
            return;
        }
        if (s.empty()) {
            String error = "Error..! This var : " + symbol1 + " is not define inside scope" + " - Scope id : " + id + " in line : " + line;
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
            return;
        }

        Scope x = s.pop();
        System.out.println("scope:" + x.getId());
        for (Symbol symbol : x.getSymbolList()) {
            if (symbol.getName().equals("Variable") || symbol.getName().equals("Object")) {
                if (symbol.getValue().equals(symbol1)) {
                    System.out.println("test true");
                    s.push(x);
                    return;
                }
            } else if (symbol.getName().equals("Function")) {
                if (symbol.getValue().equals(symbol1)) {
                    System.out.println("test true");
                    s.push(x);
                    return;
                }
            }
        }
        NotDefineInCurrentScope(symbol1, line, x.getId());

        s.push(x);
    }





    ///////////////////////
    public static void checkHooksUsage(Symbol symbol1, int line, int id) {
        if(symbol1.getName().equals("Hooks")){
            if(symbol1.getScope().getName().equals("Component Scope") || symbol1.getScope().getName().equals("WithHooks Scope")){
                return;

            }
            else{
                String error = "Error..! This hooks : "  + " can't used in this scope " + symbol1.getScope().getName() +" in line : " + line;
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
        }


    }

    public static void sameScopeRepeat(Symbol symbol1, int line, int id) {
        Stack<Scope> s = Main.symbolTable.getScopeStack();
        if (s.empty()) {
            return;
        }
        Scope x = s.pop();
        System.out.println("scope:" + x.getId());
        for (Symbol symbol : x.getSymbolList()) {
            if (symbol.getName().equals("Variable")) {
                if (!symbol.equals(symbol1)) if (symbol.getValue().equals(symbol1.getValue())) {
                    String error = "Error..! This var : " + symbol1.getValue() + " is used before " + " - Scope id : " + id + " in line : " + line;
                    System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                    Main.errorCount++;
                    s.push(x);
                    return;
                }
            } else if (symbol.getName().equals("Component")) {
                if (!symbol.equals(symbol1)) if (symbol.getValue().equals(symbol1.getValue())) {
                    String error = "Error..! This Component : " + symbol1.getValue() + " is used before " + " - Scope id : " + id + " in line : " + line;
                    Main.logger.info(error);
                    System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                    Main.errorCount++;
                    s.push(x);
                    return;
                }
            }
        }
        sameScopeRepeat(symbol1, line, x.getId());
        s.push(x);
    }





    public static void checkMatchVariableWithInteger(Node node, Symbol symbol, int line) {

        if (node.getNodeType().equals("integerLiteral")) {
            return;
        }

        for (Node child : node.getChildren()) {
            checkMatchVariableWithInteger(child, symbol, line);
        }
    }


}




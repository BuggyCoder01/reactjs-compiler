package Main;

import Classes.Start_compiler;
import Antlr.reactLexer;
import Antlr.reactParser;


import ErrorCheck.ErrorCheck;
import SymbolTable.SymbolTable;
import generation.Generator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.logging.Logger;
import SymbolTable.Scope;

import SymbolTable.Symbol;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Logger logger = Logger.getLogger("MyLog");
    public static SymbolTable symbolTable = new SymbolTable();
    public static int errorCount=0;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";

    public static ErrorCheck errorCheck=new ErrorCheck();
    public static void main(String[] args ) throws IOException {


        String source= "C:\\Users\\AbdRrhmanLegiom\\IdeaProjects\\Project_Compiler\\test\\test1.txt";
        CharStream cs=fromFileName(source);

        reactLexer lexer=new reactLexer(cs);
        CommonTokenStream token=new CommonTokenStream(lexer);
        reactParser parser=new reactParser(token);
        ParseTree tree=parser.start_compiler();

        Start_compiler doc=(Start_compiler) new BaseVisitor().visit(tree);
        doc.generate();
        Generator generator=new Generator();
        generator.addHtmlCode(doc.generate());
        generator.generate();


       System.out.println(doc);

        System.out.println("Number of Scopes in the program : " + Scope.getContId());
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            for (Symbol symbol : symbolTable.getScopes().get(i).getSymbolList()) {
                symbol.print();
                System.out.println();
            }
        }
        System.out.println("=========================================================");
    }

    }






import Classes.Start_compiler;
import Antlr.reactLexer;
import Antlr.reactParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args ) throws IOException {


        String source= "C:\\Users\\AbdRrhmanLegiom\\IdeaProjects\\Project_Compiler\\test\\test1.txt";
        CharStream cs=fromFileName(source);

        reactLexer lexer=new reactLexer(cs);
        CommonTokenStream token=new CommonTokenStream(lexer);
        reactParser parser=new reactParser(token);
        ParseTree tree=parser.start_compiler();
        Start_compiler doc=(Start_compiler) new BaseVisitor().visit(tree);
        System.out.println(doc);
    }
}




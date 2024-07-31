package generation;

import Classes.Start_compiler;
import SymbolTable.SymbolTable;
import java.io.*;

public class Generator {
    SymbolTable symbolTable;
    String htmlContent ="";

    String jsCode = " ";

    public void generate() {
        PrintWriter writerHtml, writerJs;
//        String ll = getHtmlCode(htmlContent);
        String ll = getHtmlCode(htmlContent);
        try {
            writerHtml = new PrintWriter("index.html");
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
        writerHtml.println(ll);
        writerHtml.close();
        if (!jsCode.equals(" ")) {
            try {
                writerJs = new PrintWriter("index.js");
            } catch (FileNotFoundException e) {
                throw new RuntimeException();
            }
            writerJs.println(jsCode);
            writerJs.close();
        }
    }

    public static String getHtmlCode(String html) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    " + html +
                "    <script src=\"index.js\"></script>\n" +
                "</body>\n" +
                "</html>";
    }

    public void addHtmlCode(String html) {
        htmlContent += html;
    }

    public void addJSCode(String js) {
        jsCode += js;

    }
}
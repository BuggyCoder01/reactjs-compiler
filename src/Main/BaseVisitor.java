package Main;


import AST.Node.Declare.Declaration;
import AST.Node.Node;
import Antlr.reactParserBaseVisitor;
import Classes.*;
import Antlr.reactParser;
import ErrorCheck.ErrorCheck;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import generation.Generator;


import java.util.ArrayList;
import java.util.List;



public class BaseVisitor extends reactParserBaseVisitor {


    @Override
    public Start_compiler visitStart_compiler(reactParser.Start_compilerContext ctx) {
        Start_compiler start_compiler = new Start_compiler();

        List<react_import> react_importList = new ArrayList<>();

        if (ctx.react_import() != null) {
            for (int i = 0; i < ctx.react_import().size(); i++) {
                react_importList.add((react_import) visit(ctx.react_import().get(i)));
            }
        }
        List<Products> productsList = new ArrayList<>();

        for (int i = 0; i < ctx.products().size(); i++) {
            productsList.add((Products) visit(ctx.products().get(i)));
        }
        start_compiler.setProductsList(productsList);
        start_compiler.setMainComponent((Main_component) visit(ctx.main_component()));
        start_compiler.setReact_importList(react_importList);
        start_compiler.setExport((Exportation) visit(ctx.exportation()));
        start_compiler.PrintAst();


        return start_compiler;
    }

    @Override
    public react_import visitReact_import(reactParser.React_importContext ctx) {
        react_import reactImport = new react_import();

        reactImport.setIMPORT(ctx.IMPORT().getText());
        reactImport.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        reactImport.setIDENTIFIER2(ctx.IDENTIFIER(1).getText());
        reactImport.setIDENTIFIER3(ctx.IDENTIFIER(2).getText());
        return reactImport;
    }

    @Override
    public Products visitProducts(reactParser.ProductsContext ctx) {
        Scope.createScope("product scope");
        Products products = new Products();
        products.setIDENTIFIER(ctx.IDENTIFIER().getText());

         /*   for (int i = 0; i < ctx.id().size(); i++) {
                visit(ctx.id().get(i));
            }*/
        for (int i = 0; i < ctx.name().size(); i++) {
            products.setNamee((Name) visit(ctx.name().get(i)));
        }
        /*for (int i = 0; i < ctx.price().size(); i++) {
            visit(ctx.price().get(i));
        }*/
        for (int i = 0; i < ctx.description().size(); i++) {
            products.setDescriptionn((Descreption) visit(ctx.description().get(i)));
        }
        for (int i = 0; i < ctx.image().size(); i++) {
            products.setImagee((Image) visit(ctx.image().get(i)));
        }

        for (int i = 0; i < ctx.equal2().size(); i++) {
            Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Hooks",ctx.equal2(0).getText(),ctx.getStart().getLine());
            Scope scop = Scope.getCurrentScope();
            System.out.println(scop.getName());
            ErrorCheck.checkHooksUsage(symbol,ctx.start.getLine(),scop.getId());
            products.setEqual2((Equal2) visit(ctx.equal2().get(i)));
        }
        Scope.removeScope("product Scope");

        return products;
    }

   /*
    @Override
    public Object visitId(reactParser.IdContext ctx) {
        Id id =new Id();
        id.setId(Integer.parseInt(ctx.getText()));
        id.PrintAst();
        return super.visitId(ctx);
    }*/


    @Override
    public Name visitName(reactParser.NameContext ctx) {
        Name name = new Name();
        name.setName(ctx.getText());
        return name;
    }


 /*   @Override
    public Object visitPrice(reactParser.PriceContext ctx) {
        Price price =new Price();
        price.setPrice(Float.parseFloat(ctx.getText()));
        price.PrintAst();
        return super.visitPrice(ctx);
    }*/

    @Override
    public Descreption visitDescription(reactParser.DescriptionContext ctx) {

        Descreption descreption = new Descreption();
        descreption.setDescription(ctx.getText());

        return descreption;
    }

    @Override
    public Image visitImage(reactParser.ImageContext ctx) {
        Image image = new Image();
        image.setImg(ctx.getText());

        return image;
    }

    @Override
    public Main_component visitMain_component(reactParser.Main_componentContext ctx) {

        Main_component mainComponent = new Main_component();

        mainComponent.setIDENTIFIER(ctx.IDENTIFIER().getText());
        mainComponent.setBody((Body) visit(ctx.body()));
        mainComponent.setReturnn((Return) visit(ctx.return_()));

        return mainComponent;
    }

    @Override
    public Body visitBody(reactParser.BodyContext ctx) {
        Scope.createScope("Hooks");
        Body body = new Body();
        List<Equaletion> equaletionList = new ArrayList<>();
        List<Statement>  statementList= new ArrayList<>();
        Declaration declaration = new Declaration();
        Scope.createScope("body scope");

        //Scope.getCurrentScope();
        body.setBranch_component1((Branch_component1) visit(ctx.branch_component1()));
        if (ctx.equaletion() != null) {
            for (int i = 0; i < ctx.equaletion().size(); i++) {
                equaletionList.add((Equaletion) visit(ctx.equaletion().get(i)));

            }
        }
        body.setEqualetion(equaletionList);

        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                statementList.add((Statement) visit(ctx.statement().get(i)));

            }
        }



//        ErrorCheck.sameScopeRepeat(symbol, ctx.start.getLine(), Scope.getCurrentScope().getId());

        Scope.removeScope("body Scope");

        Scope.removeScope("Hooks");



        return body;
    }

    @Override
    public Equaletion visitEqualetion(reactParser.EqualetionContext ctx) {
        Equaletion equaletion = new Equaletion();

        if (ctx.equal1() != null) {

            equaletion.setEqual1((Equal1) visit(ctx.equal1()));
        }

        if (ctx.equal2() != null) {
            equaletion.setEqual2((Equal2) visit(ctx.equal2()));
        }

        return equaletion;
    }

    @Override
    public Equal1 visitEqual1(reactParser.Equal1Context ctx) {
        Equal1 equal1 = new Equal1();
        equal1.setIDENTIFIER(ctx.IDENTIFIER(0).getText());
        if (ctx.FLOAT_LITERAL() != null) {

            equal1.setFLOAT_LITERAL(Float.parseFloat(ctx.FLOAT_LITERAL().getText()));
            Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Variable",ctx.IDENTIFIER(0).getText(),ctx.getStart().getLine());
            Scope scop = Scope.getCurrentScope();
            System.out.println(scop.getName());

                    ErrorCheck.sameScopeRepeat(symbol,ctx.start.getLine(),scop.getId());
                }

        //equal1.setFLOAT_LITERAL(Float.parseFloat(ctx.FLOAT_LITERAL().getText()));
        if (ctx.STRING_LITERAL() != null) {
            equal1.setSTRING_LITERAL(ctx.STRING_LITERAL().getText());
            Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Variable",ctx.IDENTIFIER(0).getText(),ctx.getStart().getLine());
            Scope scop = Scope.getCurrentScope();
            System.out.println(scop.getName());

            ErrorCheck.sameScopeRepeat(symbol,ctx.start.getLine(),scop.getId());
        }
        //equal1.setSTRING_LITERAL(ctx.STRING_LITERAL().getText());
        if (ctx.DECIMAL_INTEGER_LITERAL() != null) {
            equal1.setDECIMAL_INTEGER_LITERAL(Integer.parseInt(ctx.DECIMAL_INTEGER_LITERAL().getText()));
            Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Variable",ctx.IDENTIFIER(0).getText(),ctx.getStart().getLine());
            Scope scop = Scope.getCurrentScope();
            System.out.println(scop.getName());

            ErrorCheck.sameScopeRepeat(symbol,ctx.start.getLine(),scop.getId());
        }

        if (ctx.IDENTIFIER(1)!=null)
        {
          ErrorCheck.NotDefineInCurrentScope(ctx.IDENTIFIER(1).getText(),ctx.getStart().getLine(),Scope.getCurrentScope().getId());
            equal1.setIDENTIFIER1(ctx.IDENTIFIER(1).getText());
        }
        //equal1.setDECIMAL_INTEGER_LITERAL(Integer.parseInt(ctx.DECIMAL_INTEGER_LITERAL().getText()));


        return equal1;
    }


    @Override
    public Equal2 visitEqual2(reactParser.Equal2Context ctx) {
        Equal2 equal2 = new Equal2();
        equal2.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        equal2.setIDENTIFIER2(ctx.IDENTIFIER(1).getText());

        equal2.setFunction_call((Function_call) visit(ctx.function_call()));

        return equal2;
    }

    @Override
    public Function_call visitFunction_call(reactParser.Function_callContext ctx) {
        Function_call function_call = new Function_call();

        function_call.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if (ctx.parameterList() != null) {

            function_call.setParameterList((ParameterList) visit(ctx.parameterList()));
        }

        return function_call;
    }

    @Override
    public ParameterList visitParameterList(reactParser.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();
        List<Parameter> list = new ArrayList<>();
        if (ctx.parameter() != null) {
            for (int i = 0; i < ctx.parameter().size(); i++) {
                list.add((Parameter) visit(ctx.parameter().get(i)));
            }
        }
        parameterList.setParameter(list);

        return parameterList;
    }

    @Override
    public Parameter visitIdentefierParameter(reactParser.IdentefierParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setIDENTIFIER(ctx.IDENTIFIER().getText());
        return parameter;
    }

    @Override
    public Parameter visitNullParameter(reactParser.NullParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setNULLL(ctx.NULLL().getText());
        return parameter;
    }

    @Override
    public Parameter visitDecemalParameter(reactParser.DecemalParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setDECIMAL_INTEGER_LITERAL(Integer.parseInt(ctx.DECIMAL_INTEGER_LITERAL().getText()));
        return parameter;
    }

    @Override
    public Function visitFunction(reactParser.FunctionContext ctx) {
        Function function = new Function();
        function.setFUNCTION(ctx.FUNCTION().getText());
        function.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if (ctx.parameterList() != null) {
            function.setParameterList((ParameterList) visit(ctx.parameterList()));
        }
        function.setFunction_body((Function_body) visit(ctx.function_body()));
        return function;
    }

    @Override
    public Function_body visitFunction_body(reactParser.Function_bodyContext ctx) {
        Function_body function_body = new Function_body();
        List<Statement> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add((Statement) visit(ctx.statement().get(i)));
        }
        function_body.setStatement(statements);
        return function_body;
    }


    @Override
    public Statement visitStatement(reactParser.StatementContext ctx) {

        Statement statement = new Statement();
        if (ctx.block() != null) {
            statement.setBlock((Block) visit(ctx.block()));
        }
        if (ctx.exprStmt() != null) {
            statement.setExprStmt((ExprStmt) visit(ctx.exprStmt()));
        }
        if (ctx.returnStmt() != null) {
            statement.setReturnStmt((ReturnStmt) visit(ctx.exprStmt()));
        }
        if (ctx.ifStmt() != null) {
            statement.setIfStmt((IfStmt) visit(ctx.ifStmt()));
        }


        return statement;
    }

    @Override
    public ExprStmt visitExprStmt(reactParser.ExprStmtContext ctx) {
        ExprStmt exprStmt = new ExprStmt();
        exprStmt.setExpression((Expression) visit(ctx.expression()));

        return exprStmt;
    }

    @Override
    public ReturnStmt visitReturnStmt(reactParser.ReturnStmtContext ctx) {
        ReturnStmt returnStmt = new ReturnStmt();
        returnStmt.setRETURN(ctx.RETURN().getText());
        returnStmt.setExpression((Expression) visit(ctx.expression()));

        return returnStmt;
    }

    @Override
    public IfStmt visitIfStmt(reactParser.IfStmtContext ctx) {
        IfStmt ifStmt = new IfStmt();
        ifStmt.setIF(ctx.IF().getText());
        ifStmt.setELSE(ctx.ELSE().getText());
        ifStmt.setExpression((Expression) visit(ctx.expression()));

        if (ctx.statement(0) != null) {
            ifStmt.setStatement1((Statement) visit(ctx.statement(0)));
        }

        if (ctx.statement(1) != null) {
            ifStmt.setStatement2((Statement) visit(ctx.statement(1)));
        }


        return ifStmt;
    }

    //

    @Override
    public Block visitBlock(reactParser.BlockContext ctx) {
        Block block = new Block();
        List<Statement> statements = new ArrayList<>();
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                statements.add((Statement) visit(ctx.statement().get(i)));
            }
        }
        block.setStatement(statements);
        return block;
    }


    @Override
    public Expression visitIDENTIFIER_expression(reactParser.IDENTIFIER_expressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();
        String varName = ctx.IDENTIFIER().getText();

        Expression expression = new Expression();
        expression.setIDENTIFIER1(ctx.IDENTIFIER().getText());





        return expression;
    }

    @Override
    public Expression visitARGS_expression(reactParser.ARGS_expressionContext ctx) {
        Expression expression = new Expression();
        expression.setArgs((Args) visit(ctx.args()));
        return expression;
    }

    @Override
    public Expression visitNull_expression(reactParser.Null_expressionContext ctx) {
        Expression expression = new Expression();
        expression.setNULL(ctx.NULLL().getText());
        return expression;
    }

    @Override
    public Expression visitOPERATOR_expression(reactParser.OPERATOR_expressionContext ctx) {
        Expression expression = new Expression();
        expression.setExpression1((Expression) visit(ctx.expression(0)));
        expression.setOperator((Operatorr) visit(ctx.operator()));
        expression.setExpression2((Expression) visit(ctx.expression(1)));
        return expression;
    }

    @Override
    public Expression visitDECIMAL_expression(reactParser.DECIMAL_expressionContext ctx) {

        Expression expression = new Expression();
        expression.setDECIMAL_INTEGER_LITERAL(Integer.parseInt(ctx.DECIMAL_INTEGER_LITERAL().getText()));
        return expression;
    }

    @Override
    public Args visitArgs(reactParser.ArgsContext ctx) {
        Args args = new Args();
        List<Expression> expressions = new ArrayList<>();
        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                expressions.add((Expression) visit(ctx.expression().get(i)));
            }
        }
        args.setExpressions(expressions);
        return args;
    }


    @Override
    public Operatorr visitOperator(reactParser.OperatorContext ctx) {
        Operatorr operatorr = new Operatorr();
        operatorr.setOPERATOR(ctx.OPERATOR().getText());
        return operatorr;
    }

    @Override
    public Branch_component1 visitBranch_component1(reactParser.Branch_component1Context ctx) {
        Branch_component1 branch_component1 = new Branch_component1();
        List<Function> functions = new ArrayList<>();
        if (ctx.function() != null) {
            for (int i = 0; i < ctx.function().size(); i++) {
                functions.add((Function) visit(ctx.function().get(i)));
            }
        }
        branch_component1.setFunctions(functions);
        return branch_component1;
    }


    @Override
    public Return visitReturn(reactParser.ReturnContext ctx) {
        Return r = new Return();
        r.setRETURN(ctx.RETURN().getText());
        r.setJsxElement((JsxElement) visit(ctx.jsxElement()));

        return r;
    }

    @Override
    public JsxElement visitJsxElement(reactParser.JsxElementContext ctx) {
        JsxElement jsxElement = new JsxElement();
        List<JsxSelfClosing> jsxSelfClosings=new ArrayList<>();
        for (int i = 0; i < ctx.jsxSelfClosing().size(); i++) {
           jsxSelfClosings.add((JsxSelfClosing) visit(ctx.jsxSelfClosing().get(i)));
        }
        jsxElement.setJsxSelfClosing(jsxSelfClosings);

        return jsxElement;
    }

    @Override
    public JsxSelfClosing visitJsxSelfClosing(reactParser.JsxSelfClosingContext ctx) {
        JsxSelfClosing jsxSelfClosing = new JsxSelfClosing();
        List<JsxSelfClosing> jsxSelfClosings = new ArrayList<>();
        jsxSelfClosing.setJsxElementName((JsxElementName) visit(ctx.jsxElementName()));
        if (ctx.jsxAttributes() != null) {
            jsxSelfClosing.setJsxAttribute((JsxAttributes) visit(ctx.jsxAttributes()));
        }
        if (ctx.jsxElementChildren() != null) {
            jsxSelfClosing.setJsxElementChildren((JsxElementChildren) visit(ctx.jsxElementChildren()));
        }
        if (ctx.closeingt() != null) {
            jsxSelfClosing.setCloseingt((Closeingt) visit(ctx.closeingt()));
        }
        if (ctx.jsxSelfClosing() != null) {
            for (int i = 0; i < ctx.jsxSelfClosing().size(); i++) {
                jsxSelfClosings.add((JsxSelfClosing) visit(ctx.jsxSelfClosing().get(i)));
            }
        }
        jsxSelfClosing.setJsxSelfClosing(jsxSelfClosings);
        return jsxSelfClosing;
    }

    @Override
    public JsxElementName visitJsxElementName(reactParser.JsxElementNameContext ctx) {
        JsxElementName jsxElementName = new JsxElementName();
        if (ctx.A() != null) {
            jsxElementName.setA(ctx.A().getText());
        }
        if (ctx.DIV() != null) {
            jsxElementName.setDIV(ctx.DIV().getText());
        }
        if (ctx.BUTTON() != null) {
            jsxElementName.setBUTTON(ctx.BUTTON().getText());
        }
        if (ctx.PARAG() != null) {
            jsxElementName.setPARAG(ctx.PARAG().getText());
        }
        if (ctx.SPAN() != null) {
            jsxElementName.setSPAN(ctx.SPAN().getText());
        }
        if (ctx.HEAD2() != null) {
            jsxElementName.setHEAD2(ctx.HEAD2().getText());
        }
        if (ctx.IMG() != null) {
            jsxElementName.setIMG(ctx.IMG().getText());
        }

        return jsxElementName;
    }

    @Override
    public JsxAttributes visitJsxAttributes(reactParser.JsxAttributesContext ctx) {
        JsxAttributes jsxAttributes = new JsxAttributes();
        List<JsxAttribute> jsxAttributeList = new ArrayList<>();
        if (ctx.jsxAttribute() != null) {
            for (int i = 0; i < ctx.jsxAttribute().size(); i++) {
                jsxAttributeList.add((JsxAttribute) visit(ctx.jsxAttribute().get(i)));
            }
        }
        jsxAttributes.setJsxAttribute(jsxAttributeList);
        return jsxAttributes;
    }

    @Override
    public JsxAttribute visitATRIBUTE_CLASS(reactParser.ATRIBUTE_CLASSContext ctx) {

        JsxAttribute jsxAttribute = new JsxAttribute();
        jsxAttribute.setCLASSNAME(ctx.CLASSNAME().getText());
        jsxAttribute.setSTRING_LITERAL(ctx.STRING_LITERAL().getText());

        return jsxAttribute;
    }

    @Override
    public JsxAttribute visitATRIBUTE_key(reactParser.ATRIBUTE_keyContext ctx) {

        JsxAttribute jsxAttribute = new JsxAttribute();
        jsxAttribute.setJsxAttribute1((JsxAttribute) visit(ctx.jsxAttribute()));
        jsxAttribute.setKEY(ctx.KEY().getText());
        jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        jsxAttribute.setDOT1(ctx.DOT().getText());
        return jsxAttribute;
    }

    @Override
    public JsxAttribute visitATRIBUTE_IMG(reactParser.ATRIBUTE_IMGContext ctx) {
        JsxAttribute jsxAttribute = new JsxAttribute();
        jsxAttribute.setSRC(ctx.SRC().getText());
        jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        jsxAttribute.setDOT1(ctx.DOT(0).getText());
        jsxAttribute.setIDENTIFIER2(ctx.IDENTIFIER(1).getText());
        jsxAttribute.setALT(ctx.ALT().getText());
        jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(2).getText());
        jsxAttribute.setDOT1(ctx.DOT(0).getText());
        jsxAttribute.setIDENTIFIER2(ctx.IDENTIFIER(3).getText());
        return jsxAttribute;
    }

    @Override
    public JsxAttribute visitATRIBUTE_DOLLAR(reactParser.ATRIBUTE_DOLLARContext ctx) {
        JsxAttribute jsxAttribute = new JsxAttribute();
        visit(ctx.jsxAttribute());
        if (ctx.IDENTIFIER(0) != null) {
            jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        }
        if (ctx.DOLLAR() != null) {
            jsxAttribute.setDOLLAR(ctx.DOLLAR().getText());
        }
        if (ctx.IDENTIFIER(1) != null) {
            jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(1).getText());
        }

        jsxAttribute.setDOT1(ctx.DOT().getText());
        if (ctx.IDENTIFIER(2) != null) {
            jsxAttribute.setIDENTIFIER2(ctx.IDENTIFIER(2).getText());
        }
        if (ctx.jsxElementName() != null) {
            jsxAttribute.setJsxElementName((JsxElementName) visit(ctx.jsxElementName()));
        }


        return jsxAttribute;
    }

    @Override
    public JsxAttribute visitELEMENT(reactParser.ELEMENTContext ctx) {
        JsxAttribute jsxAttribute = new JsxAttribute();
        if (ctx.IDENTIFIER(0) != null) {
            jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        }
        if (ctx.DOLLAR() != null) {
            jsxAttribute.setDOLLAR(ctx.DOLLAR().getText());
        }

        if (ctx.IDENTIFIER(1) != null) {
            jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(1).getText());
        }
        if (ctx.DOT() != null) {
            jsxAttribute.setDOT1(ctx.DOT().getText());
        }
        if (ctx.IDENTIFIER(2) != null) {
            jsxAttribute.setIDENTIFIER2(ctx.IDENTIFIER(2).getText());
        }
        if (ctx.jsxElementName() != null) {
            jsxAttribute.setJsxElementName((JsxElementName) visit(ctx.jsxElementName()));
        }



        return jsxAttribute;
    }

    @Override
    public JsxAttribute visitFUNC_ELEMNT(reactParser.FUNC_ELEMNTContext ctx) {
        JsxAttribute jsxAttribute = new JsxAttribute();
        jsxAttribute.setJsxAttribute1((JsxAttribute) visit(ctx.jsxAttribute()));
        jsxAttribute.setJsxElementevent1((JsxElementevents) visit(ctx.jsxElementevents()));
        if (ctx.aninnumos_function() != null) {
            jsxAttribute.setAninnumos_function((Aninnumos_function) visit(ctx.aninnumos_function()));
        }
        jsxAttribute.setSHOWDETAILS(ctx.SHOWDETAILS().getText());

        return jsxAttribute;
    }

    @Override
    public JsxAttribute visitLOGICAL_ELMNT(reactParser.LOGICAL_ELMNTContext ctx) {
        JsxAttribute jsxAttribute = new JsxAttribute();
        jsxAttribute.setJsxAttribute1((JsxAttribute) visit(ctx.jsxAttribute()));
        jsxAttribute.setJsxElementevent1((JsxElementevents) visit(ctx.jsxElementevents()));
        jsxAttribute.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        jsxAttribute.setLOGICAL_AND(ctx.LOGICAL_AND().getText());
        jsxAttribute.setIDENTIFIER2(ctx.IDENTIFIER(1).getText());
        return jsxAttribute;
    }


    @Override
    public JsxElementChildren visitJsxElementChildren(reactParser.JsxElementChildrenContext ctx) {
        JsxElementChildren jsxElementChildren = new JsxElementChildren();
        List<Jsx11> jsx11s = new ArrayList<>();
        if (ctx.jsx11() != null) {
            for (int i = 0; i < ctx.jsx11().size(); i++) {
                jsx11s.add((Jsx11) visit(ctx.jsx11().get(i)));
            }
        }
        List<Sss> ssses = new ArrayList<>();
        jsxElementChildren.setJsx11(jsx11s);
        for (int i = 0; i < ctx.sss().size(); i++) {
            ssses.add((Sss) visit(ctx.sss().get(i)));
        }
        jsxElementChildren.setSss(ssses);

        return jsxElementChildren;
    }

    @Override
    public Jsx11 visitJsx11(reactParser.Jsx11Context ctx) {
        Jsx11 jsx11 = new Jsx11();
        jsx11.setIDENTIFIER1(ctx.IDENTIFIER(0).getText());
        jsx11.setDOT(ctx.DOT().getText());
        jsx11.setIDENTIFIER2(ctx.IDENTIFIER(1).getText());
        if (ctx.aninnumos_function() != null) {
            jsx11.setAninnumos_function((Aninnumos_function) visit(ctx.aninnumos_function()));
        }

        return jsx11;
    }

    @Override
    public JsxElementevents visitJsxElementevents(reactParser.JsxElementeventsContext ctx) {

        JsxElementevents jsxElementevents = new JsxElementevents();
        if (ctx.ONCLICK() != null) {
            jsxElementevents.setONCLICK(ctx.ONCLICK().getText());
        }

        return jsxElementevents;
    }

    @Override
    public Aninnumos_function visitAninnumos_function(reactParser.Aninnumos_functionContext ctx) {
        Aninnumos_function aninnumos_function = new Aninnumos_function();
        if (ctx.parameterList() != null) {
            aninnumos_function.setParameterList((ParameterList) visit(ctx.parameterList()));
        }
        if (ctx.jsxElement() != null) {
            aninnumos_function.setJsxElement((JsxElement) visit(ctx.jsxElement()));
        }
        if (ctx.function_call() != null) {
            aninnumos_function.setFunction_call((Function_call) visit(ctx.function_call()));
        }

        return aninnumos_function;
    }

    @Override
    public Sss visitSss(reactParser.SssContext ctx) {
        Sss sss = new Sss();
        sss.setIDENTIFIER(ctx.IDENTIFIER().getText());
        sss.setLOGICAL_AND1(ctx.LOGICAL_AND(0).getText());
        sss.setLOGICAL_AND2(ctx.LOGICAL_AND(1).getText());
        sss.setJsxSelfClosing((JsxSelfClosing) visit(ctx.jsxSelfClosing()));

        return sss;
    }

    @Override
    public Closeingt visitCloseingt(reactParser.CloseingtContext ctx) {
        Closeingt closeingt = new Closeingt();
        closeingt.setJsxElementName((JsxElementName) visit(ctx.jsxElementName()));

        return closeingt;
    }

    @Override
    public Exportation visitExportation(reactParser.ExportationContext ctx) {
        Exportation exportation = new Exportation();
        exportation.setEXPORT(ctx.EXPORT().getText());
        exportation.setIDENTIFIER(ctx.IDENTIFIER().getText());
        exportation.setDEFAULT(ctx.DEFAULT().getText());
        return exportation;
    }

}


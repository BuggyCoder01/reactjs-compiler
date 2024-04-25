// Generated from C:/Users/AbdRrhmanLegiom/IdeaProjects/Project_Compiler/src/Antlr/reactParser.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link reactParser}.
 */
public interface reactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link reactParser#start_compiler}.
	 * @param ctx the parse tree
	 */
	void enterStart_compiler(reactParser.Start_compilerContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#start_compiler}.
	 * @param ctx the parse tree
	 */
	void exitStart_compiler(reactParser.Start_compilerContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#react_import}.
	 * @param ctx the parse tree
	 */
	void enterReact_import(reactParser.React_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#react_import}.
	 * @param ctx the parse tree
	 */
	void exitReact_import(reactParser.React_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#products}.
	 * @param ctx the parse tree
	 */
	void enterProducts(reactParser.ProductsContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#products}.
	 * @param ctx the parse tree
	 */
	void exitProducts(reactParser.ProductsContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(reactParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(reactParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(reactParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(reactParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(reactParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(reactParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#main_component}.
	 * @param ctx the parse tree
	 */
	void enterMain_component(reactParser.Main_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#main_component}.
	 * @param ctx the parse tree
	 */
	void exitMain_component(reactParser.Main_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(reactParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(reactParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#equaletion}.
	 * @param ctx the parse tree
	 */
	void enterEqualetion(reactParser.EqualetionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#equaletion}.
	 * @param ctx the parse tree
	 */
	void exitEqualetion(reactParser.EqualetionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#equal1}.
	 * @param ctx the parse tree
	 */
	void enterEqual1(reactParser.Equal1Context ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#equal1}.
	 * @param ctx the parse tree
	 */
	void exitEqual1(reactParser.Equal1Context ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#equal2}.
	 * @param ctx the parse tree
	 */
	void enterEqual2(reactParser.Equal2Context ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#equal2}.
	 * @param ctx the parse tree
	 */
	void exitEqual2(reactParser.Equal2Context ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(reactParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(reactParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(reactParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(reactParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(reactParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(reactParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentefierParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterIdentefierParameter(reactParser.IdentefierParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentefierParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitIdentefierParameter(reactParser.IdentefierParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterNullParameter(reactParser.NullParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitNullParameter(reactParser.NullParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecemalParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterDecemalParameter(reactParser.DecemalParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecemalParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitDecemalParameter(reactParser.DecemalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(reactParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(reactParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(reactParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(reactParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(reactParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(reactParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(reactParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(reactParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIER_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIER_expression(reactParser.IDENTIFIER_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIER_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIER_expression(reactParser.IDENTIFIER_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARGS_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterARGS_expression(reactParser.ARGS_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARGS_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitARGS_expression(reactParser.ARGS_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_expression(reactParser.Null_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_expression(reactParser.Null_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OPERATOR_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOPERATOR_expression(reactParser.OPERATOR_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OPERATOR_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOPERATOR_expression(reactParser.OPERATOR_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DECIMAL_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDECIMAL_expression(reactParser.DECIMAL_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DECIMAL_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDECIMAL_expression(reactParser.DECIMAL_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(reactParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(reactParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(reactParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(reactParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(reactParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(reactParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(reactParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(reactParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#branch_component1}.
	 * @param ctx the parse tree
	 */
	void enterBranch_component1(reactParser.Branch_component1Context ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#branch_component1}.
	 * @param ctx the parse tree
	 */
	void exitBranch_component1(reactParser.Branch_component1Context ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(reactParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(reactParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement(reactParser.JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement(reactParser.JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#jsxSelfClosing}.
	 * @param ctx the parse tree
	 */
	void enterJsxSelfClosing(reactParser.JsxSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#jsxSelfClosing}.
	 * @param ctx the parse tree
	 */
	void exitJsxSelfClosing(reactParser.JsxSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#closeingt}.
	 * @param ctx the parse tree
	 */
	void enterCloseingt(reactParser.CloseingtContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#closeingt}.
	 * @param ctx the parse tree
	 */
	void exitCloseingt(reactParser.CloseingtContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#jsxElementChildren}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementChildren(reactParser.JsxElementChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#jsxElementChildren}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementChildren(reactParser.JsxElementChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#jsx11}.
	 * @param ctx the parse tree
	 */
	void enterJsx11(reactParser.Jsx11Context ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#jsx11}.
	 * @param ctx the parse tree
	 */
	void exitJsx11(reactParser.Jsx11Context ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#aninnumos_function}.
	 * @param ctx the parse tree
	 */
	void enterAninnumos_function(reactParser.Aninnumos_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#aninnumos_function}.
	 * @param ctx the parse tree
	 */
	void exitAninnumos_function(reactParser.Aninnumos_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#jsxElementName}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementName(reactParser.JsxElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#jsxElementName}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementName(reactParser.JsxElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#jsxElementevents}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementevents(reactParser.JsxElementeventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#jsxElementevents}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementevents(reactParser.JsxElementeventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributes(reactParser.JsxAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributes(reactParser.JsxAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATRIBUTE_key}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterATRIBUTE_key(reactParser.ATRIBUTE_keyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATRIBUTE_key}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitATRIBUTE_key(reactParser.ATRIBUTE_keyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNC_ELEMNT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterFUNC_ELEMNT(reactParser.FUNC_ELEMNTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNC_ELEMNT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitFUNC_ELEMNT(reactParser.FUNC_ELEMNTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATRIBUTE_CLASS}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterATRIBUTE_CLASS(reactParser.ATRIBUTE_CLASSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATRIBUTE_CLASS}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitATRIBUTE_CLASS(reactParser.ATRIBUTE_CLASSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ELEMENT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterELEMENT(reactParser.ELEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ELEMENT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitELEMENT(reactParser.ELEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGICAL_ELMNT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterLOGICAL_ELMNT(reactParser.LOGICAL_ELMNTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGICAL_ELMNT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitLOGICAL_ELMNT(reactParser.LOGICAL_ELMNTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATRIBUTE_IMG}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterATRIBUTE_IMG(reactParser.ATRIBUTE_IMGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATRIBUTE_IMG}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitATRIBUTE_IMG(reactParser.ATRIBUTE_IMGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATRIBUTE_DOLLAR}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterATRIBUTE_DOLLAR(reactParser.ATRIBUTE_DOLLARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATRIBUTE_DOLLAR}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitATRIBUTE_DOLLAR(reactParser.ATRIBUTE_DOLLARContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#sss}.
	 * @param ctx the parse tree
	 */
	void enterSss(reactParser.SssContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#sss}.
	 * @param ctx the parse tree
	 */
	void exitSss(reactParser.SssContext ctx);
	/**
	 * Enter a parse tree produced by {@link reactParser#exportation}.
	 * @param ctx the parse tree
	 */
	void enterExportation(reactParser.ExportationContext ctx);
	/**
	 * Exit a parse tree produced by {@link reactParser#exportation}.
	 * @param ctx the parse tree
	 */
	void exitExportation(reactParser.ExportationContext ctx);
}
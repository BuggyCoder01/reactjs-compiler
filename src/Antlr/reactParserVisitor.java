// Generated from C:/Users/AbdRrhmanLegiom/IdeaProjects/Project_Compiler/src/Antlr/reactParser.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link reactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface reactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link reactParser#start_compiler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_compiler(reactParser.Start_compilerContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#react_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReact_import(reactParser.React_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#products}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducts(reactParser.ProductsContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(reactParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(reactParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(reactParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#main_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_component(reactParser.Main_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(reactParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#equaletion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualetion(reactParser.EqualetionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#equal1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual1(reactParser.Equal1Context ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#equal2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual2(reactParser.Equal2Context ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(reactParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(reactParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(reactParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentefierParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentefierParameter(reactParser.IdentefierParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullParameter(reactParser.NullParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecemalParameter}
	 * labeled alternative in {@link reactParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecemalParameter(reactParser.DecemalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(reactParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(reactParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(reactParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(reactParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIER_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIER_expression(reactParser.IDENTIFIER_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARGS_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARGS_expression(reactParser.ARGS_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_expression(reactParser.Null_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OPERATOR_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOPERATOR_expression(reactParser.OPERATOR_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DECIMAL_expression}
	 * labeled alternative in {@link reactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDECIMAL_expression(reactParser.DECIMAL_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(reactParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(reactParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(reactParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(reactParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#branch_component1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_component1(reactParser.Branch_component1Context ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(reactParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(reactParser.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#jsxSelfClosing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSelfClosing(reactParser.JsxSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#closeingt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseingt(reactParser.CloseingtContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#jsxElementChildren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementChildren(reactParser.JsxElementChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#jsx11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx11(reactParser.Jsx11Context ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#aninnumos_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAninnumos_function(reactParser.Aninnumos_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#jsxElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementName(reactParser.JsxElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#jsxElementevents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementevents(reactParser.JsxElementeventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributes(reactParser.JsxAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATRIBUTE_key}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATRIBUTE_key(reactParser.ATRIBUTE_keyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNC_ELEMNT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNC_ELEMNT(reactParser.FUNC_ELEMNTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATRIBUTE_CLASS}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATRIBUTE_CLASS(reactParser.ATRIBUTE_CLASSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ELEMENT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELEMENT(reactParser.ELEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGICAL_ELMNT}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGICAL_ELMNT(reactParser.LOGICAL_ELMNTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATRIBUTE_IMG}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATRIBUTE_IMG(reactParser.ATRIBUTE_IMGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATRIBUTE_DOLLAR}
	 * labeled alternative in {@link reactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATRIBUTE_DOLLAR(reactParser.ATRIBUTE_DOLLARContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#sss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSss(reactParser.SssContext ctx);
	/**
	 * Visit a parse tree produced by {@link reactParser#exportation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportation(reactParser.ExportationContext ctx);
}
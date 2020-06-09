package main.antlr4;
// Generated from Yuri.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YuriParser}.
 */
public interface YuriListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YuriParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(@NotNull YuriParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(@NotNull YuriParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(@NotNull YuriParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(@NotNull YuriParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(@NotNull YuriParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(@NotNull YuriParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#exprListEnd}.
	 * @param ctx the parse tree
	 */
	void enterExprListEnd(@NotNull YuriParser.ExprListEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#exprListEnd}.
	 * @param ctx the parse tree
	 */
	void exitExprListEnd(@NotNull YuriParser.ExprListEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(@NotNull YuriParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(@NotNull YuriParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(@NotNull YuriParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(@NotNull YuriParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(@NotNull YuriParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(@NotNull YuriParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(@NotNull YuriParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(@NotNull YuriParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#compareSymbols}.
	 * @param ctx the parse tree
	 */
	void enterCompareSymbols(@NotNull YuriParser.CompareSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#compareSymbols}.
	 * @param ctx the parse tree
	 */
	void exitCompareSymbols(@NotNull YuriParser.CompareSymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#exprCond}.
	 * @param ctx the parse tree
	 */
	void enterExprCond(@NotNull YuriParser.ExprCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#exprCond}.
	 * @param ctx the parse tree
	 */
	void exitExprCond(@NotNull YuriParser.ExprCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(@NotNull YuriParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(@NotNull YuriParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(@NotNull YuriParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(@NotNull YuriParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(@NotNull YuriParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(@NotNull YuriParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(@NotNull YuriParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(@NotNull YuriParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(@NotNull YuriParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(@NotNull YuriParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(@NotNull YuriParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(@NotNull YuriParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull YuriParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull YuriParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull YuriParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull YuriParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(@NotNull YuriParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(@NotNull YuriParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull YuriParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull YuriParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YuriParser#arithSymbols}.
	 * @param ctx the parse tree
	 */
	void enterArithSymbols(@NotNull YuriParser.ArithSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YuriParser#arithSymbols}.
	 * @param ctx the parse tree
	 */
	void exitArithSymbols(@NotNull YuriParser.ArithSymbolsContext ctx);
}
package main.antlr4;
// Generated from Yuri.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YuriParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YuriVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YuriParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(@NotNull YuriParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(@NotNull YuriParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(@NotNull YuriParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#exprListEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListEnd(@NotNull YuriParser.ExprListEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(@NotNull YuriParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(@NotNull YuriParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(@NotNull YuriParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpr(@NotNull YuriParser.ArithExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#compareSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareSymbols(@NotNull YuriParser.CompareSymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#exprCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCond(@NotNull YuriParser.ExprCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(@NotNull YuriParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#declareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStmt(@NotNull YuriParser.DeclareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(@NotNull YuriParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(@NotNull YuriParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(@NotNull YuriParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#programName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramName(@NotNull YuriParser.ProgramNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(@NotNull YuriParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull YuriParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(@NotNull YuriParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull YuriParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YuriParser#arithSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithSymbols(@NotNull YuriParser.ArithSymbolsContext ctx);
}
// Generated from Expr.g4 by ANTLR 4.2.2

package antlr.my.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(@NotNull ExprParser.ArrayExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull ExprParser.AtomExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull ExprParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#parensExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(@NotNull ExprParser.ParensExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#containsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsExpr(@NotNull ExprParser.ContainsExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ExprParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#infixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(@NotNull ExprParser.InfixExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#customFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomFunction(@NotNull ExprParser.CustomFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#ternaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(@NotNull ExprParser.TernaryExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull ExprParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#customFunctionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomFunctionExpr(@NotNull ExprParser.CustomFunctionExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull ExprParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(@NotNull ExprParser.RelationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(@NotNull ExprParser.EqualExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull ExprParser.AndExprContext ctx);
}
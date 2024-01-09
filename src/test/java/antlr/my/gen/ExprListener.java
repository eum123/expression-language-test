// Generated from Expr.g4 by ANTLR 4.2.2

package antlr.my.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(@NotNull ExprParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(@NotNull ExprParser.ArrayExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull ExprParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull ExprParser.AtomExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull ExprParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull ExprParser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#parensExpr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(@NotNull ExprParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parensExpr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(@NotNull ExprParser.ParensExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#containsExpr}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpr(@NotNull ExprParser.ContainsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#containsExpr}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpr(@NotNull ExprParser.ContainsExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExprParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(@NotNull ExprParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(@NotNull ExprParser.InfixExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#customFunction}.
	 * @param ctx the parse tree
	 */
	void enterCustomFunction(@NotNull ExprParser.CustomFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#customFunction}.
	 * @param ctx the parse tree
	 */
	void exitCustomFunction(@NotNull ExprParser.CustomFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(@NotNull ExprParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(@NotNull ExprParser.TernaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull ExprParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull ExprParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#customFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void enterCustomFunctionExpr(@NotNull ExprParser.CustomFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#customFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void exitCustomFunctionExpr(@NotNull ExprParser.CustomFunctionExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ExprParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ExprParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(@NotNull ExprParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(@NotNull ExprParser.RelationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(@NotNull ExprParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(@NotNull ExprParser.EqualExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull ExprParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull ExprParser.AndExprContext ctx);
}
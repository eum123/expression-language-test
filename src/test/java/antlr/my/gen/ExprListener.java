// Generated from /Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/antlr/Expr.g4 by ANTLR 4.13.1
package antlr.my.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(ExprParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(ExprParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(ExprParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(ExprParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ExprParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ExprParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(ExprParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(ExprParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(ExprParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(ExprParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code customFunctionExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCustomFunctionExpr(ExprParser.CustomFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code customFunctionExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCustomFunctionExpr(ExprParser.CustomFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containsExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpr(ExprParser.ContainsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containsExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpr(ExprParser.ContainsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(ExprParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(ExprParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ExprParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ExprParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ExprParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ExprParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#customFunction}.
	 * @param ctx the parse tree
	 */
	void enterCustomFunction(ExprParser.CustomFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#customFunction}.
	 * @param ctx the parse tree
	 */
	void exitCustomFunction(ExprParser.CustomFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExprParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExprParser.AtomContext ctx);
}
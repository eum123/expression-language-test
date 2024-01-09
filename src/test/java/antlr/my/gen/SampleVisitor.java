// Generated from Sample.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SampleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SampleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SampleParser#java_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_variable(@NotNull SampleParser.Java_variableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#idAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull SampleParser.IdAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#intAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(@NotNull SampleParser.IntAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull SampleParser.AtomExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#plusplusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusplusExpr(@NotNull SampleParser.PlusplusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#minusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(@NotNull SampleParser.MinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(@NotNull SampleParser.FunctionExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#variableAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAtom(@NotNull SampleParser.VariableAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull SampleParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull SampleParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(@NotNull SampleParser.MulExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(@NotNull SampleParser.RelationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#doubleAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleAtom(@NotNull SampleParser.DoubleAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(@NotNull SampleParser.ExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(@NotNull SampleParser.ArrayExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#javaVariableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaVariableExpr(@NotNull SampleParser.JavaVariableExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull SampleParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#minminExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinminExpr(@NotNull SampleParser.MinminExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(@NotNull SampleParser.RContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull SampleParser.NotExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(@NotNull SampleParser.AddExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull SampleParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull SampleParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(@NotNull SampleParser.EqualExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SampleParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull SampleParser.AndExprContext ctx);
}
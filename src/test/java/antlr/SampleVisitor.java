// Generated from /Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/antlr/Sample.g4 by ANTLR 4.13.1
package antlr;
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
	 * Visit a parse tree produced by {@link SampleParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(SampleParser.RContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(SampleParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code javaVariableExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaVariableExpr(SampleParser.JavaVariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(SampleParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(SampleParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusplusExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusplusExpr(SampleParser.PlusplusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(SampleParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minminExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinminExpr(SampleParser.MinminExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(SampleParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(SampleParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(SampleParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(SampleParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(SampleParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(SampleParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(SampleParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SampleParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#java_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_variable(SampleParser.Java_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SampleParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SampleParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(SampleParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(SampleParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleAtom(SampleParser.DoubleAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(SampleParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(SampleParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAtom(SampleParser.VariableAtomContext ctx);
}
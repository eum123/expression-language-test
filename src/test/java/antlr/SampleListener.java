// Generated from /Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/antlr/Sample.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(SampleParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(SampleParser.RContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(SampleParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(SampleParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code javaVariableExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJavaVariableExpr(SampleParser.JavaVariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code javaVariableExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJavaVariableExpr(SampleParser.JavaVariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(SampleParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(SampleParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SampleParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SampleParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusplusExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusplusExpr(SampleParser.PlusplusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusplusExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusplusExpr(SampleParser.PlusplusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(SampleParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(SampleParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minminExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinminExpr(SampleParser.MinminExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minminExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinminExpr(SampleParser.MinminExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(SampleParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(SampleParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(SampleParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(SampleParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(SampleParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(SampleParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(SampleParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(SampleParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(SampleParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(SampleParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(SampleParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(SampleParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SampleParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SampleParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SampleParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SampleParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#java_variable}.
	 * @param ctx the parse tree
	 */
	void enterJava_variable(SampleParser.Java_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#java_variable}.
	 * @param ctx the parse tree
	 */
	void exitJava_variable(SampleParser.Java_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SampleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SampleParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SampleParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SampleParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(SampleParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(SampleParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(SampleParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(SampleParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDoubleAtom(SampleParser.DoubleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDoubleAtom(SampleParser.DoubleAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(SampleParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(SampleParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(SampleParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(SampleParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariableAtom(SampleParser.VariableAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAtom}
	 * labeled alternative in {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariableAtom(SampleParser.VariableAtomContext ctx);
}
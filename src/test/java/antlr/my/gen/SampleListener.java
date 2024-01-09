// Generated from Sample.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#java_variable}.
	 * @param ctx the parse tree
	 */
	void enterJava_variable(@NotNull SampleParser.Java_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#java_variable}.
	 * @param ctx the parse tree
	 */
	void exitJava_variable(@NotNull SampleParser.Java_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#idAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull SampleParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#idAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull SampleParser.IdAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#intAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(@NotNull SampleParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#intAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(@NotNull SampleParser.IntAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull SampleParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull SampleParser.AtomExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#plusplusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusplusExpr(@NotNull SampleParser.PlusplusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#plusplusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusplusExpr(@NotNull SampleParser.PlusplusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull SampleParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull SampleParser.MinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(@NotNull SampleParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(@NotNull SampleParser.FunctionExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#variableAtom}.
	 * @param ctx the parse tree
	 */
	void enterVariableAtom(@NotNull SampleParser.VariableAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#variableAtom}.
	 * @param ctx the parse tree
	 */
	void exitVariableAtom(@NotNull SampleParser.VariableAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull SampleParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull SampleParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull SampleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull SampleParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(@NotNull SampleParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(@NotNull SampleParser.MulExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(@NotNull SampleParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(@NotNull SampleParser.RelationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#doubleAtom}.
	 * @param ctx the parse tree
	 */
	void enterDoubleAtom(@NotNull SampleParser.DoubleAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#doubleAtom}.
	 * @param ctx the parse tree
	 */
	void exitDoubleAtom(@NotNull SampleParser.DoubleAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(@NotNull SampleParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(@NotNull SampleParser.ExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(@NotNull SampleParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(@NotNull SampleParser.ArrayExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#javaVariableExpr}.
	 * @param ctx the parse tree
	 */
	void enterJavaVariableExpr(@NotNull SampleParser.JavaVariableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#javaVariableExpr}.
	 * @param ctx the parse tree
	 */
	void exitJavaVariableExpr(@NotNull SampleParser.JavaVariableExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull SampleParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull SampleParser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#minminExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinminExpr(@NotNull SampleParser.MinminExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#minminExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinminExpr(@NotNull SampleParser.MinminExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull SampleParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull SampleParser.RContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull SampleParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull SampleParser.NotExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(@NotNull SampleParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(@NotNull SampleParser.AddExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull SampleParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull SampleParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull SampleParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull SampleParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(@NotNull SampleParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(@NotNull SampleParser.EqualExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SampleParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull SampleParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull SampleParser.AndExprContext ctx);
}
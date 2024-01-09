// Generated from Sample.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SampleParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NEWLINE=4, INT=5, DOUBLE=6, OP=7, CP=8, OB=9, 
		CB=10, COMMA=11, REF=12, PLUSPLUS=13, MINMIN=14, OR=15, AND=16, EQ=17, 
		NEQ=18, LI=19, RI=20, LIEQ=21, RIEQ=22, PLUS=23, MINUS=24, MUL=25, DIV=26, 
		MOD=27, NOT=28, ASSIGN=29, SEMICOLON=30, VARIABLE=31, STRING_VALUE=32, 
		WS=33, ID=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'['", "']'", "'.'", "NEWLINE", "INT", "DOUBLE", "'('", "')'", 
		"'{'", "'}'", "','", "'&'", "'++'", "'--'", "'||'", "'&&'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", 
		"'='", "';'", "VARIABLE", "STRING_VALUE", "WS", "ID"
	};
	public static final int
		RULE_r = 0, RULE_expr = 1, RULE_array = 2, RULE_java_variable = 3, RULE_function = 4, 
		RULE_arguments = 5, RULE_atom = 6;
	public static final String[] ruleNames = {
		"r", "expr", "array", "java_variable", "function", "arguments", "atom"
	};

	@Override
	public String getGrammarFileName() { return "Sample.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SampleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SampleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SampleParser.NEWLINE, i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << INT) | (1L << DOUBLE) | (1L << OP) | (1L << MINUS) | (1L << NOT) | (1L << VARIABLE) | (1L << STRING_VALUE) | (1L << ID))) != 0)) {
				{
				{
				setState(14); expr(0);
				setState(15); match(SEMICOLON);
				setState(17);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(16); match(NEWLINE);
					}
				}

				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JavaVariableExprContext extends ExprContext {
		public Java_variableContext java_variable() {
			return getRuleContext(Java_variableContext.class,0);
		}
		public JavaVariableExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterJavaVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitJavaVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitJavaVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(SampleParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusplusExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SampleParser.ID, 0); }
		public TerminalNode PLUSPLUS() { return getToken(SampleParser.PLUSPLUS, 0); }
		public PlusplusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterPlusplusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitPlusplusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitPlusplusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SampleParser.MINUS, 0); }
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinminExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SampleParser.ID, 0); }
		public TerminalNode MINMIN() { return getToken(SampleParser.MINMIN, 0); }
		public MinminExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterMinminExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitMinminExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitMinminExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(SampleParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SampleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SampleParser.MINUS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(SampleParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(SampleParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(SampleParser.MUL, 0); }
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationExprContext extends ExprContext {
		public Token op;
		public TerminalNode LIEQ() { return getToken(SampleParser.LIEQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIEQ() { return getToken(SampleParser.RIEQ, 0); }
		public TerminalNode LI() { return getToken(SampleParser.LI, 0); }
		public TerminalNode RI() { return getToken(SampleParser.RI, 0); }
		public RelationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExprContext extends ExprContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(SampleParser.NEQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SampleParser.EQ, 0); }
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(SampleParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25); match(MINUS);
				setState(26); expr(12);
				}
				break;

			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27); match(NOT);
				setState(28); expr(11);
				}
				break;

			case 3:
				{
				_localctx = new PlusplusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); match(ID);
				setState(30); match(PLUSPLUS);
				}
				break;

			case 4:
				{
				_localctx = new MinminExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); match(ID);
				setState(32); match(MINMIN);
				}
				break;

			case 5:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); array();
				}
				break;

			case 6:
				{
				_localctx = new JavaVariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34); java_variable();
				}
				break;

			case 7:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35); function();
				}
				break;

			case 8:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36); atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(39);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(40);
						((MulExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(41); expr(11);
						}
						break;

					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(42);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(43);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(44); expr(10);
						}
						break;

					case 3:
						{
						_localctx = new RelationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(46);
						((RelationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LI) | (1L << RI) | (1L << LIEQ) | (1L << RIEQ))) != 0)) ) {
							((RelationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(47); expr(9);
						}
						break;

					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(49);
						((EqualExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(50); expr(8);
						}
						break;

					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(52); match(AND);
						setState(53); expr(7);
						}
						break;

					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(55); match(OR);
						setState(56); expr(6);
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(1);
			setState(71);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << INT) | (1L << DOUBLE) | (1L << OP) | (1L << MINUS) | (1L << NOT) | (1L << VARIABLE) | (1L << STRING_VALUE) | (1L << ID))) != 0)) {
				{
				setState(63); expr(0);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(64); match(COMMA);
					setState(65); expr(0);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(73); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_variableContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(SampleParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(SampleParser.VARIABLE, i);
		}
		public Java_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterJava_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitJava_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitJava_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_variableContext java_variable() throws RecognitionException {
		Java_variableContext _localctx = new Java_variableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(VARIABLE);
			setState(76); match(3);
			setState(77); match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(SampleParser.VARIABLE, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); match(VARIABLE);
				setState(80); match(OP);
				setState(81); arguments();
				setState(82); match(CP);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case OP:
				case VARIABLE:
				case STRING_VALUE:
				case ID:
					{
					setState(84); atom();
					}
					break;
				case 1:
					{
					setState(85); array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); match(3);
				setState(89); match(VARIABLE);
				setState(90); match(OP);
				setState(91); arguments();
				setState(92); match(CP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); expr(0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97); match(COMMA);
				setState(98); expr(0);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleAtomContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(SampleParser.DOUBLE, 0); }
		public DoubleAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterDoubleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitDoubleAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitDoubleAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAtomContext extends AtomContext {
		public TerminalNode OP() { return getToken(SampleParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(SampleParser.CP, 0); }
		public ExprAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(SampleParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAtomContext extends AtomContext {
		public TerminalNode VARIABLE() { return getToken(SampleParser.VARIABLE, 0); }
		public VariableAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterVariableAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitVariableAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitVariableAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(SampleParser.INT, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING_VALUE() { return getToken(SampleParser.STRING_VALUE, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleListener ) ((SampleListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleVisitor ) return ((SampleVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case OP:
				_localctx = new ExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(OP);
				setState(105); expr(0);
				setState(106); match(CP);
				}
				break;
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108); match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(DOUBLE);
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110); match(ID);
				}
				break;
			case STRING_VALUE:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(111); match(STRING_VALUE);
				}
				break;
			case VARIABLE:
				_localctx = new VariableAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(112); match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);

		case 1: return precpred(_ctx, 9);

		case 2: return precpred(_ctx, 8);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$v\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\5\2\24\n\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3(\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4\3\4\3\4\7\4E\n\4\f\4"+
		"\16\4H\13\4\5\4J\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7\7\7f\n\7\f\7"+
		"\16\7i\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3\b\2\3\4\t\2"+
		"\4\6\b\n\f\16\2\6\3\2\33\35\3\2\31\32\3\2\25\30\3\2\23\24\u0087\2\27\3"+
		"\2\2\2\4\'\3\2\2\2\6@\3\2\2\2\bM\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16s\3\2"+
		"\2\2\20\21\5\4\3\2\21\23\7 \2\2\22\24\7\6\2\2\23\22\3\2\2\2\23\24\3\2"+
		"\2\2\24\26\3\2\2\2\25\20\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\33\b\3\1\2\33\34\7\32\2\2\34(\5\4\3"+
		"\16\35\36\7\36\2\2\36(\5\4\3\r\37 \7$\2\2 (\7\17\2\2!\"\7$\2\2\"(\7\20"+
		"\2\2#(\5\6\4\2$(\5\b\5\2%(\5\n\6\2&(\5\16\b\2\'\32\3\2\2\2\'\35\3\2\2"+
		"\2\'\37\3\2\2\2\'!\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2"+
		"(=\3\2\2\2)*\f\f\2\2*+\t\2\2\2+<\5\4\3\r,-\f\13\2\2-.\t\3\2\2.<\5\4\3"+
		"\f/\60\f\n\2\2\60\61\t\4\2\2\61<\5\4\3\13\62\63\f\t\2\2\63\64\t\5\2\2"+
		"\64<\5\4\3\n\65\66\f\b\2\2\66\67\7\22\2\2\67<\5\4\3\t89\f\7\2\29:\7\21"+
		"\2\2:<\5\4\3\b;)\3\2\2\2;,\3\2\2\2;/\3\2\2\2;\62\3\2\2\2;\65\3\2\2\2;"+
		"8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@I\7\3\2\2"+
		"AF\5\4\3\2BC\7\r\2\2CE\5\4\3\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2IA\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\4\2\2L\7\3\2\2"+
		"\2MN\7!\2\2NO\7\5\2\2OP\7!\2\2P\t\3\2\2\2QR\7!\2\2RS\7\t\2\2ST\5\f\7\2"+
		"TU\7\n\2\2Ua\3\2\2\2VY\5\16\b\2WY\5\6\4\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2"+
		"\2Z[\7\5\2\2[\\\7!\2\2\\]\7\t\2\2]^\5\f\7\2^_\7\n\2\2_a\3\2\2\2`Q\3\2"+
		"\2\2`X\3\2\2\2a\13\3\2\2\2bg\5\4\3\2cd\7\r\2\2df\5\4\3\2ec\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2h\r\3\2\2\2ig\3\2\2\2jk\7\t\2\2kl\5\4\3\2lm"+
		"\7\n\2\2mt\3\2\2\2nt\7\7\2\2ot\7\b\2\2pt\7$\2\2qt\7\"\2\2rt\7!\2\2sj\3"+
		"\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\17\3\2\2\2\r"+
		"\23\27\';=FIX`gs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
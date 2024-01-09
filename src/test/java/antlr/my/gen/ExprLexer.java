// Generated from Expr.g4 by ANTLR 4.2.2

package antlr.my.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, FUNCTION=22, CUSTOM_FUNCTION=23, 
		INT=24, DOUBLE=25, BOOLEAN=26, STRING=27, VARIABLE=28, WS=29, NEWLINE=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'!='", "':'", "'['", "'||'", "'>='", "';'", "'&&'", "'=='", "'<'", 
		"']'", "'>'", "'?'", "'<='", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "FUNCTION", "CUSTOM_FUNCTION", "INT", "DOUBLE", "BOOLEAN", "STRING", 
		"VARIABLE", "WS", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "DIGIT", "FUNCTION", "CUSTOM_FUNCTION", 
		"INT", "DOUBLE", "BOOLEAN", "STRING", "VARIABLE", "WS", "NEWLINE"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\7\30v\n\30\f\30\16\30y\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0086\n\31\3\32\6\32\u0089\n"+
		"\32\r\32\16\32\u008a\3\33\6\33\u008e\n\33\r\33\16\33\u008f\3\33\3\33\7"+
		"\33\u0094\n\33\f\33\16\33\u0097\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u00a1\n\34\3\35\3\35\7\35\u00a5\n\35\f\35\16\35\u00a8\13"+
		"\35\3\35\3\35\3\35\7\35\u00ad\n\35\f\35\16\35\u00b0\13\35\3\35\5\35\u00b3"+
		"\n\35\3\36\3\36\7\36\u00b7\n\36\f\36\16\36\u00ba\13\36\3\37\6\37\u00bd"+
		"\n\37\r\37\16\37\u00be\3\37\3\37\3 \6 \u00c4\n \r \16 \u00c5\3 \3 \2\2"+
		"!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\31\63\32\65\33\67\349\35;\36"+
		"=\37? \3\2\t\3\2\62;\6\2C\\aac|\uac02\ud7a5\7\2\62;C\\aac|\uac02\ud7a5"+
		"\3\2$$\3\2))\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00d3\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3"+
		"A\3\2\2\2\5C\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13J\3\2\2\2\rM\3\2\2\2\17P"+
		"\3\2\2\2\21R\3\2\2\2\23U\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2"+
		"\33^\3\2\2\2\35`\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'k"+
		"\3\2\2\2)m\3\2\2\2+o\3\2\2\2-q\3\2\2\2/s\3\2\2\2\61\u0085\3\2\2\2\63\u0088"+
		"\3\2\2\2\65\u008d\3\2\2\2\67\u00a0\3\2\2\29\u00b2\3\2\2\2;\u00b4\3\2\2"+
		"\2=\u00bc\3\2\2\2?\u00c3\3\2\2\2AB\7\61\2\2B\4\3\2\2\2CD\7#\2\2DE\7?\2"+
		"\2E\6\3\2\2\2FG\7<\2\2G\b\3\2\2\2HI\7]\2\2I\n\3\2\2\2JK\7~\2\2KL\7~\2"+
		"\2L\f\3\2\2\2MN\7@\2\2NO\7?\2\2O\16\3\2\2\2PQ\7=\2\2Q\20\3\2\2\2RS\7("+
		"\2\2ST\7(\2\2T\22\3\2\2\2UV\7?\2\2VW\7?\2\2W\24\3\2\2\2XY\7>\2\2Y\26\3"+
		"\2\2\2Z[\7_\2\2[\30\3\2\2\2\\]\7@\2\2]\32\3\2\2\2^_\7A\2\2_\34\3\2\2\2"+
		"`a\7>\2\2ab\7?\2\2b\36\3\2\2\2cd\7*\2\2d \3\2\2\2ef\7+\2\2f\"\3\2\2\2"+
		"gh\7,\2\2h$\3\2\2\2ij\7-\2\2j&\3\2\2\2kl\7.\2\2l(\3\2\2\2mn\7/\2\2n*\3"+
		"\2\2\2op\7\60\2\2p,\3\2\2\2qr\t\2\2\2r.\3\2\2\2sw\t\3\2\2tv\t\4\2\2ut"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\60\3\2\2\2yw\3\2\2\2z{\7o\2\2"+
		"{|\7{\2\2|}\7P\2\2}~\7c\2\2~\177\7o\2\2\177\u0086\7g\2\2\u0080\u0081\7"+
		"o\2\2\u0081\u0082\7{\2\2\u0082\u0083\7C\2\2\u0083\u0084\7i\2\2\u0084\u0086"+
		"\7g\2\2\u0085z\3\2\2\2\u0085\u0080\3\2\2\2\u0086\62\3\2\2\2\u0087\u0089"+
		"\5-\27\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\64\3\2\2\2\u008c\u008e\5-\27\2\u008d\u008c\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0095"+
		"\3\2\2\2\u0091\u0092\7\60\2\2\u0092\u0094\5-\27\2\u0093\u0091\3\2\2\2"+
		"\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\66"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a"+
		"\u009b\7w\2\2\u009b\u00a1\7g\2\2\u009c\u009d\7h\2\2\u009d\u009e\7c\2\2"+
		"\u009e\u009f\7u\2\2\u009f\u00a1\7g\2\2\u00a0\u0098\3\2\2\2\u00a0\u009c"+
		"\3\2\2\2\u00a18\3\2\2\2\u00a2\u00a6\7$\2\2\u00a3\u00a5\n\5\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b3\7$\2\2\u00aa\u00ae\7)\2"+
		"\2\u00ab\u00ad\n\6\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b3\7)\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b3:\3\2\2\2\u00b4"+
		"\u00b8\t\3\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9<\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00bd\t\7\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\37"+
		"\2\2\u00c1>\3\2\2\2\u00c2\u00c4\t\b\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\b \2\2\u00c8@\3\2\2\2\17\2w\u0085\u008a\u008f\u0095\u00a0\u00a6"+
		"\u00ae\u00b2\u00b8\u00be\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
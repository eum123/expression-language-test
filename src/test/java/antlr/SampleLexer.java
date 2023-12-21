// Generated from /Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/antlr/Sample.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SampleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NEWLINE=4, INT=5, DOUBLE=6, OP=7, CP=8, OB=9, 
		CB=10, COMMA=11, REF=12, PLUSPLUS=13, MINMIN=14, OR=15, AND=16, EQ=17, 
		NEQ=18, LI=19, RI=20, LIEQ=21, RIEQ=22, PLUS=23, MINUS=24, MUL=25, DIV=26, 
		MOD=27, NOT=28, ASSIGN=29, SEMICOLON=30, VARIABLE=31, STRING_VALUE=32, 
		WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NEWLINE", "INT", "DOUBLE", "OP", "CP", "OB", 
			"CB", "COMMA", "REF", "PLUSPLUS", "MINMIN", "OR", "AND", "EQ", "NEQ", 
			"LI", "RI", "LIEQ", "RIEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "NOT", 
			"ASSIGN", "SEMICOLON", "VARIABLE", "STRING_VALUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'.'", null, null, null, "'('", "')'", "'{'", "'}'", 
			"','", "'&'", "'++'", "'--'", "'||'", "'&&'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'='", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NEWLINE", "INT", "DOUBLE", "OP", "CP", "OB", 
			"CB", "COMMA", "REF", "PLUSPLUS", "MINMIN", "OR", "AND", "EQ", "NEQ", 
			"LI", "RI", "LIEQ", "RIEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "NOT", 
			"ASSIGN", "SEMICOLON", "VARIABLE", "STRING_VALUE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sample.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000!\u00ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004"+
		"\u0003K\b\u0003\u000b\u0003\f\u0003L\u0001\u0004\u0001\u0004\u0005\u0004"+
		"Q\b\u0004\n\u0004\f\u0004T\t\u0004\u0001\u0004\u0003\u0004W\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005\u0001"+
		"\u0005\u0003\u0005a\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005e\b\u0005"+
		"\n\u0005\f\u0005h\t\u0005\u0003\u0005j\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u00a6\b\u001e"+
		"\n\u001e\f\u001e\u00a9\t\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u00ad"+
		"\b\u001f\n\u001f\f\u001f\u00b0\t\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0004 \u00b5\b \u000b \f \u00b6\u0001 \u0001 \u0000\u0000!\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!\u0001\u0000\u0007"+
		"\u0002\u0000\n\n\r\r\u0001\u000019\u0001\u000009\u0004\u0000AZ__az\u8000"+
		"\uac00\u8000\ud7a3\u0005\u000009AZ__az\u8000\uac00\u8000\ud7a3\u0001\u0000"+
		"\"\"\u0003\u0000\t\n\r\r  \u00c3\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000"+
		"\u0003E\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000\u0007J"+
		"\u0001\u0000\u0000\u0000\tV\u0001\u0000\u0000\u0000\u000b`\u0001\u0000"+
		"\u0000\u0000\rk\u0001\u0000\u0000\u0000\u000fm\u0001\u0000\u0000\u0000"+
		"\u0011o\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000\u0000\u0015s"+
		"\u0001\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019w\u0001\u0000"+
		"\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000"+
		"\u001f\u0080\u0001\u0000\u0000\u0000!\u0083\u0001\u0000\u0000\u0000#\u0086"+
		"\u0001\u0000\u0000\u0000%\u0089\u0001\u0000\u0000\u0000\'\u008b\u0001"+
		"\u0000\u0000\u0000)\u008d\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000"+
		"\u0000-\u0093\u0001\u0000\u0000\u0000/\u0095\u0001\u0000\u0000\u00001"+
		"\u0097\u0001\u0000\u0000\u00003\u0099\u0001\u0000\u0000\u00005\u009b\u0001"+
		"\u0000\u0000\u00007\u009d\u0001\u0000\u0000\u00009\u009f\u0001\u0000\u0000"+
		"\u0000;\u00a1\u0001\u0000\u0000\u0000=\u00a3\u0001\u0000\u0000\u0000?"+
		"\u00aa\u0001\u0000\u0000\u0000A\u00b4\u0001\u0000\u0000\u0000CD\u0005"+
		"[\u0000\u0000D\u0002\u0001\u0000\u0000\u0000EF\u0005]\u0000\u0000F\u0004"+
		"\u0001\u0000\u0000\u0000GH\u0005.\u0000\u0000H\u0006\u0001\u0000\u0000"+
		"\u0000IK\u0007\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\b\u0001"+
		"\u0000\u0000\u0000NR\u0007\u0001\u0000\u0000OQ\u0007\u0002\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SW\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UW\u00050\u0000\u0000VN\u0001\u0000\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000W\n\u0001\u0000\u0000\u0000X\\\u0007\u0001\u0000\u0000Y[\u0007"+
		"\u0002\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]a\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_a\u00050\u0000\u0000`X\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ai\u0001\u0000\u0000\u0000bf\u0005.\u0000"+
		"\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\f\u0001\u0000\u0000\u0000kl\u0005(\u0000\u0000"+
		"l\u000e\u0001\u0000\u0000\u0000mn\u0005)\u0000\u0000n\u0010\u0001\u0000"+
		"\u0000\u0000op\u0005{\u0000\u0000p\u0012\u0001\u0000\u0000\u0000qr\u0005"+
		"}\u0000\u0000r\u0014\u0001\u0000\u0000\u0000st\u0005,\u0000\u0000t\u0016"+
		"\u0001\u0000\u0000\u0000uv\u0005&\u0000\u0000v\u0018\u0001\u0000\u0000"+
		"\u0000wx\u0005+\u0000\u0000xy\u0005+\u0000\u0000y\u001a\u0001\u0000\u0000"+
		"\u0000z{\u0005-\u0000\u0000{|\u0005-\u0000\u0000|\u001c\u0001\u0000\u0000"+
		"\u0000}~\u0005|\u0000\u0000~\u007f\u0005|\u0000\u0000\u007f\u001e\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005&\u0000\u0000\u0081\u0082\u0005&\u0000"+
		"\u0000\u0082 \u0001\u0000\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084"+
		"\u0085\u0005=\u0000\u0000\u0085\"\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005!\u0000\u0000\u0087\u0088\u0005=\u0000\u0000\u0088$\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005>\u0000\u0000\u008a&\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005<\u0000\u0000\u008c(\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005>\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f*\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005<\u0000\u0000\u0091\u0092\u0005=\u0000\u0000"+
		"\u0092,\u0001\u0000\u0000\u0000\u0093\u0094\u0005+\u0000\u0000\u0094."+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005-\u0000\u0000\u00960\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u00982\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005/\u0000\u0000\u009a4\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005%\u0000\u0000\u009c6\u0001\u0000\u0000\u0000\u009d\u009e\u0005!"+
		"\u0000\u0000\u009e8\u0001\u0000\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000"+
		"\u00a0:\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005;\u0000\u0000\u00a2<"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a7\u0007\u0003\u0000\u0000\u00a4\u00a6"+
		"\u0007\u0004\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8>\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ae\u0005\"\u0000\u0000\u00ab\u00ad\b\u0005"+
		"\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\"\u0000\u0000\u00b2@\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0007\u0006\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0006 \u0000\u0000\u00b9B\u0001\u0000\u0000\u0000\u000b"+
		"\u0000LRV\\`fi\u00a7\u00ae\u00b6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
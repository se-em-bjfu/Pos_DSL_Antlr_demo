// Generated from PriceStrategy.g4 by ANTLR 4.5
package bjfu.em.se.pos.domain.salepricing.dsl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PriceStrategyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, VAR=15, INT=16, REAL=17, 
		MUL=18, DIV=19, ADD=20, SUB=21, GT=22, LT=23, EQ=24, GTE=25, LTE=26, WS=27, 
		COMMENT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "VAR", "INT", "REAL", "MUL", 
		"DIV", "ADD", "SUB", "GT", "LT", "EQ", "GTE", "LTE", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'如果'", "'那么'", "'并且'", "'或者'", "'不'", "'('", "')'", "'打'", 
		"'折'", "'满'", "'减'", "'不累计'", "'不打折'", null, null, null, "'*'", "'/'", 
		"'+'", "'-'", "'大于'", "'小于'", "'等于'", "'大于等于'", "'小于等于'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "VAR", "INT", "REAL", "MUL", "DIV", "ADD", "SUB", "GT", 
		"LT", "EQ", "GTE", "LTE", "WS", "COMMENT"
	};
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


	public PriceStrategyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PriceStrategy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20h\n\20\3\21\3\21\6\21l\n\21\r\21\16"+
		"\21m\3\21\5\21q\n\21\3\22\3\22\3\22\6\22v\n\22\r\22\16\22w\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u0096"+
		"\n\34\r\34\16\34\u0097\3\34\3\34\3\35\3\35\7\35\u009e\n\35\f\35\16\35"+
		"\u00a1\13\35\3\35\5\35\u00a4\n\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\6\3\2\63;\3\2\62;"+
		"\6\2\13\13\17\17\"\"\u3002\u3002\4\2\f\f\17\17\u00ad\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7"+
		"@\3\2\2\2\tC\3\2\2\2\13F\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23"+
		"O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35[\3\2\2\2"+
		"\37g\3\2\2\2!p\3\2\2\2#r\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177\3"+
		"\2\2\2-\u0081\3\2\2\2/\u0084\3\2\2\2\61\u0087\3\2\2\2\63\u008a\3\2\2\2"+
		"\65\u008f\3\2\2\2\67\u0095\3\2\2\29\u009b\3\2\2\2;<\7\f\2\2<\4\3\2\2\2"+
		"=>\7\u5984\2\2>?\7\u679e\2\2?\6\3\2\2\2@A\7\u90a5\2\2AB\7\u4e4a\2\2B\b"+
		"\3\2\2\2CD\7\u5e78\2\2DE\7\u4e16\2\2E\n\3\2\2\2FG\7\u6218\2\2GH\7\u8007"+
		"\2\2H\f\3\2\2\2IJ\7\u4e0f\2\2J\16\3\2\2\2KL\7*\2\2L\20\3\2\2\2MN\7+\2"+
		"\2N\22\3\2\2\2OP\7\u6255\2\2P\24\3\2\2\2QR\7\u629a\2\2R\26\3\2\2\2ST\7"+
		"\u6ee3\2\2T\30\3\2\2\2UV\7\u51d1\2\2V\32\3\2\2\2WX\7\u4e0f\2\2XY\7\u7d31"+
		"\2\2YZ\7\u8ba3\2\2Z\34\3\2\2\2[\\\7\u4e0f\2\2\\]\7\u6255\2\2]^\7\u629a"+
		"\2\2^\36\3\2\2\2_`\7\u629a\2\2`a\7\u524f\2\2ab\7\u603d\2\2bh\7\u989f\2"+
		"\2cd\7\u629a\2\2de\7\u524f\2\2ef\7\u91d3\2\2fh\7\u989f\2\2g_\3\2\2\2g"+
		"c\3\2\2\2h \3\2\2\2ik\t\2\2\2jl\t\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2nq\3\2\2\2oq\t\3\2\2pi\3\2\2\2po\3\2\2\2q\"\3\2\2\2rs\5!\21"+
		"\2su\7\60\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x$\3\2"+
		"\2\2yz\7,\2\2z&\3\2\2\2{|\7\61\2\2|(\3\2\2\2}~\7-\2\2~*\3\2\2\2\177\u0080"+
		"\7/\2\2\u0080,\3\2\2\2\u0081\u0082\7\u5929\2\2\u0082\u0083\7\u4e90\2\2"+
		"\u0083.\3\2\2\2\u0084\u0085\7\u5c11\2\2\u0085\u0086\7\u4e90\2\2\u0086"+
		"\60\3\2\2\2\u0087\u0088\7\u7b4b\2\2\u0088\u0089\7\u4e90\2\2\u0089\62\3"+
		"\2\2\2\u008a\u008b\7\u5929\2\2\u008b\u008c\7\u4e90\2\2\u008c\u008d\7\u7b4b"+
		"\2\2\u008d\u008e\7\u4e90\2\2\u008e\64\3\2\2\2\u008f\u0090\7\u5c11\2\2"+
		"\u0090\u0091\7\u4e90\2\2\u0091\u0092\7\u7b4b\2\2\u0092\u0093\7\u4e90\2"+
		"\2\u0093\66\3\2\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\b\34\2\2\u009a8\3\2\2\2\u009b\u009f\7%\2\2\u009c\u009e\n\5\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\17\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\b\35\2\2\u00a6:\3\2\2\2\n\2gmpw\u0097\u009f\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
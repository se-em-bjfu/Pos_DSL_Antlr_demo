// Generated from PriceStrategy.g4 by ANTLR 4.5
package bjfu.em.se.pos.domain.salepricing.dsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PriceStrategyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, VAR=15, INT=16, REAL=17, 
		MUL=18, DIV=19, ADD=20, SUB=21, GT=22, LT=23, EQ=24, GTE=25, LTE=26, WS=27, 
		COMMENT=28;
	public static final int
		RULE_script = 0, RULE_stat = 1, RULE_boolexpr = 2, RULE_expr = 3, RULE_strategy = 4;
	public static final String[] ruleNames = {
		"script", "stat", "boolexpr", "expr", "strategy"
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

	@Override
	public String getGrammarFileName() { return "PriceStrategy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PriceStrategyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(10);
					stat();
					setState(11);
					match(T__0);
					}
					} 
				}
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			{
			setState(18);
			stat();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(19);
				match(T__0);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalStatContext extends StatContext {
		public StrategyContext strategy() {
			return getRuleContext(StrategyContext.class,0);
		}
		public NormalStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterNormalStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitNormalStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitNormalStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public StrategyContext strategy() {
			return getRuleContext(StrategyContext.class,0);
		}
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatContext extends StatContext {
		public EmptyStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterEmptyStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitEmptyStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitEmptyStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(32);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__1);
				setState(26);
				boolexpr(0);
				setState(27);
				match(T__2);
				setState(28);
				strategy();
				}
				break;
			case T__8:
			case T__10:
			case T__13:
				_localctx = new NormalStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				strategy();
				}
				break;
			case EOF:
			case T__0:
				_localctx = new EmptyStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class BoolexprContext extends ParserRuleContext {
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
	 
		public BoolexprContext() { }
		public void copyFrom(BoolexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompareNotBoolExprContext extends BoolexprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(PriceStrategyParser.GT, 0); }
		public TerminalNode LT() { return getToken(PriceStrategyParser.LT, 0); }
		public TerminalNode EQ() { return getToken(PriceStrategyParser.EQ, 0); }
		public TerminalNode GTE() { return getToken(PriceStrategyParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(PriceStrategyParser.LTE, 0); }
		public CompareNotBoolExprContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterCompareNotBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitCompareNotBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitCompareNotBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrBoolExprContext extends BoolexprContext {
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public OrBoolExprContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterOrBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitOrBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitOrBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareBoolExprContext extends BoolexprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(PriceStrategyParser.GT, 0); }
		public TerminalNode LT() { return getToken(PriceStrategyParser.LT, 0); }
		public TerminalNode EQ() { return getToken(PriceStrategyParser.EQ, 0); }
		public TerminalNode GTE() { return getToken(PriceStrategyParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(PriceStrategyParser.LTE, 0); }
		public CompareBoolExprContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterCompareBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitCompareBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitCompareBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentheseBoolExprContext extends BoolexprContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ParentheseBoolExprContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterParentheseBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitParentheseBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitParentheseBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndBoolExprContext extends BoolexprContext {
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public AndBoolExprContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterAndBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitAndBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitAndBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_boolexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new CompareNotBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				expr(0);
				setState(36);
				match(T__5);
				setState(37);
				((CompareNotBoolExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << GTE) | (1L << LTE))) != 0)) ) {
					((CompareNotBoolExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(38);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new CompareBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				expr(0);
				setState(41);
				((CompareBoolExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << GTE) | (1L << LTE))) != 0)) ) {
					((CompareBoolExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(42);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new ParentheseBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(T__6);
				setState(45);
				boolexpr(0);
				setState(46);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AndBoolExprContext(new BoolexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(50);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(51);
						match(T__3);
						}
						setState(52);
						boolexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new OrBoolExprContext(new BoolexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(53);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(54);
						match(T__4);
						}
						setState(55);
						boolexpr(5);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class MulExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(PriceStrategyParser.INT, 0); }
		public TerminalNode REAL() { return getToken(PriceStrategyParser.REAL, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentheseExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentheseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterParentheseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitParentheseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitParentheseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode VAR() { return getToken(PriceStrategyParser.VAR, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitVarExpr(this);
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
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitAddExpr(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			switch (_input.LA(1)) {
			case T__6:
				{
				_localctx = new ParentheseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				match(T__6);
				setState(63);
				expr(0);
				setState(64);
				match(T__7);
				}
				break;
			case INT:
			case REAL:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case VAR:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(71);
						((MulExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(72);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(74);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(75);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class StrategyContext extends ParserRuleContext {
		public StrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategy; }
	 
		public StrategyContext() { }
		public void copyFrom(StrategyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusStrategyContext extends StrategyContext {
		public Token threshold;
		public Token value;
		public List<TerminalNode> INT() { return getTokens(PriceStrategyParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PriceStrategyParser.INT, i);
		}
		public MinusStrategyContext(StrategyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterMinusStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitMinusStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitMinusStrategy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiscountStrategyContext extends StrategyContext {
		public Token discount;
		public TerminalNode INT() { return getToken(PriceStrategyParser.INT, 0); }
		public DiscountStrategyContext(StrategyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterDiscountStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitDiscountStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitDiscountStrategy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsoluteMinusStrategyContext extends StrategyContext {
		public Token threshold;
		public Token value;
		public List<TerminalNode> INT() { return getTokens(PriceStrategyParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PriceStrategyParser.INT, i);
		}
		public AbsoluteMinusStrategyContext(StrategyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterAbsoluteMinusStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitAbsoluteMinusStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitAbsoluteMinusStrategy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoDiscountStrategyContext extends StrategyContext {
		public NoDiscountStrategyContext(StrategyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).enterNoDiscountStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PriceStrategyListener ) ((PriceStrategyListener)listener).exitNoDiscountStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PriceStrategyVisitor ) return ((PriceStrategyVisitor<? extends T>)visitor).visitNoDiscountStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrategyContext strategy() throws RecognitionException {
		StrategyContext _localctx = new StrategyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_strategy);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DiscountStrategyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__8);
				setState(82);
				((DiscountStrategyContext)_localctx).discount = match(INT);
				setState(83);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new MinusStrategyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__10);
				setState(85);
				((MinusStrategyContext)_localctx).threshold = match(INT);
				setState(86);
				match(T__11);
				setState(87);
				((MinusStrategyContext)_localctx).value = match(INT);
				}
				break;
			case 3:
				_localctx = new AbsoluteMinusStrategyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__10);
				setState(89);
				((AbsoluteMinusStrategyContext)_localctx).threshold = match(INT);
				setState(90);
				match(T__11);
				setState(91);
				((AbsoluteMinusStrategyContext)_localctx).value = match(INT);
				setState(92);
				match(T__12);
				}
				break;
			case 4:
				_localctx = new NoDiscountStrategyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(T__13);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\6\2\4\6\b\7\2"+
		"\4\6\b\n\2\6\3\2\30\34\3\2\22\23\3\2\24\25\3\2\26\27l\2\21\3\2\2\2\4\""+
		"\3\2\2\2\6\62\3\2\2\2\bF\3\2\2\2\n`\3\2\2\2\f\r\5\4\3\2\r\16\7\3\2\2\16"+
		"\20\3\2\2\2\17\f\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\24\3\2\2\2\23\21\3\2\2\2\24\30\5\4\3\2\25\27\7\3\2\2\26\25\3\2\2\2\27"+
		"\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2\2\2\33"+
		"\34\7\4\2\2\34\35\5\6\4\2\35\36\7\5\2\2\36\37\5\n\6\2\37#\3\2\2\2 #\5"+
		"\n\6\2!#\3\2\2\2\"\33\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\b\4\1"+
		"\2%&\5\b\5\2&\'\7\b\2\2\'(\t\2\2\2()\5\b\5\2)\63\3\2\2\2*+\5\b\5\2+,\t"+
		"\2\2\2,-\5\b\5\2-\63\3\2\2\2./\7\t\2\2/\60\5\6\4\2\60\61\7\n\2\2\61\63"+
		"\3\2\2\2\62$\3\2\2\2\62*\3\2\2\2\62.\3\2\2\2\63<\3\2\2\2\64\65\f\7\2\2"+
		"\65\66\7\6\2\2\66;\5\6\4\b\678\f\6\2\289\7\7\2\29;\5\6\4\7:\64\3\2\2\2"+
		":\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\7\3\2\2\2><\3\2\2\2?@\b\5"+
		"\1\2@A\7\t\2\2AB\5\b\5\2BC\7\n\2\2CG\3\2\2\2DG\t\3\2\2EG\7\21\2\2F?\3"+
		"\2\2\2FD\3\2\2\2FE\3\2\2\2GP\3\2\2\2HI\f\7\2\2IJ\t\4\2\2JO\5\b\5\bKL\f"+
		"\6\2\2LM\t\5\2\2MO\5\b\5\7NH\3\2\2\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\t\3\2\2\2RP\3\2\2\2ST\7\13\2\2TU\7\22\2\2Ua\7\f\2\2VW\7\r\2\2"+
		"WX\7\22\2\2XY\7\16\2\2Ya\7\22\2\2Z[\7\r\2\2[\\\7\22\2\2\\]\7\16\2\2]^"+
		"\7\22\2\2^a\7\17\2\2_a\7\20\2\2`S\3\2\2\2`V\3\2\2\2`Z\3\2\2\2`_\3\2\2"+
		"\2a\13\3\2\2\2\f\21\30\"\62:<FNP`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
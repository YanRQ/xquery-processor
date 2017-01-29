// Generated from /Users/richard/Documents/graduate study/2nd semester/CS232B/project/xquery/src/main/java/Listener/XQuery.g4 by ANTLR 4.6
package Listener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, StringLiteral=36, StringConstant=37, 
		Var=38, WS=39;
	public static final int
		RULE_query = 0, RULE_forClause = 1, RULE_letClause = 2, RULE_whereClause = 3, 
		RULE_returnClause = 4, RULE_ap = 5, RULE_rp = 6, RULE_f = 7, RULE_cond = 8;
	public static final String[] ruleNames = {
		"query", "forClause", "letClause", "whereClause", "returnClause", "ap", 
		"rp", "f", "cond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
		"'</'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'doc('", 
		"'document('", "'*'", "'.'", "'..'", "'text()'", "'@'", "'['", "']'", 
		"'='", "'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", "'empty('", "'some'", 
		"'satisfies'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"StringLiteral", "StringConstant", "Var", "WS"
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
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqapContext extends QueryContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XqapContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqap(this);
		}
	}
	public static class XqtagContext extends QueryContext {
		public List<TerminalNode> StringConstant() { return getTokens(XQueryParser.StringConstant); }
		public TerminalNode StringConstant(int i) {
			return getToken(XQueryParser.StringConstant, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public XqtagContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqtag(this);
		}
	}
	public static class XqconcatContext extends QueryContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public XqconcatContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqconcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqconcat(this);
		}
	}
	public static class XqletContext extends QueryContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public XqletContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqlet(this);
		}
	}
	public static class XqslashContext extends QueryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqslashContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqslash(this);
		}
	}
	public static class XqclauseContext extends QueryContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public XqclauseContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqclause(this);
		}
	}
	public static class XqparenContext extends QueryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public XqparenContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqparen(this);
		}
	}
	public static class XqstringContext extends QueryContext {
		public TerminalNode StringLiteral() { return getToken(XQueryParser.StringLiteral, 0); }
		public XqstringContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqstring(this);
		}
	}
	public static class XqdoubleslashContext extends QueryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqdoubleslashContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqdoubleslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqdoubleslash(this);
		}
	}
	public static class XqvarContext extends QueryContext {
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public XqvarContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqvar(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		return query(0);
	}

	private QueryContext query(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryContext _localctx = new QueryContext(_ctx, _parentState);
		QueryContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_query, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				_localctx = new XqvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(Var);
				}
				break;
			case StringLiteral:
				{
				_localctx = new XqstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(StringLiteral);
				}
				break;
			case T__16:
			case T__17:
				{
				_localctx = new XqapContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new XqparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(T__0);
				setState(23);
				query(0);
				setState(24);
				match(T__1);
				}
				break;
			case T__5:
				{
				_localctx = new XqtagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(T__5);
				setState(27);
				match(StringConstant);
				setState(28);
				match(T__6);
				setState(29);
				match(T__7);
				setState(30);
				query(0);
				setState(31);
				match(T__8);
				setState(32);
				match(T__9);
				setState(33);
				match(StringConstant);
				setState(34);
				match(T__6);
				}
				break;
			case T__10:
				{
				_localctx = new XqclauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				forClause();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(37);
					letClause();
					}
				}

				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(40);
					whereClause();
					}
				}

				setState(43);
				returnClause();
				}
				break;
			case T__12:
				{
				_localctx = new XqletContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				letClause();
				setState(46);
				query(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new XqconcatContext(new QueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(50);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(51);
						match(T__2);
						setState(52);
						query(7);
						}
						break;
					case 2:
						{
						_localctx = new XqslashContext(new QueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(53);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(54);
						match(T__3);
						setState(55);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqdoubleslashContext(new QueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(56);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(57);
						match(T__4);
						setState(58);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(63);
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__10);
			setState(65);
			match(Var);
			setState(66);
			match(T__11);
			setState(67);
			query(0);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(68);
				match(T__2);
				setState(69);
				match(Var);
				setState(70);
				match(T__11);
				setState(71);
				query(0);
				}
				}
				setState(76);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__12);
			setState(78);
			match(Var);
			setState(79);
			match(T__13);
			setState(80);
			query(0);
			{
			setState(81);
			match(T__2);
			setState(82);
			match(Var);
			setState(83);
			match(T__13);
			setState(84);
			query(0);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__14);
			setState(87);
			cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__15);
			setState(90);
			query(0);
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

	public static class ApContext extends ParserRuleContext {
		public Token slash;
		public TerminalNode StringLiteral() { return getToken(XQueryParser.StringLiteral, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAp(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ap);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__16);
				setState(93);
				match(StringLiteral);
				setState(94);
				match(T__1);
				setState(95);
				((ApContext)_localctx).slash = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((ApContext)_localctx).slash = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(96);
				rp(0);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__17);
				setState(98);
				match(StringLiteral);
				setState(99);
				match(T__1);
				setState(100);
				((ApContext)_localctx).slash = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((ApContext)_localctx).slash = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				rp(0);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RpparenContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpparenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpparen(this);
		}
	}
	public static class RpselfContext extends RpContext {
		public RpselfContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpself(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpself(this);
		}
	}
	public static class RpparentContext extends RpContext {
		public RpparentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpparent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpparent(this);
		}
	}
	public static class RptextContext extends RpContext {
		public RptextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRptext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRptext(this);
		}
	}
	public static class RpslashContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpslashContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpslash(this);
		}
	}
	public static class RpdoubleslashContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpdoubleslashContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpdoubleslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpdoubleslash(this);
		}
	}
	public static class RpchildContext extends RpContext {
		public RpchildContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpchild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpchild(this);
		}
	}
	public static class RpstringContext extends RpContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public RpstringContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpstring(this);
		}
	}
	public static class RpcancatContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpcancatContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpcancat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpcancat(this);
		}
	}
	public static class RpfilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpfilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpfilter(this);
		}
	}
	public static class RpattrContext extends RpContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public RpattrContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpattr(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConstant:
				{
				_localctx = new RpstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(StringConstant);
				}
				break;
			case T__18:
				{
				_localctx = new RpchildContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__18);
				}
				break;
			case T__19:
				{
				_localctx = new RpselfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(T__19);
				}
				break;
			case T__20:
				{
				_localctx = new RpparentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(T__20);
				}
				break;
			case T__21:
				{
				_localctx = new RptextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__21);
				}
				break;
			case T__22:
				{
				_localctx = new RpattrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(T__22);
				setState(111);
				match(StringConstant);
				}
				break;
			case T__0:
				{
				_localctx = new RpparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(T__0);
				setState(113);
				rp(0);
				setState(114);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new RpslashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						match(T__3);
						setState(120);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpdoubleslashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(121);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(122);
						match(T__4);
						setState(123);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpcancatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(124);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(125);
						match(T__2);
						setState(126);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpfilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(128);
						match(T__23);
						setState(129);
						f(0);
						setState(130);
						match(T__24);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FltorContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FltorContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFltor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFltor(this);
		}
	}
	public static class FltnotContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FltnotContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFltnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFltnot(this);
		}
	}
	public static class FltrpeqContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FltrpeqContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFltrpeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFltrpeq(this);
		}
	}
	public static class FltrpvaleqContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FltrpvaleqContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFltrpvaleq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFltrpvaleq(this);
		}
	}
	public static class FltrpContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FltrpContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFltrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFltrp(this);
		}
	}
	public static class FltparenContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FltparenContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFltparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFltparen(this);
		}
	}
	public static class FltandContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FltandContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFltand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFltand(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new FltrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(138);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FltrpvaleqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				rp(0);
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FltrpeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				rp(0);
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FltparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(T__0);
				setState(148);
				f(0);
				setState(149);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FltnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__31);
				setState(152);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new FltandContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
						match(T__29);
						setState(157);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FltorContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						match(T__30);
						setState(160);
						f(3);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondeqContext extends CondContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public CondeqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondeq(this);
		}
	}
	public static class CondnotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondnotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondnot(this);
		}
	}
	public static class CondvaleqContext extends CondContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public CondvaleqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondvaleq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondvaleq(this);
		}
	}
	public static class CondemptyContext extends CondContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public CondemptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondempty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondempty(this);
		}
	}
	public static class CondexistContext extends CondContext {
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondexistContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondexist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondexist(this);
		}
	}
	public static class CondandContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondandContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondand(this);
		}
	}
	public static class CondorContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondorContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondor(this);
		}
	}
	public static class CondparenContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondparenContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondparen(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new CondvaleqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				query(0);
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				query(0);
				}
				break;
			case 2:
				{
				_localctx = new CondeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				query(0);
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				query(0);
				}
				break;
			case 3:
				{
				_localctx = new CondemptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(T__32);
				setState(176);
				query(0);
				setState(177);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new CondexistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T__33);
				setState(180);
				match(Var);
				setState(181);
				match(T__11);
				setState(182);
				query(0);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(183);
					match(T__2);
					setState(184);
					match(Var);
					setState(185);
					match(T__11);
					setState(186);
					query(0);
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(T__34);
				setState(193);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new CondparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__0);
				setState(196);
				cond(0);
				setState(197);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new CondnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(T__31);
				setState(200);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new CondandContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						match(T__29);
						setState(205);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondorContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						match(T__30);
						setState(208);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return query_sempred((QueryContext)_localctx, predIndex);
		case 6:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 7:
			return f_sempred((FContext)_localctx, predIndex);
		case 8:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean query_sempred(QueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2)\n\2\3\2\5\2,\n\2\3\2\3\2\3\2\3\2\3\2\5\2\63\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7i\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bw\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b"+
		"\u008a\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u009c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00be\n\n\f\n\16\n\u00c1\13\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d4\n"+
		"\n\f\n\16\n\u00d7\13\n\3\n\2\6\2\16\20\22\13\2\4\6\b\n\f\16\20\22\2\5"+
		"\3\2\6\7\3\2\34\35\3\2\36\37\u00f4\2\62\3\2\2\2\4B\3\2\2\2\6O\3\2\2\2"+
		"\bX\3\2\2\2\n[\3\2\2\2\fh\3\2\2\2\16v\3\2\2\2\20\u009b\3\2\2\2\22\u00cb"+
		"\3\2\2\2\24\25\b\2\1\2\25\63\7(\2\2\26\63\7&\2\2\27\63\5\f\7\2\30\31\7"+
		"\3\2\2\31\32\5\2\2\2\32\33\7\4\2\2\33\63\3\2\2\2\34\35\7\b\2\2\35\36\7"+
		"\'\2\2\36\37\7\t\2\2\37 \7\n\2\2 !\5\2\2\2!\"\7\13\2\2\"#\7\f\2\2#$\7"+
		"\'\2\2$%\7\t\2\2%\63\3\2\2\2&(\5\4\3\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2"+
		")+\3\2\2\2*,\5\b\5\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\5\n\6\2.\63\3\2\2"+
		"\2/\60\5\6\4\2\60\61\5\2\2\3\61\63\3\2\2\2\62\24\3\2\2\2\62\26\3\2\2\2"+
		"\62\27\3\2\2\2\62\30\3\2\2\2\62\34\3\2\2\2\62&\3\2\2\2\62/\3\2\2\2\63"+
		"?\3\2\2\2\64\65\f\b\2\2\65\66\7\5\2\2\66>\5\2\2\t\678\f\7\2\289\7\6\2"+
		"\29>\5\16\b\2:;\f\6\2\2;<\7\7\2\2<>\5\16\b\2=\64\3\2\2\2=\67\3\2\2\2="+
		":\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BC\7\r\2\2"+
		"CD\7(\2\2DE\7\16\2\2EL\5\2\2\2FG\7\5\2\2GH\7(\2\2HI\7\16\2\2IK\5\2\2\2"+
		"JF\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OP\7\17\2"+
		"\2PQ\7(\2\2QR\7\20\2\2RS\5\2\2\2ST\7\5\2\2TU\7(\2\2UV\7\20\2\2VW\5\2\2"+
		"\2W\7\3\2\2\2XY\7\21\2\2YZ\5\22\n\2Z\t\3\2\2\2[\\\7\22\2\2\\]\5\2\2\2"+
		"]\13\3\2\2\2^_\7\23\2\2_`\7&\2\2`a\7\4\2\2ab\t\2\2\2bi\5\16\b\2cd\7\24"+
		"\2\2de\7&\2\2ef\7\4\2\2fg\t\2\2\2gi\5\16\b\2h^\3\2\2\2hc\3\2\2\2i\r\3"+
		"\2\2\2jk\b\b\1\2kw\7\'\2\2lw\7\25\2\2mw\7\26\2\2nw\7\27\2\2ow\7\30\2\2"+
		"pq\7\31\2\2qw\7\'\2\2rs\7\3\2\2st\5\16\b\2tu\7\4\2\2uw\3\2\2\2vj\3\2\2"+
		"\2vl\3\2\2\2vm\3\2\2\2vn\3\2\2\2vo\3\2\2\2vp\3\2\2\2vr\3\2\2\2w\u0088"+
		"\3\2\2\2xy\f\6\2\2yz\7\6\2\2z\u0087\5\16\b\7{|\f\5\2\2|}\7\7\2\2}\u0087"+
		"\5\16\b\6~\177\f\3\2\2\177\u0080\7\5\2\2\u0080\u0087\5\16\b\4\u0081\u0082"+
		"\f\4\2\2\u0082\u0083\7\32\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7\33\2"+
		"\2\u0085\u0087\3\2\2\2\u0086x\3\2\2\2\u0086{\3\2\2\2\u0086~\3\2\2\2\u0086"+
		"\u0081\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\17\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\b\t\1\2\u008c\u009c"+
		"\5\16\b\2\u008d\u008e\5\16\b\2\u008e\u008f\t\3\2\2\u008f\u0090\5\16\b"+
		"\2\u0090\u009c\3\2\2\2\u0091\u0092\5\16\b\2\u0092\u0093\t\4\2\2\u0093"+
		"\u0094\5\16\b\2\u0094\u009c\3\2\2\2\u0095\u0096\7\3\2\2\u0096\u0097\5"+
		"\20\t\2\u0097\u0098\7\4\2\2\u0098\u009c\3\2\2\2\u0099\u009a\7\"\2\2\u009a"+
		"\u009c\5\20\t\3\u009b\u008b\3\2\2\2\u009b\u008d\3\2\2\2\u009b\u0091\3"+
		"\2\2\2\u009b\u0095\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a5\3\2\2\2\u009d"+
		"\u009e\f\5\2\2\u009e\u009f\7 \2\2\u009f\u00a4\5\20\t\6\u00a0\u00a1\f\4"+
		"\2\2\u00a1\u00a2\7!\2\2\u00a2\u00a4\5\20\t\5\u00a3\u009d\3\2\2\2\u00a3"+
		"\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\21\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\b\n\1\2\u00a9\u00aa"+
		"\5\2\2\2\u00aa\u00ab\t\3\2\2\u00ab\u00ac\5\2\2\2\u00ac\u00cc\3\2\2\2\u00ad"+
		"\u00ae\5\2\2\2\u00ae\u00af\t\4\2\2\u00af\u00b0\5\2\2\2\u00b0\u00cc\3\2"+
		"\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3\5\2\2\2\u00b3\u00b4\7\4\2\2\u00b4"+
		"\u00cc\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8\7\16"+
		"\2\2\u00b8\u00bf\5\2\2\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\7(\2\2\u00bb"+
		"\u00bc\7\16\2\2\u00bc\u00be\5\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00c1\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7%\2\2\u00c3\u00c4\5\22\n\7\u00c4\u00cc\3\2"+
		"\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\5\22\n\2\u00c7\u00c8\7\4\2\2\u00c8"+
		"\u00cc\3\2\2\2\u00c9\u00ca\7\"\2\2\u00ca\u00cc\5\22\n\3\u00cb\u00a8\3"+
		"\2\2\2\u00cb\u00ad\3\2\2\2\u00cb\u00b1\3\2\2\2\u00cb\u00b5\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\f\5"+
		"\2\2\u00ce\u00cf\7 \2\2\u00cf\u00d4\5\22\n\6\u00d0\u00d1\f\4\2\2\u00d1"+
		"\u00d2\7!\2\2\u00d2\u00d4\5\22\n\5\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\23\3\2\2\2\u00d7\u00d5\3\2\2\2\23(+\62=?Lhv\u0086\u0088\u009b\u00a3\u00a5"+
		"\u00bf\u00cb\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
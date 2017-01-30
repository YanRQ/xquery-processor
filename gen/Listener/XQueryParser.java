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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, StringLiteral=38, 
		StringConstant=39, Var=40, WS=41;
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
		"'document('", "')/'", "')//'", "'*'", "'.'", "'..'", "'text()'", "'@'", 
		"'['", "']'", "'='", "'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", 
		"'empty('", "'some'", "'satisfies'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "StringLiteral", "StringConstant", "Var", "WS"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqap(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqtag(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqconcat(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqlet(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqslash(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqclause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqparenContext extends QueryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public XqparenContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqparen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqstringContext extends QueryContext {
		public TerminalNode StringLiteral() { return getToken(XQueryParser.StringLiteral, 0); }
		public XqstringContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqstring(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqdoubleslash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqvarContext extends QueryContext {
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public XqvarContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqvar(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
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
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApdoubleslashContext extends ApContext {
		public TerminalNode StringLiteral() { return getToken(XQueryParser.StringLiteral, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApdoubleslashContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApdoubleslash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApslashContext extends ApContext {
		public TerminalNode StringLiteral() { return getToken(XQueryParser.StringLiteral, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApslashContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApslash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ap);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ApslashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				match(StringLiteral);
				setState(94);
				match(T__18);
				setState(95);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApdoubleslashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				match(StringLiteral);
				setState(98);
				match(T__19);
				setState(99);
				rp(0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpparen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpselfContext extends RpContext {
		public RpselfContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpself(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpparentContext extends RpContext {
		public RpparentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpparent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RptextContext extends RpContext {
		public RptextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRptext(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpslash(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpdoubleslash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpchildContext extends RpContext {
		public RpchildContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpchild(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpstringContext extends RpContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public RpstringContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpstring(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpcancat(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpfilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpattrContext extends RpContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public RpattrContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpattr(this);
			else return visitor.visitChildren(this);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConstant:
				{
				_localctx = new RpstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(StringConstant);
				}
				break;
			case T__20:
				{
				_localctx = new RpchildContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(T__20);
				}
				break;
			case T__21:
				{
				_localctx = new RpselfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(T__21);
				}
				break;
			case T__22:
				{
				_localctx = new RpparentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__22);
				}
				break;
			case T__23:
				{
				_localctx = new RptextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(T__23);
				}
				break;
			case T__24:
				{
				_localctx = new RpattrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(T__24);
				setState(109);
				match(StringConstant);
				}
				break;
			case T__0:
				{
				_localctx = new RpparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(T__0);
				setState(111);
				rp(0);
				setState(112);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new RpslashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						match(T__3);
						setState(118);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpdoubleslashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(T__4);
						setState(121);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpcancatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(122);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(123);
						match(T__2);
						setState(124);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpfilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(125);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(126);
						match(T__25);
						setState(127);
						f(0);
						setState(128);
						match(T__26);
						}
						break;
					}
					} 
				}
				setState(134);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFltor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FltnotContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FltnotContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFltnot(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFltrpeq(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFltrpvaleq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FltrpContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FltrpContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFltrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FltparenContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FltparenContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFltparen(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFltand(this);
			else return visitor.visitChildren(this);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new FltrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FltrpvaleqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				rp(0);
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FltrpeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				rp(0);
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FltparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__0);
				setState(146);
				f(0);
				setState(147);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FltnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__33);
				setState(150);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new FltandContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(153);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(154);
						match(T__31);
						setState(155);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FltorContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(156);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(157);
						match(T__32);
						setState(158);
						f(3);
						}
						break;
					}
					} 
				}
				setState(163);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondnotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondnotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondnot(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondvaleq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondemptyContext extends CondContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public CondemptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondempty(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondexist(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondand(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondparenContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondparenContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondparen(this);
			else return visitor.visitChildren(this);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new CondvaleqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165);
				query(0);
				setState(166);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				query(0);
				}
				break;
			case 2:
				{
				_localctx = new CondeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				query(0);
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				query(0);
				}
				break;
			case 3:
				{
				_localctx = new CondemptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__34);
				setState(174);
				query(0);
				setState(175);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new CondexistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__35);
				setState(178);
				match(Var);
				setState(179);
				match(T__11);
				setState(180);
				query(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(181);
					match(T__2);
					setState(182);
					match(Var);
					setState(183);
					match(T__11);
					setState(184);
					query(0);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(T__36);
				setState(191);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new CondparenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(T__0);
				setState(194);
				cond(0);
				setState(195);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new CondnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(T__33);
				setState(198);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new CondandContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						match(T__31);
						setState(203);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondorContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(205);
						match(T__32);
						setState(206);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(211);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2)\n\2\3\2\5\2,\n\2\3\2\3\2\3\2\3\2\3\2\5\2\63\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7g\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00ca\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16"+
		"\n\u00d5\13\n\3\n\2\6\2\16\20\22\13\2\4\6\b\n\f\16\20\22\2\5\3\2\23\24"+
		"\3\2\36\37\3\2 !\u00f2\2\62\3\2\2\2\4B\3\2\2\2\6O\3\2\2\2\bX\3\2\2\2\n"+
		"[\3\2\2\2\ff\3\2\2\2\16t\3\2\2\2\20\u0099\3\2\2\2\22\u00c9\3\2\2\2\24"+
		"\25\b\2\1\2\25\63\7*\2\2\26\63\7(\2\2\27\63\5\f\7\2\30\31\7\3\2\2\31\32"+
		"\5\2\2\2\32\33\7\4\2\2\33\63\3\2\2\2\34\35\7\b\2\2\35\36\7)\2\2\36\37"+
		"\7\t\2\2\37 \7\n\2\2 !\5\2\2\2!\"\7\13\2\2\"#\7\f\2\2#$\7)\2\2$%\7\t\2"+
		"\2%\63\3\2\2\2&(\5\4\3\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5"+
		"\b\5\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\5\n\6\2.\63\3\2\2\2/\60\5\6\4\2"+
		"\60\61\5\2\2\3\61\63\3\2\2\2\62\24\3\2\2\2\62\26\3\2\2\2\62\27\3\2\2\2"+
		"\62\30\3\2\2\2\62\34\3\2\2\2\62&\3\2\2\2\62/\3\2\2\2\63?\3\2\2\2\64\65"+
		"\f\b\2\2\65\66\7\5\2\2\66>\5\2\2\t\678\f\7\2\289\7\6\2\29>\5\16\b\2:;"+
		"\f\6\2\2;<\7\7\2\2<>\5\16\b\2=\64\3\2\2\2=\67\3\2\2\2=:\3\2\2\2>A\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BC\7\r\2\2CD\7*\2\2DE\7\16"+
		"\2\2EL\5\2\2\2FG\7\5\2\2GH\7*\2\2HI\7\16\2\2IK\5\2\2\2JF\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OP\7\17\2\2PQ\7*\2\2QR\7"+
		"\20\2\2RS\5\2\2\2ST\7\5\2\2TU\7*\2\2UV\7\20\2\2VW\5\2\2\2W\7\3\2\2\2X"+
		"Y\7\21\2\2YZ\5\22\n\2Z\t\3\2\2\2[\\\7\22\2\2\\]\5\2\2\2]\13\3\2\2\2^_"+
		"\t\2\2\2_`\7(\2\2`a\7\25\2\2ag\5\16\b\2bc\t\2\2\2cd\7(\2\2de\7\26\2\2"+
		"eg\5\16\b\2f^\3\2\2\2fb\3\2\2\2g\r\3\2\2\2hi\b\b\1\2iu\7)\2\2ju\7\27\2"+
		"\2ku\7\30\2\2lu\7\31\2\2mu\7\32\2\2no\7\33\2\2ou\7)\2\2pq\7\3\2\2qr\5"+
		"\16\b\2rs\7\4\2\2su\3\2\2\2th\3\2\2\2tj\3\2\2\2tk\3\2\2\2tl\3\2\2\2tm"+
		"\3\2\2\2tn\3\2\2\2tp\3\2\2\2u\u0086\3\2\2\2vw\f\6\2\2wx\7\6\2\2x\u0085"+
		"\5\16\b\7yz\f\5\2\2z{\7\7\2\2{\u0085\5\16\b\6|}\f\3\2\2}~\7\5\2\2~\u0085"+
		"\5\16\b\4\177\u0080\f\4\2\2\u0080\u0081\7\34\2\2\u0081\u0082\5\20\t\2"+
		"\u0082\u0083\7\35\2\2\u0083\u0085\3\2\2\2\u0084v\3\2\2\2\u0084y\3\2\2"+
		"\2\u0084|\3\2\2\2\u0084\177\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\17\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\b\t\1\2\u008a\u009a\5\16\b\2\u008b\u008c\5\16\b\2\u008c\u008d\t"+
		"\3\2\2\u008d\u008e\5\16\b\2\u008e\u009a\3\2\2\2\u008f\u0090\5\16\b\2\u0090"+
		"\u0091\t\4\2\2\u0091\u0092\5\16\b\2\u0092\u009a\3\2\2\2\u0093\u0094\7"+
		"\3\2\2\u0094\u0095\5\20\t\2\u0095\u0096\7\4\2\2\u0096\u009a\3\2\2\2\u0097"+
		"\u0098\7$\2\2\u0098\u009a\5\20\t\3\u0099\u0089\3\2\2\2\u0099\u008b\3\2"+
		"\2\2\u0099\u008f\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u00a3\3\2\2\2\u009b\u009c\f\5\2\2\u009c\u009d\7\"\2\2\u009d\u00a2\5\20"+
		"\t\6\u009e\u009f\f\4\2\2\u009f\u00a0\7#\2\2\u00a0\u00a2\5\20\t\5\u00a1"+
		"\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7"+
		"\b\n\1\2\u00a7\u00a8\5\2\2\2\u00a8\u00a9\t\3\2\2\u00a9\u00aa\5\2\2\2\u00aa"+
		"\u00ca\3\2\2\2\u00ab\u00ac\5\2\2\2\u00ac\u00ad\t\4\2\2\u00ad\u00ae\5\2"+
		"\2\2\u00ae\u00ca\3\2\2\2\u00af\u00b0\7%\2\2\u00b0\u00b1\5\2\2\2\u00b1"+
		"\u00b2\7\4\2\2\u00b2\u00ca\3\2\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b5\7*\2"+
		"\2\u00b5\u00b6\7\16\2\2\u00b6\u00bd\5\2\2\2\u00b7\u00b8\7\5\2\2\u00b8"+
		"\u00b9\7*\2\2\u00b9\u00ba\7\16\2\2\u00ba\u00bc\5\2\2\2\u00bb\u00b7\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\5\22"+
		"\n\7\u00c2\u00ca\3\2\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\5\22\n\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8\u00ca\5\22"+
		"\n\3\u00c9\u00a6\3\2\2\2\u00c9\u00ab\3\2\2\2\u00c9\u00af\3\2\2\2\u00c9"+
		"\u00b3\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d3\3\2"+
		"\2\2\u00cb\u00cc\f\5\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00d2\5\22\n\6\u00ce"+
		"\u00cf\f\4\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d2\5\22\n\5\u00d1\u00cb\3\2"+
		"\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d3\3\2\2\2\23(+\62=?Lft\u0084"+
		"\u0086\u0099\u00a1\u00a3\u00bd\u00c9\u00d1\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
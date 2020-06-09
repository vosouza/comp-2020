package main.antlr4;
// Generated from Yuri.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YuriParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, CHAR=3, STRING=4, GLOBAL=5, PLUS=6, MINUS=7, STAR=8, DIV=9, 
		MOD=10, AND=11, OR=12, NOT=13, INIT=14, END=15, MAIN=16, IMPORT=17, OPENPAR=18, 
		CLOSEPAR=19, DOT=20, COLON=21, COMMA=22, LT=23, GT=24, EQ=25, NE=26, LE=27, 
		GE=28, IFINIT=29, IFEND=30, THEN=31, ELSE=32, WHILEINIT=33, WHILEEND=34, 
		FORINIT=35, FOREND=36, SWITCHINIT=37, SWITCHEND=38, CASE=39, DEFAULT=40, 
		DIG=41, NAME=42, LIB=43, WHITESPACE=44, NEWLINE=45, COMMENT=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'Inteiro'", "'Real'", "'Caractere'", "'Cadeia'", "'Global'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "AND", "OR", "NOT", "'Inicio'", "'Fim'", 
		"'Principal'", "'Importar'", "'('", "')'", "'.'", "':'", "','", "'<'", 
		"'>'", "'='", "'!='", "'<='", "'>='", "'Se'", "'FimSe'", "THEN", "ELSE", 
		"'Enquanto'", "'FimEnquanto'", "'Para'", "'FimPara'", "'Seja'", "'FimSeja'", 
		"'Caso'", "DEFAULT", "DIG", "NAME", "LIB", "WHITESPACE", "NEWLINE", "COMMENT"
	};
	public static final int
		RULE_include = 0, RULE_programName = 1, RULE_stmtList = 2, RULE_stmt = 3, 
		RULE_assignStmt = 4, RULE_declareStmt = 5, RULE_varType = 6, RULE_expr = 7, 
		RULE_callExpr = 8, RULE_arithExpr = 9, RULE_exprCond = 10, RULE_exprList = 11, 
		RULE_exprListEnd = 12, RULE_ifStmt = 13, RULE_elseStmt = 14, RULE_whileStmt = 15, 
		RULE_switchStmt = 16, RULE_switchBody = 17, RULE_forStmt = 18, RULE_compareSymbols = 19, 
		RULE_arithSymbols = 20;
	public static final String[] ruleNames = {
		"include", "programName", "stmtList", "stmt", "assignStmt", "declareStmt", 
		"varType", "expr", "callExpr", "arithExpr", "exprCond", "exprList", "exprListEnd", 
		"ifStmt", "elseStmt", "whileStmt", "switchStmt", "switchBody", "forStmt", 
		"compareSymbols", "arithSymbols"
	};

	@Override
	public String getGrammarFileName() { return "Yuri.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YuriParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode LIB() { return getToken(YuriParser.LIB, 0); }
		public TerminalNode LT() { return getToken(YuriParser.LT, 0); }
		public TerminalNode IMPORT() { return getToken(YuriParser.IMPORT, 0); }
		public TerminalNode GT() { return getToken(YuriParser.GT, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(IMPORT);
			setState(43); match(LT);
			setState(44); match(LIB);
			setState(45); match(GT);
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

	public static class ProgramNameContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(YuriParser.INIT, 0); }
		public TerminalNode OPENPAR() { return getToken(YuriParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(YuriParser.CLOSEPAR, 0); }
		public TerminalNode MAIN() { return getToken(YuriParser.MAIN, 0); }
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitProgramName(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(INIT);
			setState(48); match(MAIN);
			setState(49); match(OPENPAR);
			setState(50); match(CLOSEPAR);
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

	public static class StmtListContext extends ParserRuleContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitStmtList(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmtList);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case IFINIT:
			case WHILEINIT:
			case FORINIT:
			case SWITCHINIT:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); stmt();
				setState(53); stmtList();
				}
				break;
			case IFEND:
			case ELSE:
			case WHILEEND:
			case FOREND:
			case SWITCHEND:
			case CASE:
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
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

	public static class StmtContext extends ParserRuleContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(63);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); assignStmt();
				}
				break;
			case IFINIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); ifStmt();
				}
				break;
			case WHILEINIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); whileStmt();
				}
				break;
			case FORINIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(61); forStmt();
				}
				break;
			case SWITCHINIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(62); switchStmt();
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

	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(YuriParser.DOT, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(YuriParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(YuriParser.EQ, 0); }
		public TerminalNode GLOBAL() { return getToken(YuriParser.GLOBAL, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStmt);
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); varType();
				setState(66); match(NAME);
				setState(67); match(EQ);
				setState(68); expr();
				setState(69); match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); varType();
				setState(72); match(GLOBAL);
				setState(73); match(NAME);
				setState(74); match(EQ);
				setState(75); expr();
				setState(76); match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); match(NAME);
				setState(79); match(EQ);
				setState(80); expr();
				setState(81); match(DOT);
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

	public static class DeclareStmtContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(YuriParser.DOT, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(YuriParser.NAME, 0); }
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterDeclareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitDeclareStmt(this);
		}
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declareStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); varType();
			setState(86); match(NAME);
			setState(87); match(DOT);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YuriParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(YuriParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(YuriParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(YuriParser.FLOAT, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); arithExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); callExpr();
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

	public static class CallExprContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode NAME() { return getToken(YuriParser.NAME, 0); }
		public TerminalNode OPENPAR() { return getToken(YuriParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(YuriParser.CLOSEPAR, 0); }
		public CallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitCallExpr(this);
		}
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(NAME);
			setState(96); match(OPENPAR);
			setState(97); exprList();
			setState(98); match(CLOSEPAR);
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

	public static class ArithExprContext extends ParserRuleContext {
		public TerminalNode NAME(int i) {
			return getToken(YuriParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(YuriParser.NAME); }
		public ArithSymbolsContext arithSymbols() {
			return getRuleContext(ArithSymbolsContext.class,0);
		}
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitArithExpr(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithExpr);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(NAME);
				setState(101); arithSymbols();
				setState(102); arithExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(NAME);
				setState(105); arithSymbols();
				setState(106); match(NAME);
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

	public static class ExprCondContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(YuriParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprCondContext exprCond() {
			return getRuleContext(ExprCondContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPENPAR() { return getToken(YuriParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(YuriParser.CLOSEPAR, 0); }
		public TerminalNode AND() { return getToken(YuriParser.AND, 0); }
		public CompareSymbolsContext compareSymbols() {
			return getRuleContext(CompareSymbolsContext.class,0);
		}
		public TerminalNode OR() { return getToken(YuriParser.OR, 0); }
		public ExprCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterExprCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitExprCond(this);
		}
	}

	public final ExprCondContext exprCond() throws RecognitionException {
		ExprCondContext _localctx = new ExprCondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprCond);
		int _la;
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); expr();
				setState(111); compareSymbols();
				setState(112); exprCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(116);
				_la = _input.LA(1);
				if (_la==OPENPAR) {
					{
					setState(115); match(OPENPAR);
					}
				}

				setState(118); exprCond();
				setState(120);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(119); match(CLOSEPAR);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); match(NOT);
				setState(123); match(OPENPAR);
				setState(124); exprCond();
				setState(125); match(CLOSEPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); expr();
				setState(128); compareSymbols();
				setState(129); expr();
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

	public static class ExprListContext extends ParserRuleContext {
		public ExprListEndContext exprListEnd() {
			return getRuleContext(ExprListEndContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprList);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); expr();
				setState(134); exprListEnd();
				}
				break;
			case CLOSEPAR:
				enterOuterAlt(_localctx, 2);
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

	public static class ExprListEndContext extends ParserRuleContext {
		public ExprListEndContext exprListEnd() {
			return getRuleContext(ExprListEndContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(YuriParser.COMMA, 0); }
		public ExprListEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprListEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterExprListEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitExprListEnd(this);
		}
	}

	public final ExprListEndContext exprListEnd() throws RecognitionException {
		ExprListEndContext _localctx = new ExprListEndContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprListEnd);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(COMMA);
				setState(140); expr();
				setState(141); exprListEnd();
				}
				break;
			case CLOSEPAR:
				enterOuterAlt(_localctx, 2);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IFEND() { return getToken(YuriParser.IFEND, 0); }
		public TerminalNode IFINIT() { return getToken(YuriParser.IFINIT, 0); }
		public ExprCondContext exprCond() {
			return getRuleContext(ExprCondContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(YuriParser.OPENPAR, 0); }
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(YuriParser.CLOSEPAR, 0); }
		public TerminalNode THEN() { return getToken(YuriParser.THEN, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(IFINIT);
			setState(147); match(OPENPAR);
			setState(148); exprCond();
			setState(149); match(CLOSEPAR);
			setState(150); match(THEN);
			setState(151); stmtList();
			setState(152); elseStmt();
			setState(153); match(IFEND);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(YuriParser.ELSE, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitElseStmt(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(ELSE);
			setState(156); stmtList();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILEEND() { return getToken(YuriParser.WHILEEND, 0); }
		public ExprCondContext exprCond() {
			return getRuleContext(ExprCondContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(YuriParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(YuriParser.CLOSEPAR, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode WHILEINIT() { return getToken(YuriParser.WHILEINIT, 0); }
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(WHILEINIT);
			setState(159); match(OPENPAR);
			setState(160); exprCond();
			setState(161); match(CLOSEPAR);
			setState(162); stmtList();
			setState(163); match(WHILEEND);
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

	public static class SwitchStmtContext extends ParserRuleContext {
		public TerminalNode OPENPAR() { return getToken(YuriParser.OPENPAR, 0); }
		public TerminalNode SWITCHINIT() { return getToken(YuriParser.SWITCHINIT, 0); }
		public TerminalNode CLOSEPAR() { return getToken(YuriParser.CLOSEPAR, 0); }
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public TerminalNode SWITCHEND() { return getToken(YuriParser.SWITCHEND, 0); }
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitSwitchStmt(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(SWITCHINIT);
			setState(166); match(OPENPAR);
			setState(167); assignStmt();
			setState(168); match(CLOSEPAR);
			setState(169); switchBody();
			setState(170); match(SWITCHEND);
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

	public static class SwitchBodyContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(YuriParser.CASE, 0); }
		public ExprCondContext exprCond() {
			return getRuleContext(ExprCondContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YuriParser.COLON, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(YuriParser.DEFAULT, 0); }
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitSwitchBody(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchBody);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(CASE);
				setState(173); exprCond();
				setState(174); match(COLON);
				setState(175); stmtList();
				setState(176); switchBody();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); match(DEFAULT);
				setState(179); match(COLON);
				setState(180); stmtList();
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FORINIT() { return getToken(YuriParser.FORINIT, 0); }
		public ExprCondContext exprCond() {
			return getRuleContext(ExprCondContext.class,0);
		}
		public TerminalNode FOREND() { return getToken(YuriParser.FOREND, 0); }
		public TerminalNode OPENPAR() { return getToken(YuriParser.OPENPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(YuriParser.COMMA); }
		public TerminalNode CLOSEPAR() { return getToken(YuriParser.CLOSEPAR, 0); }
		public TerminalNode DIG() { return getToken(YuriParser.DIG, 0); }
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(YuriParser.COMMA, i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(FORINIT);
			setState(184); match(OPENPAR);
			setState(185); assignStmt();
			setState(186); match(COMMA);
			setState(187); exprCond();
			setState(188); match(COMMA);
			setState(189); match(DIG);
			setState(190); match(CLOSEPAR);
			setState(191); stmtList();
			setState(192); match(FOREND);
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

	public static class CompareSymbolsContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(YuriParser.GE, 0); }
		public TerminalNode LT() { return getToken(YuriParser.LT, 0); }
		public TerminalNode GT() { return getToken(YuriParser.GT, 0); }
		public TerminalNode LE() { return getToken(YuriParser.LE, 0); }
		public TerminalNode EQ() { return getToken(YuriParser.EQ, 0); }
		public TerminalNode NE() { return getToken(YuriParser.NE, 0); }
		public CompareSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterCompareSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitCompareSymbols(this);
		}
	}

	public final CompareSymbolsContext compareSymbols() throws RecognitionException {
		CompareSymbolsContext _localctx = new CompareSymbolsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compareSymbols);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(GT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); match(EQ);
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 4);
				{
				setState(197); match(NE);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(198); match(LE);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
				setState(199); match(GE);
				}
				break;
			case AND:
			case OR:
			case NOT:
			case NAME:
				enterOuterAlt(_localctx, 7);
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

	public static class ArithSymbolsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(YuriParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(YuriParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(YuriParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(YuriParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(YuriParser.DIV, 0); }
		public ArithSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).enterArithSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YuriListener ) ((YuriListener)listener).exitArithSymbols(this);
		}
	}

	public final ArithSymbolsContext arithSymbols() throws RecognitionException {
		ArithSymbolsContext _localctx = new ArithSymbolsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arithSymbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"V\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fw\n\f\3\f\3\f\5\f{\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0086"+
		"\n\f\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0093"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b8\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00cc\n\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\5\3\2\3\6\3\2\r\16\3\2\b\f\u00d1\2,\3\2\2\2\4\61"+
		"\3\2\2\2\6:\3\2\2\2\bA\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16[\3\2\2\2\20_\3"+
		"\2\2\2\22a\3\2\2\2\24n\3\2\2\2\26\u0085\3\2\2\2\30\u008b\3\2\2\2\32\u0092"+
		"\3\2\2\2\34\u0094\3\2\2\2\36\u009d\3\2\2\2 \u00a0\3\2\2\2\"\u00a7\3\2"+
		"\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00cb\3\2\2\2*\u00cd\3\2\2\2,-\7\23"+
		"\2\2-.\7\31\2\2./\7-\2\2/\60\7\32\2\2\60\3\3\2\2\2\61\62\7\20\2\2\62\63"+
		"\7\22\2\2\63\64\7\24\2\2\64\65\7\25\2\2\65\5\3\2\2\2\66\67\5\b\5\2\67"+
		"8\5\6\4\28;\3\2\2\29;\3\2\2\2:\66\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<B\5\n\6"+
		"\2=B\5\34\17\2>B\5 \21\2?B\5&\24\2@B\5\"\22\2A<\3\2\2\2A=\3\2\2\2A>\3"+
		"\2\2\2A?\3\2\2\2A@\3\2\2\2B\t\3\2\2\2CD\5\16\b\2DE\7,\2\2EF\7\33\2\2F"+
		"G\5\20\t\2GH\7\26\2\2HV\3\2\2\2IJ\5\16\b\2JK\7\7\2\2KL\7,\2\2LM\7\33\2"+
		"\2MN\5\20\t\2NO\7\26\2\2OV\3\2\2\2PQ\7,\2\2QR\7\33\2\2RS\5\20\t\2ST\7"+
		"\26\2\2TV\3\2\2\2UC\3\2\2\2UI\3\2\2\2UP\3\2\2\2V\13\3\2\2\2WX\5\16\b\2"+
		"XY\7,\2\2YZ\7\26\2\2Z\r\3\2\2\2[\\\t\2\2\2\\\17\3\2\2\2]`\5\24\13\2^`"+
		"\5\22\n\2_]\3\2\2\2_^\3\2\2\2`\21\3\2\2\2ab\7,\2\2bc\7\24\2\2cd\5\30\r"+
		"\2de\7\25\2\2e\23\3\2\2\2fg\7,\2\2gh\5*\26\2hi\5\24\13\2io\3\2\2\2jk\7"+
		",\2\2kl\5*\26\2lm\7,\2\2mo\3\2\2\2nf\3\2\2\2nj\3\2\2\2o\25\3\2\2\2pq\5"+
		"\20\t\2qr\5(\25\2rs\5\26\f\2s\u0086\3\2\2\2tv\t\3\2\2uw\7\24\2\2vu\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xz\5\26\f\2y{\7\25\2\2zy\3\2\2\2z{\3\2\2\2{\u0086"+
		"\3\2\2\2|}\7\17\2\2}~\7\24\2\2~\177\5\26\f\2\177\u0080\7\25\2\2\u0080"+
		"\u0086\3\2\2\2\u0081\u0082\5\20\t\2\u0082\u0083\5(\25\2\u0083\u0084\5"+
		"\20\t\2\u0084\u0086\3\2\2\2\u0085p\3\2\2\2\u0085t\3\2\2\2\u0085|\3\2\2"+
		"\2\u0085\u0081\3\2\2\2\u0086\27\3\2\2\2\u0087\u0088\5\20\t\2\u0088\u0089"+
		"\5\32\16\2\u0089\u008c\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\31\3\2\2\2\u008d\u008e\7\30\2\2\u008e\u008f"+
		"\5\20\t\2\u008f\u0090\5\32\16\2\u0090\u0093\3\2\2\2\u0091\u0093\3\2\2"+
		"\2\u0092\u008d\3\2\2\2\u0092\u0091\3\2\2\2\u0093\33\3\2\2\2\u0094\u0095"+
		"\7\37\2\2\u0095\u0096\7\24\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7\25\2"+
		"\2\u0098\u0099\7!\2\2\u0099\u009a\5\6\4\2\u009a\u009b\5\36\20\2\u009b"+
		"\u009c\7 \2\2\u009c\35\3\2\2\2\u009d\u009e\7\"\2\2\u009e\u009f\5\6\4\2"+
		"\u009f\37\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3"+
		"\5\26\f\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\5\6\4\2\u00a5\u00a6\7$\2\2"+
		"\u00a6!\3\2\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5"+
		"\n\6\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5$\23\2\u00ac\u00ad\7(\2\2\u00ad"+
		"#\3\2\2\2\u00ae\u00af\7)\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\27\2\2"+
		"\u00b1\u00b2\5\6\4\2\u00b2\u00b3\5$\23\2\u00b3\u00b8\3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b8\5\6\4\2\u00b7\u00ae\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7%\2\2\u00ba\u00bb\7\24\2\2"+
		"\u00bb\u00bc\5\n\6\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf"+
		"\7\30\2\2\u00bf\u00c0\7+\2\2\u00c0\u00c1\7\25\2\2\u00c1\u00c2\5\6\4\2"+
		"\u00c2\u00c3\7&\2\2\u00c3\'\3\2\2\2\u00c4\u00cc\7\31\2\2\u00c5\u00cc\7"+
		"\32\2\2\u00c6\u00cc\7\33\2\2\u00c7\u00cc\7\34\2\2\u00c8\u00cc\7\35\2\2"+
		"\u00c9\u00cc\7\36\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c5"+
		"\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00ce\t\4\2\2"+
		"\u00ce+\3\2\2\2\16:AU_nvz\u0085\u008b\u0092\u00b7\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
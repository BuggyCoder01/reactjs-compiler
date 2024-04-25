// Generated from C:/Users/AbdRrhmanLegiom/IdeaProjects/Project_Compiler/src/Antlr/reactParser.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class reactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACE=1, CLOSE_BRACE=2, OPEN_PAREN=3, CLOSE_PAREN=4, OPEN_BRACKET=5, 
		CLOSE_BRACKET=6, COMMA=7, SEMICOLON=8, DOT=9, COLON=10, QUOTE=11, EQUAL=12, 
		BACK_SLASH=13, ARROW=14, OPENTAG=15, CLOSETAG=16, SLASH=17, OPERATOR=18, 
		DOLLAR=19, LOGICAL_AND=20, CLASS=21, FUNCTION=22, IMPORT=23, FROM=24, 
		EXPORT=25, IF=26, ELSE=27, FOR=28, WHILE=29, DO=30, SWITCH=31, CASE=32, 
		DEFAULT=33, RETURN=34, BREAK=35, CONTINUE=36, TRUE=37, FALSE=38, NULLL=39, 
		UNDEFINED=40, CONST=41, LET=42, VAR=43, HTTPS=44, DIV=45, SPAN=46, A=47, 
		PARAG=48, HEAD2=49, CLASSNAME=50, KEY=51, IMG=52, SRC=53, ALT=54, BUTTON=55, 
		ONCLICK=56, SHOWDETAILS=57, IDENTIFIER=58, DECIMAL_INTEGER_LITERAL=59, 
		HEX_INTEGER_LITERAL=60, OCTAL_INTEGER_LITERAL=61, BINARY_INTEGER_LITERAL=62, 
		FLOAT_LITERAL=63, STRING_LITERAL=64, TEMPLATE_LITERAL=65, LINE_COMMENT=66, 
		BLOCK_COMMENT=67, WS=68;
	public static final int
		RULE_start_compiler = 0, RULE_react_import = 1, RULE_products = 2, RULE_name = 3, 
		RULE_description = 4, RULE_image = 5, RULE_main_component = 6, RULE_body = 7, 
		RULE_equaletion = 8, RULE_equal1 = 9, RULE_equal2 = 10, RULE_function_call = 11, 
		RULE_function = 12, RULE_parameterList = 13, RULE_parameter = 14, RULE_function_body = 15, 
		RULE_statement = 16, RULE_exprStmt = 17, RULE_returnStmt = 18, RULE_expression = 19, 
		RULE_args = 20, RULE_operator = 21, RULE_ifStmt = 22, RULE_block = 23, 
		RULE_branch_component1 = 24, RULE_return = 25, RULE_jsxElement = 26, RULE_jsxSelfClosing = 27, 
		RULE_closeingt = 28, RULE_jsxElementChildren = 29, RULE_jsx11 = 30, RULE_aninnumos_function = 31, 
		RULE_jsxElementName = 32, RULE_jsxElementevents = 33, RULE_jsxAttributes = 34, 
		RULE_jsxAttribute = 35, RULE_sss = 36, RULE_exportation = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_compiler", "react_import", "products", "name", "description", 
			"image", "main_component", "body", "equaletion", "equal1", "equal2", 
			"function_call", "function", "parameterList", "parameter", "function_body", 
			"statement", "exprStmt", "returnStmt", "expression", "args", "operator", 
			"ifStmt", "block", "branch_component1", "return", "jsxElement", "jsxSelfClosing", 
			"closeingt", "jsxElementChildren", "jsx11", "aninnumos_function", "jsxElementName", 
			"jsxElementevents", "jsxAttributes", "jsxAttribute", "sss", "exportation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'['", "']'", "','", "';'", "'.'", 
			"':'", "'''", "'='", "'\\'", "'=>'", "'<'", "'>'", "'/'", null, "'$'", 
			"'&'", "'class'", "'function'", "'import'", "'from'", "'export'", "'if'", 
			"'else'", "'for'", "'while'", "'do'", "'switch'", "'case'", "'default'", 
			"'return'", "'break'", "'continue'", "'true'", "'false'", "'nulll'", 
			"'undefined'", "'const'", "'let'", "'var'", "'https'", "'div'", "'span'", 
			"'a'", "'p'", "'h2'", "'className'", "'key'", "'img'", "'src'", "'alt'", 
			"'button'", "'onClick'", "'Show Details'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "COMMA", "SEMICOLON", "DOT", "COLON", "QUOTE", "EQUAL", 
			"BACK_SLASH", "ARROW", "OPENTAG", "CLOSETAG", "SLASH", "OPERATOR", "DOLLAR", 
			"LOGICAL_AND", "CLASS", "FUNCTION", "IMPORT", "FROM", "EXPORT", "IF", 
			"ELSE", "FOR", "WHILE", "DO", "SWITCH", "CASE", "DEFAULT", "RETURN", 
			"BREAK", "CONTINUE", "TRUE", "FALSE", "NULLL", "UNDEFINED", "CONST", 
			"LET", "VAR", "HTTPS", "DIV", "SPAN", "A", "PARAG", "HEAD2", "CLASSNAME", 
			"KEY", "IMG", "SRC", "ALT", "BUTTON", "ONCLICK", "SHOWDETAILS", "IDENTIFIER", 
			"DECIMAL_INTEGER_LITERAL", "HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", 
			"BINARY_INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "TEMPLATE_LITERAL", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "reactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public reactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_compilerContext extends ParserRuleContext {
		public Main_componentContext main_component() {
			return getRuleContext(Main_componentContext.class,0);
		}
		public ExportationContext exportation() {
			return getRuleContext(ExportationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(reactParser.EOF, 0); }
		public List<React_importContext> react_import() {
			return getRuleContexts(React_importContext.class);
		}
		public React_importContext react_import(int i) {
			return getRuleContext(React_importContext.class,i);
		}
		public List<ProductsContext> products() {
			return getRuleContexts(ProductsContext.class);
		}
		public ProductsContext products(int i) {
			return getRuleContext(ProductsContext.class,i);
		}
		public Start_compilerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_compiler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterStart_compiler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitStart_compiler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitStart_compiler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_compilerContext start_compiler() throws RecognitionException {
		Start_compilerContext _localctx = new Start_compilerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_compiler);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(76);
				react_import();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82);
					products();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(87);
			main_component();
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPORT:
				{
				setState(88);
				exportation();
				}
				break;
			case EOF:
				{
				setState(89);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class React_importContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(reactParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public TerminalNode COMMA() { return getToken(reactParser.COMMA, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(reactParser.FROM, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(reactParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(reactParser.QUOTE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public React_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_react_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterReact_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitReact_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitReact_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final React_importContext react_import() throws RecognitionException {
		React_importContext _localctx = new React_importContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_react_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IMPORT);
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(COMMA);
			setState(95);
			match(OPEN_BRACE);
			setState(96);
			match(IDENTIFIER);
			setState(97);
			match(CLOSE_BRACE);
			setState(98);
			match(FROM);
			setState(99);
			match(QUOTE);
			setState(100);
			match(IDENTIFIER);
			setState(101);
			match(QUOTE);
			setState(102);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProductsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(reactParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(reactParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(reactParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(reactParser.OPEN_BRACE, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(reactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(reactParser.COMMA, i);
		}
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public List<ImageContext> image() {
			return getRuleContexts(ImageContext.class);
		}
		public ImageContext image(int i) {
			return getRuleContext(ImageContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(reactParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(reactParser.CLOSE_BRACE, i);
		}
		public TerminalNode CONST() { return getToken(reactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(reactParser.LET, 0); }
		public TerminalNode VAR() { return getToken(reactParser.VAR, 0); }
		public ProductsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_products; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterProducts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitProducts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitProducts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductsContext products() throws RecognitionException {
		ProductsContext _localctx = new ProductsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_products);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) {
				{
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(107);
			match(IDENTIFIER);
			setState(108);
			match(EQUAL);
			setState(109);
			match(OPEN_BRACKET);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				match(OPEN_BRACE);
				setState(111);
				name();
				setState(112);
				match(COMMA);
				setState(113);
				description();
				setState(114);
				match(COMMA);
				setState(115);
				image();
				setState(116);
				match(COMMA);
				setState(117);
				match(CLOSE_BRACE);
				setState(118);
				match(COMMA);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACE );
			setState(124);
			match(CLOSE_BRACKET);
			setState(125);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(reactParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(reactParser.STRING_LITERAL, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(COLON);
			setState(129);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(reactParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(reactParser.STRING_LITERAL, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(COLON);
			setState(133);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(reactParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(reactParser.STRING_LITERAL, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENTIFIER);
			setState(136);
			match(COLON);
			setState(137);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Main_componentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(reactParser.ARROW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(reactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(reactParser.LET, 0); }
		public TerminalNode VAR() { return getToken(reactParser.VAR, 0); }
		public Main_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterMain_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitMain_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitMain_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_componentContext main_component() throws RecognitionException {
		Main_componentContext _localctx = new Main_componentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) {
				{
				setState(139);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(EQUAL);
			setState(144);
			match(OPEN_PAREN);
			setState(145);
			match(CLOSE_PAREN);
			setState(146);
			match(ARROW);
			setState(147);
			match(OPEN_BRACE);
			setState(148);
			body();
			setState(149);
			return_();
			setState(150);
			match(CLOSE_BRACE);
			setState(151);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public EqualetionContext equaletion() {
			return getRuleContext(EqualetionContext.class,0);
		}
		public Branch_component1Context branch_component1() {
			return getRuleContext(Branch_component1Context.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			equaletion();
			setState(154);
			branch_component1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualetionContext extends ParserRuleContext {
		public Equal1Context equal1() {
			return getRuleContext(Equal1Context.class,0);
		}
		public Equal2Context equal2() {
			return getRuleContext(Equal2Context.class,0);
		}
		public EqualetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equaletion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterEqualetion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitEqualetion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitEqualetion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualetionContext equaletion() throws RecognitionException {
		EqualetionContext _localctx = new EqualetionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_equaletion);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				equal1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				equal2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Equal1Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(reactParser.STRING_LITERAL, 0); }
		public TerminalNode DECIMAL_INTEGER_LITERAL() { return getToken(reactParser.DECIMAL_INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(reactParser.FLOAT_LITERAL, 0); }
		public List<TerminalNode> CONST() { return getTokens(reactParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(reactParser.CONST, i);
		}
		public List<TerminalNode> LET() { return getTokens(reactParser.LET); }
		public TerminalNode LET(int i) {
			return getToken(reactParser.LET, i);
		}
		public List<TerminalNode> VAR() { return getTokens(reactParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(reactParser.VAR, i);
		}
		public Equal1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterEqual1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitEqual1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitEqual1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal1Context equal1() throws RecognitionException {
		Equal1Context _localctx = new Equal1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_equal1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0) );
			setState(165);
			match(IDENTIFIER);
			setState(166);
			match(EQUAL);
			setState(167);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 49L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Equal2Context extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(reactParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public TerminalNode COMMA() { return getToken(reactParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(reactParser.CLOSE_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public List<TerminalNode> CONST() { return getTokens(reactParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(reactParser.CONST, i);
		}
		public List<TerminalNode> LET() { return getTokens(reactParser.LET); }
		public TerminalNode LET(int i) {
			return getToken(reactParser.LET, i);
		}
		public List<TerminalNode> VAR() { return getTokens(reactParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(reactParser.VAR, i);
		}
		public Equal2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterEqual2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitEqual2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitEqual2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal2Context equal2() throws RecognitionException {
		Equal2Context _localctx = new Equal2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_equal2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0) );
			setState(175);
			match(OPEN_BRACKET);
			setState(176);
			match(IDENTIFIER);
			setState(177);
			match(COMMA);
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(CLOSE_BRACKET);
			setState(180);
			match(EQUAL);
			setState(181);
			function_call();
			setState(182);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(OPEN_PAREN);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691678210949120L) != 0)) {
				{
				setState(186);
				parameterList();
				}
			}

			setState(189);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(reactParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FUNCTION);
			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(OPEN_PAREN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691678210949120L) != 0)) {
				{
				setState(194);
				parameterList();
				}
			}

			setState(197);
			match(CLOSE_PAREN);
			setState(198);
			match(OPEN_BRACE);
			setState(199);
			function_body();
			setState(200);
			match(CLOSE_BRACE);
			setState(201);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(reactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(reactParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			parameter();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(205);
				parameter();
				}
				}
				setState(210);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentefierParameterContext extends ParameterContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public IdentefierParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterIdentefierParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitIdentefierParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitIdentefierParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullParameterContext extends ParameterContext {
		public TerminalNode NULLL() { return getToken(reactParser.NULLL, 0); }
		public NullParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterNullParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitNullParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitNullParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecemalParameterContext extends ParameterContext {
		public TerminalNode DECIMAL_INTEGER_LITERAL() { return getToken(reactParser.DECIMAL_INTEGER_LITERAL, 0); }
		public DecemalParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterDecemalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitDecemalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitDecemalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentefierParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(IDENTIFIER);
				}
				break;
			case NULLL:
				_localctx = new NullParameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(NULLL);
				}
				break;
			case DECIMAL_INTEGER_LITERAL:
				_localctx = new DecemalParameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(DECIMAL_INTEGER_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691695457927170L) != 0)) {
				{
				{
				setState(216);
				statement();
				}
				}
				setState(221);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLL:
			case IDENTIFIER:
			case DECIMAL_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				exprStmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				returnStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				ifStmt();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expression(0);
			setState(229);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(reactParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(RETURN);
			setState(232);
			expression(0);
			setState(233);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDENTIFIER_expressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public IDENTIFIER_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterIDENTIFIER_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitIDENTIFIER_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitIDENTIFIER_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ARGS_expressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public ARGS_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterARGS_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitARGS_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitARGS_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Null_expressionContext extends ExpressionContext {
		public TerminalNode NULLL() { return getToken(reactParser.NULLL, 0); }
		public Null_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterNull_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitNull_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitNull_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OPERATOR_expressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OPERATOR_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterOPERATOR_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitOPERATOR_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitOPERATOR_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DECIMAL_expressionContext extends ExpressionContext {
		public TerminalNode DECIMAL_INTEGER_LITERAL() { return getToken(reactParser.DECIMAL_INTEGER_LITERAL, 0); }
		public DECIMAL_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterDECIMAL_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitDECIMAL_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitDECIMAL_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new IDENTIFIER_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(236);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new DECIMAL_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(DECIMAL_INTEGER_LITERAL);
				}
				break;
			case 3:
				{
				_localctx = new Null_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(NULLL);
				}
				break;
			case 4:
				{
				_localctx = new ARGS_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(IDENTIFIER);
				setState(240);
				match(OPEN_PAREN);
				setState(241);
				args();
				setState(242);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OPERATOR_expressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(246);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(247);
					operator();
					setState(248);
					expression(3);
					}
					} 
				}
				setState(254);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(reactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(reactParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expression(0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				expression(0);
				}
				}
				setState(262);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(reactParser.OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(OPERATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(reactParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(reactParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IF);
			setState(266);
			match(OPEN_PAREN);
			setState(267);
			expression(0);
			setState(268);
			match(CLOSE_PAREN);
			setState(269);
			statement();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(270);
				match(ELSE);
				setState(271);
				statement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(OPEN_BRACE);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691695457927170L) != 0)) {
				{
				{
				setState(275);
				statement();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Branch_component1Context extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Branch_component1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_component1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterBranch_component1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitBranch_component1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitBranch_component1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_component1Context branch_component1() throws RecognitionException {
		Branch_component1Context _localctx = new Branch_component1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_branch_component1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(283);
				function();
				}
				}
				setState(286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(reactParser.RETURN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(RETURN);
			setState(289);
			match(OPEN_PAREN);
			setState(290);
			jsxElement();
			setState(291);
			match(CLOSE_PAREN);
			setState(292);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public List<JsxSelfClosingContext> jsxSelfClosing() {
			return getRuleContexts(JsxSelfClosingContext.class);
		}
		public JsxSelfClosingContext jsxSelfClosing(int i) {
			return getRuleContext(JsxSelfClosingContext.class,i);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jsxElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				jsxSelfClosing();
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPENTAG );
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSelfClosingContext extends ParserRuleContext {
		public TerminalNode OPENTAG() { return getToken(reactParser.OPENTAG, 0); }
		public JsxElementNameContext jsxElementName() {
			return getRuleContext(JsxElementNameContext.class,0);
		}
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(reactParser.SLASH, 0); }
		public TerminalNode CLOSETAG() { return getToken(reactParser.CLOSETAG, 0); }
		public List<JsxSelfClosingContext> jsxSelfClosing() {
			return getRuleContexts(JsxSelfClosingContext.class);
		}
		public JsxSelfClosingContext jsxSelfClosing(int i) {
			return getRuleContext(JsxSelfClosingContext.class,i);
		}
		public CloseingtContext closeingt() {
			return getRuleContext(CloseingtContext.class,0);
		}
		public JsxElementChildrenContext jsxElementChildren() {
			return getRuleContext(JsxElementChildrenContext.class,0);
		}
		public JsxSelfClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSelfClosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterJsxSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitJsxSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitJsxSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSelfClosingContext jsxSelfClosing() throws RecognitionException {
		JsxSelfClosingContext _localctx = new JsxSelfClosingContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jsxSelfClosing);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(OPENTAG);
			setState(300);
			jsxElementName();
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(301);
				jsxAttributes();
				}
				break;
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(304);
				match(SLASH);
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSETAG) {
				{
				setState(307);
				match(CLOSETAG);
				}
			}

			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(310);
				jsxElementChildren();
				}
			}

			}
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					jsxSelfClosing();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(319);
				closeingt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseingtContext extends ParserRuleContext {
		public TerminalNode OPENTAG() { return getToken(reactParser.OPENTAG, 0); }
		public TerminalNode SLASH() { return getToken(reactParser.SLASH, 0); }
		public JsxElementNameContext jsxElementName() {
			return getRuleContext(JsxElementNameContext.class,0);
		}
		public TerminalNode CLOSETAG() { return getToken(reactParser.CLOSETAG, 0); }
		public CloseingtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeingt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterCloseingt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitCloseingt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitCloseingt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseingtContext closeingt() throws RecognitionException {
		CloseingtContext _localctx = new CloseingtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_closeingt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(OPENTAG);
			setState(323);
			match(SLASH);
			setState(324);
			jsxElementName();
			setState(325);
			match(CLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementChildrenContext extends ParserRuleContext {
		public List<Jsx11Context> jsx11() {
			return getRuleContexts(Jsx11Context.class);
		}
		public Jsx11Context jsx11(int i) {
			return getRuleContext(Jsx11Context.class,i);
		}
		public List<SssContext> sss() {
			return getRuleContexts(SssContext.class);
		}
		public SssContext sss(int i) {
			return getRuleContext(SssContext.class,i);
		}
		public JsxElementChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementChildren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterJsxElementChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitJsxElementChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitJsxElementChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementChildrenContext jsxElementChildren() throws RecognitionException {
		JsxElementChildrenContext _localctx = new JsxElementChildrenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jsxElementChildren);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					jsx11();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				sss();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jsx11Context extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(reactParser.DOT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public Aninnumos_functionContext aninnumos_function() {
			return getRuleContext(Aninnumos_functionContext.class,0);
		}
		public Jsx11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterJsx11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitJsx11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitJsx11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jsx11Context jsx11() throws RecognitionException {
		Jsx11Context _localctx = new Jsx11Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_jsx11);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(OPEN_BRACE);
			setState(339);
			match(IDENTIFIER);
			setState(340);
			match(DOT);
			setState(341);
			match(IDENTIFIER);
			setState(342);
			match(OPEN_PAREN);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(343);
				aninnumos_function();
				}
			}

			setState(346);
			match(CLOSE_PAREN);
			setState(347);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aninnumos_functionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(reactParser.ARROW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Aninnumos_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aninnumos_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterAninnumos_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitAninnumos_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitAninnumos_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aninnumos_functionContext aninnumos_function() throws RecognitionException {
		Aninnumos_functionContext _localctx = new Aninnumos_functionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_aninnumos_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPEN_PAREN);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691678210949120L) != 0)) {
				{
				setState(350);
				parameterList();
				}
			}

			}
			setState(353);
			match(CLOSE_PAREN);
			setState(354);
			match(ARROW);
			setState(355);
			match(OPEN_BRACE);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENTAG) {
				{
				setState(356);
				jsxElement();
				}
			}

			}
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(359);
				function_call();
				}
			}

			}
			setState(362);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementNameContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(reactParser.DIV, 0); }
		public TerminalNode SPAN() { return getToken(reactParser.SPAN, 0); }
		public TerminalNode A() { return getToken(reactParser.A, 0); }
		public TerminalNode HEAD2() { return getToken(reactParser.HEAD2, 0); }
		public TerminalNode PARAG() { return getToken(reactParser.PARAG, 0); }
		public TerminalNode IMG() { return getToken(reactParser.IMG, 0); }
		public TerminalNode BUTTON() { return getToken(reactParser.BUTTON, 0); }
		public JsxElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterJsxElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitJsxElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitJsxElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementNameContext jsxElementName() throws RecognitionException {
		JsxElementNameContext _localctx = new JsxElementNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jsxElementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 41623112181088256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementeventsContext extends ParserRuleContext {
		public TerminalNode ONCLICK() { return getToken(reactParser.ONCLICK, 0); }
		public JsxElementeventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementevents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterJsxElementevents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitJsxElementevents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitJsxElementevents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementeventsContext jsxElementevents() throws RecognitionException {
		JsxElementeventsContext _localctx = new JsxElementeventsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jsxElementevents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONCLICK) {
				{
				setState(366);
				match(ONCLICK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributesContext extends ParserRuleContext {
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public JsxAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterJsxAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitJsxAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitJsxAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributesContext jsxAttributes() throws RecognitionException {
		JsxAttributesContext _localctx = new JsxAttributesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_jsxAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					jsxAttribute(0);
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeContext extends ParserRuleContext {
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
	 
		public JsxAttributeContext() { }
		public void copyFrom(JsxAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ATRIBUTE_keyContext extends JsxAttributeContext {
		public JsxAttributeContext jsxAttribute() {
			return getRuleContext(JsxAttributeContext.class,0);
		}
		public TerminalNode KEY() { return getToken(reactParser.KEY, 0); }
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(reactParser.DOT, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public ATRIBUTE_keyContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterATRIBUTE_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitATRIBUTE_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitATRIBUTE_key(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FUNC_ELEMNTContext extends JsxAttributeContext {
		public JsxAttributeContext jsxAttribute() {
			return getRuleContext(JsxAttributeContext.class,0);
		}
		public JsxElementeventsContext jsxElementevents() {
			return getRuleContext(JsxElementeventsContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public TerminalNode CLOSETAG() { return getToken(reactParser.CLOSETAG, 0); }
		public TerminalNode SHOWDETAILS() { return getToken(reactParser.SHOWDETAILS, 0); }
		public Aninnumos_functionContext aninnumos_function() {
			return getRuleContext(Aninnumos_functionContext.class,0);
		}
		public FUNC_ELEMNTContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterFUNC_ELEMNT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitFUNC_ELEMNT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitFUNC_ELEMNT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ATRIBUTE_CLASSContext extends JsxAttributeContext {
		public TerminalNode CLASSNAME() { return getToken(reactParser.CLASSNAME, 0); }
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(reactParser.STRING_LITERAL, 0); }
		public ATRIBUTE_CLASSContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterATRIBUTE_CLASS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitATRIBUTE_CLASS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitATRIBUTE_CLASS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ELEMENTContext extends JsxAttributeContext {
		public TerminalNode OPENTAG() { return getToken(reactParser.OPENTAG, 0); }
		public TerminalNode SLASH() { return getToken(reactParser.SLASH, 0); }
		public JsxElementNameContext jsxElementName() {
			return getRuleContext(JsxElementNameContext.class,0);
		}
		public List<TerminalNode> CLOSETAG() { return getTokens(reactParser.CLOSETAG); }
		public TerminalNode CLOSETAG(int i) {
			return getToken(reactParser.CLOSETAG, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(reactParser.DOT, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public TerminalNode COLON() { return getToken(reactParser.COLON, 0); }
		public TerminalNode DOLLAR() { return getToken(reactParser.DOLLAR, 0); }
		public ELEMENTContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterELEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitELEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitELEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LOGICAL_ELMNTContext extends JsxAttributeContext {
		public JsxAttributeContext jsxAttribute() {
			return getRuleContext(JsxAttributeContext.class,0);
		}
		public JsxElementeventsContext jsxElementevents() {
			return getRuleContext(JsxElementeventsContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(reactParser.EQUAL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public TerminalNode CLOSETAG() { return getToken(reactParser.CLOSETAG, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(reactParser.LOGICAL_AND, 0); }
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public LOGICAL_ELMNTContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterLOGICAL_ELMNT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitLOGICAL_ELMNT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitLOGICAL_ELMNT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ATRIBUTE_IMGContext extends JsxAttributeContext {
		public TerminalNode SRC() { return getToken(reactParser.SRC, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(reactParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(reactParser.EQUAL, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(reactParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(reactParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(reactParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(reactParser.DOT, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(reactParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(reactParser.CLOSE_BRACE, i);
		}
		public TerminalNode ALT() { return getToken(reactParser.ALT, 0); }
		public ATRIBUTE_IMGContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterATRIBUTE_IMG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitATRIBUTE_IMG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitATRIBUTE_IMG(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ATRIBUTE_DOLLARContext extends JsxAttributeContext {
		public JsxAttributeContext jsxAttribute() {
			return getRuleContext(JsxAttributeContext.class,0);
		}
		public TerminalNode OPENTAG() { return getToken(reactParser.OPENTAG, 0); }
		public TerminalNode SLASH() { return getToken(reactParser.SLASH, 0); }
		public JsxElementNameContext jsxElementName() {
			return getRuleContext(JsxElementNameContext.class,0);
		}
		public List<TerminalNode> CLOSETAG() { return getTokens(reactParser.CLOSETAG); }
		public TerminalNode CLOSETAG(int i) {
			return getToken(reactParser.CLOSETAG, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(reactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(reactParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(reactParser.DOT, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public TerminalNode COLON() { return getToken(reactParser.COLON, 0); }
		public TerminalNode DOLLAR() { return getToken(reactParser.DOLLAR, 0); }
		public ATRIBUTE_DOLLARContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterATRIBUTE_DOLLAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitATRIBUTE_DOLLAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitATRIBUTE_DOLLAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		return jsxAttribute(0);
	}

	private JsxAttributeContext jsxAttribute(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, _parentState);
		JsxAttributeContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_jsxAttribute, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASSNAME:
				{
				_localctx = new ATRIBUTE_CLASSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(376);
				match(CLASSNAME);
				setState(377);
				match(EQUAL);
				setState(378);
				match(STRING_LITERAL);
				}
				}
				break;
			case SRC:
				{
				_localctx = new ATRIBUTE_IMGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(379);
				match(SRC);
				setState(380);
				match(EQUAL);
				setState(381);
				match(OPEN_BRACE);
				setState(382);
				match(IDENTIFIER);
				setState(383);
				match(DOT);
				setState(384);
				match(IDENTIFIER);
				setState(385);
				match(CLOSE_BRACE);
				setState(386);
				match(ALT);
				setState(387);
				match(EQUAL);
				setState(388);
				match(OPEN_BRACE);
				setState(389);
				match(IDENTIFIER);
				setState(390);
				match(DOT);
				setState(391);
				match(IDENTIFIER);
				setState(392);
				match(CLOSE_BRACE);
				}
				}
				break;
			case OPEN_BRACE:
			case COLON:
			case CLOSETAG:
			case DOLLAR:
			case IDENTIFIER:
				{
				_localctx = new ELEMENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSETAG) {
					{
					setState(393);
					match(CLOSETAG);
					}
				}

				{
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(396);
					match(IDENTIFIER);
					}
				}

				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(399);
					match(COLON);
					}
				}

				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(402);
					match(DOLLAR);
					}
				}

				setState(405);
				match(OPEN_BRACE);
				setState(406);
				match(IDENTIFIER);
				setState(407);
				match(DOT);
				setState(408);
				match(IDENTIFIER);
				setState(409);
				match(CLOSE_BRACE);
				}
				setState(411);
				match(OPENTAG);
				setState(412);
				match(SLASH);
				setState(413);
				jsxElementName();
				setState(414);
				match(CLOSETAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new ATRIBUTE_keyContext(new JsxAttributeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jsxAttribute);
						setState(418);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(419);
						match(KEY);
						setState(420);
						match(EQUAL);
						setState(421);
						match(OPEN_BRACE);
						setState(422);
						match(IDENTIFIER);
						setState(423);
						match(DOT);
						setState(424);
						match(IDENTIFIER);
						setState(425);
						match(CLOSE_BRACE);
						}
						}
						break;
					case 2:
						{
						_localctx = new ATRIBUTE_DOLLARContext(new JsxAttributeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jsxAttribute);
						setState(426);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(428);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CLOSETAG) {
							{
							setState(427);
							match(CLOSETAG);
							}
						}

						{
						setState(431);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(430);
							match(IDENTIFIER);
							}
						}

						setState(434);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(433);
							match(COLON);
							}
						}

						setState(437);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOLLAR) {
							{
							setState(436);
							match(DOLLAR);
							}
						}

						setState(439);
						match(OPEN_BRACE);
						setState(440);
						match(IDENTIFIER);
						setState(441);
						match(DOT);
						setState(442);
						match(IDENTIFIER);
						setState(443);
						match(CLOSE_BRACE);
						}
						setState(445);
						match(OPENTAG);
						setState(446);
						match(SLASH);
						setState(447);
						jsxElementName();
						setState(448);
						match(CLOSETAG);
						}
						break;
					case 3:
						{
						_localctx = new FUNC_ELEMNTContext(new JsxAttributeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jsxAttribute);
						setState(450);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(451);
						jsxElementevents();
						setState(452);
						match(EQUAL);
						setState(453);
						match(OPEN_BRACE);
						setState(455);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OPEN_PAREN) {
							{
							setState(454);
							aninnumos_function();
							}
						}

						setState(457);
						match(CLOSE_BRACE);
						setState(458);
						match(CLOSETAG);
						setState(459);
						match(SHOWDETAILS);
						}
						break;
					case 4:
						{
						_localctx = new LOGICAL_ELMNTContext(new JsxAttributeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jsxAttribute);
						setState(461);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(462);
						jsxElementevents();
						setState(463);
						match(EQUAL);
						setState(464);
						match(OPEN_BRACE);
						setState(465);
						match(IDENTIFIER);
						setState(466);
						match(CLOSE_BRACE);
						setState(467);
						match(CLOSETAG);
						setState(468);
						match(LOGICAL_AND);
						setState(469);
						match(IDENTIFIER);
						setState(470);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SssContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(reactParser.OPEN_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public List<TerminalNode> LOGICAL_AND() { return getTokens(reactParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(reactParser.LOGICAL_AND, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(reactParser.OPEN_PAREN, 0); }
		public JsxSelfClosingContext jsxSelfClosing() {
			return getRuleContext(JsxSelfClosingContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(reactParser.CLOSE_PAREN, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(reactParser.CLOSE_BRACE, 0); }
		public SssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterSss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitSss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitSss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SssContext sss() throws RecognitionException {
		SssContext _localctx = new SssContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(OPEN_BRACE);
			setState(478);
			match(IDENTIFIER);
			setState(479);
			match(LOGICAL_AND);
			setState(480);
			match(LOGICAL_AND);
			setState(481);
			match(OPEN_PAREN);
			setState(482);
			jsxSelfClosing();
			setState(483);
			match(CLOSE_PAREN);
			setState(484);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(reactParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(reactParser.DEFAULT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(reactParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(reactParser.SEMICOLON, 0); }
		public ExportationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).enterExportation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reactParserListener ) ((reactParserListener)listener).exitExportation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reactParserVisitor ) return ((reactParserVisitor<? extends T>)visitor).visitExportation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportationContext exportation() throws RecognitionException {
		ExportationContext _localctx = new ExportationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exportation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(EXPORT);
			setState(487);
			match(DEFAULT);
			setState(488);
			match(IDENTIFIER);
			setState(489);
			match(SEMICOLON);
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 35:
			return jsxAttribute_sempred((JsxAttributeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean jsxAttribute_sempred(JsxAttributeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u01ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0004\u0000T\b\u0000\u000b\u0000"+
		"\f\u0000U\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000[\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0003\u0002j\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002y\b\u0002\u000b"+
		"\u0002\f\u0002z\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006\u008d\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u009f"+
		"\b\b\u0001\t\u0004\t\u00a2\b\t\u000b\t\f\t\u00a3\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0004\n\u00ac\b\n\u000b\n\f\n\u00ad\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00bc\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c4\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00cf"+
		"\b\r\n\r\f\r\u00d2\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d7\b\u000e\u0001\u000f\u0005\u000f\u00da\b\u000f\n\u000f\f\u000f\u00dd"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e3"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f5"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00fb"+
		"\b\u0013\n\u0013\f\u0013\u00fe\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0103\b\u0014\n\u0014\f\u0014\u0106\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0111\b\u0016\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0115\b\u0017\n\u0017\f\u0017\u0118\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0004\u0018\u011d\b\u0018\u000b\u0018\f\u0018\u011e\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0004\u001a\u0128\b\u001a\u000b\u001a\f\u001a\u0129\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u012f\b\u001b\u0001\u001b\u0003\u001b"+
		"\u0132\b\u001b\u0001\u001b\u0003\u001b\u0135\b\u001b\u0001\u001b\u0003"+
		"\u001b\u0138\b\u001b\u0001\u001b\u0005\u001b\u013b\b\u001b\n\u001b\f\u001b"+
		"\u013e\t\u001b\u0001\u001b\u0003\u001b\u0141\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0005\u001d\u0149"+
		"\b\u001d\n\u001d\f\u001d\u014c\t\u001d\u0001\u001d\u0004\u001d\u014f\b"+
		"\u001d\u000b\u001d\f\u001d\u0150\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0159\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0160\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0166\b\u001f\u0001"+
		"\u001f\u0003\u001f\u0169\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0003!\u0170\b!\u0001\"\u0005\"\u0173\b\"\n\"\f\"\u0176\t\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u018b"+
		"\b#\u0001#\u0003#\u018e\b#\u0001#\u0003#\u0191\b#\u0001#\u0003#\u0194"+
		"\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u01a1\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01ad\b#\u0001#\u0003#\u01b0\b#\u0001#\u0003"+
		"#\u01b3\b#\u0001#\u0003#\u01b6\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01c8\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u01d9\b#\n#"+
		"\f#\u01dc\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0000\u0002&F&\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJ\u0000\u0003\u0001\u0000)+\u0002\u0000;;?@\u0003"+
		"\u0000-14477\u01fd\u0000O\u0001\u0000\u0000\u0000\u0002\\\u0001\u0000"+
		"\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000"+
		"\u0000\b\u0083\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000"+
		"\f\u008c\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000\u0010"+
		"\u009e\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014"+
		"\u00ab\u0001\u0000\u0000\u0000\u0016\u00b8\u0001\u0000\u0000\u0000\u0018"+
		"\u00bf\u0001\u0000\u0000\u0000\u001a\u00cb\u0001\u0000\u0000\u0000\u001c"+
		"\u00d6\u0001\u0000\u0000\u0000\u001e\u00db\u0001\u0000\u0000\u0000 \u00e2"+
		"\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000$\u00e7\u0001"+
		"\u0000\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000(\u00ff\u0001\u0000\u0000"+
		"\u0000*\u0107\u0001\u0000\u0000\u0000,\u0109\u0001\u0000\u0000\u0000."+
		"\u0112\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u00002\u0120\u0001"+
		"\u0000\u0000\u00004\u0127\u0001\u0000\u0000\u00006\u012b\u0001\u0000\u0000"+
		"\u00008\u0142\u0001\u0000\u0000\u0000:\u014a\u0001\u0000\u0000\u0000<"+
		"\u0152\u0001\u0000\u0000\u0000>\u015d\u0001\u0000\u0000\u0000@\u016c\u0001"+
		"\u0000\u0000\u0000B\u016f\u0001\u0000\u0000\u0000D\u0174\u0001\u0000\u0000"+
		"\u0000F\u01a0\u0001\u0000\u0000\u0000H\u01dd\u0001\u0000\u0000\u0000J"+
		"\u01e6\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RT\u0003\u0004\u0002\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WZ\u0003\f\u0006\u0000X[\u0003J%\u0000Y[\u0005\u0000\u0000"+
		"\u0001ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0001\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u0017\u0000\u0000]^\u0005:\u0000\u0000^_\u0005"+
		"\u0007\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0005:\u0000\u0000ab\u0005"+
		"\u0002\u0000\u0000bc\u0005\u0018\u0000\u0000cd\u0005\u000b\u0000\u0000"+
		"de\u0005:\u0000\u0000ef\u0005\u000b\u0000\u0000fg\u0005\b\u0000\u0000"+
		"g\u0003\u0001\u0000\u0000\u0000hj\u0007\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005"+
		":\u0000\u0000lm\u0005\f\u0000\u0000mx\u0005\u0005\u0000\u0000no\u0005"+
		"\u0001\u0000\u0000op\u0003\u0006\u0003\u0000pq\u0005\u0007\u0000\u0000"+
		"qr\u0003\b\u0004\u0000rs\u0005\u0007\u0000\u0000st\u0003\n\u0005\u0000"+
		"tu\u0005\u0007\u0000\u0000uv\u0005\u0002\u0000\u0000vw\u0005\u0007\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xn\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0006\u0000\u0000}~\u0005\b\u0000\u0000~\u0005"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005:\u0000\u0000\u0080\u0081\u0005"+
		"\n\u0000\u0000\u0081\u0082\u0005@\u0000\u0000\u0082\u0007\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005:\u0000\u0000\u0084\u0085\u0005\n\u0000"+
		"\u0000\u0085\u0086\u0005@\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005:\u0000\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089"+
		"\u008a\u0005@\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0007\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005:\u0000\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091\u0005"+
		"\u0003\u0000\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0093\u0005"+
		"\u000e\u0000\u0000\u0093\u0094\u0005\u0001\u0000\u0000\u0094\u0095\u0003"+
		"\u000e\u0007\u0000\u0095\u0096\u00032\u0019\u0000\u0096\u0097\u0005\u0002"+
		"\u0000\u0000\u0097\u0098\u0005\b\u0000\u0000\u0098\r\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0003\u0010\b\u0000\u009a\u009b\u00030\u0018\u0000"+
		"\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009f\u0003\u0012\t\u0000\u009d"+
		"\u009f\u0003\u0014\n\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u0011\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0007\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005:\u0000\u0000\u00a6\u00a7\u0005\f\u0000\u0000\u00a7\u00a8\u0007"+
		"\u0001\u0000\u0000\u00a8\u00a9\u0005\b\u0000\u0000\u00a9\u0013\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0007\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005\u0005\u0000\u0000\u00b0\u00b1\u0005:\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00b3\u0005:\u0000\u0000"+
		"\u00b3\u00b4\u0005\u0006\u0000\u0000\u00b4\u00b5\u0005\f\u0000\u0000\u00b5"+
		"\u00b6\u0003\u0016\u000b\u0000\u00b6\u00b7\u0005\b\u0000\u0000\u00b7\u0015"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005:\u0000\u0000\u00b9\u00bb\u0005"+
		"\u0003\u0000\u0000\u00ba\u00bc\u0003\u001a\r\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\u0004\u0000\u0000\u00be\u0017\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0016\u0000\u0000\u00c0\u00c1\u0005:\u0000"+
		"\u0000\u00c1\u00c3\u0005\u0003\u0000\u0000\u00c2\u00c4\u0003\u001a\r\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0004\u0000\u0000"+
		"\u00c6\u00c7\u0005\u0001\u0000\u0000\u00c7\u00c8\u0003\u001e\u000f\u0000"+
		"\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca"+
		"\u0019\u0001\u0000\u0000\u0000\u00cb\u00d0\u0003\u001c\u000e\u0000\u00cc"+
		"\u00cd\u0005\u0007\u0000\u0000\u00cd\u00cf\u0003\u001c\u000e\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u001b\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d7\u0005:\u0000\u0000\u00d4\u00d7\u0005\'\u0000\u0000\u00d5\u00d7"+
		"\u0005;\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u001d\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0003 \u0010\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u001f\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e3\u0003\"\u0011"+
		"\u0000\u00df\u00e3\u0003$\u0012\u0000\u00e0\u00e3\u0003,\u0016\u0000\u00e1"+
		"\u00e3\u0003.\u0017\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e2\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003"+
		"&\u0013\u0000\u00e5\u00e6\u0005\b\u0000\u0000\u00e6#\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005\"\u0000\u0000\u00e8\u00e9\u0003&\u0013\u0000"+
		"\u00e9\u00ea\u0005\b\u0000\u0000\u00ea%\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0006\u0013\uffff\uffff\u0000\u00ec\u00f5\u0005:\u0000\u0000\u00ed"+
		"\u00f5\u0005;\u0000\u0000\u00ee\u00f5\u0005\'\u0000\u0000\u00ef\u00f0"+
		"\u0005:\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000\u00f1\u00f2\u0003"+
		"(\u0014\u0000\u00f2\u00f3\u0005\u0004\u0000\u0000\u00f3\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f4\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f4\u00ee\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f5\u00fc\u0001\u0000\u0000\u0000\u00f6\u00f7\n\u0002\u0000"+
		"\u0000\u00f7\u00f8\u0003*\u0015\u0000\u00f8\u00f9\u0003&\u0013\u0003\u00f9"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\'\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0104\u0003&\u0013\u0000\u0100\u0101\u0005"+
		"\u0007\u0000\u0000\u0101\u0103\u0003&\u0013\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105)\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0012\u0000"+
		"\u0000\u0108+\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u001a\u0000\u0000"+
		"\u010a\u010b\u0005\u0003\u0000\u0000\u010b\u010c\u0003&\u0013\u0000\u010c"+
		"\u010d\u0005\u0004\u0000\u0000\u010d\u0110\u0003 \u0010\u0000\u010e\u010f"+
		"\u0005\u001b\u0000\u0000\u010f\u0111\u0003 \u0010\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111-\u0001\u0000"+
		"\u0000\u0000\u0112\u0116\u0005\u0001\u0000\u0000\u0113\u0115\u0003 \u0010"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\u0002\u0000\u0000\u011a/\u0001\u0000\u0000\u0000"+
		"\u011b\u011d\u0003\u0018\f\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f1\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0005\"\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0123\u0003"+
		"4\u001a\u0000\u0123\u0124\u0005\u0004\u0000\u0000\u0124\u0125\u0005\b"+
		"\u0000\u0000\u01253\u0001\u0000\u0000\u0000\u0126\u0128\u00036\u001b\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a5\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u000f\u0000\u0000\u012c"+
		"\u012e\u0003@ \u0000\u012d\u012f\u0003D\"\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000"+
		"\u0000\u0000\u0130\u0132\u0005\u0011\u0000\u0000\u0131\u0130\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000"+
		"\u0000\u0000\u0133\u0135\u0005\u0010\u0000\u0000\u0134\u0133\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000"+
		"\u0000\u0000\u0136\u0138\u0003:\u001d\u0000\u0137\u0136\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013c\u0001\u0000\u0000"+
		"\u0000\u0139\u013b\u00036\u001b\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0141\u00038\u001c\u0000\u0140"+
		"\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"7\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u000f\u0000\u0000\u0143\u0144"+
		"\u0005\u0011\u0000\u0000\u0144\u0145\u0003@ \u0000\u0145\u0146\u0005\u0010"+
		"\u0000\u0000\u01469\u0001\u0000\u0000\u0000\u0147\u0149\u0003<\u001e\u0000"+
		"\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u014f\u0003H$\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151;\u0001\u0000\u0000\u0000\u0152\u0153\u0005"+
		"\u0001\u0000\u0000\u0153\u0154\u0005:\u0000\u0000\u0154\u0155\u0005\t"+
		"\u0000\u0000\u0155\u0156\u0005:\u0000\u0000\u0156\u0158\u0005\u0003\u0000"+
		"\u0000\u0157\u0159\u0003>\u001f\u0000\u0158\u0157\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005\u0004\u0000\u0000\u015b\u015c\u0005\u0002\u0000\u0000"+
		"\u015c=\u0001\u0000\u0000\u0000\u015d\u015f\u0005\u0003\u0000\u0000\u015e"+
		"\u0160\u0003\u001a\r\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0005\u0004\u0000\u0000\u0162\u0163\u0005\u000e\u0000\u0000\u0163\u0165"+
		"\u0005\u0001\u0000\u0000\u0164\u0166\u00034\u001a\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001"+
		"\u0000\u0000\u0000\u0167\u0169\u0003\u0016\u000b\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005\u0002\u0000\u0000\u016b?\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0007\u0002\u0000\u0000\u016dA\u0001\u0000\u0000"+
		"\u0000\u016e\u0170\u00058\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170C\u0001\u0000\u0000\u0000\u0171"+
		"\u0173\u0003F#\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001"+
		"\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001"+
		"\u0000\u0000\u0000\u0175E\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0006#\uffff\uffff\u0000\u0178\u0179\u00052\u0000"+
		"\u0000\u0179\u017a\u0005\f\u0000\u0000\u017a\u01a1\u0005@\u0000\u0000"+
		"\u017b\u017c\u00055\u0000\u0000\u017c\u017d\u0005\f\u0000\u0000\u017d"+
		"\u017e\u0005\u0001\u0000\u0000\u017e\u017f\u0005:\u0000\u0000\u017f\u0180"+
		"\u0005\t\u0000\u0000\u0180\u0181\u0005:\u0000\u0000\u0181\u0182\u0005"+
		"\u0002\u0000\u0000\u0182\u0183\u00056\u0000\u0000\u0183\u0184\u0005\f"+
		"\u0000\u0000\u0184\u0185\u0005\u0001\u0000\u0000\u0185\u0186\u0005:\u0000"+
		"\u0000\u0186\u0187\u0005\t\u0000\u0000\u0187\u0188\u0005:\u0000\u0000"+
		"\u0188\u01a1\u0005\u0002\u0000\u0000\u0189\u018b\u0005\u0010\u0000\u0000"+
		"\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0005:\u0000\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u0190\u0001\u0000\u0000\u0000\u018f\u0191\u0005\n\u0000\u0000\u0190\u018f"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193"+
		"\u0001\u0000\u0000\u0000\u0192\u0194\u0005\u0013\u0000\u0000\u0193\u0192"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0005\u0001\u0000\u0000\u0196\u0197"+
		"\u0005:\u0000\u0000\u0197\u0198\u0005\t\u0000\u0000\u0198\u0199\u0005"+
		":\u0000\u0000\u0199\u019a\u0005\u0002\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0005\u000f\u0000\u0000\u019c\u019d\u0005\u0011"+
		"\u0000\u0000\u019d\u019e\u0003@ \u0000\u019e\u019f\u0005\u0010\u0000\u0000"+
		"\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u0177\u0001\u0000\u0000\u0000"+
		"\u01a0\u017b\u0001\u0000\u0000\u0000\u01a0\u018a\u0001\u0000\u0000\u0000"+
		"\u01a1\u01da\u0001\u0000\u0000\u0000\u01a2\u01a3\n\u0006\u0000\u0000\u01a3"+
		"\u01a4\u00053\u0000\u0000\u01a4\u01a5\u0005\f\u0000\u0000\u01a5\u01a6"+
		"\u0005\u0001\u0000\u0000\u01a6\u01a7\u0005:\u0000\u0000\u01a7\u01a8\u0005"+
		"\t\u0000\u0000\u01a8\u01a9\u0005:\u0000\u0000\u01a9\u01d9\u0005\u0002"+
		"\u0000\u0000\u01aa\u01ac\n\u0004\u0000\u0000\u01ab\u01ad\u0005\u0010\u0000"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01b0\u0005:\u0000\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005\n\u0000\u0000\u01b2"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b6\u0005\u0013\u0000\u0000\u01b5"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\u0001\u0000\u0000\u01b8"+
		"\u01b9\u0005:\u0000\u0000\u01b9\u01ba\u0005\t\u0000\u0000\u01ba\u01bb"+
		"\u0005:\u0000\u0000\u01bb\u01bc\u0005\u0002\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0005\u000f\u0000\u0000\u01be\u01bf\u0005"+
		"\u0011\u0000\u0000\u01bf\u01c0\u0003@ \u0000\u01c0\u01c1\u0005\u0010\u0000"+
		"\u0000\u01c1\u01d9\u0001\u0000\u0000\u0000\u01c2\u01c3\n\u0002\u0000\u0000"+
		"\u01c3\u01c4\u0003B!\u0000\u01c4\u01c5\u0005\f\u0000\u0000\u01c5\u01c7"+
		"\u0005\u0001\u0000\u0000\u01c6\u01c8\u0003>\u001f\u0000\u01c7\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0005\u0002\u0000\u0000\u01ca\u01cb\u0005"+
		"\u0010\u0000\u0000\u01cb\u01cc\u00059\u0000\u0000\u01cc\u01d9\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\n\u0001\u0000\u0000\u01ce\u01cf\u0003B!\u0000"+
		"\u01cf\u01d0\u0005\f\u0000\u0000\u01d0\u01d1\u0005\u0001\u0000\u0000\u01d1"+
		"\u01d2\u0005:\u0000\u0000\u01d2\u01d3\u0005\u0002\u0000\u0000\u01d3\u01d4"+
		"\u0005\u0010\u0000\u0000\u01d4\u01d5\u0005\u0014\u0000\u0000\u01d5\u01d6"+
		"\u0005:\u0000\u0000\u01d6\u01d7\u0005\b\u0000\u0000\u01d7\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d8\u01a2\u0001\u0000\u0000\u0000\u01d8\u01aa\u0001"+
		"\u0000\u0000\u0000\u01d8\u01c2\u0001\u0000\u0000\u0000\u01d8\u01cd\u0001"+
		"\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01dbG\u0001\u0000"+
		"\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de\u0005\u0001"+
		"\u0000\u0000\u01de\u01df\u0005:\u0000\u0000\u01df\u01e0\u0005\u0014\u0000"+
		"\u0000\u01e0\u01e1\u0005\u0014\u0000\u0000\u01e1\u01e2\u0005\u0003\u0000"+
		"\u0000\u01e2\u01e3\u00036\u001b\u0000\u01e3\u01e4\u0005\u0004\u0000\u0000"+
		"\u01e4\u01e5\u0005\u0002\u0000\u0000\u01e5I\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0005\u0019\u0000\u0000\u01e7\u01e8\u0005!\u0000\u0000\u01e8\u01e9"+
		"\u0005:\u0000\u0000\u01e9\u01ea\u0005\b\u0000\u0000\u01eaK\u0001\u0000"+
		"\u0000\u00000OUZiz\u008c\u009e\u00a3\u00ad\u00bb\u00c3\u00d0\u00d6\u00db"+
		"\u00e2\u00f4\u00fc\u0104\u0110\u0116\u011e\u0129\u012e\u0131\u0134\u0137"+
		"\u013c\u0140\u014a\u0150\u0158\u015f\u0165\u0168\u016f\u0174\u018a\u018d"+
		"\u0190\u0193\u01a0\u01ac\u01af\u01b2\u01b5\u01c7\u01d8\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
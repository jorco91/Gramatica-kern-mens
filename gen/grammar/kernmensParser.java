// Generated from /Users/jorgemarcoesteve/IdeaProjects/TFG/src/main/java/grammar/kernmens.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kernmensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOTENAME=1, NOTENAMECL=2, DIGIT=3, THREE=4, TWO=5, M_RHYTHM=6, SHARP=7, 
		FLAT=8, DOUBLESHARP=9, DOUBLEFLAT=10, NATURAL=11, CLEF=12, SPACE=13, GREATER=14, 
		LESS=15, LEFTPAR=16, RIGHTPAR=17, LEFTBRACKET=18, RIGHTBRACKET=19, LEFTCURBRACES=20, 
		RIGHTCURBRACES=21, LETTER_K=22, LETTER_k=23, LETTER_M=24, LETTER_m=25, 
		LETTER_T=26, LETTER_t=27, LETTER_W=28, LETTER_w=29, LETTER_U=30, LETTER_p=31, 
		LETTER_i=32, LETTER_v=33, LETTER_r=34, COMMON=35, PERTFECT=36, WORD_CLEF=37, 
		WORD_SKERN=38, WORD_SMENS=39, WORD_MET=40, DOT=41, BARLINE=42, EQUAL=43, 
		SLASH=44, BACKSLASH=45, ASTERISK=46, CIRCUNFLEX=47, APOSTROPHE=48, SEMICOLON=49, 
		COLON=50, COLOURED=51, GRAVE_ACCENT=52, EXCLAMATION=53, COMA=54, SLURS_COUNT=55;
	public static final int
		RULE_incipit = 0, RULE_mastercleff = 1, RULE_keysignature = 2, RULE_note_signature = 3, 
		RULE_notesuffix = 4, RULE_pitch = 5, RULE_stem_direction = 6, RULE_mens_notation = 7, 
		RULE_m_timesignature = 8, RULE_m_musicalcontent = 9, RULE_m_measure = 10, 
		RULE_m_items = 11, RULE_m_item = 12, RULE_m_note = 13, RULE_m_barlines = 14, 
		RULE_m_rest = 15, RULE_m_slurs = 16, RULE_m_ligature = 17, RULE_m_dot = 18, 
		RULE_m_notesuffix = 19, RULE_mensural_signs = 20, RULE_m_perfect = 21, 
		RULE_m_imperfect = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"incipit", "mastercleff", "keysignature", "note_signature", "notesuffix", 
			"pitch", "stem_direction", "mens_notation", "m_timesignature", "m_musicalcontent", 
			"m_measure", "m_items", "m_item", "m_note", "m_barlines", "m_rest", "m_slurs", 
			"m_ligature", "m_dot", "m_notesuffix", "mensural_signs", "m_perfect", 
			"m_imperfect"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'3'", "'2'", null, "'#'", "'-'", "'##'", "'--'", 
			"'n'", null, "' '", "'>'", "'<'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'K'", "'k'", "'M'", "'m'", "'T'", "'t'", "'W'", "'w'", "'U'", 
			"'p'", "'i'", "'v'", "'r'", "'C'", "'O'", "'clef'", "'skern'", "'smens'", 
			"'met'", "'.'", "'|'", "'='", "'/'", "'\\'", "'*'", "'^'", "'''", "';'", 
			"':'", "'~'", "'`'", "'!'", "','", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOTENAME", "NOTENAMECL", "DIGIT", "THREE", "TWO", "M_RHYTHM", 
			"SHARP", "FLAT", "DOUBLESHARP", "DOUBLEFLAT", "NATURAL", "CLEF", "SPACE", 
			"GREATER", "LESS", "LEFTPAR", "RIGHTPAR", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTCURBRACES", "RIGHTCURBRACES", "LETTER_K", "LETTER_k", "LETTER_M", 
			"LETTER_m", "LETTER_T", "LETTER_t", "LETTER_W", "LETTER_w", "LETTER_U", 
			"LETTER_p", "LETTER_i", "LETTER_v", "LETTER_r", "COMMON", "PERTFECT", 
			"WORD_CLEF", "WORD_SKERN", "WORD_SMENS", "WORD_MET", "DOT", "BARLINE", 
			"EQUAL", "SLASH", "BACKSLASH", "ASTERISK", "CIRCUNFLEX", "APOSTROPHE", 
			"SEMICOLON", "COLON", "COLOURED", "GRAVE_ACCENT", "EXCLAMATION", "COMA", 
			"SLURS_COUNT"
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
	public String getGrammarFileName() { return "kernmens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kernmensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IncipitContext extends ParserRuleContext {
		public List<Mens_notationContext> mens_notation() {
			return getRuleContexts(Mens_notationContext.class);
		}
		public Mens_notationContext mens_notation(int i) {
			return getRuleContext(Mens_notationContext.class,i);
		}
		public IncipitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incipit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterIncipit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitIncipit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitIncipit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncipitContext incipit() throws RecognitionException {
		IncipitContext _localctx = new IncipitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_incipit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				mens_notation();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASTERISK );
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

	public static class MastercleffContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode WORD_CLEF() { return getToken(kernmensParser.WORD_CLEF, 0); }
		public TerminalNode CLEF() { return getToken(kernmensParser.CLEF, 0); }
		public MastercleffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mastercleff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterMastercleff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitMastercleff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitMastercleff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MastercleffContext mastercleff() throws RecognitionException {
		MastercleffContext _localctx = new MastercleffContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mastercleff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ASTERISK);
			setState(52);
			match(WORD_CLEF);
			setState(53);
			match(CLEF);
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

	public static class KeysignatureContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode LETTER_K() { return getToken(kernmensParser.LETTER_K, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(kernmensParser.LEFTBRACKET, 0); }
		public List<Note_signatureContext> note_signature() {
			return getRuleContexts(Note_signatureContext.class);
		}
		public Note_signatureContext note_signature(int i) {
			return getRuleContext(Note_signatureContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public List<TerminalNode> COMA() { return getTokens(kernmensParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(kernmensParser.COMA, i);
		}
		public KeysignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keysignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterKeysignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitKeysignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitKeysignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeysignatureContext keysignature() throws RecognitionException {
		KeysignatureContext _localctx = new KeysignatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keysignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ASTERISK);
			setState(56);
			match(LETTER_K);
			setState(57);
			match(LEFTBRACKET);
			setState(58);
			note_signature();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(59);
				match(COMA);
				setState(60);
				note_signature();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(RIGHTBRACKET);
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

	public static class Note_signatureContext extends ParserRuleContext {
		public TerminalNode NOTENAME() { return getToken(kernmensParser.NOTENAME, 0); }
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public TerminalNode SHARP() { return getToken(kernmensParser.SHARP, 0); }
		public Note_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterNote_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitNote_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitNote_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Note_signatureContext note_signature() throws RecognitionException {
		Note_signatureContext _localctx = new Note_signatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_note_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(NOTENAME);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==SHARP || _la==FLAT) ) {
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

	public static class NotesuffixContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(kernmensParser.SHARP, 0); }
		public TerminalNode DOUBLESHARP() { return getToken(kernmensParser.DOUBLESHARP, 0); }
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public TerminalNode DOUBLEFLAT() { return getToken(kernmensParser.DOUBLEFLAT, 0); }
		public TerminalNode NATURAL() { return getToken(kernmensParser.NATURAL, 0); }
		public NotesuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notesuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterNotesuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitNotesuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitNotesuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotesuffixContext notesuffix() throws RecognitionException {
		NotesuffixContext _localctx = new NotesuffixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL))) != 0)) ) {
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

	public static class PitchContext extends ParserRuleContext {
		public List<TerminalNode> NOTENAME() { return getTokens(kernmensParser.NOTENAME); }
		public TerminalNode NOTENAME(int i) {
			return getToken(kernmensParser.NOTENAME, i);
		}
		public List<TerminalNode> NOTENAMECL() { return getTokens(kernmensParser.NOTENAMECL); }
		public TerminalNode NOTENAMECL(int i) {
			return getToken(kernmensParser.NOTENAMECL, i);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitPitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pitch);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					match(NOTENAME);
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOTENAME );
				}
				break;
			case NOTENAMECL:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					match(NOTENAMECL);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOTENAMECL );
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

	public static class Stem_directionContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public TerminalNode BACKSLASH() { return getToken(kernmensParser.BACKSLASH, 0); }
		public Stem_directionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stem_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterStem_direction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitStem_direction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitStem_direction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stem_directionContext stem_direction() throws RecognitionException {
		Stem_directionContext _localctx = new Stem_directionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stem_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==SLASH || _la==BACKSLASH) ) {
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

	public static class Mens_notationContext extends ParserRuleContext {
		public List<TerminalNode> ASTERISK() { return getTokens(kernmensParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(kernmensParser.ASTERISK, i);
		}
		public TerminalNode WORD_SMENS() { return getToken(kernmensParser.WORD_SMENS, 0); }
		public MastercleffContext mastercleff() {
			return getRuleContext(MastercleffContext.class,0);
		}
		public M_musicalcontentContext m_musicalcontent() {
			return getRuleContext(M_musicalcontentContext.class,0);
		}
		public M_timesignatureContext m_timesignature() {
			return getRuleContext(M_timesignatureContext.class,0);
		}
		public KeysignatureContext keysignature() {
			return getRuleContext(KeysignatureContext.class,0);
		}
		public Mens_notationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mens_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterMens_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitMens_notation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitMens_notation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mens_notationContext mens_notation() throws RecognitionException {
		Mens_notationContext _localctx = new Mens_notationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mens_notation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ASTERISK);
			setState(88);
			match(ASTERISK);
			setState(89);
			match(WORD_SMENS);
			setState(90);
			mastercleff();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(91);
				m_timesignature();
				}
				break;
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(94);
				keysignature();
				}
			}

			setState(97);
			m_musicalcontent();
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

	public static class M_timesignatureContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode WORD_MET() { return getToken(kernmensParser.WORD_MET, 0); }
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public Mensural_signsContext mensural_signs() {
			return getRuleContext(Mensural_signsContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public M_timesignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_timesignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_timesignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_timesignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_timesignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_timesignatureContext m_timesignature() throws RecognitionException {
		M_timesignatureContext _localctx = new M_timesignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_m_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ASTERISK);
			setState(100);
			match(WORD_MET);
			setState(101);
			match(LEFTPAR);
			setState(102);
			mensural_signs();
			setState(103);
			match(RIGHTPAR);
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

	public static class M_musicalcontentContext extends ParserRuleContext {
		public List<M_measureContext> m_measure() {
			return getRuleContexts(M_measureContext.class);
		}
		public M_measureContext m_measure(int i) {
			return getRuleContext(M_measureContext.class,i);
		}
		public M_itemsContext m_items() {
			return getRuleContext(M_itemsContext.class,0);
		}
		public M_musicalcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_musicalcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_musicalcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_musicalcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_musicalcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_musicalcontentContext m_musicalcontent() throws RecognitionException {
		M_musicalcontentContext _localctx = new M_musicalcontentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_m_musicalcontent);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					m_measure();
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << M_RHYTHM) | (1L << GREATER) | (1L << LESS) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << EQUAL))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				m_items();
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

	public static class M_measureContext extends ParserRuleContext {
		public M_itemsContext m_items() {
			return getRuleContext(M_itemsContext.class,0);
		}
		public M_barlinesContext m_barlines() {
			return getRuleContext(M_barlinesContext.class,0);
		}
		public M_measureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_measure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_measure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_measure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_measureContext m_measure() throws RecognitionException {
		M_measureContext _localctx = new M_measureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_m_measure);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case M_RHYTHM:
			case GREATER:
			case LESS:
			case LEFTPAR:
			case RIGHTPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				m_items();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				m_barlines();
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

	public static class M_itemsContext extends ParserRuleContext {
		public List<M_itemContext> m_item() {
			return getRuleContexts(M_itemContext.class);
		}
		public M_itemContext m_item(int i) {
			return getRuleContext(M_itemContext.class,i);
		}
		public M_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_itemsContext m_items() throws RecognitionException {
		M_itemsContext _localctx = new M_itemsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_m_items);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117);
					m_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class M_itemContext extends ParserRuleContext {
		public M_noteContext m_note() {
			return getRuleContext(M_noteContext.class,0);
		}
		public M_restContext m_rest() {
			return getRuleContext(M_restContext.class,0);
		}
		public M_slursContext m_slurs() {
			return getRuleContext(M_slursContext.class,0);
		}
		public M_ligatureContext m_ligature() {
			return getRuleContext(M_ligatureContext.class,0);
		}
		public M_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_itemContext m_item() throws RecognitionException {
		M_itemContext _localctx = new M_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_m_item);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				m_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				m_rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				m_slurs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				m_ligature();
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

	public static class M_noteContext extends ParserRuleContext {
		public TerminalNode M_RHYTHM() { return getToken(kernmensParser.M_RHYTHM, 0); }
		public TerminalNode COLOURED() { return getToken(kernmensParser.COLOURED, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public M_dotContext m_dot() {
			return getRuleContext(M_dotContext.class,0);
		}
		public M_perfectContext m_perfect() {
			return getRuleContext(M_perfectContext.class,0);
		}
		public M_imperfectContext m_imperfect() {
			return getRuleContext(M_imperfectContext.class,0);
		}
		public M_notesuffixContext m_notesuffix() {
			return getRuleContext(M_notesuffixContext.class,0);
		}
		public Stem_directionContext stem_direction() {
			return getRuleContext(Stem_directionContext.class,0);
		}
		public M_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_note(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_note(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_noteContext m_note() throws RecognitionException {
		M_noteContext _localctx = new M_noteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_m_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(M_RHYTHM);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(129);
				m_dot();
				}
				break;
			}
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_p:
				{
				setState(132);
				m_perfect();
				}
				break;
			case LETTER_i:
				{
				setState(133);
				m_imperfect();
				}
				break;
			case COLOURED:
				break;
			default:
				break;
			}
			setState(136);
			match(COLOURED);
			setState(137);
			pitch();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL) | (1L << LETTER_U))) != 0)) {
				{
				setState(138);
				m_notesuffix();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(141);
				stem_direction();
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

	public static class M_barlinesContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(kernmensParser.EQUAL, 0); }
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public List<TerminalNode> BARLINE() { return getTokens(kernmensParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(kernmensParser.BARLINE, i);
		}
		public M_barlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_barlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_barlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_barlines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_barlines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_barlinesContext m_barlines() throws RecognitionException {
		M_barlinesContext _localctx = new M_barlinesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_m_barlines);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(EQUAL);
				setState(145);
				match(FLAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(EQUAL);
				setState(147);
				match(BARLINE);
				setState(148);
				match(BARLINE);
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

	public static class M_restContext extends ParserRuleContext {
		public TerminalNode M_RHYTHM() { return getToken(kernmensParser.M_RHYTHM, 0); }
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public M_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_rest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_rest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_restContext m_rest() throws RecognitionException {
		M_restContext _localctx = new M_restContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_m_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(M_RHYTHM);
			setState(152);
			match(LETTER_r);
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

	public static class M_slursContext extends ParserRuleContext {
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public M_slursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_slurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_slurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_slurs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_slurs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_slursContext m_slurs() throws RecognitionException {
		M_slursContext _localctx = new M_slursContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_m_slurs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==LEFTPAR || _la==RIGHTPAR) ) {
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

	public static class M_ligatureContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(kernmensParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(kernmensParser.GREATER, 0); }
		public M_ligatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_ligature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_ligature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_ligature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_ligature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_ligatureContext m_ligature() throws RecognitionException {
		M_ligatureContext _localctx = new M_ligatureContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_m_ligature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==GREATER || _la==LESS) ) {
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

	public static class M_dotContext extends ParserRuleContext {
		public TerminalNode LETTER_p() { return getToken(kernmensParser.LETTER_p, 0); }
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
		public M_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_dotContext m_dot() throws RecognitionException {
		M_dotContext _localctx = new M_dotContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_m_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LETTER_p);
			setState(159);
			match(COLON);
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

	public static class M_notesuffixContext extends ParserRuleContext {
		public NotesuffixContext notesuffix() {
			return getRuleContext(NotesuffixContext.class,0);
		}
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public M_notesuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_notesuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_notesuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_notesuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_notesuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_notesuffixContext m_notesuffix() throws RecognitionException {
		M_notesuffixContext _localctx = new M_notesuffixContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_m_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(161);
				match(LETTER_U);
				}
			}

			setState(164);
			notesuffix();
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

	public static class Mensural_signsContext extends ParserRuleContext {
		public TerminalNode COMMON() { return getToken(kernmensParser.COMMON, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode TWO() { return getToken(kernmensParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(kernmensParser.THREE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public TerminalNode PERTFECT() { return getToken(kernmensParser.PERTFECT, 0); }
		public Mensural_signsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensural_signs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterMensural_signs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitMensural_signs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitMensural_signs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mensural_signsContext mensural_signs() throws RecognitionException {
		Mensural_signsContext _localctx = new Mensural_signsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mensural_signs);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(166);
				match(COMMON);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BARLINE:
					{
					setState(167);
					match(BARLINE);
					setState(173);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case THREE:
						{
						setState(168);
						match(THREE);
						}
						break;
					case TWO:
						{
						setState(169);
						match(TWO);
						}
						break;
					case SLASH:
						{
						setState(170);
						match(SLASH);
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==THREE || _la==TWO) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case LETTER_r:
						{
						setState(172);
						match(LETTER_r);
						}
						break;
					case RIGHTPAR:
						break;
					default:
						break;
					}
					}
					break;
				case TWO:
					{
					setState(175);
					match(TWO);
					}
					break;
				case THREE:
					{
					setState(176);
					match(THREE);
					}
					break;
				case DOT:
					{
					setState(177);
					match(DOT);
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BARLINE) {
						{
						setState(178);
						match(BARLINE);
						}
					}

					}
					break;
				case LETTER_r:
					{
					setState(181);
					match(LETTER_r);
					}
					break;
				case RIGHTPAR:
					break;
				default:
					break;
				}
				}
				}
				break;
			case THREE:
			case TWO:
			case PERTFECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(184);
					match(PERTFECT);
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TWO:
						{
						setState(185);
						match(TWO);
						}
						break;
					case THREE:
						{
						setState(186);
						match(THREE);
						}
						break;
					case BARLINE:
						{
						setState(187);
						match(BARLINE);
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THREE) {
							{
							setState(188);
							match(THREE);
							}
						}

						}
						break;
					case SLASH:
						{
						setState(191);
						match(SLASH);
						setState(192);
						match(THREE);
						}
						break;
					case DOT:
						{
						setState(193);
						match(DOT);
						}
						break;
					case RIGHTPAR:
						break;
					default:
						break;
					}
					}
					break;
				case 2:
					{
					setState(196);
					match(THREE);
					setState(197);
					match(SLASH);
					setState(198);
					match(TWO);
					}
					break;
				case 3:
					{
					setState(199);
					match(THREE);
					}
					break;
				case 4:
					{
					setState(200);
					match(TWO);
					}
					break;
				}
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

	public static class M_perfectContext extends ParserRuleContext {
		public TerminalNode LETTER_p() { return getToken(kernmensParser.LETTER_p, 0); }
		public M_perfectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_perfect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_perfect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_perfect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_perfect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_perfectContext m_perfect() throws RecognitionException {
		M_perfectContext _localctx = new M_perfectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_m_perfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(LETTER_p);
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

	public static class M_imperfectContext extends ParserRuleContext {
		public TerminalNode LETTER_i() { return getToken(kernmensParser.LETTER_i, 0); }
		public M_imperfectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_imperfect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterM_imperfect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitM_imperfect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitM_imperfect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_imperfectContext m_imperfect() throws RecognitionException {
		M_imperfectContext _localctx = new M_imperfectContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_m_imperfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(LETTER_i);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4"+
		"\16\4C\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\6\7M\n\7\r\7\16\7N\3\7\6\7"+
		"R\n\7\r\7\16\7S\5\7V\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\5\t"+
		"b\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13m\n\13\r\13\16\13n\3\13"+
		"\5\13r\n\13\3\f\3\f\5\fv\n\f\3\r\6\ry\n\r\r\r\16\rz\3\16\3\16\3\16\3\16"+
		"\5\16\u0081\n\16\3\17\3\17\5\17\u0085\n\17\3\17\3\17\5\17\u0089\n\17\3"+
		"\17\3\17\3\17\5\17\u008e\n\17\3\17\5\17\u0091\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0098\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\5\25\u00a5\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00b0\n\26\3\26\3\26\3\26\3\26\5\26\u00b6\n\26\3\26\5\26\u00b9\n\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u00c0\n\26\3\26\3\26\3\26\5\26\u00c5\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00cc\n\26\5\26\u00ce\n\26\3\27\3\27\3"+
		"\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\b\3\2\t\n\3\2\t\r\3\2./\3\2\22\23\3\2\20\21\3\2\6\7\2\u00e5\2\61\3\2"+
		"\2\2\4\65\3\2\2\2\69\3\2\2\2\bF\3\2\2\2\nI\3\2\2\2\fU\3\2\2\2\16W\3\2"+
		"\2\2\20Y\3\2\2\2\22e\3\2\2\2\24q\3\2\2\2\26u\3\2\2\2\30x\3\2\2\2\32\u0080"+
		"\3\2\2\2\34\u0082\3\2\2\2\36\u0097\3\2\2\2 \u0099\3\2\2\2\"\u009c\3\2"+
		"\2\2$\u009e\3\2\2\2&\u00a0\3\2\2\2(\u00a4\3\2\2\2*\u00cd\3\2\2\2,\u00cf"+
		"\3\2\2\2.\u00d1\3\2\2\2\60\62\5\20\t\2\61\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\66\7\60\2\2\66\67\7\'\2\2\67"+
		"8\7\16\2\28\5\3\2\2\29:\7\60\2\2:;\7\30\2\2;<\7\24\2\2<A\5\b\5\2=>\78"+
		"\2\2>@\5\b\5\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2"+
		"\2\2DE\7\25\2\2E\7\3\2\2\2FG\7\3\2\2GH\t\2\2\2H\t\3\2\2\2IJ\t\3\2\2J\13"+
		"\3\2\2\2KM\7\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2\2P"+
		"R\7\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UL\3\2\2\2"+
		"UQ\3\2\2\2V\r\3\2\2\2WX\t\4\2\2X\17\3\2\2\2YZ\7\60\2\2Z[\7\60\2\2[\\\7"+
		")\2\2\\^\5\4\3\2]_\5\22\n\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\6\4\2a`"+
		"\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\24\13\2d\21\3\2\2\2ef\7\60\2\2fg\7*\2"+
		"\2gh\7\22\2\2hi\5*\26\2ij\7\23\2\2j\23\3\2\2\2km\5\26\f\2lk\3\2\2\2mn"+
		"\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pr\5\30\r\2ql\3\2\2\2qp\3\2\2\2"+
		"r\25\3\2\2\2sv\5\30\r\2tv\5\36\20\2us\3\2\2\2ut\3\2\2\2v\27\3\2\2\2wy"+
		"\5\32\16\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\31\3\2\2\2|\u0081"+
		"\5\34\17\2}\u0081\5 \21\2~\u0081\5\"\22\2\177\u0081\5$\23\2\u0080|\3\2"+
		"\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\33\3\2\2\2"+
		"\u0082\u0084\7\b\2\2\u0083\u0085\5&\24\2\u0084\u0083\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0089\5,\27\2\u0087\u0089\5.\30\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\7\65\2\2\u008b\u008d\5\f\7\2\u008c\u008e\5(\25\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5\16"+
		"\b\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\35\3\2\2\2\u0092\u0093"+
		"\7-\2\2\u0093\u0098\7\n\2\2\u0094\u0095\7-\2\2\u0095\u0096\7,\2\2\u0096"+
		"\u0098\7,\2\2\u0097\u0092\3\2\2\2\u0097\u0094\3\2\2\2\u0098\37\3\2\2\2"+
		"\u0099\u009a\7\b\2\2\u009a\u009b\7$\2\2\u009b!\3\2\2\2\u009c\u009d\t\5"+
		"\2\2\u009d#\3\2\2\2\u009e\u009f\t\6\2\2\u009f%\3\2\2\2\u00a0\u00a1\7!"+
		"\2\2\u00a1\u00a2\7\64\2\2\u00a2\'\3\2\2\2\u00a3\u00a5\7 \2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\n\6\2\u00a7"+
		")\3\2\2\2\u00a8\u00b8\7%\2\2\u00a9\u00af\7,\2\2\u00aa\u00b0\7\6\2\2\u00ab"+
		"\u00b0\7\7\2\2\u00ac\u00ad\7.\2\2\u00ad\u00b0\t\7\2\2\u00ae\u00b0\7$\2"+
		"\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ae"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b9\3\2\2\2\u00b1\u00b9\7\7\2\2\u00b2"+
		"\u00b9\7\6\2\2\u00b3\u00b5\7+\2\2\u00b4\u00b6\7,\2\2\u00b5\u00b4\3\2\2"+
		"\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\7$\2\2\u00b8\u00a9"+
		"\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ce\3\2\2\2\u00ba\u00c4\7&"+
		"\2\2\u00bb\u00c5\7\7\2\2\u00bc\u00c5\7\6\2\2\u00bd\u00bf\7,\2\2\u00be"+
		"\u00c0\7\6\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c5\3\2"+
		"\2\2\u00c1\u00c2\7.\2\2\u00c2\u00c5\7\6\2\2\u00c3\u00c5\7+\2\2\u00c4\u00bb"+
		"\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\7\6"+
		"\2\2\u00c7\u00c8\7.\2\2\u00c8\u00cc\7\7\2\2\u00c9\u00cc\7\6\2\2\u00ca"+
		"\u00cc\7\7\2\2\u00cb\u00ba\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00a8\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce+\3\2\2\2\u00cf\u00d0\7!\2\2\u00d0-\3\2\2\2\u00d1"+
		"\u00d2\7\"\2\2\u00d2/\3\2\2\2\33\63ANSU^anquz\u0080\u0084\u0088\u008d"+
		"\u0090\u0097\u00a4\u00af\u00b5\u00b8\u00bf\u00c4\u00cb\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
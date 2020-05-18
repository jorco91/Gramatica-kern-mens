// Generated from jorge/kernmensParser.g4 by ANTLR 4.8
package jorge;
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
		WS=1, LETTER_L=2, LETTER_M=3, PERTFECT=4, ONE=5, FOUR=6, THREE=7, TWO=8, 
		FIVE=9, SIX=10, SEVEN=11, EIGHT=12, NINE=13, ZERO=14, SHARP=15, FLAT=16, 
		DOUBLESHARP=17, DOUBLEFLAT=18, NATURAL=19, SPACE=20, GREATER=21, LESS=22, 
		LEFTPAR=23, RIGHTPAR=24, LEFTBRACKET=25, RIGHTBRACKET=26, LEFTCURBRACES=27, 
		RIGHTCURBRACES=28, LETTER_K=29, LETTER_k=30, LETTER_S=31, LETTER_s=32, 
		LETTER_u=33, LETTER_m=34, LETTER_T=35, LETTER_t=36, LETTER_W=37, LETTER_w=38, 
		LETTER_U=39, LETTER_p=40, LETTER_i=41, LETTER_v=42, LETTER_r=43, LETTER_R=44, 
		LETTER_I=45, LETTER_P=46, LETTER_A=47, LETTER_B=48, LETTER_C=49, LETTER_D=50, 
		LETTER_E=51, LETTER_F=52, LETTER_G=53, LETTER_X=54, LETTER_a=55, LETTER_b=56, 
		LETTER_c=57, LETTER_d=58, LETTER_e=59, LETTER_f=60, LETTER_g=61, LETTER_J=62, 
		WORD_CLEF=63, WORD_SKERN=64, WORD_SMENS=65, WORD_MET=66, DOT=67, BARLINE=68, 
		EQUAL=69, SLASH=70, BACKSLASH=71, ASTERISK=72, CIRCUNFLEX=73, APOSTROPHE=74, 
		SEMICOLON=75, COLON=76, COLOURED=77, GRAVE_ACCENT=78, EXCLAMATION=79, 
		COMA=80, SLURS_COUNT=81, TOKEN_FINISH=82;
	public static final int
		RULE_startRule = 0, RULE_mastercleff = 1, RULE_keysignature = 2, RULE_note_signature = 3, 
		RULE_notesuffix = 4, RULE_pitch = 5, RULE_stem_direction = 6, RULE_kern_notation = 7, 
		RULE_timesignature = 8, RULE_fraction = 9, RULE_number = 10, RULE_metter = 11, 
		RULE_common_met = 12, RULE_musicalcontent = 13, RULE_measure = 14, RULE_items = 15, 
		RULE_item = 16, RULE_changeconfiguration = 17, RULE_slurs = 18, RULE_ties = 19, 
		RULE_notes = 20, RULE_beaming = 21, RULE_note = 22, RULE_time = 23, RULE_rest = 24, 
		RULE_barlines = 25, RULE_chord = 26, RULE_articulations = 27, RULE_ornaments = 28, 
		RULE_partial_beaming = 29, RULE_edit_accident = 30, RULE_doubleBarline = 31, 
		RULE_rightRepeatBarline = 32, RULE_leftRepeatBarline = 33, RULE_doubleRepeatBarline = 34, 
		RULE_endBarline = 35, RULE_mens_notation = 36, RULE_m_timesignature = 37, 
		RULE_m_musicalcontent = 38, RULE_m_measure = 39, RULE_m_items = 40, RULE_m_item = 41, 
		RULE_m_note = 42, RULE_m_barlines = 43, RULE_m_rest = 44, RULE_m_slurs = 45, 
		RULE_m_ligature = 46, RULE_m_dot = 47, RULE_m_notesuffix = 48, RULE_mensural_signs = 49, 
		RULE_signs_c = 50, RULE_signs_p = 51, RULE_m_perfect = 52, RULE_m_imperfect = 53, 
		RULE_noteName = 54, RULE_noteNameCl = 55, RULE_m_rhythm = 56, RULE_not_hide = 57, 
		RULE_bracket = 58, RULE_parenthe = 59, RULE_digit = 60, RULE_clef = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "mastercleff", "keysignature", "note_signature", "notesuffix", 
			"pitch", "stem_direction", "kern_notation", "timesignature", "fraction", 
			"number", "metter", "common_met", "musicalcontent", "measure", "items", 
			"item", "changeconfiguration", "slurs", "ties", "notes", "beaming", "note", 
			"time", "rest", "barlines", "chord", "articulations", "ornaments", "partial_beaming", 
			"edit_accident", "doubleBarline", "rightRepeatBarline", "leftRepeatBarline", 
			"doubleRepeatBarline", "endBarline", "mens_notation", "m_timesignature", 
			"m_musicalcontent", "m_measure", "m_items", "m_item", "m_note", "m_barlines", 
			"m_rest", "m_slurs", "m_ligature", "m_dot", "m_notesuffix", "mensural_signs", 
			"signs_c", "signs_p", "m_perfect", "m_imperfect", "noteName", "noteNameCl", 
			"m_rhythm", "not_hide", "bracket", "parenthe", "digit", "clef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'L'", "'M'", null, "'1'", "'4'", "'3'", "'2'", "'5'", "'6'", 
			"'7'", "'8'", "'9'", "'0'", "'#'", "'-'", "'##'", "'--'", "'n'", "' '", 
			"'>'", "'<'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'K'", "'k'", 
			"'S'", "'s'", "'u'", "'m'", "'T'", "'t'", "'W'", "'w'", "'U'", "'p'", 
			"'i'", "'v'", "'r'", "'R'", "'I'", "'P'", "'A'", "'B'", "'C'", "'D'", 
			"'E'", "'F'", "'G'", "'X'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", 
			"'g'", "'J'", "'clef'", "'skern'", "'mens'", "'met'", "'.'", "'|'", "'='", 
			"'/'", "'\\'", "'*'", "'^'", "'''", "';'", "':'", "'~'", "'`'", "'!'", 
			"','", "'&'", "'*-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LETTER_L", "LETTER_M", "PERTFECT", "ONE", "FOUR", "THREE", 
			"TWO", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "ZERO", "SHARP", "FLAT", 
			"DOUBLESHARP", "DOUBLEFLAT", "NATURAL", "SPACE", "GREATER", "LESS", "LEFTPAR", 
			"RIGHTPAR", "LEFTBRACKET", "RIGHTBRACKET", "LEFTCURBRACES", "RIGHTCURBRACES", 
			"LETTER_K", "LETTER_k", "LETTER_S", "LETTER_s", "LETTER_u", "LETTER_m", 
			"LETTER_T", "LETTER_t", "LETTER_W", "LETTER_w", "LETTER_U", "LETTER_p", 
			"LETTER_i", "LETTER_v", "LETTER_r", "LETTER_R", "LETTER_I", "LETTER_P", 
			"LETTER_A", "LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", "LETTER_F", 
			"LETTER_G", "LETTER_X", "LETTER_a", "LETTER_b", "LETTER_c", "LETTER_d", 
			"LETTER_e", "LETTER_f", "LETTER_g", "LETTER_J", "WORD_CLEF", "WORD_SKERN", 
			"WORD_SMENS", "WORD_MET", "DOT", "BARLINE", "EQUAL", "SLASH", "BACKSLASH", 
			"ASTERISK", "CIRCUNFLEX", "APOSTROPHE", "SEMICOLON", "COLON", "COLOURED", 
			"GRAVE_ACCENT", "EXCLAMATION", "COMA", "SLURS_COUNT", "TOKEN_FINISH"
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
	public String getGrammarFileName() { return "kernmensParser.g4"; }

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

	public static class StartRuleContext extends ParserRuleContext {
		public List<Kern_notationContext> kern_notation() {
			return getRuleContexts(Kern_notationContext.class);
		}
		public Kern_notationContext kern_notation(int i) {
			return getRuleContext(Kern_notationContext.class,i);
		}
		public List<Mens_notationContext> mens_notation() {
			return getRuleContexts(Mens_notationContext.class);
		}
		public Mens_notationContext mens_notation(int i) {
			return getRuleContext(Mens_notationContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					kern_notation();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASTERISK );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					mens_notation();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASTERISK );
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

	public static class MastercleffContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode WORD_CLEF() { return getToken(kernmensParser.WORD_CLEF, 0); }
		public ClefContext clef() {
			return getRuleContext(ClefContext.class,0);
		}
		public MastercleffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mastercleff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMastercleff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMastercleff(this);
		}
	}

	public final MastercleffContext mastercleff() throws RecognitionException {
		MastercleffContext _localctx = new MastercleffContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mastercleff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ASTERISK);
			setState(137);
			match(WORD_CLEF);
			setState(138);
			clef();
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
		public TerminalNode LETTER_k() { return getToken(kernmensParser.LETTER_k, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(kernmensParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public List<Note_signatureContext> note_signature() {
			return getRuleContexts(Note_signatureContext.class);
		}
		public Note_signatureContext note_signature(int i) {
			return getRuleContext(Note_signatureContext.class,i);
		}
		public KeysignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keysignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterKeysignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitKeysignature(this);
		}
	}

	public final KeysignatureContext keysignature() throws RecognitionException {
		KeysignatureContext _localctx = new KeysignatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keysignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ASTERISK);
			setState(141);
			match(LETTER_k);
			setState(142);
			match(LEFTBRACKET);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_a) | (1L << LETTER_b) | (1L << LETTER_c) | (1L << LETTER_d) | (1L << LETTER_e) | (1L << LETTER_f) | (1L << LETTER_g))) != 0)) {
				{
				{
				setState(143);
				note_signature();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		public NoteNameContext noteName() {
			return getRuleContext(NoteNameContext.class,0);
		}
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public TerminalNode SHARP() { return getToken(kernmensParser.SHARP, 0); }
		public Note_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNote_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNote_signature(this);
		}
	}

	public final Note_signatureContext note_signature() throws RecognitionException {
		Note_signatureContext _localctx = new Note_signatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_note_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			noteName();
			setState(152);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNotesuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNotesuffix(this);
		}
	}

	public final NotesuffixContext notesuffix() throws RecognitionException {
		NotesuffixContext _localctx = new NotesuffixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		public List<NoteNameContext> noteName() {
			return getRuleContexts(NoteNameContext.class);
		}
		public NoteNameContext noteName(int i) {
			return getRuleContext(NoteNameContext.class,i);
		}
		public List<NoteNameClContext> noteNameCl() {
			return getRuleContexts(NoteNameClContext.class);
		}
		public NoteNameClContext noteNameCl(int i) {
			return getRuleContext(NoteNameClContext.class,i);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pitch);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_a:
			case LETTER_b:
			case LETTER_c:
			case LETTER_d:
			case LETTER_e:
			case LETTER_f:
			case LETTER_g:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					noteName();
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_a) | (1L << LETTER_b) | (1L << LETTER_c) | (1L << LETTER_d) | (1L << LETTER_e) | (1L << LETTER_f) | (1L << LETTER_g))) != 0) );
				}
				break;
			case LETTER_A:
			case LETTER_B:
			case LETTER_C:
			case LETTER_D:
			case LETTER_E:
			case LETTER_F:
			case LETTER_G:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					noteNameCl();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_A) | (1L << LETTER_B) | (1L << LETTER_C) | (1L << LETTER_D) | (1L << LETTER_E) | (1L << LETTER_F) | (1L << LETTER_G))) != 0) );
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterStem_direction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitStem_direction(this);
		}
	}

	public final Stem_directionContext stem_direction() throws RecognitionException {
		Stem_directionContext _localctx = new Stem_directionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stem_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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

	public static class Kern_notationContext extends ParserRuleContext {
		public List<TerminalNode> ASTERISK() { return getTokens(kernmensParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(kernmensParser.ASTERISK, i);
		}
		public TerminalNode WORD_SKERN() { return getToken(kernmensParser.WORD_SKERN, 0); }
		public MastercleffContext mastercleff() {
			return getRuleContext(MastercleffContext.class,0);
		}
		public MusicalcontentContext musicalcontent() {
			return getRuleContext(MusicalcontentContext.class,0);
		}
		public TerminalNode TOKEN_FINISH() { return getToken(kernmensParser.TOKEN_FINISH, 0); }
		public KeysignatureContext keysignature() {
			return getRuleContext(KeysignatureContext.class,0);
		}
		public TimesignatureContext timesignature() {
			return getRuleContext(TimesignatureContext.class,0);
		}
		public Kern_notationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kern_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterKern_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitKern_notation(this);
		}
	}

	public final Kern_notationContext kern_notation() throws RecognitionException {
		Kern_notationContext _localctx = new Kern_notationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kern_notation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ASTERISK);
			setState(171);
			match(ASTERISK);
			setState(172);
			match(WORD_SKERN);
			setState(173);
			mastercleff();
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(174);
				keysignature();
				}
				break;
			}
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(177);
				timesignature();
				}
				break;
			}
			setState(180);
			musicalcontent();
			setState(181);
			match(TOKEN_FINISH);
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

	public static class TimesignatureContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode LETTER_M() { return getToken(kernmensParser.LETTER_M, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public MetterContext metter() {
			return getRuleContext(MetterContext.class,0);
		}
		public TimesignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTimesignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTimesignature(this);
		}
	}

	public final TimesignatureContext timesignature() throws RecognitionException {
		TimesignatureContext _localctx = new TimesignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ASTERISK);
			setState(184);
			match(LETTER_M);
			setState(185);
			fraction();
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(186);
				metter();
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

	public static class FractionContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitFraction(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			number();
			setState(190);
			match(SLASH);
			setState(191);
			number();
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

	public static class NumberContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(193);
					digit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196); 
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

	public static class MetterContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode WORD_MET() { return getToken(kernmensParser.WORD_MET, 0); }
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public Common_metContext common_met() {
			return getRuleContext(Common_metContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public MetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMetter(this);
		}
	}

	public final MetterContext metter() throws RecognitionException {
		MetterContext _localctx = new MetterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_metter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ASTERISK);
			setState(199);
			match(WORD_MET);
			setState(200);
			match(LEFTPAR);
			setState(201);
			common_met();
			setState(202);
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

	public static class Common_metContext extends ParserRuleContext {
		public TerminalNode LETTER_c() { return getToken(kernmensParser.LETTER_c, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public Common_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterCommon_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitCommon_met(this);
		}
	}

	public final Common_metContext common_met() throws RecognitionException {
		Common_metContext _localctx = new Common_metContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_common_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LETTER_c);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BARLINE) {
				{
				setState(205);
				match(BARLINE);
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

	public static class MusicalcontentContext extends ParserRuleContext {
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public MusicalcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musicalcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMusicalcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMusicalcontent(this);
		}
	}

	public final MusicalcontentContext musicalcontent() throws RecognitionException {
		MusicalcontentContext _localctx = new MusicalcontentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_musicalcontent);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (BARLINE - 68)) | (1L << (EQUAL - 68)) | (1L << (COLON - 68)) | (1L << (EXCLAMATION - 68)))) != 0)) {
					{
					setState(208);
					barlines();
					}
				}

				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(211);
					measure();
					}
					}
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LEFTBRACKET) | (1L << LETTER_U))) != 0) || _la==ASTERISK || _la==SLURS_COUNT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				items();
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

	public static class MeasureContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_measure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			items();
			setState(220);
			barlines();
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

	public static class ItemsContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitItems(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				item();
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LEFTBRACKET) | (1L << LETTER_U))) != 0) || _la==ASTERISK || _la==SLURS_COUNT );
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

	public static class ItemContext extends ParserRuleContext {
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public ChangeconfigurationContext changeconfiguration() {
			return getRuleContext(ChangeconfigurationContext.class,0);
		}
		public SlursContext slurs() {
			return getRuleContext(SlursContext.class,0);
		}
		public TiesContext ties() {
			return getRuleContext(TiesContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_item);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				notes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				changeconfiguration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				slurs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				ties();
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

	public static class ChangeconfigurationContext extends ParserRuleContext {
		public List<MastercleffContext> mastercleff() {
			return getRuleContexts(MastercleffContext.class);
		}
		public MastercleffContext mastercleff(int i) {
			return getRuleContext(MastercleffContext.class,i);
		}
		public List<TimesignatureContext> timesignature() {
			return getRuleContexts(TimesignatureContext.class);
		}
		public TimesignatureContext timesignature(int i) {
			return getRuleContext(TimesignatureContext.class,i);
		}
		public List<KeysignatureContext> keysignature() {
			return getRuleContexts(KeysignatureContext.class);
		}
		public KeysignatureContext keysignature(int i) {
			return getRuleContext(KeysignatureContext.class,i);
		}
		public ChangeconfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeconfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterChangeconfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitChangeconfiguration(this);
		}
	}

	public final ChangeconfigurationContext changeconfiguration() throws RecognitionException {
		ChangeconfigurationContext _localctx = new ChangeconfigurationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_changeconfiguration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(234);
						mastercleff();
						}
						break;
					case 2:
						{
						setState(235);
						timesignature();
						}
						break;
					case 3:
						{
						setState(236);
						keysignature();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class SlursContext extends ParserRuleContext {
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public List<TerminalNode> SLURS_COUNT() { return getTokens(kernmensParser.SLURS_COUNT); }
		public TerminalNode SLURS_COUNT(int i) {
			return getToken(kernmensParser.SLURS_COUNT, i);
		}
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public SlursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterSlurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitSlurs(this);
		}
	}

	public final SlursContext slurs() throws RecognitionException {
		SlursContext _localctx = new SlursContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_slurs);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTER_U) {
					{
					setState(241);
					match(LETTER_U);
					}
				}

				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(244);
					match(SLURS_COUNT);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(LEFTPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(251);
					match(SLURS_COUNT);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(RIGHTPAR);
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

	public static class TiesContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(kernmensParser.LEFTBRACKET, 0); }
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public TiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTies(this);
		}
	}

	public final TiesContext ties() throws RecognitionException {
		TiesContext _localctx = new TiesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ties);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTER_U) {
					{
					setState(260);
					match(LETTER_U);
					}
				}

				setState(263);
				match(LEFTBRACKET);
				setState(264);
				note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				note();
				setState(266);
				match(RIGHTBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(LEFTBRACKET);
				setState(269);
				note();
				setState(270);
				match(RIGHTBRACKET);
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

	public static class NotesContext extends ParserRuleContext {
		public BeamingContext beaming() {
			return getRuleContext(BeamingContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public NotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNotes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNotes(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_notes);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				beaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				note();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				chord();
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

	public static class BeamingContext extends ParserRuleContext {
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public List<TerminalNode> LETTER_L() { return getTokens(kernmensParser.LETTER_L); }
		public TerminalNode LETTER_L(int i) {
			return getToken(kernmensParser.LETTER_L, i);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public TiesContext ties() {
			return getRuleContext(TiesContext.class,0);
		}
		public List<TerminalNode> LETTER_J() { return getTokens(kernmensParser.LETTER_J); }
		public TerminalNode LETTER_J(int i) {
			return getToken(kernmensParser.LETTER_J, i);
		}
		public Partial_beamingContext partial_beaming() {
			return getRuleContext(Partial_beamingContext.class,0);
		}
		public BeamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterBeaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitBeaming(this);
		}
	}

	public final BeamingContext beaming() throws RecognitionException {
		BeamingContext _localctx = new BeamingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_beaming);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(279);
						note();
						}
						break;
					case 2:
						{
						setState(280);
						ties();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(283);
					chord();
					}
					break;
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(286);
					match(LETTER_L);
					}
					}
					setState(289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_L );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(291);
						note();
						}
						break;
					case 2:
						{
						setState(292);
						ties();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(295);
					chord();
					}
					break;
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					match(LETTER_J);
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_J );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(303);
						note();
						}
						break;
					case 2:
						{
						setState(304);
						ties();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(307);
					chord();
					}
					break;
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LETTER_L) {
					{
					{
					setState(310);
					match(LETTER_L);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
				partial_beaming();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(318);
						note();
						}
						break;
					case 2:
						{
						setState(319);
						ties();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(322);
					chord();
					}
					break;
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LETTER_J) {
					{
					{
					setState(325);
					match(LETTER_J);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				partial_beaming();
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

	public static class NoteContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(kernmensParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(kernmensParser.DOT, i);
		}
		public NotesuffixContext notesuffix() {
			return getRuleContext(NotesuffixContext.class,0);
		}
		public Edit_accidentContext edit_accident() {
			return getRuleContext(Edit_accidentContext.class,0);
		}
		public Not_hideContext not_hide() {
			return getRuleContext(Not_hideContext.class,0);
		}
		public OrnamentsContext ornaments() {
			return getRuleContext(OrnamentsContext.class,0);
		}
		public ArticulationsContext articulations() {
			return getRuleContext(ArticulationsContext.class,0);
		}
		public Stem_directionContext stem_direction() {
			return getRuleContext(Stem_directionContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			time();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(336);
				match(DOT);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			pitch();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL))) != 0)) {
				{
				setState(343);
				notesuffix();
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_I || _la==LETTER_P) {
				{
				setState(346);
				edit_accident();
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_X) {
				{
				setState(349);
				not_hide();
				}
			}

			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_M) | (1L << LETTER_m) | (1L << LETTER_T) | (1L << LETTER_t) | (1L << LETTER_W) | (1L << LETTER_w))) != 0)) {
				{
				setState(352);
				ornaments();
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (CIRCUNFLEX - 73)) | (1L << (APOSTROPHE - 73)) | (1L << (SEMICOLON - 73)) | (1L << (COLOURED - 73)) | (1L << (GRAVE_ACCENT - 73)))) != 0)) {
				{
				setState(355);
				articulations();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(358);
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

	public static class TimeContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				digit();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO))) != 0) );
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

	public static class RestContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public List<TerminalNode> DOT() { return getTokens(kernmensParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(kernmensParser.DOT, i);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			time();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(367);
				match(DOT);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
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

	public static class BarlinesContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(kernmensParser.EQUAL, 0); }
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public DoubleBarlineContext doubleBarline() {
			return getRuleContext(DoubleBarlineContext.class,0);
		}
		public LeftRepeatBarlineContext leftRepeatBarline() {
			return getRuleContext(LeftRepeatBarlineContext.class,0);
		}
		public RightRepeatBarlineContext rightRepeatBarline() {
			return getRuleContext(RightRepeatBarlineContext.class,0);
		}
		public EndBarlineContext endBarline() {
			return getRuleContext(EndBarlineContext.class,0);
		}
		public DoubleRepeatBarlineContext doubleRepeatBarline() {
			return getRuleContext(DoubleRepeatBarlineContext.class,0);
		}
		public BarlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterBarlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitBarlines(this);
		}
	}

	public final BarlinesContext barlines() throws RecognitionException {
		BarlinesContext _localctx = new BarlinesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_barlines);
		int _la;
		try {
			int _alt;
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(EQUAL);
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(376);
						digit();
						}
						} 
					}
					setState(381);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FLAT) {
					{
					setState(382);
					match(FLAT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(385);
					match(EQUAL);
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO))) != 0)) {
						{
						{
						setState(386);
						digit();
						}
						}
						setState(391);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(394);
				doubleBarline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(395);
					match(EQUAL);
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO))) != 0)) {
						{
						{
						setState(396);
						digit();
						}
						}
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(404);
				leftRepeatBarline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(405);
					match(EQUAL);
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO))) != 0)) {
						{
						{
						setState(406);
						digit();
						}
						}
						setState(411);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(414);
				rightRepeatBarline();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				endBarline();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(416);
					match(EQUAL);
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO))) != 0)) {
						{
						{
						setState(417);
						digit();
						}
						}
						setState(422);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(425);
				doubleRepeatBarline();
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

	public static class ChordContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<TiesContext> ties() {
			return getRuleContexts(TiesContext.class);
		}
		public TiesContext ties(int i) {
			return getRuleContext(TiesContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(kernmensParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(kernmensParser.SPACE, i);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(428);
				note();
				}
				break;
			case 2:
				{
				setState(429);
				ties();
				}
				break;
			}
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				match(SPACE);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(433);
					note();
					}
					break;
				case 2:
					{
					setState(434);
					ties();
					}
					break;
				}
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
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

	public static class ArticulationsContext extends ParserRuleContext {
		public TerminalNode APOSTROPHE() { return getToken(kernmensParser.APOSTROPHE, 0); }
		public List<TerminalNode> CIRCUNFLEX() { return getTokens(kernmensParser.CIRCUNFLEX); }
		public TerminalNode CIRCUNFLEX(int i) {
			return getToken(kernmensParser.CIRCUNFLEX, i);
		}
		public TerminalNode GRAVE_ACCENT() { return getToken(kernmensParser.GRAVE_ACCENT, 0); }
		public TerminalNode COLOURED() { return getToken(kernmensParser.COLOURED, 0); }
		public TerminalNode SEMICOLON() { return getToken(kernmensParser.SEMICOLON, 0); }
		public ArticulationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_articulations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterArticulations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitArticulations(this);
		}
	}

	public final ArticulationsContext articulations() throws RecognitionException {
		ArticulationsContext _localctx = new ArticulationsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_articulations);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(APOSTROPHE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(CIRCUNFLEX);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				match(GRAVE_ACCENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				match(COLOURED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				match(APOSTROPHE);
				setState(446);
				match(COLOURED);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				match(APOSTROPHE);
				setState(448);
				match(CIRCUNFLEX);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				match(CIRCUNFLEX);
				setState(450);
				match(CIRCUNFLEX);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				match(SEMICOLON);
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

	public static class OrnamentsContext extends ParserRuleContext {
		public TerminalNode LETTER_t() { return getToken(kernmensParser.LETTER_t, 0); }
		public TerminalNode LETTER_T() { return getToken(kernmensParser.LETTER_T, 0); }
		public TerminalNode LETTER_m() { return getToken(kernmensParser.LETTER_m, 0); }
		public TerminalNode LETTER_M() { return getToken(kernmensParser.LETTER_M, 0); }
		public TerminalNode LETTER_W() { return getToken(kernmensParser.LETTER_W, 0); }
		public TerminalNode LETTER_w() { return getToken(kernmensParser.LETTER_w, 0); }
		public OrnamentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ornaments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterOrnaments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitOrnaments(this);
		}
	}

	public final OrnamentsContext ornaments() throws RecognitionException {
		OrnamentsContext _localctx = new OrnamentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ornaments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_M) | (1L << LETTER_m) | (1L << LETTER_T) | (1L << LETTER_t) | (1L << LETTER_W) | (1L << LETTER_w))) != 0)) ) {
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

	public static class Partial_beamingContext extends ParserRuleContext {
		public TerminalNode LETTER_K() { return getToken(kernmensParser.LETTER_K, 0); }
		public TerminalNode LETTER_k() { return getToken(kernmensParser.LETTER_k, 0); }
		public Partial_beamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial_beaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterPartial_beaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitPartial_beaming(this);
		}
	}

	public final Partial_beamingContext partial_beaming() throws RecognitionException {
		Partial_beamingContext _localctx = new Partial_beamingContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_partial_beaming);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(_la==LETTER_K || _la==LETTER_k) ) {
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

	public static class Edit_accidentContext extends ParserRuleContext {
		public BracketContext bracket() {
			return getRuleContext(BracketContext.class,0);
		}
		public ParentheContext parenthe() {
			return getRuleContext(ParentheContext.class,0);
		}
		public Edit_accidentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edit_accident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterEdit_accident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitEdit_accident(this);
		}
	}

	public final Edit_accidentContext edit_accident() throws RecognitionException {
		Edit_accidentContext _localctx = new Edit_accidentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_edit_accident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_I:
				{
				setState(458);
				bracket();
				}
				break;
			case LETTER_P:
				{
				setState(459);
				parenthe();
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

	public static class DoubleBarlineContext extends ParserRuleContext {
		public List<TerminalNode> BARLINE() { return getTokens(kernmensParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(kernmensParser.BARLINE, i);
		}
		public DoubleBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterDoubleBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitDoubleBarline(this);
		}
	}

	public final DoubleBarlineContext doubleBarline() throws RecognitionException {
		DoubleBarlineContext _localctx = new DoubleBarlineContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_doubleBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(BARLINE);
			setState(463);
			match(BARLINE);
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

	public static class RightRepeatBarlineContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public RightRepeatBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightRepeatBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterRightRepeatBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitRightRepeatBarline(this);
		}
	}

	public final RightRepeatBarlineContext rightRepeatBarline() throws RecognitionException {
		RightRepeatBarlineContext _localctx = new RightRepeatBarlineContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rightRepeatBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(COLON);
			setState(466);
			match(BARLINE);
			setState(467);
			match(EXCLAMATION);
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

	public static class LeftRepeatBarlineContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
		public LeftRepeatBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftRepeatBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterLeftRepeatBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitLeftRepeatBarline(this);
		}
	}

	public final LeftRepeatBarlineContext leftRepeatBarline() throws RecognitionException {
		LeftRepeatBarlineContext _localctx = new LeftRepeatBarlineContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_leftRepeatBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(EXCLAMATION);
			setState(470);
			match(BARLINE);
			setState(471);
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

	public static class DoubleRepeatBarlineContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(kernmensParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(kernmensParser.COLON, i);
		}
		public List<TerminalNode> BARLINE() { return getTokens(kernmensParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(kernmensParser.BARLINE, i);
		}
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public DoubleRepeatBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleRepeatBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterDoubleRepeatBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitDoubleRepeatBarline(this);
		}
	}

	public final DoubleRepeatBarlineContext doubleRepeatBarline() throws RecognitionException {
		DoubleRepeatBarlineContext _localctx = new DoubleRepeatBarlineContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_doubleRepeatBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(COLON);
			setState(474);
			match(BARLINE);
			setState(475);
			match(EXCLAMATION);
			setState(476);
			match(BARLINE);
			setState(477);
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

	public static class EndBarlineContext extends ParserRuleContext {
		public List<TerminalNode> EQUAL() { return getTokens(kernmensParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(kernmensParser.EQUAL, i);
		}
		public EndBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterEndBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitEndBarline(this);
		}
	}

	public final EndBarlineContext endBarline() throws RecognitionException {
		EndBarlineContext _localctx = new EndBarlineContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_endBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(EQUAL);
			setState(480);
			match(EQUAL);
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
		public TerminalNode TOKEN_FINISH() { return getToken(kernmensParser.TOKEN_FINISH, 0); }
		public KeysignatureContext keysignature() {
			return getRuleContext(KeysignatureContext.class,0);
		}
		public M_timesignatureContext m_timesignature() {
			return getRuleContext(M_timesignatureContext.class,0);
		}
		public Mens_notationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mens_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMens_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMens_notation(this);
		}
	}

	public final Mens_notationContext mens_notation() throws RecognitionException {
		Mens_notationContext _localctx = new Mens_notationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mens_notation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(ASTERISK);
			setState(483);
			match(ASTERISK);
			setState(484);
			match(WORD_SMENS);
			setState(485);
			mastercleff();
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(486);
				keysignature();
				}
				break;
			}
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(489);
				m_timesignature();
				}
			}

			setState(492);
			m_musicalcontent();
			setState(493);
			match(TOKEN_FINISH);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_timesignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_timesignature(this);
		}
	}

	public final M_timesignatureContext m_timesignature() throws RecognitionException {
		M_timesignatureContext _localctx = new M_timesignatureContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_m_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(ASTERISK);
			setState(496);
			match(WORD_MET);
			setState(497);
			match(LEFTPAR);
			setState(498);
			mensural_signs();
			setState(499);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_musicalcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_musicalcontent(this);
		}
	}

	public final M_musicalcontentContext m_musicalcontent() throws RecognitionException {
		M_musicalcontentContext _localctx = new M_musicalcontentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_m_musicalcontent);
		int _la;
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(501);
					m_measure();
					}
					}
					setState(504); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_L) | (1L << LETTER_M) | (1L << GREATER) | (1L << LESS) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LETTER_S) | (1L << LETTER_s) | (1L << LETTER_u) | (1L << LETTER_m) | (1L << LETTER_U) | (1L << LETTER_X))) != 0) || _la==SLURS_COUNT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
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
		public M_barlinesContext m_barlines() {
			return getRuleContext(M_barlinesContext.class,0);
		}
		public List<M_itemsContext> m_items() {
			return getRuleContexts(M_itemsContext.class);
		}
		public M_itemsContext m_items(int i) {
			return getRuleContext(M_itemsContext.class,i);
		}
		public M_measureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_measure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_measure(this);
		}
	}

	public final M_measureContext m_measure() throws RecognitionException {
		M_measureContext _localctx = new M_measureContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_m_measure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(509);
				m_items();
				}
				}
				setState(512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_L) | (1L << LETTER_M) | (1L << GREATER) | (1L << LESS) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LETTER_S) | (1L << LETTER_s) | (1L << LETTER_u) | (1L << LETTER_m) | (1L << LETTER_U) | (1L << LETTER_X))) != 0) || _la==SLURS_COUNT );
			setState(514);
			m_barlines();
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_items(this);
		}
	}

	public final M_itemsContext m_items() throws RecognitionException {
		M_itemsContext _localctx = new M_itemsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_m_items);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(516);
					m_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(519); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_item(this);
		}
	}

	public final M_itemContext m_item() throws RecognitionException {
		M_itemContext _localctx = new M_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_m_item);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				m_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				m_rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				m_slurs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
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
		public M_rhythmContext m_rhythm() {
			return getRuleContext(M_rhythmContext.class,0);
		}
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
		public TerminalNode COLOURED() { return getToken(kernmensParser.COLOURED, 0); }
		public M_notesuffixContext m_notesuffix() {
			return getRuleContext(M_notesuffixContext.class,0);
		}
		public Stem_directionContext stem_direction() {
			return getRuleContext(Stem_directionContext.class,0);
		}
		public BracketContext bracket() {
			return getRuleContext(BracketContext.class,0);
		}
		public ParentheContext parenthe() {
			return getRuleContext(ParentheContext.class,0);
		}
		public M_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_note(this);
		}
	}

	public final M_noteContext m_note() throws RecognitionException {
		M_noteContext _localctx = new M_noteContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_m_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			m_rhythm();
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(528);
				m_dot();
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_p:
				{
				setState(531);
				m_perfect();
				}
				break;
			case LETTER_i:
				{
				setState(532);
				m_imperfect();
				}
				break;
			case LETTER_A:
			case LETTER_B:
			case LETTER_C:
			case LETTER_D:
			case LETTER_E:
			case LETTER_F:
			case LETTER_G:
			case LETTER_a:
			case LETTER_b:
			case LETTER_c:
			case LETTER_d:
			case LETTER_e:
			case LETTER_f:
			case LETTER_g:
			case COLOURED:
				break;
			default:
				break;
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOURED) {
				{
				setState(535);
				match(COLOURED);
				}
			}

			setState(538);
			pitch();
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(539);
				m_notesuffix();
				setState(542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETTER_I:
					{
					setState(540);
					bracket();
					}
					break;
				case LETTER_P:
					{
					setState(541);
					parenthe();
					}
					break;
				case LETTER_L:
				case LETTER_M:
				case GREATER:
				case LESS:
				case LEFTPAR:
				case RIGHTPAR:
				case LETTER_S:
				case LETTER_s:
				case LETTER_u:
				case LETTER_m:
				case LETTER_U:
				case LETTER_X:
				case EQUAL:
				case SLASH:
				case BACKSLASH:
				case SLURS_COUNT:
				case TOKEN_FINISH:
					break;
				default:
					break;
				}
				}
				break;
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(546);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_barlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_barlines(this);
		}
	}

	public final M_barlinesContext m_barlines() throws RecognitionException {
		M_barlinesContext _localctx = new M_barlinesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_m_barlines);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(EQUAL);
				setState(550);
				match(FLAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(EQUAL);
				setState(552);
				match(BARLINE);
				setState(553);
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
		public M_rhythmContext m_rhythm() {
			return getRuleContext(M_rhythmContext.class,0);
		}
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public M_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_rest(this);
		}
	}

	public final M_restContext m_rest() throws RecognitionException {
		M_restContext _localctx = new M_restContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_m_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			m_rhythm();
			setState(557);
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
		public List<TerminalNode> SLURS_COUNT() { return getTokens(kernmensParser.SLURS_COUNT); }
		public TerminalNode SLURS_COUNT(int i) {
			return getToken(kernmensParser.SLURS_COUNT, i);
		}
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public M_slursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_slurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_slurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_slurs(this);
		}
	}

	public final M_slursContext m_slurs() throws RecognitionException {
		M_slursContext _localctx = new M_slursContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_m_slurs);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(559);
					match(SLURS_COUNT);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
				match(LEFTPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(566);
					match(SLURS_COUNT);
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(572);
				match(RIGHTPAR);
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

	public static class M_ligatureContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(kernmensParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(kernmensParser.GREATER, 0); }
		public M_ligatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_ligature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_ligature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_ligature(this);
		}
	}

	public final M_ligatureContext m_ligature() throws RecognitionException {
		M_ligatureContext _localctx = new M_ligatureContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_m_ligature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_dot(this);
		}
	}

	public final M_dotContext m_dot() throws RecognitionException {
		M_dotContext _localctx = new M_dotContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_m_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(LETTER_p);
			setState(578);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_notesuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_notesuffix(this);
		}
	}

	public final M_notesuffixContext m_notesuffix() throws RecognitionException {
		M_notesuffixContext _localctx = new M_notesuffixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_m_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(580);
				match(LETTER_U);
				}
			}

			setState(583);
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
		public Signs_cContext signs_c() {
			return getRuleContext(Signs_cContext.class,0);
		}
		public Signs_pContext signs_p() {
			return getRuleContext(Signs_pContext.class,0);
		}
		public Mensural_signsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensural_signs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMensural_signs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMensural_signs(this);
		}
	}

	public final Mensural_signsContext mensural_signs() throws RecognitionException {
		Mensural_signsContext _localctx = new Mensural_signsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mensural_signs);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_C:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				signs_c();
				}
				break;
			case PERTFECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				signs_p();
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

	public static class Signs_cContext extends ParserRuleContext {
		public TerminalNode LETTER_C() { return getToken(kernmensParser.LETTER_C, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode TWO() { return getToken(kernmensParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(kernmensParser.THREE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public Signs_cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signs_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterSigns_c(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitSigns_c(this);
		}
	}

	public final Signs_cContext signs_c() throws RecognitionException {
		Signs_cContext _localctx = new Signs_cContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_signs_c);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(589);
			match(LETTER_C);
			}
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BARLINE:
				{
				setState(590);
				match(BARLINE);
				setState(596);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THREE:
					{
					setState(591);
					match(THREE);
					}
					break;
				case TWO:
					{
					setState(592);
					match(TWO);
					}
					break;
				case SLASH:
					{
					setState(593);
					match(SLASH);
					setState(594);
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
					setState(595);
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
				setState(598);
				match(TWO);
				}
				break;
			case THREE:
				{
				setState(599);
				match(THREE);
				}
				break;
			case DOT:
				{
				setState(600);
				match(DOT);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BARLINE) {
					{
					setState(601);
					match(BARLINE);
					}
				}

				}
				break;
			case LETTER_r:
				{
				setState(604);
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

	public static class Signs_pContext extends ParserRuleContext {
		public TerminalNode PERTFECT() { return getToken(kernmensParser.PERTFECT, 0); }
		public TerminalNode THREE() { return getToken(kernmensParser.THREE, 0); }
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public TerminalNode TWO() { return getToken(kernmensParser.TWO, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public Signs_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signs_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterSigns_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitSigns_p(this);
		}
	}

	public final Signs_pContext signs_p() throws RecognitionException {
		Signs_pContext _localctx = new Signs_pContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_signs_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(607);
			match(PERTFECT);
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(617);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TWO:
					{
					setState(608);
					match(TWO);
					}
					break;
				case THREE:
					{
					setState(609);
					match(THREE);
					}
					break;
				case BARLINE:
					{
					setState(610);
					match(BARLINE);
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THREE) {
						{
						setState(611);
						match(THREE);
						}
					}

					}
					break;
				case SLASH:
					{
					setState(614);
					match(SLASH);
					setState(615);
					match(THREE);
					}
					break;
				case DOT:
					{
					setState(616);
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
				setState(619);
				match(THREE);
				setState(620);
				match(SLASH);
				setState(621);
				match(TWO);
				}
				break;
			case 3:
				{
				setState(622);
				match(THREE);
				}
				break;
			case 4:
				{
				setState(623);
				match(TWO);
				}
				break;
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

	public static class M_perfectContext extends ParserRuleContext {
		public TerminalNode LETTER_p() { return getToken(kernmensParser.LETTER_p, 0); }
		public M_perfectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_perfect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_perfect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_perfect(this);
		}
	}

	public final M_perfectContext m_perfect() throws RecognitionException {
		M_perfectContext _localctx = new M_perfectContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_m_perfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_imperfect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_imperfect(this);
		}
	}

	public final M_imperfectContext m_imperfect() throws RecognitionException {
		M_imperfectContext _localctx = new M_imperfectContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_m_imperfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
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

	public static class NoteNameContext extends ParserRuleContext {
		public TerminalNode LETTER_a() { return getToken(kernmensParser.LETTER_a, 0); }
		public TerminalNode LETTER_b() { return getToken(kernmensParser.LETTER_b, 0); }
		public TerminalNode LETTER_c() { return getToken(kernmensParser.LETTER_c, 0); }
		public TerminalNode LETTER_d() { return getToken(kernmensParser.LETTER_d, 0); }
		public TerminalNode LETTER_e() { return getToken(kernmensParser.LETTER_e, 0); }
		public TerminalNode LETTER_f() { return getToken(kernmensParser.LETTER_f, 0); }
		public TerminalNode LETTER_g() { return getToken(kernmensParser.LETTER_g, 0); }
		public NoteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNoteName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNoteName(this);
		}
	}

	public final NoteNameContext noteName() throws RecognitionException {
		NoteNameContext _localctx = new NoteNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_noteName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_a) | (1L << LETTER_b) | (1L << LETTER_c) | (1L << LETTER_d) | (1L << LETTER_e) | (1L << LETTER_f) | (1L << LETTER_g))) != 0)) ) {
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

	public static class NoteNameClContext extends ParserRuleContext {
		public TerminalNode LETTER_A() { return getToken(kernmensParser.LETTER_A, 0); }
		public TerminalNode LETTER_B() { return getToken(kernmensParser.LETTER_B, 0); }
		public TerminalNode LETTER_C() { return getToken(kernmensParser.LETTER_C, 0); }
		public TerminalNode LETTER_D() { return getToken(kernmensParser.LETTER_D, 0); }
		public TerminalNode LETTER_E() { return getToken(kernmensParser.LETTER_E, 0); }
		public TerminalNode LETTER_F() { return getToken(kernmensParser.LETTER_F, 0); }
		public TerminalNode LETTER_G() { return getToken(kernmensParser.LETTER_G, 0); }
		public NoteNameClContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteNameCl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNoteNameCl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNoteNameCl(this);
		}
	}

	public final NoteNameClContext noteNameCl() throws RecognitionException {
		NoteNameClContext _localctx = new NoteNameClContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_noteNameCl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_A) | (1L << LETTER_B) | (1L << LETTER_C) | (1L << LETTER_D) | (1L << LETTER_E) | (1L << LETTER_F) | (1L << LETTER_G))) != 0)) ) {
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

	public static class M_rhythmContext extends ParserRuleContext {
		public TerminalNode LETTER_X() { return getToken(kernmensParser.LETTER_X, 0); }
		public TerminalNode LETTER_L() { return getToken(kernmensParser.LETTER_L, 0); }
		public TerminalNode LETTER_S() { return getToken(kernmensParser.LETTER_S, 0); }
		public TerminalNode LETTER_M() { return getToken(kernmensParser.LETTER_M, 0); }
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public TerminalNode LETTER_s() { return getToken(kernmensParser.LETTER_s, 0); }
		public TerminalNode LETTER_m() { return getToken(kernmensParser.LETTER_m, 0); }
		public TerminalNode LETTER_u() { return getToken(kernmensParser.LETTER_u, 0); }
		public M_rhythmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_rhythm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_rhythm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_rhythm(this);
		}
	}

	public final M_rhythmContext m_rhythm() throws RecognitionException {
		M_rhythmContext _localctx = new M_rhythmContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_m_rhythm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_L) | (1L << LETTER_M) | (1L << LETTER_S) | (1L << LETTER_s) | (1L << LETTER_u) | (1L << LETTER_m) | (1L << LETTER_U) | (1L << LETTER_X))) != 0)) ) {
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

	public static class Not_hideContext extends ParserRuleContext {
		public TerminalNode LETTER_X() { return getToken(kernmensParser.LETTER_X, 0); }
		public Not_hideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_hide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNot_hide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNot_hide(this);
		}
	}

	public final Not_hideContext not_hide() throws RecognitionException {
		Not_hideContext _localctx = new Not_hideContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_not_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(LETTER_X);
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

	public static class BracketContext extends ParserRuleContext {
		public TerminalNode LETTER_I() { return getToken(kernmensParser.LETTER_I, 0); }
		public BracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitBracket(this);
		}
	}

	public final BracketContext bracket() throws RecognitionException {
		BracketContext _localctx = new BracketContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(LETTER_I);
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

	public static class ParentheContext extends ParserRuleContext {
		public TerminalNode LETTER_P() { return getToken(kernmensParser.LETTER_P, 0); }
		public ParentheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterParenthe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitParenthe(this);
		}
	}

	public final ParentheContext parenthe() throws RecognitionException {
		ParentheContext _localctx = new ParentheContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parenthe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(LETTER_P);
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

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(kernmensParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(kernmensParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(kernmensParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(kernmensParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(kernmensParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(kernmensParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(kernmensParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(kernmensParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(kernmensParser.NINE, 0); }
		public TerminalNode ZERO() { return getToken(kernmensParser.ZERO, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << FOUR) | (1L << THREE) | (1L << TWO) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << ZERO))) != 0)) ) {
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

	public static class ClefContext extends ParserRuleContext {
		public TerminalNode LETTER_G() { return getToken(kernmensParser.LETTER_G, 0); }
		public TerminalNode TWO() { return getToken(kernmensParser.TWO, 0); }
		public TerminalNode LETTER_F() { return getToken(kernmensParser.LETTER_F, 0); }
		public TerminalNode THREE() { return getToken(kernmensParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(kernmensParser.FOUR, 0); }
		public TerminalNode LETTER_C() { return getToken(kernmensParser.LETTER_C, 0); }
		public TerminalNode FIVE() { return getToken(kernmensParser.FIVE, 0); }
		public TerminalNode ONE() { return getToken(kernmensParser.ONE, 0); }
		public ClefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterClef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitClef(this);
		}
	}

	public final ClefContext clef() throws RecognitionException {
		ClefContext _localctx = new ClefContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_clef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(644);
				match(LETTER_G);
				setState(645);
				match(TWO);
				}
				break;
			case 2:
				{
				setState(646);
				match(LETTER_F);
				setState(647);
				match(TWO);
				}
				break;
			case 3:
				{
				setState(648);
				match(LETTER_F);
				setState(649);
				match(THREE);
				}
				break;
			case 4:
				{
				setState(650);
				match(LETTER_F);
				setState(651);
				match(FOUR);
				}
				break;
			case 5:
				{
				setState(652);
				match(LETTER_C);
				setState(653);
				match(FIVE);
				}
				break;
			case 6:
				{
				setState(654);
				match(LETTER_C);
				setState(655);
				match(FOUR);
				}
				break;
			case 7:
				{
				setState(656);
				match(LETTER_C);
				setState(657);
				match(THREE);
				}
				break;
			case 8:
				{
				setState(658);
				match(LETTER_C);
				setState(659);
				match(TWO);
				}
				break;
			case 9:
				{
				setState(660);
				match(LETTER_C);
				setState(661);
				match(ONE);
				}
				break;
			case 10:
				{
				setState(662);
				match(LETTER_G);
				setState(663);
				match(ONE);
				}
				break;
			case 11:
				{
				setState(664);
				match(LETTER_G);
				setState(665);
				match(TWO);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u029f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\6\2\u0080\n\2\r\2\16\2\u0081\3\2\6\2\u0085\n\2\r\2\16"+
		"\2\u0086\5\2\u0089\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0093\n\4\f"+
		"\4\16\4\u0096\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\6\7\u00a0\n\7\r\7\16"+
		"\7\u00a1\3\7\6\7\u00a5\n\7\r\7\16\7\u00a6\5\7\u00a9\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00b2\n\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u00be\n\n\3\13\3\13\3\13\3\13\3\f\6\f\u00c5\n\f\r\f\16\f\u00c6"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00d1\n\16\3\17\5\17\u00d4\n\17"+
		"\3\17\6\17\u00d7\n\17\r\17\16\17\u00d8\3\17\5\17\u00dc\n\17\3\20\3\20"+
		"\3\20\3\21\6\21\u00e2\n\21\r\21\16\21\u00e3\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00eb\n\22\3\23\3\23\3\23\6\23\u00f0\n\23\r\23\16\23\u00f1\3\24\5"+
		"\24\u00f5\n\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb\13\24\3\24\3\24\7"+
		"\24\u00ff\n\24\f\24\16\24\u0102\13\24\3\24\5\24\u0105\n\24\3\25\5\25\u0108"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0113\n\25\3\26"+
		"\3\26\3\26\5\26\u0118\n\26\3\27\3\27\5\27\u011c\n\27\3\27\5\27\u011f\n"+
		"\27\3\27\6\27\u0122\n\27\r\27\16\27\u0123\3\27\3\27\5\27\u0128\n\27\3"+
		"\27\5\27\u012b\n\27\3\27\6\27\u012e\n\27\r\27\16\27\u012f\3\27\3\27\5"+
		"\27\u0134\n\27\3\27\5\27\u0137\n\27\3\27\7\27\u013a\n\27\f\27\16\27\u013d"+
		"\13\27\3\27\3\27\3\27\3\27\5\27\u0143\n\27\3\27\5\27\u0146\n\27\3\27\7"+
		"\27\u0149\n\27\f\27\16\27\u014c\13\27\3\27\3\27\5\27\u0150\n\27\3\30\3"+
		"\30\7\30\u0154\n\30\f\30\16\30\u0157\13\30\3\30\3\30\5\30\u015b\n\30\3"+
		"\30\5\30\u015e\n\30\3\30\5\30\u0161\n\30\3\30\5\30\u0164\n\30\3\30\5\30"+
		"\u0167\n\30\3\30\5\30\u016a\n\30\3\31\6\31\u016d\n\31\r\31\16\31\u016e"+
		"\3\32\3\32\7\32\u0173\n\32\f\32\16\32\u0176\13\32\3\32\3\32\3\33\3\33"+
		"\7\33\u017c\n\33\f\33\16\33\u017f\13\33\3\33\5\33\u0182\n\33\3\33\3\33"+
		"\7\33\u0186\n\33\f\33\16\33\u0189\13\33\5\33\u018b\n\33\3\33\3\33\3\33"+
		"\7\33\u0190\n\33\f\33\16\33\u0193\13\33\5\33\u0195\n\33\3\33\3\33\3\33"+
		"\7\33\u019a\n\33\f\33\16\33\u019d\13\33\5\33\u019f\n\33\3\33\3\33\3\33"+
		"\3\33\7\33\u01a5\n\33\f\33\16\33\u01a8\13\33\5\33\u01aa\n\33\3\33\5\33"+
		"\u01ad\n\33\3\34\3\34\5\34\u01b1\n\34\3\34\3\34\3\34\5\34\u01b6\n\34\6"+
		"\34\u01b8\n\34\r\34\16\34\u01b9\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u01c7\n\35\3\36\3\36\3\37\3\37\3 \3 \5 \u01cf\n "+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\5&\u01ea\n&\3&\5&\u01ed\n&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\6(\u01f9\n(\r(\16(\u01fa\3(\5(\u01fe\n(\3)\6)\u0201\n)\r)\16)\u0202"+
		"\3)\3)\3*\6*\u0208\n*\r*\16*\u0209\3+\3+\3+\3+\5+\u0210\n+\3,\3,\5,\u0214"+
		"\n,\3,\3,\5,\u0218\n,\3,\5,\u021b\n,\3,\3,\3,\3,\5,\u0221\n,\5,\u0223"+
		"\n,\3,\5,\u0226\n,\3-\3-\3-\3-\3-\5-\u022d\n-\3.\3.\3.\3/\7/\u0233\n/"+
		"\f/\16/\u0236\13/\3/\3/\7/\u023a\n/\f/\16/\u023d\13/\3/\5/\u0240\n/\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\5\62\u0248\n\62\3\62\3\62\3\63\3\63\5\63"+
		"\u024e\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0257\n\64\3\64\3"+
		"\64\3\64\3\64\5\64\u025d\n\64\3\64\5\64\u0260\n\64\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0267\n\65\3\65\3\65\3\65\5\65\u026c\n\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u0273\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\5?\u029d\n?\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\r\3\2\21"+
		"\22\3\2\21\25\3\2HI\4\2\5\5$(\3\2\37 \3\2\27\30\3\2\t\n\3\29?\3\2\61\67"+
		"\6\2\4\5!$))88\3\2\7\20\2\u02e6\2\u0088\3\2\2\2\4\u008a\3\2\2\2\6\u008e"+
		"\3\2\2\2\b\u0099\3\2\2\2\n\u009c\3\2\2\2\f\u00a8\3\2\2\2\16\u00aa\3\2"+
		"\2\2\20\u00ac\3\2\2\2\22\u00b9\3\2\2\2\24\u00bf\3\2\2\2\26\u00c4\3\2\2"+
		"\2\30\u00c8\3\2\2\2\32\u00ce\3\2\2\2\34\u00db\3\2\2\2\36\u00dd\3\2\2\2"+
		" \u00e1\3\2\2\2\"\u00ea\3\2\2\2$\u00ef\3\2\2\2&\u0104\3\2\2\2(\u0112\3"+
		"\2\2\2*\u0117\3\2\2\2,\u014f\3\2\2\2.\u0151\3\2\2\2\60\u016c\3\2\2\2\62"+
		"\u0170\3\2\2\2\64\u01ac\3\2\2\2\66\u01b0\3\2\2\28\u01c6\3\2\2\2:\u01c8"+
		"\3\2\2\2<\u01ca\3\2\2\2>\u01ce\3\2\2\2@\u01d0\3\2\2\2B\u01d3\3\2\2\2D"+
		"\u01d7\3\2\2\2F\u01db\3\2\2\2H\u01e1\3\2\2\2J\u01e4\3\2\2\2L\u01f1\3\2"+
		"\2\2N\u01fd\3\2\2\2P\u0200\3\2\2\2R\u0207\3\2\2\2T\u020f\3\2\2\2V\u0211"+
		"\3\2\2\2X\u022c\3\2\2\2Z\u022e\3\2\2\2\\\u023f\3\2\2\2^\u0241\3\2\2\2"+
		"`\u0243\3\2\2\2b\u0247\3\2\2\2d\u024d\3\2\2\2f\u024f\3\2\2\2h\u0261\3"+
		"\2\2\2j\u0274\3\2\2\2l\u0276\3\2\2\2n\u0278\3\2\2\2p\u027a\3\2\2\2r\u027c"+
		"\3\2\2\2t\u027e\3\2\2\2v\u0280\3\2\2\2x\u0282\3\2\2\2z\u0284\3\2\2\2|"+
		"\u029c\3\2\2\2~\u0080\5\20\t\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0089\3\2\2\2\u0083\u0085\5J&\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\177\3\2\2\2\u0088\u0084\3\2\2\2\u0089"+
		"\3\3\2\2\2\u008a\u008b\7J\2\2\u008b\u008c\7A\2\2\u008c\u008d\5|?\2\u008d"+
		"\5\3\2\2\2\u008e\u008f\7J\2\2\u008f\u0090\7 \2\2\u0090\u0094\7\33\2\2"+
		"\u0091\u0093\5\b\5\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\34\2\2\u0098\7\3\2\2\2\u0099\u009a\5n8\2\u009a\u009b\t\2\2\2"+
		"\u009b\t\3\2\2\2\u009c\u009d\t\3\2\2\u009d\13\3\2\2\2\u009e\u00a0\5n8"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a5\5p9\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\r\3\2\2\2\u00aa\u00ab"+
		"\t\4\2\2\u00ab\17\3\2\2\2\u00ac\u00ad\7J\2\2\u00ad\u00ae\7J\2\2\u00ae"+
		"\u00af\7B\2\2\u00af\u00b1\5\4\3\2\u00b0\u00b2\5\6\4\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5\22\n\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5\34"+
		"\17\2\u00b7\u00b8\7T\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\7J\2\2\u00ba\u00bb"+
		"\7\5\2\2\u00bb\u00bd\5\24\13\2\u00bc\u00be\5\30\r\2\u00bd\u00bc\3\2\2"+
		"\2\u00bd\u00be\3\2\2\2\u00be\23\3\2\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1"+
		"\7H\2\2\u00c1\u00c2\5\26\f\2\u00c2\25\3\2\2\2\u00c3\u00c5\5z>\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\7J\2\2\u00c9\u00ca\7D\2\2\u00ca\u00cb"+
		"\7\31\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7\32\2\2\u00cd\31\3\2\2\2"+
		"\u00ce\u00d0\7;\2\2\u00cf\u00d1\7F\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d4\5\64\33\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5\36\20\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00dc\5 \21\2\u00db\u00d3\3\2\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\35\3\2\2\2\u00dd\u00de\5 \21\2\u00de\u00df\5\64\33\2\u00df"+
		"\37\3\2\2\2\u00e0\u00e2\5\"\22\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00eb"+
		"\5*\26\2\u00e6\u00eb\5\62\32\2\u00e7\u00eb\5$\23\2\u00e8\u00eb\5&\24\2"+
		"\u00e9\u00eb\5(\25\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb#\3\2\2\2\u00ec"+
		"\u00f0\5\4\3\2\u00ed\u00f0\5\22\n\2\u00ee\u00f0\5\6\4\2\u00ef\u00ec\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f5\7)\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8\7S"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0105\7\31"+
		"\2\2\u00fd\u00ff\7S\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0105\7\32\2\2\u0104\u00f4\3\2\2\2\u0104\u0100\3\2\2\2\u0105"+
		"\'\3\2\2\2\u0106\u0108\7)\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010a\7\33\2\2\u010a\u0113\5.\30\2\u010b\u010c"+
		"\5.\30\2\u010c\u010d\7\34\2\2\u010d\u0113\3\2\2\2\u010e\u010f\7\33\2\2"+
		"\u010f\u0110\5.\30\2\u0110\u0111\7\34\2\2\u0111\u0113\3\2\2\2\u0112\u0107"+
		"\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u010e\3\2\2\2\u0113)\3\2\2\2\u0114"+
		"\u0118\5,\27\2\u0115\u0118\5.\30\2\u0116\u0118\5\66\34\2\u0117\u0114\3"+
		"\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118+\3\2\2\2\u0119\u011c"+
		"\5.\30\2\u011a\u011c\5(\25\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011f\5\66\34\2\u011e\u011b\3\2\2\2\u011e\u011d\3"+
		"\2\2\2\u011f\u0121\3\2\2\2\u0120\u0122\7\4\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0150\3\2"+
		"\2\2\u0125\u0128\5.\30\2\u0126\u0128\5(\25\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012b\5\66\34\2\u012a\u0127\3"+
		"\2\2\2\u012a\u0129\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\7@\2\2\u012d"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0150\3\2\2\2\u0131\u0134\5.\30\2\u0132\u0134\5(\25\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0137\5\66"+
		"\34\2\u0136\u0133\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013b\3\2\2\2\u0138"+
		"\u013a\7\4\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\5<\37\2\u013f\u0150\3\2\2\2\u0140\u0143\5.\30\2\u0141\u0143\5("+
		"\25\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0146\5\66\34\2\u0145\u0142\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u014a\3"+
		"\2\2\2\u0147\u0149\7@\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014d\u014e\5<\37\2\u014e\u0150\3\2\2\2\u014f\u011e\3\2\2\2\u014f"+
		"\u012a\3\2\2\2\u014f\u0136\3\2\2\2\u014f\u0145\3\2\2\2\u0150-\3\2\2\2"+
		"\u0151\u0155\5\60\31\2\u0152\u0154\7E\2\2\u0153\u0152\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015a\5\f\7\2\u0159\u015b\5\n\6\2\u015a\u0159\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\5> \2\u015d\u015c"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0161\5t;\2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0164\5:"+
		"\36\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0167\58\35\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2"+
		"\2\2\u0168\u016a\5\16\b\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"/\3\2\2\2\u016b\u016d\5z>\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\61\3\2\2\2\u0170\u0174\5\60\31"+
		"\2\u0171\u0173\7E\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7-\2\2\u0178\63\3\2\2\2\u0179\u017d\7G\2\2\u017a\u017c\5z>\2\u017b"+
		"\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7\22\2\2\u0181"+
		"\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u01ad\3\2\2\2\u0183\u0187\7G"+
		"\2\2\u0184\u0186\5z>\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u0183\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u01ad\5@"+
		"!\2\u018d\u0191\7G\2\2\u018e\u0190\5z>\2\u018f\u018e\3\2\2\2\u0190\u0193"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u018d\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u01ad\5D#\2\u0197\u019b\7G\2\2\u0198\u019a\5z>\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u0197\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01ad\5B\"\2\u01a1\u01ad\5H%\2\u01a2\u01a6"+
		"\7G\2\2\u01a3\u01a5\5z>\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a9\u01a2\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ad\5F$\2\u01ac\u0179\3\2\2\2\u01ac\u018a\3\2\2\2\u01ac\u0194\3\2\2"+
		"\2\u01ac\u019e\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ad\65"+
		"\3\2\2\2\u01ae\u01b1\5.\30\2\u01af\u01b1\5(\25\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b7\3\2\2\2\u01b2\u01b5\7\26\2\2\u01b3\u01b6\5"+
		".\30\2\u01b4\u01b6\5(\25\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\67\3\2\2\2\u01bb\u01c7\7L\2\2\u01bc\u01c7"+
		"\7K\2\2\u01bd\u01c7\7P\2\2\u01be\u01c7\7O\2\2\u01bf\u01c0\7L\2\2\u01c0"+
		"\u01c7\7O\2\2\u01c1\u01c2\7L\2\2\u01c2\u01c7\7K\2\2\u01c3\u01c4\7K\2\2"+
		"\u01c4\u01c7\7K\2\2\u01c5\u01c7\7M\2\2\u01c6\u01bb\3\2\2\2\u01c6\u01bc"+
		"\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c6"+
		"\u01c1\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c79\3\2\2\2"+
		"\u01c8\u01c9\t\5\2\2\u01c9;\3\2\2\2\u01ca\u01cb\t\6\2\2\u01cb=\3\2\2\2"+
		"\u01cc\u01cf\5v<\2\u01cd\u01cf\5x=\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3"+
		"\2\2\2\u01cf?\3\2\2\2\u01d0\u01d1\7F\2\2\u01d1\u01d2\7F\2\2\u01d2A\3\2"+
		"\2\2\u01d3\u01d4\7N\2\2\u01d4\u01d5\7F\2\2\u01d5\u01d6\7Q\2\2\u01d6C\3"+
		"\2\2\2\u01d7\u01d8\7Q\2\2\u01d8\u01d9\7F\2\2\u01d9\u01da\7N\2\2\u01da"+
		"E\3\2\2\2\u01db\u01dc\7N\2\2\u01dc\u01dd\7F\2\2\u01dd\u01de\7Q\2\2\u01de"+
		"\u01df\7F\2\2\u01df\u01e0\7N\2\2\u01e0G\3\2\2\2\u01e1\u01e2\7G\2\2\u01e2"+
		"\u01e3\7G\2\2\u01e3I\3\2\2\2\u01e4\u01e5\7J\2\2\u01e5\u01e6\7J\2\2\u01e6"+
		"\u01e7\7C\2\2\u01e7\u01e9\5\4\3\2\u01e8\u01ea\5\6\4\2\u01e9\u01e8\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed\5L\'\2\u01ec"+
		"\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5N"+
		"(\2\u01ef\u01f0\7T\2\2\u01f0K\3\2\2\2\u01f1\u01f2\7J\2\2\u01f2\u01f3\7"+
		"D\2\2\u01f3\u01f4\7\31\2\2\u01f4\u01f5\5d\63\2\u01f5\u01f6\7\32\2\2\u01f6"+
		"M\3\2\2\2\u01f7\u01f9\5P)\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fe\5R"+
		"*\2\u01fd\u01f8\3\2\2\2\u01fd\u01fc\3\2\2\2\u01feO\3\2\2\2\u01ff\u0201"+
		"\5R*\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5X-\2\u0205Q\3\2\2\2\u0206"+
		"\u0208\5T+\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020aS\3\2\2\2\u020b\u0210\5V,\2\u020c\u0210\5"+
		"Z.\2\u020d\u0210\5\\/\2\u020e\u0210\5^\60\2\u020f\u020b\3\2\2\2\u020f"+
		"\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210U\3\2\2\2"+
		"\u0211\u0213\5r:\2\u0212\u0214\5`\61\2\u0213\u0212\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0218\5j\66\2\u0216\u0218\5l\67\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2"+
		"\2\2\u0219\u021b\7O\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u0222\5\f\7\2\u021d\u0220\5b\62\2\u021e\u0221\5v"+
		"<\2\u021f\u0221\5x=\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u021d\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0225\3\2\2\2\u0224\u0226\5\16\b\2\u0225\u0224\3\2\2\2\u0225\u0226\3"+
		"\2\2\2\u0226W\3\2\2\2\u0227\u0228\7G\2\2\u0228\u022d\7\22\2\2\u0229\u022a"+
		"\7G\2\2\u022a\u022b\7F\2\2\u022b\u022d\7F\2\2\u022c\u0227\3\2\2\2\u022c"+
		"\u0229\3\2\2\2\u022dY\3\2\2\2\u022e\u022f\5r:\2\u022f\u0230\7-\2\2\u0230"+
		"[\3\2\2\2\u0231\u0233\7S\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2"+
		"\2\2\u0237\u0240\7\31\2\2\u0238\u023a\7S\2\2\u0239\u0238\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023e\u0240\7\32\2\2\u023f\u0234\3\2\2\2\u023f"+
		"\u023b\3\2\2\2\u0240]\3\2\2\2\u0241\u0242\t\7\2\2\u0242_\3\2\2\2\u0243"+
		"\u0244\7*\2\2\u0244\u0245\7N\2\2\u0245a\3\2\2\2\u0246\u0248\7)\2\2\u0247"+
		"\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\5\n"+
		"\6\2\u024ac\3\2\2\2\u024b\u024e\5f\64\2\u024c\u024e\5h\65\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024c\3\2\2\2\u024ee\3\2\2\2\u024f\u025f\7\63\2\2\u0250"+
		"\u0256\7F\2\2\u0251\u0257\7\t\2\2\u0252\u0257\7\n\2\2\u0253\u0254\7H\2"+
		"\2\u0254\u0257\t\b\2\2\u0255\u0257\7-\2\2\u0256\u0251\3\2\2\2\u0256\u0252"+
		"\3\2\2\2\u0256\u0253\3\2\2\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0260\3\2\2\2\u0258\u0260\7\n\2\2\u0259\u0260\7\t\2\2\u025a\u025c\7E"+
		"\2\2\u025b\u025d\7F\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u0260\3\2\2\2\u025e\u0260\7-\2\2\u025f\u0250\3\2\2\2\u025f\u0258\3\2"+
		"\2\2\u025f\u0259\3\2\2\2\u025f\u025a\3\2\2\2\u025f\u025e\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260g\3\2\2\2\u0261\u0272\7\6\2\2\u0262\u026c\7\n\2\2"+
		"\u0263\u026c\7\t\2\2\u0264\u0266\7F\2\2\u0265\u0267\7\t\2\2\u0266\u0265"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026c\3\2\2\2\u0268\u0269\7H\2\2\u0269"+
		"\u026c\7\t\2\2\u026a\u026c\7E\2\2\u026b\u0262\3\2\2\2\u026b\u0263\3\2"+
		"\2\2\u026b\u0264\3\2\2\2\u026b\u0268\3\2\2\2\u026b\u026a\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u0273\3\2\2\2\u026d\u026e\7\t\2\2\u026e\u026f\7H"+
		"\2\2\u026f\u0273\7\n\2\2\u0270\u0273\7\t\2\2\u0271\u0273\7\n\2\2\u0272"+
		"\u026b\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2"+
		"\2\2\u0273i\3\2\2\2\u0274\u0275\7*\2\2\u0275k\3\2\2\2\u0276\u0277\7+\2"+
		"\2\u0277m\3\2\2\2\u0278\u0279\t\t\2\2\u0279o\3\2\2\2\u027a\u027b\t\n\2"+
		"\2\u027bq\3\2\2\2\u027c\u027d\t\13\2\2\u027ds\3\2\2\2\u027e\u027f\78\2"+
		"\2\u027fu\3\2\2\2\u0280\u0281\7/\2\2\u0281w\3\2\2\2\u0282\u0283\7\60\2"+
		"\2\u0283y\3\2\2\2\u0284\u0285\t\f\2\2\u0285{\3\2\2\2\u0286\u0287\7\67"+
		"\2\2\u0287\u029d\7\n\2\2\u0288\u0289\7\66\2\2\u0289\u029d\7\n\2\2\u028a"+
		"\u028b\7\66\2\2\u028b\u029d\7\t\2\2\u028c\u028d\7\66\2\2\u028d\u029d\7"+
		"\b\2\2\u028e\u028f\7\63\2\2\u028f\u029d\7\13\2\2\u0290\u0291\7\63\2\2"+
		"\u0291\u029d\7\b\2\2\u0292\u0293\7\63\2\2\u0293\u029d\7\t\2\2\u0294\u0295"+
		"\7\63\2\2\u0295\u029d\7\n\2\2\u0296\u0297\7\63\2\2\u0297\u029d\7\7\2\2"+
		"\u0298\u0299\7\67\2\2\u0299\u029d\7\7\2\2\u029a\u029b\7\67\2\2\u029b\u029d"+
		"\7\n\2\2\u029c\u0286\3\2\2\2\u029c\u0288\3\2\2\2\u029c\u028a\3\2\2\2\u029c"+
		"\u028c\3\2\2\2\u029c\u028e\3\2\2\2\u029c\u0290\3\2\2\2\u029c\u0292\3\2"+
		"\2\2\u029c\u0294\3\2\2\2\u029c\u0296\3\2\2\2\u029c\u0298\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029d}\3\2\2\2\\\u0081\u0086\u0088\u0094\u00a1\u00a6\u00a8"+
		"\u00b1\u00b4\u00bd\u00c6\u00d0\u00d3\u00d8\u00db\u00e3\u00ea\u00ef\u00f1"+
		"\u00f4\u00f9\u0100\u0104\u0107\u0112\u0117\u011b\u011e\u0123\u0127\u012a"+
		"\u012f\u0133\u0136\u013b\u0142\u0145\u014a\u014f\u0155\u015a\u015d\u0160"+
		"\u0163\u0166\u0169\u016e\u0174\u017d\u0181\u0187\u018a\u0191\u0194\u019b"+
		"\u019e\u01a6\u01a9\u01ac\u01b0\u01b5\u01b9\u01c6\u01ce\u01e9\u01ec\u01fa"+
		"\u01fd\u0202\u0209\u020f\u0213\u0217\u021a\u0220\u0222\u0225\u022c\u0234"+
		"\u023b\u023f\u0247\u024d\u0256\u025c\u025f\u0266\u026b\u0272\u029c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
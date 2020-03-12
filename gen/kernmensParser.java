// Generated from /Users/jorgemarco/IdeaProjects/ProyectoTFG/src/main/antlr4/jorge/kernmensParser.g4 by ANTLR 4.8
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
		WS=1, LETTER_L=2, LETTER_M=3, PERTFECT=4, DIGIT=5, THREE=6, TWO=7, M_RHYTHM=8, 
		SHARP=9, FLAT=10, DOUBLESHARP=11, DOUBLEFLAT=12, NATURAL=13, CLEF=14, 
		SPACE=15, GREATER=16, LESS=17, LEFTPAR=18, RIGHTPAR=19, LEFTBRACKET=20, 
		RIGHTBRACKET=21, LEFTCURBRACES=22, RIGHTCURBRACES=23, LETTER_K=24, LETTER_k=25, 
		LETTER_m=26, LETTER_T=27, LETTER_t=28, LETTER_W=29, LETTER_w=30, LETTER_U=31, 
		LETTER_p=32, LETTER_i=33, LETTER_v=34, LETTER_r=35, LETTER_R=36, LETTER_A=37, 
		LETTER_B=38, LETTER_C=39, LETTER_D=40, LETTER_E=41, LETTER_F=42, LETTER_G=43, 
		LETTER_a=44, LETTER_b=45, LETTER_c=46, LETTER_d=47, LETTER_e=48, LETTER_f=49, 
		LETTER_g=50, LETTER_J=51, WORD_CLEF=52, WORD_SKERN=53, WORD_SMENS=54, 
		WORD_MET=55, DOT=56, BARLINE=57, DOUBLEBARLINE=58, EQUAL=59, SLASH=60, 
		BACKSLASH=61, ASTERISK=62, CIRCUNFLEX=63, APOSTROPHE=64, SEMICOLON=65, 
		COLON=66, COLOURED=67, GRAVE_ACCENT=68, EXCLAMATION=69, COMA=70, SLURS_COUNT=71, 
		TOKEN_FINISH=72;
	public static final int
		RULE_incipit = 0, RULE_mastercleff = 1, RULE_keysignature = 2, RULE_note_signature = 3, 
		RULE_notesuffix = 4, RULE_pitch = 5, RULE_stem_direction = 6, RULE_kern_notation = 7, 
		RULE_timesignature = 8, RULE_fraction = 9, RULE_number = 10, RULE_metter = 11, 
		RULE_common_met = 12, RULE_perfect_met = 13, RULE_musicalcontent = 14, 
		RULE_measure = 15, RULE_items = 16, RULE_item = 17, RULE_changeconfiguration = 18, 
		RULE_slurs = 19, RULE_ties = 20, RULE_notesties = 21, RULE_tiesaux = 22, 
		RULE_notes = 23, RULE_beaming = 24, RULE_note = 25, RULE_time = 26, RULE_rest = 27, 
		RULE_barlines = 28, RULE_chord = 29, RULE_articulations = 30, RULE_ornaments = 31, 
		RULE_partial_beaming = 32, RULE_doubleBarline = 33, RULE_mens_notation = 34, 
		RULE_m_timesignature = 35, RULE_m_musicalcontent = 36, RULE_m_measure = 37, 
		RULE_m_items = 38, RULE_m_item = 39, RULE_m_note = 40, RULE_m_barlines = 41, 
		RULE_m_rest = 42, RULE_m_slurs = 43, RULE_m_ligature = 44, RULE_m_dot = 45, 
		RULE_m_notesuffix = 46, RULE_mensural_signs = 47, RULE_m_perfect = 48, 
		RULE_m_imperfect = 49, RULE_noteName = 50, RULE_noteNameCl = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"incipit", "mastercleff", "keysignature", "note_signature", "notesuffix", 
			"pitch", "stem_direction", "kern_notation", "timesignature", "fraction", 
			"number", "metter", "common_met", "perfect_met", "musicalcontent", "measure", 
			"items", "item", "changeconfiguration", "slurs", "ties", "notesties", 
			"tiesaux", "notes", "beaming", "note", "time", "rest", "barlines", "chord", 
			"articulations", "ornaments", "partial_beaming", "doubleBarline", "mens_notation", 
			"m_timesignature", "m_musicalcontent", "m_measure", "m_items", "m_item", 
			"m_note", "m_barlines", "m_rest", "m_slurs", "m_ligature", "m_dot", "m_notesuffix", 
			"mensural_signs", "m_perfect", "m_imperfect", "noteName", "noteNameCl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'L'", "'M'", "'o'", null, "'3'", "'2'", null, "'#'", "'-'", 
			"'##'", "'--'", "'n'", null, "' '", "'>'", "'<'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'K'", "'k'", "'m'", "'T'", "'t'", "'W'", "'w'", 
			"'U'", "'p'", "'i'", "'v'", "'r'", "'R'", "'A'", "'B'", "'C'", "'D'", 
			"'E'", "'F'", "'G'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", 
			"'J'", "'clef'", "'skern'", "'smens'", "'met'", "'.'", "'|'", "'||'", 
			"'='", "'/'", "'\\'", "'*'", "'^'", "'''", "';'", "':'", "'~'", "'`'", 
			"'!'", "','", "'&'", "'*-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LETTER_L", "LETTER_M", "PERTFECT", "DIGIT", "THREE", "TWO", 
			"M_RHYTHM", "SHARP", "FLAT", "DOUBLESHARP", "DOUBLEFLAT", "NATURAL", 
			"CLEF", "SPACE", "GREATER", "LESS", "LEFTPAR", "RIGHTPAR", "LEFTBRACKET", 
			"RIGHTBRACKET", "LEFTCURBRACES", "RIGHTCURBRACES", "LETTER_K", "LETTER_k", 
			"LETTER_m", "LETTER_T", "LETTER_t", "LETTER_W", "LETTER_w", "LETTER_U", 
			"LETTER_p", "LETTER_i", "LETTER_v", "LETTER_r", "LETTER_R", "LETTER_A", 
			"LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", "LETTER_F", "LETTER_G", 
			"LETTER_a", "LETTER_b", "LETTER_c", "LETTER_d", "LETTER_e", "LETTER_f", 
			"LETTER_g", "LETTER_J", "WORD_CLEF", "WORD_SKERN", "WORD_SMENS", "WORD_MET", 
			"DOT", "BARLINE", "DOUBLEBARLINE", "EQUAL", "SLASH", "BACKSLASH", "ASTERISK", 
			"CIRCUNFLEX", "APOSTROPHE", "SEMICOLON", "COLON", "COLOURED", "GRAVE_ACCENT", 
			"EXCLAMATION", "COMA", "SLURS_COUNT", "TOKEN_FINISH"
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

	public static class IncipitContext extends ParserRuleContext {
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
		public IncipitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incipit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterIncipit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitIncipit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitIncipit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncipitContext incipit() throws RecognitionException {
		IncipitContext _localctx = new IncipitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_incipit);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					kern_notation();
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASTERISK );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109);
					mens_notation();
					}
					}
					setState(112); 
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
		public TerminalNode CLEF() { return getToken(kernmensParser.CLEF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitMastercleff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MastercleffContext mastercleff() throws RecognitionException {
		MastercleffContext _localctx = new MastercleffContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mastercleff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ASTERISK);
			setState(117);
			match(WORD_CLEF);
			setState(118);
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
		public TerminalNode LETTER_k() { return getToken(kernmensParser.LETTER_k, 0); }
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterKeysignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitKeysignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitKeysignature(this);
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
			setState(120);
			match(ASTERISK);
			setState(121);
			match(LETTER_k);
			setState(122);
			match(LEFTBRACKET);
			setState(123);
			note_signature();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(124);
				match(COMA);
				setState(125);
				note_signature();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNote_signature(this);
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
			setState(133);
			noteName();
			setState(134);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNotesuffix(this);
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
			setState(136);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pitch);
		int _la;
		try {
			setState(148);
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
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					noteName();
					}
					}
					setState(141); 
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
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					noteNameCl();
					}
					}
					setState(146); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitStem_direction(this);
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
			setState(150);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitKern_notation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kern_notationContext kern_notation() throws RecognitionException {
		Kern_notationContext _localctx = new Kern_notationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kern_notation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ASTERISK);
			setState(153);
			match(ASTERISK);
			setState(154);
			match(WORD_SKERN);
			setState(155);
			mastercleff();
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(156);
				keysignature();
				}
				break;
			}
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(159);
				timesignature();
				}
				break;
			}
			setState(162);
			musicalcontent();
			setState(163);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitTimesignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesignatureContext timesignature() throws RecognitionException {
		TimesignatureContext _localctx = new TimesignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ASTERISK);
			setState(166);
			match(LETTER_M);
			setState(167);
			fraction();
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(168);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			number();
			setState(172);
			match(SLASH);
			setState(173);
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
		public List<TerminalNode> DIGIT() { return getTokens(kernmensParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(kernmensParser.DIGIT, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
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
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public Common_metContext common_met() {
			return getRuleContext(Common_metContext.class,0);
		}
		public Perfect_metContext perfect_met() {
			return getRuleContext(Perfect_metContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitMetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetterContext metter() throws RecognitionException {
		MetterContext _localctx = new MetterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_metter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ASTERISK);
			setState(181);
			match(WORD_MET);
			setState(182);
			match(LEFTPAR);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_C:
			case LETTER_c:
				{
				setState(183);
				common_met();
				}
				break;
			case PERTFECT:
				{
				setState(184);
				perfect_met();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
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
		public TerminalNode LETTER_C() { return getToken(kernmensParser.LETTER_C, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public TerminalNode LETTER_R() { return getToken(kernmensParser.LETTER_R, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitCommon_met(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_metContext common_met() throws RecognitionException {
		Common_metContext _localctx = new Common_metContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_common_met);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_c:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(LETTER_c);
				}
				break;
			case LETTER_C:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(LETTER_C);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_R) | (1L << DOT) | (1L << BARLINE))) != 0)) {
					{
					setState(191);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_R) | (1L << DOT) | (1L << BARLINE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
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

	public static class Perfect_metContext extends ParserRuleContext {
		public TerminalNode PERTFECT() { return getToken(kernmensParser.PERTFECT, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public Perfect_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perfect_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterPerfect_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitPerfect_met(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitPerfect_met(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perfect_metContext perfect_met() throws RecognitionException {
		Perfect_metContext _localctx = new Perfect_metContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_perfect_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(PERTFECT);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==BARLINE) {
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==BARLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitMusicalcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MusicalcontentContext musicalcontent() throws RecognitionException {
		MusicalcontentContext _localctx = new MusicalcontentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_musicalcontent);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BARLINE - 57)) | (1L << (EQUAL - 57)) | (1L << (COLON - 57)) | (1L << (EXCLAMATION - 57)))) != 0)) {
					{
					setState(200);
					barlines();
					}
				}

				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(203);
					measure();
					}
					}
					setState(206); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_L) | (1L << DIGIT) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LEFTBRACKET) | (1L << LETTER_U) | (1L << ASTERISK))) != 0) || _la==SLURS_COUNT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitMeasure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_measure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			items();
			setState(212);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				item();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_L) | (1L << DIGIT) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LEFTBRACKET) | (1L << LETTER_U) | (1L << ASTERISK))) != 0) || _la==SLURS_COUNT );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_item);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				notes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				changeconfiguration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				slurs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitChangeconfiguration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeconfigurationContext changeconfiguration() throws RecognitionException {
		ChangeconfigurationContext _localctx = new ChangeconfigurationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_changeconfiguration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(226);
						mastercleff();
						}
						break;
					case 2:
						{
						setState(227);
						timesignature();
						}
						break;
					case 3:
						{
						setState(228);
						keysignature();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitSlurs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlursContext slurs() throws RecognitionException {
		SlursContext _localctx = new SlursContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_slurs);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTER_U) {
					{
					setState(233);
					match(LETTER_U);
					}
				}

				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(236);
					match(SLURS_COUNT);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(LEFTPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(243);
					match(SLURS_COUNT);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
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
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public NotestiesContext notesties() {
			return getRuleContext(NotestiesContext.class,0);
		}
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitTies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiesContext ties() throws RecognitionException {
		TiesContext _localctx = new TiesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(252);
				match(LETTER_U);
				}
			}

			setState(255);
			match(LEFTBRACKET);
			setState(256);
			notes();
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(257);
				barlines();
				}
				break;
			}
			setState(260);
			notesties();
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

	public static class NotestiesContext extends ParserRuleContext {
		public TiesauxContext tiesaux() {
			return getRuleContext(TiesauxContext.class,0);
		}
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public NotestiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notesties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNotesties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNotesties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNotesties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotestiesContext notesties() throws RecognitionException {
		NotestiesContext _localctx = new NotestiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notesties);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACKET:
			case LETTER_U:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				tiesaux();
				}
				break;
			case LETTER_L:
			case DIGIT:
			case BARLINE:
			case EQUAL:
			case COLON:
			case EXCLAMATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BARLINE - 57)) | (1L << (EQUAL - 57)) | (1L << (COLON - 57)) | (1L << (EXCLAMATION - 57)))) != 0)) {
					{
					setState(263);
					barlines();
					}
				}

				setState(266);
				notes();
				setState(267);
				match(RIGHTBRACKET);
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

	public static class TiesauxContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(kernmensParser.LEFTBRACKET, 0); }
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public NotestiesContext notesties() {
			return getRuleContext(NotestiesContext.class,0);
		}
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public TiesauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiesaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTiesaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTiesaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitTiesaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiesauxContext tiesaux() throws RecognitionException {
		TiesauxContext _localctx = new TiesauxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tiesaux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(271);
				match(LETTER_U);
				}
			}

			setState(274);
			match(LEFTBRACKET);
			setState(275);
			notes();
			setState(276);
			match(RIGHTBRACKET);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(277);
				barlines();
				}
				break;
			}
			setState(280);
			notesties();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNotes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_notes);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				beaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				note();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
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
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public List<TerminalNode> LETTER_L() { return getTokens(kernmensParser.LETTER_L); }
		public TerminalNode LETTER_L(int i) {
			return getToken(kernmensParser.LETTER_L, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitBeaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeamingContext beaming() throws RecognitionException {
		BeamingContext _localctx = new BeamingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_beaming);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(287);
					match(LETTER_L);
					}
					}
					setState(290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_L );
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(292);
					note();
					}
					break;
				case 2:
					{
					setState(293);
					chord();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(296);
					note();
					}
					break;
				case 2:
					{
					setState(297);
					chord();
					}
					break;
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					match(LETTER_J);
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_J );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(305);
					note();
					}
					break;
				case 2:
					{
					setState(306);
					chord();
					}
					break;
				}
				setState(309);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			time();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(314);
				match(DOT);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			pitch();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL))) != 0)) {
				{
				setState(321);
				notesuffix();
				}
			}

			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_M) | (1L << LETTER_m) | (1L << LETTER_T) | (1L << LETTER_t) | (1L << LETTER_W) | (1L << LETTER_w))) != 0)) {
				{
				setState(324);
				ornaments();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (CIRCUNFLEX - 63)) | (1L << (APOSTROPHE - 63)) | (1L << (SEMICOLON - 63)) | (1L << (COLOURED - 63)) | (1L << (GRAVE_ACCENT - 63)))) != 0)) {
				{
				setState(327);
				articulations();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(330);
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
		public List<TerminalNode> DIGIT() { return getTokens(kernmensParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(kernmensParser.DIGIT, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				match(DIGIT);
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			time();
			setState(339);
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
		public List<TerminalNode> EQUAL() { return getTokens(kernmensParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(kernmensParser.EQUAL, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(kernmensParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(kernmensParser.DIGIT, i);
		}
		public DoubleBarlineContext doubleBarline() {
			return getRuleContext(DoubleBarlineContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitBarlines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarlinesContext barlines() throws RecognitionException {
		BarlinesContext _localctx = new BarlinesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_barlines);
		try {
			int _alt;
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(EQUAL);
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(342);
						match(DIGIT);
						}
						} 
					}
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				doubleBarline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(EXCLAMATION);
				setState(350);
				match(BARLINE);
				setState(351);
				match(COLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(COLON);
				setState(353);
				match(BARLINE);
				setState(354);
				match(EXCLAMATION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				match(EQUAL);
				setState(356);
				match(EQUAL);
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
		public List<TerminalNode> COMA() { return getTokens(kernmensParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(kernmensParser.COMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitChord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			note();
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				match(COMA);
				setState(361);
				note();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitArticulations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticulationsContext articulations() throws RecognitionException {
		ArticulationsContext _localctx = new ArticulationsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_articulations);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(APOSTROPHE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(CIRCUNFLEX);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(GRAVE_ACCENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(COLOURED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				match(APOSTROPHE);
				setState(371);
				match(COLOURED);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(372);
				match(APOSTROPHE);
				setState(373);
				match(CIRCUNFLEX);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(374);
				match(CIRCUNFLEX);
				setState(375);
				match(CIRCUNFLEX);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(376);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitOrnaments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrnamentsContext ornaments() throws RecognitionException {
		OrnamentsContext _localctx = new OrnamentsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ornaments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitPartial_beaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partial_beamingContext partial_beaming() throws RecognitionException {
		Partial_beamingContext _localctx = new Partial_beamingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_partial_beaming);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitDoubleBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleBarlineContext doubleBarline() throws RecognitionException {
		DoubleBarlineContext _localctx = new DoubleBarlineContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_doubleBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(BARLINE);
			setState(384);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMens_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMens_notation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitMens_notation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mens_notationContext mens_notation() throws RecognitionException {
		Mens_notationContext _localctx = new Mens_notationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mens_notation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ASTERISK);
			setState(387);
			match(ASTERISK);
			setState(388);
			match(WORD_SMENS);
			setState(389);
			mastercleff();
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(390);
				m_timesignature();
				}
				break;
			}
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(393);
				keysignature();
				}
			}

			setState(396);
			m_musicalcontent();
			setState(397);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_timesignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_timesignatureContext m_timesignature() throws RecognitionException {
		M_timesignatureContext _localctx = new M_timesignatureContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_m_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(ASTERISK);
			setState(400);
			match(WORD_MET);
			setState(401);
			match(LEFTPAR);
			setState(402);
			mensural_signs();
			setState(403);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_musicalcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_musicalcontentContext m_musicalcontent() throws RecognitionException {
		M_musicalcontentContext _localctx = new M_musicalcontentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_m_musicalcontent);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405);
					m_measure();
					}
					}
					setState(408); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << M_RHYTHM) | (1L << GREATER) | (1L << LESS) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << EQUAL))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_measure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_measure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_measure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_measureContext m_measure() throws RecognitionException {
		M_measureContext _localctx = new M_measureContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_m_measure);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case M_RHYTHM:
			case GREATER:
			case LESS:
			case LEFTPAR:
			case RIGHTPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				m_items();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_itemsContext m_items() throws RecognitionException {
		M_itemsContext _localctx = new M_itemsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_m_items);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(417);
					m_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(420); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_itemContext m_item() throws RecognitionException {
		M_itemContext _localctx = new M_itemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_m_item);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				m_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				m_rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				m_slurs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_note(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_noteContext m_note() throws RecognitionException {
		M_noteContext _localctx = new M_noteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_m_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(M_RHYTHM);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(429);
				m_dot();
				}
				break;
			}
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_p:
				{
				setState(432);
				m_perfect();
				}
				break;
			case LETTER_i:
				{
				setState(433);
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
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOURED) {
				{
				setState(436);
				match(COLOURED);
				}
			}

			setState(439);
			pitch();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL) | (1L << LETTER_U))) != 0)) {
				{
				setState(440);
				m_notesuffix();
				}
			}

			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(443);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_barlines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_barlinesContext m_barlines() throws RecognitionException {
		M_barlinesContext _localctx = new M_barlinesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_m_barlines);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(EQUAL);
				setState(447);
				match(FLAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(EQUAL);
				setState(449);
				match(BARLINE);
				setState(450);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_rest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_rest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_restContext m_rest() throws RecognitionException {
		M_restContext _localctx = new M_restContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_m_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(M_RHYTHM);
			setState(454);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_slurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_slurs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_slurs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_slursContext m_slurs() throws RecognitionException {
		M_slursContext _localctx = new M_slursContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_m_slurs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_ligature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_ligature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_ligature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_ligatureContext m_ligature() throws RecognitionException {
		M_ligatureContext _localctx = new M_ligatureContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_m_ligature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_dotContext m_dot() throws RecognitionException {
		M_dotContext _localctx = new M_dotContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_m_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(LETTER_p);
			setState(461);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_notesuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_notesuffixContext m_notesuffix() throws RecognitionException {
		M_notesuffixContext _localctx = new M_notesuffixContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_m_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(463);
				match(LETTER_U);
				}
			}

			setState(466);
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
		public TerminalNode LETTER_c() { return getToken(kernmensParser.LETTER_c, 0); }
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMensural_signs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMensural_signs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitMensural_signs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mensural_signsContext mensural_signs() throws RecognitionException {
		Mensural_signsContext _localctx = new Mensural_signsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mensural_signs);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_c:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(468);
				match(LETTER_c);
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BARLINE:
					{
					setState(469);
					match(BARLINE);
					setState(475);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case THREE:
						{
						setState(470);
						match(THREE);
						}
						break;
					case TWO:
						{
						setState(471);
						match(TWO);
						}
						break;
					case SLASH:
						{
						setState(472);
						match(SLASH);
						setState(473);
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
						setState(474);
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
					setState(477);
					match(TWO);
					}
					break;
				case THREE:
					{
					setState(478);
					match(THREE);
					}
					break;
				case DOT:
					{
					setState(479);
					match(DOT);
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BARLINE) {
						{
						setState(480);
						match(BARLINE);
						}
					}

					}
					break;
				case LETTER_r:
					{
					setState(483);
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
			case PERTFECT:
			case THREE:
			case TWO:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(486);
					match(PERTFECT);
					setState(496);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TWO:
						{
						setState(487);
						match(TWO);
						}
						break;
					case THREE:
						{
						setState(488);
						match(THREE);
						}
						break;
					case BARLINE:
						{
						setState(489);
						match(BARLINE);
						setState(491);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THREE) {
							{
							setState(490);
							match(THREE);
							}
						}

						}
						break;
					case SLASH:
						{
						setState(493);
						match(SLASH);
						setState(494);
						match(THREE);
						}
						break;
					case DOT:
						{
						setState(495);
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
					setState(498);
					match(THREE);
					setState(499);
					match(SLASH);
					setState(500);
					match(TWO);
					}
					break;
				case 3:
					{
					setState(501);
					match(THREE);
					}
					break;
				case 4:
					{
					setState(502);
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
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_perfect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_perfect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_perfect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_perfectContext m_perfect() throws RecognitionException {
		M_perfectContext _localctx = new M_perfectContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_m_perfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitM_imperfect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_imperfectContext m_imperfect() throws RecognitionException {
		M_imperfectContext _localctx = new M_imperfectContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_m_imperfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNoteName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteNameContext noteName() throws RecognitionException {
		NoteNameContext _localctx = new NoteNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_noteName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensParserVisitor ) return ((kernmensParserVisitor<? extends T>)visitor).visitNoteNameCl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteNameClContext noteNameCl() throws RecognitionException {
		NoteNameClContext _localctx = new NoteNameClContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_noteNameCl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u0206\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\6\2l\n\2\r\2\16\2m\3\2\6\2q\n\2\r\2\16\2r\5\2u\n\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\6\7\u008e\n\7\r\7\16\7\u008f\3\7\6"+
		"\7\u0093\n\7\r\7\16\7\u0094\5\7\u0097\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a0\n\t\3\t\5\t\u00a3\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00ac"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\6\f\u00b3\n\f\r\f\16\f\u00b4\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00c3\n\16\5\16\u00c5"+
		"\n\16\3\17\3\17\5\17\u00c9\n\17\3\20\5\20\u00cc\n\20\3\20\6\20\u00cf\n"+
		"\20\r\20\16\20\u00d0\3\20\5\20\u00d4\n\20\3\21\3\21\3\21\3\22\6\22\u00da"+
		"\n\22\r\22\16\22\u00db\3\23\3\23\3\23\3\23\3\23\5\23\u00e3\n\23\3\24\3"+
		"\24\3\24\6\24\u00e8\n\24\r\24\16\24\u00e9\3\25\5\25\u00ed\n\25\3\25\7"+
		"\25\u00f0\n\25\f\25\16\25\u00f3\13\25\3\25\3\25\7\25\u00f7\n\25\f\25\16"+
		"\25\u00fa\13\25\3\25\5\25\u00fd\n\25\3\26\5\26\u0100\n\26\3\26\3\26\3"+
		"\26\5\26\u0105\n\26\3\26\3\26\3\27\3\27\5\27\u010b\n\27\3\27\3\27\3\27"+
		"\5\27\u0110\n\27\3\30\5\30\u0113\n\30\3\30\3\30\3\30\3\30\5\30\u0119\n"+
		"\30\3\30\3\30\3\31\3\31\3\31\5\31\u0120\n\31\3\32\6\32\u0123\n\32\r\32"+
		"\16\32\u0124\3\32\3\32\5\32\u0129\n\32\3\32\3\32\5\32\u012d\n\32\3\32"+
		"\6\32\u0130\n\32\r\32\16\32\u0131\3\32\3\32\5\32\u0136\n\32\3\32\3\32"+
		"\5\32\u013a\n\32\3\33\3\33\7\33\u013e\n\33\f\33\16\33\u0141\13\33\3\33"+
		"\3\33\5\33\u0145\n\33\3\33\5\33\u0148\n\33\3\33\5\33\u014b\n\33\3\33\5"+
		"\33\u014e\n\33\3\34\6\34\u0151\n\34\r\34\16\34\u0152\3\35\3\35\3\35\3"+
		"\36\3\36\7\36\u015a\n\36\f\36\16\36\u015d\13\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0168\n\36\3\37\3\37\3\37\6\37\u016d\n\37"+
		"\r\37\16\37\u016e\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u017c\n \3!\3!\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\5$\u018a\n$\3$\5$\u018d\n$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3&\6&\u0199\n&\r&\16&\u019a\3&\5&\u019e\n&\3\'\3\'\5\'"+
		"\u01a2\n\'\3(\6(\u01a5\n(\r(\16(\u01a6\3)\3)\3)\3)\5)\u01ad\n)\3*\3*\5"+
		"*\u01b1\n*\3*\3*\5*\u01b5\n*\3*\5*\u01b8\n*\3*\3*\5*\u01bc\n*\3*\5*\u01bf"+
		"\n*\3+\3+\3+\3+\3+\5+\u01c6\n+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\5\60"+
		"\u01d3\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01de\n"+
		"\61\3\61\3\61\3\61\3\61\5\61\u01e4\n\61\3\61\5\61\u01e7\n\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u01ee\n\61\3\61\3\61\3\61\5\61\u01f3\n\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u01fa\n\61\5\61\u01fc\n\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\16\3\2\13\f\3\2\13\17"+
		"\3\2>?\4\2&&:;\3\2:;\4\2\5\5\34 \3\2\32\33\3\2\24\25\3\2\22\23\3\2\b\t"+
		"\3\2.\64\3\2\'-\2\u0236\2t\3\2\2\2\4v\3\2\2\2\6z\3\2\2\2\b\u0087\3\2\2"+
		"\2\n\u008a\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u009a\3\2\2\2\22"+
		"\u00a7\3\2\2\2\24\u00ad\3\2\2\2\26\u00b2\3\2\2\2\30\u00b6\3\2\2\2\32\u00c4"+
		"\3\2\2\2\34\u00c6\3\2\2\2\36\u00d3\3\2\2\2 \u00d5\3\2\2\2\"\u00d9\3\2"+
		"\2\2$\u00e2\3\2\2\2&\u00e7\3\2\2\2(\u00fc\3\2\2\2*\u00ff\3\2\2\2,\u010f"+
		"\3\2\2\2.\u0112\3\2\2\2\60\u011f\3\2\2\2\62\u0139\3\2\2\2\64\u013b\3\2"+
		"\2\2\66\u0150\3\2\2\28\u0154\3\2\2\2:\u0167\3\2\2\2<\u0169\3\2\2\2>\u017b"+
		"\3\2\2\2@\u017d\3\2\2\2B\u017f\3\2\2\2D\u0181\3\2\2\2F\u0184\3\2\2\2H"+
		"\u0191\3\2\2\2J\u019d\3\2\2\2L\u01a1\3\2\2\2N\u01a4\3\2\2\2P\u01ac\3\2"+
		"\2\2R\u01ae\3\2\2\2T\u01c5\3\2\2\2V\u01c7\3\2\2\2X\u01ca\3\2\2\2Z\u01cc"+
		"\3\2\2\2\\\u01ce\3\2\2\2^\u01d2\3\2\2\2`\u01fb\3\2\2\2b\u01fd\3\2\2\2"+
		"d\u01ff\3\2\2\2f\u0201\3\2\2\2h\u0203\3\2\2\2jl\5\20\t\2kj\3\2\2\2lm\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2nu\3\2\2\2oq\5F$\2po\3\2\2\2qr\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2su\3\2\2\2tk\3\2\2\2tp\3\2\2\2u\3\3\2\2\2vw\7@\2\2wx\7\66"+
		"\2\2xy\7\20\2\2y\5\3\2\2\2z{\7@\2\2{|\7\33\2\2|}\7\26\2\2}\u0082\5\b\5"+
		"\2~\177\7H\2\2\177\u0081\5\b\5\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\7\27\2\2\u0086\7\3\2\2\2\u0087\u0088\5f\64\2\u0088\u0089"+
		"\t\2\2\2\u0089\t\3\2\2\2\u008a\u008b\t\3\2\2\u008b\13\3\2\2\2\u008c\u008e"+
		"\5f\64\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0097\3\2\2\2\u0091\u0093\5h\65\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u0092\3\2\2\2\u0097\r\3\2\2\2"+
		"\u0098\u0099\t\4\2\2\u0099\17\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7"+
		"@\2\2\u009c\u009d\7\67\2\2\u009d\u009f\5\4\3\2\u009e\u00a0\5\6\4\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\5\22"+
		"\n\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\5\36\20\2\u00a5\u00a6\7J\2\2\u00a6\21\3\2\2\2\u00a7\u00a8\7@\2"+
		"\2\u00a8\u00a9\7\5\2\2\u00a9\u00ab\5\24\13\2\u00aa\u00ac\5\30\r\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\5\26\f"+
		"\2\u00ae\u00af\7>\2\2\u00af\u00b0\5\26\f\2\u00b0\25\3\2\2\2\u00b1\u00b3"+
		"\7\7\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b8\79\2\2"+
		"\u00b8\u00bb\7\24\2\2\u00b9\u00bc\5\32\16\2\u00ba\u00bc\5\34\17\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\25"+
		"\2\2\u00be\31\3\2\2\2\u00bf\u00c5\7\60\2\2\u00c0\u00c2\7)\2\2\u00c1\u00c3"+
		"\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c8\7\6\2"+
		"\2\u00c7\u00c9\t\6\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\35"+
		"\3\2\2\2\u00ca\u00cc\5:\36\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cf\5 \21\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d4\5\"\22\2\u00d3\u00cb\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\37\3\2\2"+
		"\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\5:\36\2\u00d7!\3\2\2\2\u00d8\u00da"+
		"\5$\23\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00e3\5\60\31\2\u00de\u00e3\58\35"+
		"\2\u00df\u00e3\5&\24\2\u00e0\u00e3\5(\25\2\u00e1\u00e3\5*\26\2\u00e2\u00dd"+
		"\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e8\5\4\3\2\u00e5\u00e8\5\22\n\2"+
		"\u00e6\u00e8\5\6\4\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\'\3\2\2\2\u00eb\u00ed\7!\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00f1\3\2\2\2\u00ee\u00f0\7I\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00fd\7\24\2\2\u00f5\u00f7\7I\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\25\2\2\u00fc\u00ec\3"+
		"\2\2\2\u00fc\u00f8\3\2\2\2\u00fd)\3\2\2\2\u00fe\u0100\7!\2\2\u00ff\u00fe"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\26\2\2"+
		"\u0102\u0104\5\60\31\2\u0103\u0105\5:\36\2\u0104\u0103\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5,\27\2\u0107+\3\2\2\2\u0108"+
		"\u0110\5.\30\2\u0109\u010b\5:\36\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5\60\31\2\u010d\u010e\7\27\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u010a\3\2\2\2\u0110-\3\2\2\2"+
		"\u0111\u0113\7!\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\7\26\2\2\u0115\u0116\5\60\31\2\u0116\u0118\7\27\2"+
		"\2\u0117\u0119\5:\36\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\5,\27\2\u011b/\3\2\2\2\u011c\u0120\5\62\32\2\u011d"+
		"\u0120\5\64\33\2\u011e\u0120\5<\37\2\u011f\u011c\3\2\2\2\u011f\u011d\3"+
		"\2\2\2\u011f\u011e\3\2\2\2\u0120\61\3\2\2\2\u0121\u0123\7\4\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0129\5\64\33\2\u0127\u0129\5<\37\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u013a\3\2\2\2\u012a\u012d\5\64"+
		"\33\2\u012b\u012d\5<\37\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0130\7\65\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013a\3\2\2\2\u0133"+
		"\u0136\5\64\33\2\u0134\u0136\5<\37\2\u0135\u0133\3\2\2\2\u0135\u0134\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\5B\"\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0122\3\2\2\2\u0139\u012c\3\2\2\2\u0139\u0135\3\2\2\2\u013a\63\3\2\2"+
		"\2\u013b\u013f\5\66\34\2\u013c\u013e\7:\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0144\5\f\7\2\u0143\u0145\5\n\6\2\u0144"+
		"\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\5@"+
		"!\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u014b\5> \2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2"+
		"\2\u014c\u014e\5\16\b\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\65\3\2\2\2\u014f\u0151\7\7\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\67\3\2\2\2\u0154\u0155"+
		"\5\66\34\2\u0155\u0156\7%\2\2\u01569\3\2\2\2\u0157\u015b\7=\2\2\u0158"+
		"\u015a\7\7\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u0168\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0168\5D#\2\u015f\u0160\7G\2\2\u0160\u0161\7;\2\2\u0161\u0168\7D\2\2"+
		"\u0162\u0163\7D\2\2\u0163\u0164\7;\2\2\u0164\u0168\7G\2\2\u0165\u0166"+
		"\7=\2\2\u0166\u0168\7=\2\2\u0167\u0157\3\2\2\2\u0167\u015e\3\2\2\2\u0167"+
		"\u015f\3\2\2\2\u0167\u0162\3\2\2\2\u0167\u0165\3\2\2\2\u0168;\3\2\2\2"+
		"\u0169\u016c\5\64\33\2\u016a\u016b\7H\2\2\u016b\u016d\5\64\33\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f=\3\2\2\2\u0170\u017c\7B\2\2\u0171\u017c\7A\2\2\u0172\u017c"+
		"\7F\2\2\u0173\u017c\7E\2\2\u0174\u0175\7B\2\2\u0175\u017c\7E\2\2\u0176"+
		"\u0177\7B\2\2\u0177\u017c\7A\2\2\u0178\u0179\7A\2\2\u0179\u017c\7A\2\2"+
		"\u017a\u017c\7C\2\2\u017b\u0170\3\2\2\2\u017b\u0171\3\2\2\2\u017b\u0172"+
		"\3\2\2\2\u017b\u0173\3\2\2\2\u017b\u0174\3\2\2\2\u017b\u0176\3\2\2\2\u017b"+
		"\u0178\3\2\2\2\u017b\u017a\3\2\2\2\u017c?\3\2\2\2\u017d\u017e\t\7\2\2"+
		"\u017eA\3\2\2\2\u017f\u0180\t\b\2\2\u0180C\3\2\2\2\u0181\u0182\7;\2\2"+
		"\u0182\u0183\7;\2\2\u0183E\3\2\2\2\u0184\u0185\7@\2\2\u0185\u0186\7@\2"+
		"\2\u0186\u0187\78\2\2\u0187\u0189\5\4\3\2\u0188\u018a\5H%\2\u0189\u0188"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u018d\5\6\4\2\u018c"+
		"\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5J"+
		"&\2\u018f\u0190\7J\2\2\u0190G\3\2\2\2\u0191\u0192\7@\2\2\u0192\u0193\7"+
		"9\2\2\u0193\u0194\7\24\2\2\u0194\u0195\5`\61\2\u0195\u0196\7\25\2\2\u0196"+
		"I\3\2\2\2\u0197\u0199\5L\'\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019e\5N"+
		"(\2\u019d\u0198\3\2\2\2\u019d\u019c\3\2\2\2\u019eK\3\2\2\2\u019f\u01a2"+
		"\5N(\2\u01a0\u01a2\5T+\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2"+
		"M\3\2\2\2\u01a3\u01a5\5P)\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7O\3\2\2\2\u01a8\u01ad\5R*\2\u01a9"+
		"\u01ad\5V,\2\u01aa\u01ad\5X-\2\u01ab\u01ad\5Z.\2\u01ac\u01a8\3\2\2\2\u01ac"+
		"\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adQ\3\2\2\2"+
		"\u01ae\u01b0\7\n\2\2\u01af\u01b1\5\\/\2\u01b0\u01af\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b5\5b\62\2\u01b3\u01b5\5d\63\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2"+
		"\2\2\u01b6\u01b8\7E\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\5\f\7\2\u01ba\u01bc\5^\60\2\u01bb\u01ba\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bf\5\16\b\2\u01be"+
		"\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfS\3\2\2\2\u01c0\u01c1\7=\2\2\u01c1"+
		"\u01c6\7\f\2\2\u01c2\u01c3\7=\2\2\u01c3\u01c4\7;\2\2\u01c4\u01c6\7;\2"+
		"\2\u01c5\u01c0\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c6U\3\2\2\2\u01c7\u01c8"+
		"\7\n\2\2\u01c8\u01c9\7%\2\2\u01c9W\3\2\2\2\u01ca\u01cb\t\t\2\2\u01cbY"+
		"\3\2\2\2\u01cc\u01cd\t\n\2\2\u01cd[\3\2\2\2\u01ce\u01cf\7\"\2\2\u01cf"+
		"\u01d0\7D\2\2\u01d0]\3\2\2\2\u01d1\u01d3\7!\2\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5\n\6\2\u01d5_\3\2\2\2"+
		"\u01d6\u01e6\7\60\2\2\u01d7\u01dd\7;\2\2\u01d8\u01de\7\b\2\2\u01d9\u01de"+
		"\7\t\2\2\u01da\u01db\7>\2\2\u01db\u01de\t\13\2\2\u01dc\u01de\7%\2\2\u01dd"+
		"\u01d8\3\2\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e7\3\2\2\2\u01df\u01e7\7\t\2\2\u01e0"+
		"\u01e7\7\b\2\2\u01e1\u01e3\7:\2\2\u01e2\u01e4\7;\2\2\u01e3\u01e2\3\2\2"+
		"\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e7\7%\2\2\u01e6\u01d7"+
		"\3\2\2\2\u01e6\u01df\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01fc\3\2\2\2\u01e8\u01f2\7\6"+
		"\2\2\u01e9\u01f3\7\t\2\2\u01ea\u01f3\7\b\2\2\u01eb\u01ed\7;\2\2\u01ec"+
		"\u01ee\7\b\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f3\3\2"+
		"\2\2\u01ef\u01f0\7>\2\2\u01f0\u01f3\7\b\2\2\u01f1\u01f3\7:\2\2\u01f2\u01e9"+
		"\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f2\u01eb\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01fa\3\2\2\2\u01f4\u01f5\7\b"+
		"\2\2\u01f5\u01f6\7>\2\2\u01f6\u01fa\7\t\2\2\u01f7\u01fa\7\b\2\2\u01f8"+
		"\u01fa\7\t\2\2\u01f9\u01e8\3\2\2\2\u01f9\u01f4\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01d6\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fca\3\2\2\2\u01fd\u01fe\7\"\2\2\u01fec\3\2\2\2\u01ff"+
		"\u0200\7#\2\2\u0200e\3\2\2\2\u0201\u0202\t\f\2\2\u0202g\3\2\2\2\u0203"+
		"\u0204\t\r\2\2\u0204i\3\2\2\2Hmrt\u0082\u008f\u0094\u0096\u009f\u00a2"+
		"\u00ab\u00b4\u00bb\u00c2\u00c4\u00c8\u00cb\u00d0\u00d3\u00db\u00e2\u00e7"+
		"\u00e9\u00ec\u00f1\u00f8\u00fc\u00ff\u0104\u010a\u010f\u0112\u0118\u011f"+
		"\u0124\u0128\u012c\u0131\u0135\u0139\u013f\u0144\u0147\u014a\u014d\u0152"+
		"\u015b\u0167\u016e\u017b\u0189\u018c\u019a\u019d\u01a1\u01a6\u01ac\u01b0"+
		"\u01b4\u01b7\u01bb\u01be\u01c5\u01d2\u01dd\u01e3\u01e6\u01ed\u01f2\u01f9"+
		"\u01fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
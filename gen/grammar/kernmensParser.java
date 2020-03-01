// Generated from /Users/jorgemarcoesteve/IdeaProjects/TFG/src/main/java/grammar/kernmensParser.g4 by ANTLR 4.8
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
		WS=1, LETTER_L=2, NOTENAME=3, NOTENAMECL=4, LETTER_M=5, PERTFECT=6, DIGIT=7, 
		THREE=8, TWO=9, M_RHYTHM=10, SHARP=11, FLAT=12, DOUBLESHARP=13, DOUBLEFLAT=14, 
		NATURAL=15, CLEF=16, SPACE=17, GREATER=18, LESS=19, LEFTPAR=20, RIGHTPAR=21, 
		LEFTBRACKET=22, RIGHTBRACKET=23, LEFTCURBRACES=24, RIGHTCURBRACES=25, 
		LETTER_K=26, LETTER_k=27, LETTER_m=28, LETTER_T=29, LETTER_t=30, LETTER_W=31, 
		LETTER_w=32, LETTER_U=33, LETTER_p=34, LETTER_i=35, LETTER_v=36, LETTER_r=37, 
		LETTER_R=38, LETTER_A=39, LETTER_B=40, LETTER_C=41, LETTER_D=42, LETTER_E=43, 
		LETTER_F=44, LETTER_G=45, LETTER_a=46, LETTER_b=47, LETTER_c=48, LETTER_d=49, 
		LETTER_e=50, LETTER_f=51, LETTER_g=52, LETTER_J=53, WORD_CLEF=54, WORD_SKERN=55, 
		WORD_SMENS=56, WORD_MET=57, DOT=58, BARLINE=59, EQUAL=60, SLASH=61, BACKSLASH=62, 
		ASTERISK=63, CIRCUNFLEX=64, APOSTROPHE=65, SEMICOLON=66, COLON=67, COLOURED=68, 
		GRAVE_ACCENT=69, EXCLAMATION=70, COMA=71, SLURS_COUNT=72, TOKEN_FINISH=73, 
		COMMON=74;
	public static final int
		RULE_incipit = 0, RULE_mastercleff = 1, RULE_keysignature = 2, RULE_note_signature = 3, 
		RULE_notesuffix = 4, RULE_pitch = 5, RULE_stem_direction = 6, RULE_kern_notation = 7, 
		RULE_timesignature = 8, RULE_fraction = 9, RULE_number = 10, RULE_metter = 11, 
		RULE_common_met = 12, RULE_perfect_met = 13, RULE_musicalcontent = 14, 
		RULE_measure = 15, RULE_items = 16, RULE_item = 17, RULE_changeconfiguration = 18, 
		RULE_slurs = 19, RULE_ties = 20, RULE_notesties = 21, RULE_tiesaux = 22, 
		RULE_notes = 23, RULE_beaming = 24, RULE_note = 25, RULE_time = 26, RULE_rest = 27, 
		RULE_barlines = 28, RULE_chord = 29, RULE_articulations = 30, RULE_ornaments = 31, 
		RULE_partial_beaming = 32, RULE_mens_notation = 33, RULE_m_timesignature = 34, 
		RULE_m_musicalcontent = 35, RULE_m_measure = 36, RULE_m_items = 37, RULE_m_item = 38, 
		RULE_m_note = 39, RULE_m_barlines = 40, RULE_m_rest = 41, RULE_m_slurs = 42, 
		RULE_m_ligature = 43, RULE_m_dot = 44, RULE_m_notesuffix = 45, RULE_mensural_signs = 46, 
		RULE_m_perfect = 47, RULE_m_imperfect = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"incipit", "mastercleff", "keysignature", "note_signature", "notesuffix", 
			"pitch", "stem_direction", "kern_notation", "timesignature", "fraction", 
			"number", "metter", "common_met", "perfect_met", "musicalcontent", "measure", 
			"items", "item", "changeconfiguration", "slurs", "ties", "notesties", 
			"tiesaux", "notes", "beaming", "note", "time", "rest", "barlines", "chord", 
			"articulations", "ornaments", "partial_beaming", "mens_notation", "m_timesignature", 
			"m_musicalcontent", "m_measure", "m_items", "m_item", "m_note", "m_barlines", 
			"m_rest", "m_slurs", "m_ligature", "m_dot", "m_notesuffix", "mensural_signs", 
			"m_perfect", "m_imperfect"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'L'", null, null, "'M'", "'o'", null, "'3'", "'2'", null, 
			"'#'", "'-'", "'##'", "'--'", "'n'", null, "' '", "'>'", "'<'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'K'", "'k'", "'m'", "'T'", "'t'", 
			"'W'", "'w'", "'U'", "'p'", "'i'", "'v'", "'r'", "'R'", "'A'", "'B'", 
			"'C'", "'D'", "'E'", "'F'", "'G'", "'a'", "'b'", "'c'", "'d'", "'e'", 
			"'f'", "'g'", "'J'", "'clef'", "'skern'", "'smens'", "'met'", "'.'", 
			"'|'", "'='", "'/'", "'\\'", "'*'", "'^'", "'''", "';'", "':'", "'~'", 
			"'`'", "'!'", "','", "'&'", "'*-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LETTER_L", "NOTENAME", "NOTENAMECL", "LETTER_M", "PERTFECT", 
			"DIGIT", "THREE", "TWO", "M_RHYTHM", "SHARP", "FLAT", "DOUBLESHARP", 
			"DOUBLEFLAT", "NATURAL", "CLEF", "SPACE", "GREATER", "LESS", "LEFTPAR", 
			"RIGHTPAR", "LEFTBRACKET", "RIGHTBRACKET", "LEFTCURBRACES", "RIGHTCURBRACES", 
			"LETTER_K", "LETTER_k", "LETTER_m", "LETTER_T", "LETTER_t", "LETTER_W", 
			"LETTER_w", "LETTER_U", "LETTER_p", "LETTER_i", "LETTER_v", "LETTER_r", 
			"LETTER_R", "LETTER_A", "LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", 
			"LETTER_F", "LETTER_G", "LETTER_a", "LETTER_b", "LETTER_c", "LETTER_d", 
			"LETTER_e", "LETTER_f", "LETTER_g", "LETTER_J", "WORD_CLEF", "WORD_SKERN", 
			"WORD_SMENS", "WORD_MET", "DOT", "BARLINE", "EQUAL", "SLASH", "BACKSLASH", 
			"ASTERISK", "CIRCUNFLEX", "APOSTROPHE", "SEMICOLON", "COLON", "COLOURED", 
			"GRAVE_ACCENT", "EXCLAMATION", "COMA", "SLURS_COUNT", "TOKEN_FINISH", 
			"COMMON"
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					kern_notation();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASTERISK );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					mens_notation();
					}
					}
					setState(106); 
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
			setState(110);
			match(ASTERISK);
			setState(111);
			match(WORD_CLEF);
			setState(112);
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
			setState(114);
			match(ASTERISK);
			setState(115);
			match(LETTER_k);
			setState(116);
			match(LEFTBRACKET);
			setState(117);
			note_signature();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(118);
				match(COMA);
				setState(119);
				note_signature();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
			setState(127);
			match(NOTENAME);
			setState(128);
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
			setState(130);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					match(NOTENAME);
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOTENAME );
				}
				break;
			case NOTENAMECL:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					match(NOTENAMECL);
					}
					}
					setState(140); 
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
			setState(144);
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
		public TimesignatureContext timesignature() {
			return getRuleContext(TimesignatureContext.class,0);
		}
		public MusicalcontentContext musicalcontent() {
			return getRuleContext(MusicalcontentContext.class,0);
		}
		public TerminalNode TOKEN_FINISH() { return getToken(kernmensParser.TOKEN_FINISH, 0); }
		public KeysignatureContext keysignature() {
			return getRuleContext(KeysignatureContext.class,0);
		}
		public Kern_notationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kern_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterKern_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitKern_notation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitKern_notation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kern_notationContext kern_notation() throws RecognitionException {
		Kern_notationContext _localctx = new Kern_notationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kern_notation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ASTERISK);
			setState(147);
			match(ASTERISK);
			setState(148);
			match(WORD_SKERN);
			setState(149);
			mastercleff();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(150);
				keysignature();
				}
				break;
			}
			setState(153);
			timesignature();
			setState(154);
			musicalcontent();
			setState(155);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterTimesignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitTimesignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitTimesignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesignatureContext timesignature() throws RecognitionException {
		TimesignatureContext _localctx = new TimesignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ASTERISK);
			setState(158);
			match(LETTER_M);
			setState(159);
			fraction();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(160);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			number();
			setState(164);
			match(SLASH);
			setState(165);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitNumber(this);
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
			setState(168); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(167);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterMetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitMetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitMetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetterContext metter() throws RecognitionException {
		MetterContext _localctx = new MetterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_metter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ASTERISK);
			setState(173);
			match(WORD_MET);
			setState(174);
			match(LEFTPAR);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_c:
				{
				setState(175);
				common_met();
				}
				break;
			case PERTFECT:
				{
				setState(176);
				perfect_met();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
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
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public TerminalNode LETTER_R() { return getToken(kernmensParser.LETTER_R, 0); }
		public Common_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterCommon_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitCommon_met(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitCommon_met(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_metContext common_met() throws RecognitionException {
		Common_metContext _localctx = new Common_metContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_common_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LETTER_c);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_R) | (1L << DOT) | (1L << BARLINE))) != 0)) {
				{
				setState(182);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterPerfect_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitPerfect_met(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitPerfect_met(this);
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
			setState(185);
			match(PERTFECT);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==BARLINE) {
				{
				setState(186);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterMusicalcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitMusicalcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitMusicalcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MusicalcontentContext musicalcontent() throws RecognitionException {
		MusicalcontentContext _localctx = new MusicalcontentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_musicalcontent);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BARLINE - 59)) | (1L << (EQUAL - 59)) | (1L << (COLON - 59)) | (1L << (EXCLAMATION - 59)))) != 0)) {
					{
					setState(189);
					barlines();
					}
				}

				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					measure();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_L) | (1L << DIGIT) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LEFTBRACKET) | (1L << LETTER_U) | (1L << ASTERISK))) != 0) || _la==SLURS_COUNT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitMeasure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitMeasure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_measure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			items();
			setState(201);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitItems(this);
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
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				item();
				}
				}
				setState(206); 
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_item);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				notes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				changeconfiguration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				slurs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterChangeconfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitChangeconfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitChangeconfiguration(this);
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
			setState(218); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(215);
						mastercleff();
						}
						break;
					case 2:
						{
						setState(216);
						timesignature();
						}
						break;
					case 3:
						{
						setState(217);
						keysignature();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterSlurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitSlurs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitSlurs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlursContext slurs() throws RecognitionException {
		SlursContext _localctx = new SlursContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_slurs);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTER_U) {
					{
					setState(222);
					match(LETTER_U);
					}
				}

				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(225);
					match(SLURS_COUNT);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(LEFTPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(232);
					match(SLURS_COUNT);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterTies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitTies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitTies(this);
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
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(241);
				match(LETTER_U);
				}
			}

			setState(244);
			match(LEFTBRACKET);
			setState(245);
			notes();
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(246);
				barlines();
				}
				break;
			}
			setState(249);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterNotesties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitNotesties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitNotesties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotestiesContext notesties() throws RecognitionException {
		NotestiesContext _localctx = new NotestiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notesties);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACKET:
			case LETTER_U:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
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
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BARLINE - 59)) | (1L << (EQUAL - 59)) | (1L << (COLON - 59)) | (1L << (EXCLAMATION - 59)))) != 0)) {
					{
					setState(252);
					barlines();
					}
				}

				setState(255);
				notes();
				setState(256);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterTiesaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitTiesaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitTiesaux(this);
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
			notes();
			setState(265);
			match(RIGHTBRACKET);
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(266);
				barlines();
				}
				break;
			}
			setState(269);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterNotes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitNotes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitNotes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_notes);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				beaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				note();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterBeaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitBeaming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitBeaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeamingContext beaming() throws RecognitionException {
		BeamingContext _localctx = new BeamingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_beaming);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(276);
					match(LETTER_L);
					}
					}
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_L );
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(281);
					note();
					}
					break;
				case 2:
					{
					setState(282);
					chord();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(285);
					note();
					}
					break;
				case 2:
					{
					setState(286);
					chord();
					}
					break;
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(289);
					match(LETTER_J);
					}
					}
					setState(292); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_J );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(294);
					note();
					}
					break;
				case 2:
					{
					setState(295);
					chord();
					}
					break;
				}
				setState(298);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitNote(this);
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
			setState(302);
			time();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(303);
				match(DOT);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			pitch();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL))) != 0)) {
				{
				setState(310);
				notesuffix();
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_M) | (1L << LETTER_m) | (1L << LETTER_T) | (1L << LETTER_t) | (1L << LETTER_W) | (1L << LETTER_w))) != 0)) {
				{
				setState(313);
				ornaments();
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CIRCUNFLEX - 64)) | (1L << (APOSTROPHE - 64)) | (1L << (SEMICOLON - 64)) | (1L << (COLOURED - 64)) | (1L << (GRAVE_ACCENT - 64)))) != 0)) {
				{
				setState(316);
				articulations();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(319);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitTime(this);
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
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				match(DIGIT);
				}
				}
				setState(325); 
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			time();
			setState(328);
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
		public List<TerminalNode> BARLINE() { return getTokens(kernmensParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(kernmensParser.BARLINE, i);
		}
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
		public BarlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterBarlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitBarlines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitBarlines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarlinesContext barlines() throws RecognitionException {
		BarlinesContext _localctx = new BarlinesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_barlines);
		try {
			int _alt;
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(EQUAL);
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(331);
						match(DIGIT);
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(BARLINE);
				setState(338);
				match(BARLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(EXCLAMATION);
				setState(340);
				match(BARLINE);
				setState(341);
				match(COLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(COLON);
				setState(343);
				match(BARLINE);
				setState(344);
				match(EXCLAMATION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				match(EQUAL);
				setState(346);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitChord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitChord(this);
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
			setState(349);
			note();
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(350);
				match(COMA);
				setState(351);
				note();
				}
				}
				setState(354); 
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterArticulations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitArticulations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitArticulations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticulationsContext articulations() throws RecognitionException {
		ArticulationsContext _localctx = new ArticulationsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_articulations);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(APOSTROPHE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(CIRCUNFLEX);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(GRAVE_ACCENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(COLOURED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(APOSTROPHE);
				setState(361);
				match(COLOURED);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(APOSTROPHE);
				setState(363);
				match(CIRCUNFLEX);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(364);
				match(CIRCUNFLEX);
				setState(365);
				match(CIRCUNFLEX);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterOrnaments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitOrnaments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitOrnaments(this);
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
			setState(369);
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
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).enterPartial_beaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensListener ) ((kernmensListener)listener).exitPartial_beaming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernmensVisitor ) return ((kernmensVisitor<? extends T>)visitor).visitPartial_beaming(this);
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
			setState(371);
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
		enterRule(_localctx, 66, RULE_mens_notation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ASTERISK);
			setState(374);
			match(ASTERISK);
			setState(375);
			match(WORD_SMENS);
			setState(376);
			mastercleff();
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(377);
				m_timesignature();
				}
				break;
			}
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(380);
				keysignature();
				}
			}

			setState(383);
			m_musicalcontent();
			setState(384);
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
		enterRule(_localctx, 68, RULE_m_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ASTERISK);
			setState(387);
			match(WORD_MET);
			setState(388);
			match(LEFTPAR);
			setState(389);
			mensural_signs();
			setState(390);
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
		enterRule(_localctx, 70, RULE_m_musicalcontent);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(392);
					m_measure();
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << M_RHYTHM) | (1L << GREATER) | (1L << LESS) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << EQUAL))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
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
		enterRule(_localctx, 72, RULE_m_measure);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case M_RHYTHM:
			case GREATER:
			case LESS:
			case LEFTPAR:
			case RIGHTPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				m_items();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
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
		enterRule(_localctx, 74, RULE_m_items);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(404);
					m_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(407); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 76, RULE_m_item);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				m_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				m_rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				m_slurs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
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
		enterRule(_localctx, 78, RULE_m_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(M_RHYTHM);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(416);
				m_dot();
				}
				break;
			}
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_p:
				{
				setState(419);
				m_perfect();
				}
				break;
			case LETTER_i:
				{
				setState(420);
				m_imperfect();
				}
				break;
			case NOTENAME:
			case NOTENAMECL:
			case COLOURED:
				break;
			default:
				break;
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOURED) {
				{
				setState(423);
				match(COLOURED);
				}
			}

			setState(426);
			pitch();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL) | (1L << LETTER_U))) != 0)) {
				{
				setState(427);
				m_notesuffix();
				}
			}

			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(430);
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
		enterRule(_localctx, 80, RULE_m_barlines);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(EQUAL);
				setState(434);
				match(FLAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(EQUAL);
				setState(436);
				match(BARLINE);
				setState(437);
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
		enterRule(_localctx, 82, RULE_m_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(M_RHYTHM);
			setState(441);
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
		enterRule(_localctx, 84, RULE_m_slurs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 86, RULE_m_ligature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		enterRule(_localctx, 88, RULE_m_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LETTER_p);
			setState(448);
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
		enterRule(_localctx, 90, RULE_m_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(450);
				match(LETTER_U);
				}
			}

			setState(453);
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
		enterRule(_localctx, 92, RULE_mensural_signs);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(455);
				match(COMMON);
				setState(471);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BARLINE:
					{
					setState(456);
					match(BARLINE);
					setState(462);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case THREE:
						{
						setState(457);
						match(THREE);
						}
						break;
					case TWO:
						{
						setState(458);
						match(TWO);
						}
						break;
					case SLASH:
						{
						setState(459);
						match(SLASH);
						setState(460);
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
						setState(461);
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
					setState(464);
					match(TWO);
					}
					break;
				case THREE:
					{
					setState(465);
					match(THREE);
					}
					break;
				case DOT:
					{
					setState(466);
					match(DOT);
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BARLINE) {
						{
						setState(467);
						match(BARLINE);
						}
					}

					}
					break;
				case LETTER_r:
					{
					setState(470);
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
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(473);
					match(PERTFECT);
					setState(483);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TWO:
						{
						setState(474);
						match(TWO);
						}
						break;
					case THREE:
						{
						setState(475);
						match(THREE);
						}
						break;
					case BARLINE:
						{
						setState(476);
						match(BARLINE);
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THREE) {
							{
							setState(477);
							match(THREE);
							}
						}

						}
						break;
					case SLASH:
						{
						setState(480);
						match(SLASH);
						setState(481);
						match(THREE);
						}
						break;
					case DOT:
						{
						setState(482);
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
					setState(485);
					match(THREE);
					setState(486);
					match(SLASH);
					setState(487);
					match(TWO);
					}
					break;
				case 3:
					{
					setState(488);
					match(THREE);
					}
					break;
				case 4:
					{
					setState(489);
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
		enterRule(_localctx, 94, RULE_m_perfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		enterRule(_localctx, 96, RULE_m_imperfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u01f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2f\n\2\r\2"+
		"\16\2g\3\2\6\2k\n\2\r\2\16\2l\5\2o\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4{\n\4\f\4\16\4~\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\6\7\u0088"+
		"\n\7\r\7\16\7\u0089\3\7\6\7\u008d\n\7\r\7\16\7\u008e\5\7\u0091\n\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\5\n\u00a4\n\n\3\13\3\13\3\13\3\13\3\f\6\f\u00ab\n\f\r\f\16\f\u00ac\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00b4\n\r\3\r\3\r\3\16\3\16\5\16\u00ba\n\16\3\17"+
		"\3\17\5\17\u00be\n\17\3\20\5\20\u00c1\n\20\3\20\6\20\u00c4\n\20\r\20\16"+
		"\20\u00c5\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\22\6\22\u00cf\n\22\r\22"+
		"\16\22\u00d0\3\23\3\23\3\23\3\23\3\23\5\23\u00d8\n\23\3\24\3\24\3\24\6"+
		"\24\u00dd\n\24\r\24\16\24\u00de\3\25\5\25\u00e2\n\25\3\25\7\25\u00e5\n"+
		"\25\f\25\16\25\u00e8\13\25\3\25\3\25\7\25\u00ec\n\25\f\25\16\25\u00ef"+
		"\13\25\3\25\5\25\u00f2\n\25\3\26\5\26\u00f5\n\26\3\26\3\26\3\26\5\26\u00fa"+
		"\n\26\3\26\3\26\3\27\3\27\5\27\u0100\n\27\3\27\3\27\3\27\5\27\u0105\n"+
		"\27\3\30\5\30\u0108\n\30\3\30\3\30\3\30\3\30\5\30\u010e\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u0115\n\31\3\32\6\32\u0118\n\32\r\32\16\32\u0119"+
		"\3\32\3\32\5\32\u011e\n\32\3\32\3\32\5\32\u0122\n\32\3\32\6\32\u0125\n"+
		"\32\r\32\16\32\u0126\3\32\3\32\5\32\u012b\n\32\3\32\3\32\5\32\u012f\n"+
		"\32\3\33\3\33\7\33\u0133\n\33\f\33\16\33\u0136\13\33\3\33\3\33\5\33\u013a"+
		"\n\33\3\33\5\33\u013d\n\33\3\33\5\33\u0140\n\33\3\33\5\33\u0143\n\33\3"+
		"\34\6\34\u0146\n\34\r\34\16\34\u0147\3\35\3\35\3\35\3\36\3\36\7\36\u014f"+
		"\n\36\f\36\16\36\u0152\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u015e\n\36\3\37\3\37\3\37\6\37\u0163\n\37\r\37\16\37\u0164"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0172\n \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\5#\u017d\n#\3#\5#\u0180\n#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\6%\u018c"+
		"\n%\r%\16%\u018d\3%\5%\u0191\n%\3&\3&\5&\u0195\n&\3\'\6\'\u0198\n\'\r"+
		"\'\16\'\u0199\3(\3(\3(\3(\5(\u01a0\n(\3)\3)\5)\u01a4\n)\3)\3)\5)\u01a8"+
		"\n)\3)\5)\u01ab\n)\3)\3)\5)\u01af\n)\3)\5)\u01b2\n)\3*\3*\3*\3*\3*\5*"+
		"\u01b9\n*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\5/\u01c6\n/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u01d1\n\60\3\60\3\60\3\60\3\60\5\60\u01d7"+
		"\n\60\3\60\5\60\u01da\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u01e1\n\60\3"+
		"\60\3\60\3\60\5\60\u01e6\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u01ed\n\60"+
		"\5\60\u01ef\n\60\3\61\3\61\3\62\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\f\3\2"+
		"\r\16\3\2\r\21\3\2?@\4\2((<=\3\2<=\4\2\7\7\36\"\3\2\34\35\3\2\26\27\3"+
		"\2\24\25\3\2\n\13\2\u0226\2n\3\2\2\2\4p\3\2\2\2\6t\3\2\2\2\b\u0081\3\2"+
		"\2\2\n\u0084\3\2\2\2\f\u0090\3\2\2\2\16\u0092\3\2\2\2\20\u0094\3\2\2\2"+
		"\22\u009f\3\2\2\2\24\u00a5\3\2\2\2\26\u00aa\3\2\2\2\30\u00ae\3\2\2\2\32"+
		"\u00b7\3\2\2\2\34\u00bb\3\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2\2\2\"\u00ce"+
		"\3\2\2\2$\u00d7\3\2\2\2&\u00dc\3\2\2\2(\u00f1\3\2\2\2*\u00f4\3\2\2\2,"+
		"\u0104\3\2\2\2.\u0107\3\2\2\2\60\u0114\3\2\2\2\62\u012e\3\2\2\2\64\u0130"+
		"\3\2\2\2\66\u0145\3\2\2\28\u0149\3\2\2\2:\u015d\3\2\2\2<\u015f\3\2\2\2"+
		">\u0171\3\2\2\2@\u0173\3\2\2\2B\u0175\3\2\2\2D\u0177\3\2\2\2F\u0184\3"+
		"\2\2\2H\u0190\3\2\2\2J\u0194\3\2\2\2L\u0197\3\2\2\2N\u019f\3\2\2\2P\u01a1"+
		"\3\2\2\2R\u01b8\3\2\2\2T\u01ba\3\2\2\2V\u01bd\3\2\2\2X\u01bf\3\2\2\2Z"+
		"\u01c1\3\2\2\2\\\u01c5\3\2\2\2^\u01ee\3\2\2\2`\u01f0\3\2\2\2b\u01f2\3"+
		"\2\2\2df\5\20\t\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2ho\3\2\2\2ik"+
		"\5D#\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2ne\3\2\2\2nj\3"+
		"\2\2\2o\3\3\2\2\2pq\7A\2\2qr\78\2\2rs\7\22\2\2s\5\3\2\2\2tu\7A\2\2uv\7"+
		"\35\2\2vw\7\30\2\2w|\5\b\5\2xy\7I\2\2y{\5\b\5\2zx\3\2\2\2{~\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\31\2\2\u0080\7\3"+
		"\2\2\2\u0081\u0082\7\5\2\2\u0082\u0083\t\2\2\2\u0083\t\3\2\2\2\u0084\u0085"+
		"\t\3\2\2\u0085\13\3\2\2\2\u0086\u0088\7\5\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0091\3\2"+
		"\2\2\u008b\u008d\7\6\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0087\3\2"+
		"\2\2\u0090\u008c\3\2\2\2\u0091\r\3\2\2\2\u0092\u0093\t\4\2\2\u0093\17"+
		"\3\2\2\2\u0094\u0095\7A\2\2\u0095\u0096\7A\2\2\u0096\u0097\79\2\2\u0097"+
		"\u0099\5\4\3\2\u0098\u009a\5\6\4\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\5\36\20\2\u009d"+
		"\u009e\7K\2\2\u009e\21\3\2\2\2\u009f\u00a0\7A\2\2\u00a0\u00a1\7\7\2\2"+
		"\u00a1\u00a3\5\24\13\2\u00a2\u00a4\5\30\r\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\7?\2"+
		"\2\u00a7\u00a8\5\26\f\2\u00a8\25\3\2\2\2\u00a9\u00ab\7\t\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\27\3\2\2\2\u00ae\u00af\7A\2\2\u00af\u00b0\7;\2\2\u00b0\u00b3\7\26\2\2"+
		"\u00b1\u00b4\5\32\16\2\u00b2\u00b4\5\34\17\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\27\2\2\u00b6\31\3\2\2"+
		"\2\u00b7\u00b9\7\62\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bd\7\b\2\2\u00bc\u00be\t\6\2"+
		"\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c1"+
		"\5:\36\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c4\5 \21\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5\"\22\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\5\"\22"+
		"\2\u00cb\u00cc\5:\36\2\u00cc!\3\2\2\2\u00cd\u00cf\5$\23\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"#\3\2\2\2\u00d2\u00d8\5\60\31\2\u00d3\u00d8\58\35\2\u00d4\u00d8\5&\24"+
		"\2\u00d5\u00d8\5(\25\2\u00d6\u00d8\5*\26\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3"+
		"\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"%\3\2\2\2\u00d9\u00dd\5\4\3\2\u00da\u00dd\5\22\n\2\u00db\u00dd\5\6\4\2"+
		"\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\'\3\2\2\2\u00e0"+
		"\u00e2\7#\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6\3\2"+
		"\2\2\u00e3\u00e5\7J\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00f2\7\26\2\2\u00ea\u00ec\7J\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\7\27\2\2\u00f1\u00e1\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f5\7#\2\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\30\2\2\u00f7\u00f9\5"+
		"\60\31\2\u00f8\u00fa\5:\36\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\5,\27\2\u00fc+\3\2\2\2\u00fd\u0105\5.\30\2"+
		"\u00fe\u0100\5:\36\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\5\60\31\2\u0102\u0103\7\31\2\2\u0103\u0105\3\2\2"+
		"\2\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0105-\3\2\2\2\u0106\u0108"+
		"\7#\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\7\30\2\2\u010a\u010b\5\60\31\2\u010b\u010d\7\31\2\2\u010c\u010e"+
		"\5:\36\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\5,\27\2\u0110/\3\2\2\2\u0111\u0115\5\62\32\2\u0112\u0115\5\64\33"+
		"\2\u0113\u0115\5<\37\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\61\3\2\2\2\u0116\u0118\7\4\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u011e\5\64\33\2\u011c\u011e\5<\37\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u012f\3\2\2\2\u011f\u0122\5\64\33\2\u0120\u0122\5"+
		"<\37\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0125\7\67\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u012f\3\2\2\2\u0128\u012b\5\64\33\2\u0129"+
		"\u012b\5<\37\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\5B\"\2\u012d\u012f\3\2\2\2\u012e\u0117\3\2\2\2\u012e"+
		"\u0121\3\2\2\2\u012e\u012a\3\2\2\2\u012f\63\3\2\2\2\u0130\u0134\5\66\34"+
		"\2\u0131\u0133\7<\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0139\5\f\7\2\u0138\u013a\5\n\6\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u013d\5@!\2\u013c\u013b\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140\5> \2\u013f\u013e\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5\16\b\2\u0142\u0141\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\65\3\2\2\2\u0144\u0146\7\t\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\67\3\2\2\2\u0149\u014a\5\66\34\2\u014a\u014b\7\'\2\2\u014b"+
		"9\3\2\2\2\u014c\u0150\7>\2\2\u014d\u014f\7\t\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u015e\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7=\2\2\u0154\u015e\7=\2\2\u0155\u0156"+
		"\7H\2\2\u0156\u0157\7=\2\2\u0157\u015e\7E\2\2\u0158\u0159\7E\2\2\u0159"+
		"\u015a\7=\2\2\u015a\u015e\7H\2\2\u015b\u015c\7>\2\2\u015c\u015e\7>\2\2"+
		"\u015d\u014c\3\2\2\2\u015d\u0153\3\2\2\2\u015d\u0155\3\2\2\2\u015d\u0158"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015e;\3\2\2\2\u015f\u0162\5\64\33\2\u0160"+
		"\u0161\7I\2\2\u0161\u0163\5\64\33\2\u0162\u0160\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165=\3\2\2\2\u0166\u0172"+
		"\7C\2\2\u0167\u0172\7B\2\2\u0168\u0172\7G\2\2\u0169\u0172\7F\2\2\u016a"+
		"\u016b\7C\2\2\u016b\u0172\7F\2\2\u016c\u016d\7C\2\2\u016d\u0172\7B\2\2"+
		"\u016e\u016f\7B\2\2\u016f\u0172\7B\2\2\u0170\u0172\7D\2\2\u0171\u0166"+
		"\3\2\2\2\u0171\u0167\3\2\2\2\u0171\u0168\3\2\2\2\u0171\u0169\3\2\2\2\u0171"+
		"\u016a\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u0170\3\2"+
		"\2\2\u0172?\3\2\2\2\u0173\u0174\t\7\2\2\u0174A\3\2\2\2\u0175\u0176\t\b"+
		"\2\2\u0176C\3\2\2\2\u0177\u0178\7A\2\2\u0178\u0179\7A\2\2\u0179\u017a"+
		"\7:\2\2\u017a\u017c\5\4\3\2\u017b\u017d\5F$\2\u017c\u017b\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\5\6\4\2\u017f\u017e\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\5H%\2\u0182\u0183"+
		"\7K\2\2\u0183E\3\2\2\2\u0184\u0185\7A\2\2\u0185\u0186\7;\2\2\u0186\u0187"+
		"\7\26\2\2\u0187\u0188\5^\60\2\u0188\u0189\7\27\2\2\u0189G\3\2\2\2\u018a"+
		"\u018c\5J&\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2"+
		"\2\u018d\u018e\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u0191\5L\'\2\u0190\u018b"+
		"\3\2\2\2\u0190\u018f\3\2\2\2\u0191I\3\2\2\2\u0192\u0195\5L\'\2\u0193\u0195"+
		"\5R*\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195K\3\2\2\2\u0196\u0198"+
		"\5N(\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019aM\3\2\2\2\u019b\u01a0\5P)\2\u019c\u01a0\5T+\2\u019d"+
		"\u01a0\5V,\2\u019e\u01a0\5X-\2\u019f\u019b\3\2\2\2\u019f\u019c\3\2\2\2"+
		"\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0O\3\2\2\2\u01a1\u01a3\7"+
		"\f\2\2\u01a2\u01a4\5Z.\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a8\5`\61\2\u01a6\u01a8\5b\62\2\u01a7\u01a5\3\2"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01ab\7F\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ae\5\f\7\2\u01ad\u01af\5\\/\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\5\16\b\2\u01b1\u01b0\3"+
		"\2\2\2\u01b1\u01b2\3\2\2\2\u01b2Q\3\2\2\2\u01b3\u01b4\7>\2\2\u01b4\u01b9"+
		"\7\16\2\2\u01b5\u01b6\7>\2\2\u01b6\u01b7\7=\2\2\u01b7\u01b9\7=\2\2\u01b8"+
		"\u01b3\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b9S\3\2\2\2\u01ba\u01bb\7\f\2\2"+
		"\u01bb\u01bc\7\'\2\2\u01bcU\3\2\2\2\u01bd\u01be\t\t\2\2\u01beW\3\2\2\2"+
		"\u01bf\u01c0\t\n\2\2\u01c0Y\3\2\2\2\u01c1\u01c2\7$\2\2\u01c2\u01c3\7E"+
		"\2\2\u01c3[\3\2\2\2\u01c4\u01c6\7#\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\5\n\6\2\u01c8]\3\2\2\2\u01c9"+
		"\u01d9\7L\2\2\u01ca\u01d0\7=\2\2\u01cb\u01d1\7\n\2\2\u01cc\u01d1\7\13"+
		"\2\2\u01cd\u01ce\7?\2\2\u01ce\u01d1\t\13\2\2\u01cf\u01d1\7\'\2\2\u01d0"+
		"\u01cb\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01da\3\2\2\2\u01d2\u01da\7\13\2\2\u01d3"+
		"\u01da\7\n\2\2\u01d4\u01d6\7<\2\2\u01d5\u01d7\7=\2\2\u01d6\u01d5\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01da\7\'\2\2\u01d9\u01ca"+
		"\3\2\2\2\u01d9\u01d2\3\2\2\2\u01d9\u01d3\3\2\2\2\u01d9\u01d4\3\2\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01ef\3\2\2\2\u01db\u01e5\7\b"+
		"\2\2\u01dc\u01e6\7\13\2\2\u01dd\u01e6\7\n\2\2\u01de\u01e0\7=\2\2\u01df"+
		"\u01e1\7\n\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e6\3\2"+
		"\2\2\u01e2\u01e3\7?\2\2\u01e3\u01e6\7\n\2\2\u01e4\u01e6\7<\2\2\u01e5\u01dc"+
		"\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e5\u01de\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ed\3\2\2\2\u01e7\u01e8\7\n"+
		"\2\2\u01e8\u01e9\7?\2\2\u01e9\u01ed\7\13\2\2\u01ea\u01ed\7\n\2\2\u01eb"+
		"\u01ed\7\13\2\2\u01ec\u01db\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01ea\3"+
		"\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01c9\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef_\3\2\2\2\u01f0\u01f1\7$\2\2\u01f1a\3\2\2\2\u01f2"+
		"\u01f3\7%\2\2\u01f3c\3\2\2\2Fgln|\u0089\u008e\u0090\u0099\u00a3\u00ac"+
		"\u00b3\u00b9\u00bd\u00c0\u00c5\u00c8\u00d0\u00d7\u00dc\u00de\u00e1\u00e6"+
		"\u00ed\u00f1\u00f4\u00f9\u00ff\u0104\u0107\u010d\u0114\u0119\u011d\u0121"+
		"\u0126\u012a\u012e\u0134\u0139\u013c\u013f\u0142\u0147\u0150\u015d\u0164"+
		"\u0171\u017c\u017f\u018d\u0190\u0194\u0199\u019f\u01a3\u01a7\u01aa\u01ae"+
		"\u01b1\u01b8\u01c5\u01d0\u01d6\u01d9\u01e0\u01e5\u01ec\u01ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
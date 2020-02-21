// Generated from /Users/jorgemarcoesteve/IdeaProjects/TFG/src/main/java/grammar/kernmens.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kernmensLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOTENAME", "NOTENAMECL", "DIGIT", "THREE", "TWO", "M_RHYTHM", "SHARP", 
			"FLAT", "DOUBLESHARP", "DOUBLEFLAT", "NATURAL", "CLEF", "SPACE", "GREATER", 
			"LESS", "LEFTPAR", "RIGHTPAR", "LEFTBRACKET", "RIGHTBRACKET", "LEFTCURBRACES", 
			"RIGHTCURBRACES", "LETTER_K", "LETTER_k", "LETTER_M", "LETTER_m", "LETTER_T", 
			"LETTER_t", "LETTER_W", "LETTER_w", "LETTER_U", "LETTER_p", "LETTER_i", 
			"LETTER_v", "LETTER_r", "COMMON", "PERTFECT", "WORD_CLEF", "WORD_SKERN", 
			"WORD_SMENS", "WORD_MET", "DOT", "BARLINE", "EQUAL", "SLASH", "BACKSLASH", 
			"ASTERISK", "CIRCUNFLEX", "APOSTROPHE", "SEMICOLON", "COLON", "COLOURED", 
			"GRAVE_ACCENT", "EXCLAMATION", "COMA", "SLURS_COUNT"
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


	public kernmensLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "kernmens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0105\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\6\3\2ci\3\2CI\3\2\62;\t\2NOUUWWZ"+
		"Zoouuww\2\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2"+
		"\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2"+
		"\25\u0084\3\2\2\2\27\u0087\3\2\2\2\31\u00a0\3\2\2\2\33\u00a2\3\2\2\2\35"+
		"\u00a4\3\2\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3"+
		"\2\2\2\'\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00b6"+
		"\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2\2\2\67\u00be\3"+
		"\2\2\29\u00c0\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00c6\3\2\2\2A\u00c8"+
		"\3\2\2\2C\u00ca\3\2\2\2E\u00cc\3\2\2\2G\u00ce\3\2\2\2I\u00d0\3\2\2\2K"+
		"\u00d2\3\2\2\2M\u00d7\3\2\2\2O\u00dd\3\2\2\2Q\u00e3\3\2\2\2S\u00e7\3\2"+
		"\2\2U\u00e9\3\2\2\2W\u00eb\3\2\2\2Y\u00ed\3\2\2\2[\u00ef\3\2\2\2]\u00f1"+
		"\3\2\2\2_\u00f3\3\2\2\2a\u00f5\3\2\2\2c\u00f7\3\2\2\2e\u00f9\3\2\2\2g"+
		"\u00fb\3\2\2\2i\u00fd\3\2\2\2k\u00ff\3\2\2\2m\u0101\3\2\2\2o\u0103\3\2"+
		"\2\2qr\t\2\2\2r\4\3\2\2\2st\t\3\2\2t\6\3\2\2\2uv\t\4\2\2v\b\3\2\2\2wx"+
		"\7\65\2\2x\n\3\2\2\2yz\7\64\2\2z\f\3\2\2\2{|\t\5\2\2|\16\3\2\2\2}~\7%"+
		"\2\2~\20\3\2\2\2\177\u0080\7/\2\2\u0080\22\3\2\2\2\u0081\u0082\7%\2\2"+
		"\u0082\u0083\7%\2\2\u0083\24\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086\7"+
		"/\2\2\u0086\26\3\2\2\2\u0087\u0088\7p\2\2\u0088\30\3\2\2\2\u0089\u008a"+
		"\7I\2\2\u008a\u00a1\7\64\2\2\u008b\u008c\7H\2\2\u008c\u00a1\7\64\2\2\u008d"+
		"\u008e\7H\2\2\u008e\u00a1\7\65\2\2\u008f\u0090\7H\2\2\u0090\u00a1\7\66"+
		"\2\2\u0091\u0092\7E\2\2\u0092\u00a1\7\67\2\2\u0093\u0094\7E\2\2\u0094"+
		"\u00a1\7\66\2\2\u0095\u0096\7E\2\2\u0096\u00a1\7\65\2\2\u0097\u0098\7"+
		"E\2\2\u0098\u00a1\7\64\2\2\u0099\u009a\7E\2\2\u009a\u00a1\7\63\2\2\u009b"+
		"\u009c\7I\2\2\u009c\u00a1\7\63\2\2\u009d\u009e\7I\2\2\u009e\u009f\7x\2"+
		"\2\u009f\u00a1\7\64\2\2\u00a0\u0089\3\2\2\2\u00a0\u008b\3\2\2\2\u00a0"+
		"\u008d\3\2\2\2\u00a0\u008f\3\2\2\2\u00a0\u0091\3\2\2\2\u00a0\u0093\3\2"+
		"\2\2\u00a0\u0095\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0"+
		"\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7\"\2"+
		"\2\u00a3\34\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7"+
		">\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7"+
		"+\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7]\2\2\u00ad&\3\2\2\2\u00ae\u00af\7_"+
		"\2\2\u00af(\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7\177"+
		"\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7M\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7m\2"+
		"\2\u00b7\60\3\2\2\2\u00b8\u00b9\7O\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7"+
		"o\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7V\2\2\u00bd\66\3\2\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7Y\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7"+
		"y\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7W\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7r"+
		"\2\2\u00c7@\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7x\2"+
		"\2\u00cbD\3\2\2\2\u00cc\u00cd\7t\2\2\u00cdF\3\2\2\2\u00ce\u00cf\7E\2\2"+
		"\u00cfH\3\2\2\2\u00d0\u00d1\7Q\2\2\u00d1J\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7h\2\2\u00d6L\3\2\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\u00d9\7m\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7t\2\2"+
		"\u00db\u00dc\7p\2\2\u00dcN\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7o\2"+
		"\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7u\2\2\u00e2P\3\2"+
		"\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7v\2\2\u00e6R\3"+
		"\2\2\2\u00e7\u00e8\7\60\2\2\u00e8T\3\2\2\2\u00e9\u00ea\7~\2\2\u00eaV\3"+
		"\2\2\2\u00eb\u00ec\7?\2\2\u00ecX\3\2\2\2\u00ed\u00ee\7\61\2\2\u00eeZ\3"+
		"\2\2\2\u00ef\u00f0\7^\2\2\u00f0\\\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2^\3"+
		"\2\2\2\u00f3\u00f4\7`\2\2\u00f4`\3\2\2\2\u00f5\u00f6\7)\2\2\u00f6b\3\2"+
		"\2\2\u00f7\u00f8\7=\2\2\u00f8d\3\2\2\2\u00f9\u00fa\7<\2\2\u00faf\3\2\2"+
		"\2\u00fb\u00fc\7\u0080\2\2\u00fch\3\2\2\2\u00fd\u00fe\7b\2\2\u00fej\3"+
		"\2\2\2\u00ff\u0100\7#\2\2\u0100l\3\2\2\2\u0101\u0102\7.\2\2\u0102n\3\2"+
		"\2\2\u0103\u0104\7(\2\2\u0104p\3\2\2\2\4\2\u00a0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
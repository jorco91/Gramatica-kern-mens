// Generated from jorge/lexerkernmens.g4 by ANTLR 4.8
package jorge;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexerkernmens extends Lexer {
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
		WORD_MET=55, DOT=56, BARLINE=57, EQUAL=58, SLASH=59, BACKSLASH=60, ASTERISK=61, 
		CIRCUNFLEX=62, APOSTROPHE=63, SEMICOLON=64, COLON=65, COLOURED=66, GRAVE_ACCENT=67, 
		EXCLAMATION=68, COMA=69, SLURS_COUNT=70, TOKEN_FINISH=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LETTER_L", "LETTER_M", "PERTFECT", "DIGIT", "THREE", "TWO", "M_RHYTHM", 
			"SHARP", "FLAT", "DOUBLESHARP", "DOUBLEFLAT", "NATURAL", "CLEF", "SPACE", 
			"GREATER", "LESS", "LEFTPAR", "RIGHTPAR", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTCURBRACES", "RIGHTCURBRACES", "LETTER_K", "LETTER_k", "LETTER_m", 
			"LETTER_T", "LETTER_t", "LETTER_W", "LETTER_w", "LETTER_U", "LETTER_p", 
			"LETTER_i", "LETTER_v", "LETTER_r", "LETTER_R", "LETTER_A", "LETTER_B", 
			"LETTER_C", "LETTER_D", "LETTER_E", "LETTER_F", "LETTER_G", "LETTER_a", 
			"LETTER_b", "LETTER_c", "LETTER_d", "LETTER_e", "LETTER_f", "LETTER_g", 
			"LETTER_J", "WORD_CLEF", "WORD_SKERN", "WORD_SMENS", "WORD_MET", "DOT", 
			"BARLINE", "EQUAL", "SLASH", "BACKSLASH", "ASTERISK", "CIRCUNFLEX", "APOSTROPHE", 
			"SEMICOLON", "COLON", "COLOURED", "GRAVE_ACCENT", "EXCLAMATION", "COMA", 
			"SLURS_COUNT", "TOKEN_FINISH"
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
			"'J'", "'clef'", "'skern'", "'smens'", "'met'", "'.'", "'|'", "'='", 
			"'/'", "'\\'", "'*'", "'^'", "'''", "';'", "':'", "'~'", "'`'", "'!'", 
			"','", "'&'", "'*-'"
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
			"DOT", "BARLINE", "EQUAL", "SLASH", "BACKSLASH", "ASTERISK", "CIRCUNFLEX", 
			"APOSTROPHE", "SEMICOLON", "COLON", "COLOURED", "GRAVE_ACCENT", "EXCLAMATION", 
			"COMA", "SLURS_COUNT", "TOKEN_FINISH"
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


	public lexerkernmens(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexerkernmens.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u0148\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?"+
		"\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\2\2I\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\t\2NOUUWWZZoouuww\2\u0151\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\3\u0091\3\2\2\2\5\u0095\3\2\2\2\7\u0097\3\2\2\2\t\u0099\3\2\2"+
		"\2\13\u009b\3\2\2\2\r\u009d\3\2\2\2\17\u009f\3\2\2\2\21\u00a1\3\2\2\2"+
		"\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2\2\31\u00aa\3\2\2\2\33"+
		"\u00ad\3\2\2\2\35\u00c6\3\2\2\2\37\u00c8\3\2\2\2!\u00ca\3\2\2\2#\u00cc"+
		"\3\2\2\2%\u00ce\3\2\2\2\'\u00d0\3\2\2\2)\u00d2\3\2\2\2+\u00d4\3\2\2\2"+
		"-\u00d6\3\2\2\2/\u00d8\3\2\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00de"+
		"\3\2\2\2\67\u00e0\3\2\2\29\u00e2\3\2\2\2;\u00e4\3\2\2\2=\u00e6\3\2\2\2"+
		"?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E\u00ee\3\2\2\2G\u00f0\3"+
		"\2\2\2I\u00f2\3\2\2\2K\u00f4\3\2\2\2M\u00f6\3\2\2\2O\u00f8\3\2\2\2Q\u00fa"+
		"\3\2\2\2S\u00fc\3\2\2\2U\u00fe\3\2\2\2W\u0100\3\2\2\2Y\u0102\3\2\2\2["+
		"\u0104\3\2\2\2]\u0106\3\2\2\2_\u0108\3\2\2\2a\u010a\3\2\2\2c\u010c\3\2"+
		"\2\2e\u010e\3\2\2\2g\u0110\3\2\2\2i\u0112\3\2\2\2k\u0117\3\2\2\2m\u011d"+
		"\3\2\2\2o\u0123\3\2\2\2q\u0127\3\2\2\2s\u0129\3\2\2\2u\u012b\3\2\2\2w"+
		"\u012d\3\2\2\2y\u012f\3\2\2\2{\u0131\3\2\2\2}\u0133\3\2\2\2\177\u0135"+
		"\3\2\2\2\u0081\u0137\3\2\2\2\u0083\u0139\3\2\2\2\u0085\u013b\3\2\2\2\u0087"+
		"\u013d\3\2\2\2\u0089\u013f\3\2\2\2\u008b\u0141\3\2\2\2\u008d\u0143\3\2"+
		"\2\2\u008f\u0145\3\2\2\2\u0091\u0092\t\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\b\2\2\2\u0094\4\3\2\2\2\u0095\u0096\7N\2\2\u0096\6\3\2\2\2\u0097"+
		"\u0098\7O\2\2\u0098\b\3\2\2\2\u0099\u009a\7q\2\2\u009a\n\3\2\2\2\u009b"+
		"\u009c\t\3\2\2\u009c\f\3\2\2\2\u009d\u009e\7\65\2\2\u009e\16\3\2\2\2\u009f"+
		"\u00a0\7\64\2\2\u00a0\20\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2\22\3\2\2\2"+
		"\u00a3\u00a4\7%\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\26\3\2\2"+
		"\2\u00a7\u00a8\7%\2\2\u00a8\u00a9\7%\2\2\u00a9\30\3\2\2\2\u00aa\u00ab"+
		"\7/\2\2\u00ab\u00ac\7/\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae\34"+
		"\3\2\2\2\u00af\u00b0\7I\2\2\u00b0\u00c7\7\64\2\2\u00b1\u00b2\7H\2\2\u00b2"+
		"\u00c7\7\64\2\2\u00b3\u00b4\7H\2\2\u00b4\u00c7\7\65\2\2\u00b5\u00b6\7"+
		"H\2\2\u00b6\u00c7\7\66\2\2\u00b7\u00b8\7E\2\2\u00b8\u00c7\7\67\2\2\u00b9"+
		"\u00ba\7E\2\2\u00ba\u00c7\7\66\2\2\u00bb\u00bc\7E\2\2\u00bc\u00c7\7\65"+
		"\2\2\u00bd\u00be\7E\2\2\u00be\u00c7\7\64\2\2\u00bf\u00c0\7E\2\2\u00c0"+
		"\u00c7\7\63\2\2\u00c1\u00c2\7I\2\2\u00c2\u00c7\7\63\2\2\u00c3\u00c4\7"+
		"I\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c7\7\64\2\2\u00c6\u00af\3\2\2\2\u00c6"+
		"\u00b1\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00b5\3\2\2\2\u00c6\u00b7\3\2"+
		"\2\2\u00c6\u00b9\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6"+
		"\u00bf\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\36\3\2\2"+
		"\2\u00c8\u00c9\7\"\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7@\2\2\u00cb\"\3\2\2"+
		"\2\u00cc\u00cd\7>\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf&\3\2\2\2"+
		"\u00d0\u00d1\7+\2\2\u00d1(\3\2\2\2\u00d2\u00d3\7]\2\2\u00d3*\3\2\2\2\u00d4"+
		"\u00d5\7_\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7}\2\2\u00d7.\3\2\2\2\u00d8\u00d9"+
		"\7\177\2\2\u00d9\60\3\2\2\2\u00da\u00db\7M\2\2\u00db\62\3\2\2\2\u00dc"+
		"\u00dd\7m\2\2\u00dd\64\3\2\2\2\u00de\u00df\7o\2\2\u00df\66\3\2\2\2\u00e0"+
		"\u00e1\7V\2\2\u00e18\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3:\3\2\2\2\u00e4\u00e5"+
		"\7Y\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7y\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7"+
		"W\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7r\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7k"+
		"\2\2\u00edD\3\2\2\2\u00ee\u00ef\7x\2\2\u00efF\3\2\2\2\u00f0\u00f1\7t\2"+
		"\2\u00f1H\3\2\2\2\u00f2\u00f3\7T\2\2\u00f3J\3\2\2\2\u00f4\u00f5\7C\2\2"+
		"\u00f5L\3\2\2\2\u00f6\u00f7\7D\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7E\2\2\u00f9"+
		"P\3\2\2\2\u00fa\u00fb\7F\2\2\u00fbR\3\2\2\2\u00fc\u00fd\7G\2\2\u00fdT"+
		"\3\2\2\2\u00fe\u00ff\7H\2\2\u00ffV\3\2\2\2\u0100\u0101\7I\2\2\u0101X\3"+
		"\2\2\2\u0102\u0103\7c\2\2\u0103Z\3\2\2\2\u0104\u0105\7d\2\2\u0105\\\3"+
		"\2\2\2\u0106\u0107\7e\2\2\u0107^\3\2\2\2\u0108\u0109\7f\2\2\u0109`\3\2"+
		"\2\2\u010a\u010b\7g\2\2\u010bb\3\2\2\2\u010c\u010d\7h\2\2\u010dd\3\2\2"+
		"\2\u010e\u010f\7i\2\2\u010ff\3\2\2\2\u0110\u0111\7L\2\2\u0111h\3\2\2\2"+
		"\u0112\u0113\7e\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115\u0116"+
		"\7h\2\2\u0116j\3\2\2\2\u0117\u0118\7u\2\2\u0118\u0119\7m\2\2\u0119\u011a"+
		"\7g\2\2\u011a\u011b\7t\2\2\u011b\u011c\7p\2\2\u011cl\3\2\2\2\u011d\u011e"+
		"\7u\2\2\u011e\u011f\7o\2\2\u011f\u0120\7g\2\2\u0120\u0121\7p\2\2\u0121"+
		"\u0122\7u\2\2\u0122n\3\2\2\2\u0123\u0124\7o\2\2\u0124\u0125\7g\2\2\u0125"+
		"\u0126\7v\2\2\u0126p\3\2\2\2\u0127\u0128\7\60\2\2\u0128r\3\2\2\2\u0129"+
		"\u012a\7~\2\2\u012at\3\2\2\2\u012b\u012c\7?\2\2\u012cv\3\2\2\2\u012d\u012e"+
		"\7\61\2\2\u012ex\3\2\2\2\u012f\u0130\7^\2\2\u0130z\3\2\2\2\u0131\u0132"+
		"\7,\2\2\u0132|\3\2\2\2\u0133\u0134\7`\2\2\u0134~\3\2\2\2\u0135\u0136\7"+
		")\2\2\u0136\u0080\3\2\2\2\u0137\u0138\7=\2\2\u0138\u0082\3\2\2\2\u0139"+
		"\u013a\7<\2\2\u013a\u0084\3\2\2\2\u013b\u013c\7\u0080\2\2\u013c\u0086"+
		"\3\2\2\2\u013d\u013e\7b\2\2\u013e\u0088\3\2\2\2\u013f\u0140\7#\2\2\u0140"+
		"\u008a\3\2\2\2\u0141\u0142\7.\2\2\u0142\u008c\3\2\2\2\u0143\u0144\7(\2"+
		"\2\u0144\u008e\3\2\2\2\u0145\u0146\7,\2\2\u0146\u0147\7/\2\2\u0147\u0090"+
		"\3\2\2\2\4\2\u00c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
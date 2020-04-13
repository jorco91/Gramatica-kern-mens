// Generated from /Users/jorgemarco/IdeaProjects/ProyectoTFG/src/main/antlr4/jorge/lexerkernmens.g4 by ANTLR 4.8
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LETTER_L", "LETTER_M", "PERTFECT", "ONE", "FOUR", "THREE", "TWO", 
			"FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "ZERO", "SHARP", "FLAT", "DOUBLESHARP", 
			"DOUBLEFLAT", "NATURAL", "SPACE", "GREATER", "LESS", "LEFTPAR", "RIGHTPAR", 
			"LEFTBRACKET", "RIGHTBRACKET", "LEFTCURBRACES", "RIGHTCURBRACES", "LETTER_K", 
			"LETTER_k", "LETTER_S", "LETTER_s", "LETTER_u", "LETTER_m", "LETTER_T", 
			"LETTER_t", "LETTER_W", "LETTER_w", "LETTER_U", "LETTER_p", "LETTER_i", 
			"LETTER_v", "LETTER_r", "LETTER_R", "LETTER_I", "LETTER_P", "LETTER_A", 
			"LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", "LETTER_F", "LETTER_G", 
			"LETTER_X", "LETTER_a", "LETTER_b", "LETTER_c", "LETTER_d", "LETTER_e", 
			"LETTER_f", "LETTER_g", "LETTER_J", "WORD_CLEF", "WORD_SKERN", "WORD_SMENS", 
			"WORD_MET", "DOT", "BARLINE", "EQUAL", "SLASH", "BACKSLASH", "ASTERISK", 
			"CIRCUNFLEX", "APOSTROPHE", "SEMICOLON", "COLON", "COLOURED", "GRAVE_ACCENT", 
			"EXCLAMATION", "COMA", "SLURS_COUNT", "TOKEN_FINISH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3"+
		"B\3B\3B\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3"+
		"L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\2\2T\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\3\2\4"+
		"\5\2\13\f\17\17\"\"\4\2QQqq\2\u015b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\3\u00a7\3\2\2\2\5\u00ab\3\2\2\2\7\u00ad\3\2\2\2\t\u00af"+
		"\3\2\2\2\13\u00b1\3\2\2\2\r\u00b3\3\2\2\2\17\u00b5\3\2\2\2\21\u00b7\3"+
		"\2\2\2\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd\3\2\2\2\31\u00bf\3\2"+
		"\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2\2\2"+
		"#\u00c9\3\2\2\2%\u00cc\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3"+
		"\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63\u00db\3\2\2\2"+
		"\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e1\3\2\2\2;\u00e3\3\2\2\2=\u00e5"+
		"\3\2\2\2?\u00e7\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E\u00ed\3\2\2\2G"+
		"\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2\2\2O\u00f7\3\2"+
		"\2\2Q\u00f9\3\2\2\2S\u00fb\3\2\2\2U\u00fd\3\2\2\2W\u00ff\3\2\2\2Y\u0101"+
		"\3\2\2\2[\u0103\3\2\2\2]\u0105\3\2\2\2_\u0107\3\2\2\2a\u0109\3\2\2\2c"+
		"\u010b\3\2\2\2e\u010d\3\2\2\2g\u010f\3\2\2\2i\u0111\3\2\2\2k\u0113\3\2"+
		"\2\2m\u0115\3\2\2\2o\u0117\3\2\2\2q\u0119\3\2\2\2s\u011b\3\2\2\2u\u011d"+
		"\3\2\2\2w\u011f\3\2\2\2y\u0121\3\2\2\2{\u0123\3\2\2\2}\u0125\3\2\2\2\177"+
		"\u0127\3\2\2\2\u0081\u012c\3\2\2\2\u0083\u0132\3\2\2\2\u0085\u0137\3\2"+
		"\2\2\u0087\u013b\3\2\2\2\u0089\u013d\3\2\2\2\u008b\u013f\3\2\2\2\u008d"+
		"\u0141\3\2\2\2\u008f\u0143\3\2\2\2\u0091\u0145\3\2\2\2\u0093\u0147\3\2"+
		"\2\2\u0095\u0149\3\2\2\2\u0097\u014b\3\2\2\2\u0099\u014d\3\2\2\2\u009b"+
		"\u014f\3\2\2\2\u009d\u0151\3\2\2\2\u009f\u0153\3\2\2\2\u00a1\u0155\3\2"+
		"\2\2\u00a3\u0157\3\2\2\2\u00a5\u0159\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\b\2\2\2\u00aa\4\3\2\2\2\u00ab\u00ac\7N\2\2"+
		"\u00ac\6\3\2\2\2\u00ad\u00ae\7O\2\2\u00ae\b\3\2\2\2\u00af\u00b0\t\3\2"+
		"\2\u00b0\n\3\2\2\2\u00b1\u00b2\7\63\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7"+
		"\66\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\7\65\2\2\u00b6\20\3\2\2\2\u00b7\u00b8"+
		"\7\64\2\2\u00b8\22\3\2\2\2\u00b9\u00ba\7\67\2\2\u00ba\24\3\2\2\2\u00bb"+
		"\u00bc\78\2\2\u00bc\26\3\2\2\2\u00bd\u00be\79\2\2\u00be\30\3\2\2\2\u00bf"+
		"\u00c0\7:\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\7;\2\2\u00c2\34\3\2\2\2\u00c3"+
		"\u00c4\7\62\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7%\2\2\u00c6 \3\2\2\2\u00c7"+
		"\u00c8\7/\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7%\2\2\u00ca\u00cb\7%\2\2\u00cb"+
		"$\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\7/\2\2\u00ce&\3\2\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7\"\2\2\u00d2*\3\2\2\2\u00d3\u00d4"+
		"\7@\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7"+
		"*\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7+\2\2\u00da\62\3\2\2\2\u00db\u00dc"+
		"\7]\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7_\2\2\u00de\66\3\2\2\2\u00df\u00e0"+
		"\7}\2\2\u00e08\3\2\2\2\u00e1\u00e2\7\177\2\2\u00e2:\3\2\2\2\u00e3\u00e4"+
		"\7M\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7m\2\2\u00e6>\3\2\2\2\u00e7\u00e8\7"+
		"U\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7u\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7w"+
		"\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7o\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7V\2"+
		"\2\u00f0H\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7Y\2\2"+
		"\u00f4L\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7W\2\2\u00f8"+
		"P\3\2\2\2\u00f9\u00fa\7r\2\2\u00faR\3\2\2\2\u00fb\u00fc\7k\2\2\u00fcT"+
		"\3\2\2\2\u00fd\u00fe\7x\2\2\u00feV\3\2\2\2\u00ff\u0100\7t\2\2\u0100X\3"+
		"\2\2\2\u0101\u0102\7T\2\2\u0102Z\3\2\2\2\u0103\u0104\7K\2\2\u0104\\\3"+
		"\2\2\2\u0105\u0106\7R\2\2\u0106^\3\2\2\2\u0107\u0108\7C\2\2\u0108`\3\2"+
		"\2\2\u0109\u010a\7D\2\2\u010ab\3\2\2\2\u010b\u010c\7E\2\2\u010cd\3\2\2"+
		"\2\u010d\u010e\7F\2\2\u010ef\3\2\2\2\u010f\u0110\7G\2\2\u0110h\3\2\2\2"+
		"\u0111\u0112\7H\2\2\u0112j\3\2\2\2\u0113\u0114\7I\2\2\u0114l\3\2\2\2\u0115"+
		"\u0116\7Z\2\2\u0116n\3\2\2\2\u0117\u0118\7c\2\2\u0118p\3\2\2\2\u0119\u011a"+
		"\7d\2\2\u011ar\3\2\2\2\u011b\u011c\7e\2\2\u011ct\3\2\2\2\u011d\u011e\7"+
		"f\2\2\u011ev\3\2\2\2\u011f\u0120\7g\2\2\u0120x\3\2\2\2\u0121\u0122\7h"+
		"\2\2\u0122z\3\2\2\2\u0123\u0124\7i\2\2\u0124|\3\2\2\2\u0125\u0126\7L\2"+
		"\2\u0126~\3\2\2\2\u0127\u0128\7e\2\2\u0128\u0129\7n\2\2\u0129\u012a\7"+
		"g\2\2\u012a\u012b\7h\2\2\u012b\u0080\3\2\2\2\u012c\u012d\7u\2\2\u012d"+
		"\u012e\7m\2\2\u012e\u012f\7g\2\2\u012f\u0130\7t\2\2\u0130\u0131\7p\2\2"+
		"\u0131\u0082\3\2\2\2\u0132\u0133\7o\2\2\u0133\u0134\7g\2\2\u0134\u0135"+
		"\7p\2\2\u0135\u0136\7u\2\2\u0136\u0084\3\2\2\2\u0137\u0138\7o\2\2\u0138"+
		"\u0139\7g\2\2\u0139\u013a\7v\2\2\u013a\u0086\3\2\2\2\u013b\u013c\7\60"+
		"\2\2\u013c\u0088\3\2\2\2\u013d\u013e\7~\2\2\u013e\u008a\3\2\2\2\u013f"+
		"\u0140\7?\2\2\u0140\u008c\3\2\2\2\u0141\u0142\7\61\2\2\u0142\u008e\3\2"+
		"\2\2\u0143\u0144\7^\2\2\u0144\u0090\3\2\2\2\u0145\u0146\7,\2\2\u0146\u0092"+
		"\3\2\2\2\u0147\u0148\7`\2\2\u0148\u0094\3\2\2\2\u0149\u014a\7)\2\2\u014a"+
		"\u0096\3\2\2\2\u014b\u014c\7=\2\2\u014c\u0098\3\2\2\2\u014d\u014e\7<\2"+
		"\2\u014e\u009a\3\2\2\2\u014f\u0150\7\u0080\2\2\u0150\u009c\3\2\2\2\u0151"+
		"\u0152\7b\2\2\u0152\u009e\3\2\2\2\u0153\u0154\7#\2\2\u0154\u00a0\3\2\2"+
		"\2\u0155\u0156\7.\2\2\u0156\u00a2\3\2\2\2\u0157\u0158\7(\2\2\u0158\u00a4"+
		"\3\2\2\2\u0159\u015a\7,\2\2\u015a\u015b\7/\2\2\u015b\u00a6\3\2\2\2\3\2"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
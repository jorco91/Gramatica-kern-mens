// Generated from /Users/jorgemarcoesteve/IdeaProjects/TFG/src/main/java/grammar/kernmensParser.g4 by ANTLR 4.8
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
		GRAVE_ACCENT=69, EXCLAMATION=70, COMA=71, SLURS_COUNT=72, TOKEN_FINISH=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LETTER_L", "NOTENAME", "NOTENAMECL", "LETTER_M", "PERTFECT", "DIGIT", 
			"THREE", "TWO", "M_RHYTHM", "SHARP", "FLAT", "DOUBLESHARP", "DOUBLEFLAT", 
			"NATURAL", "CLEF", "SPACE", "GREATER", "LESS", "LEFTPAR", "RIGHTPAR", 
			"LEFTBRACKET", "RIGHTBRACKET", "LEFTCURBRACES", "RIGHTCURBRACES", "LETTER_K", 
			"LETTER_k", "LETTER_m", "LETTER_T", "LETTER_t", "LETTER_W", "LETTER_w", 
			"LETTER_U", "LETTER_p", "LETTER_i", "LETTER_v", "LETTER_r", "LETTER_R", 
			"LETTER_A", "LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", "LETTER_F", 
			"LETTER_G", "LETTER_a", "LETTER_b", "LETTER_c", "LETTER_d", "LETTER_e", 
			"LETTER_f", "LETTER_g", "LETTER_J", "WORD_CLEF", "WORD_SKERN", "WORD_SMENS", 
			"WORD_MET", "DOT", "BARLINE", "EQUAL", "SLASH", "BACKSLASH", "ASTERISK", 
			"CIRCUNFLEX", "APOSTROPHE", "SEMICOLON", "COLON", "COLOURED", "GRAVE_ACCENT", 
			"EXCLAMATION", "COMA", "SLURS_COUNT", "TOKEN_FINISH"
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


	public kernmensLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "kernmensParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a3"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dd"+
		"\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?"+
		"\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J"+
		"\2\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\t\2NOUUWWZZoo"+
		"uuww\2\u0173\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095"+
		"\3\2\2\2\5\u0099\3\2\2\2\7\u00a2\3\2\2\2\t\u00ab\3\2\2\2\13\u00ad\3\2"+
		"\2\2\r\u00af\3\2\2\2\17\u00b1\3\2\2\2\21\u00b3\3\2\2\2\23\u00b5\3\2\2"+
		"\2\25\u00b7\3\2\2\2\27\u00b9\3\2\2\2\31\u00bb\3\2\2\2\33\u00bd\3\2\2\2"+
		"\35\u00c0\3\2\2\2\37\u00c3\3\2\2\2!\u00dc\3\2\2\2#\u00de\3\2\2\2%\u00e0"+
		"\3\2\2\2\'\u00e2\3\2\2\2)\u00e4\3\2\2\2+\u00e6\3\2\2\2-\u00e8\3\2\2\2"+
		"/\u00ea\3\2\2\2\61\u00ec\3\2\2\2\63\u00ee\3\2\2\2\65\u00f0\3\2\2\2\67"+
		"\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00f6\3\2\2\2=\u00f8\3\2\2\2?\u00fa\3\2"+
		"\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E\u0100\3\2\2\2G\u0102\3\2\2\2I\u0104"+
		"\3\2\2\2K\u0106\3\2\2\2M\u0108\3\2\2\2O\u010a\3\2\2\2Q\u010c\3\2\2\2S"+
		"\u010e\3\2\2\2U\u0110\3\2\2\2W\u0112\3\2\2\2Y\u0114\3\2\2\2[\u0116\3\2"+
		"\2\2]\u0118\3\2\2\2_\u011a\3\2\2\2a\u011c\3\2\2\2c\u011e\3\2\2\2e\u0120"+
		"\3\2\2\2g\u0122\3\2\2\2i\u0124\3\2\2\2k\u0126\3\2\2\2m\u0128\3\2\2\2o"+
		"\u012d\3\2\2\2q\u0133\3\2\2\2s\u0139\3\2\2\2u\u013d\3\2\2\2w\u013f\3\2"+
		"\2\2y\u0141\3\2\2\2{\u0143\3\2\2\2}\u0145\3\2\2\2\177\u0147\3\2\2\2\u0081"+
		"\u0149\3\2\2\2\u0083\u014b\3\2\2\2\u0085\u014d\3\2\2\2\u0087\u014f\3\2"+
		"\2\2\u0089\u0151\3\2\2\2\u008b\u0153\3\2\2\2\u008d\u0155\3\2\2\2\u008f"+
		"\u0157\3\2\2\2\u0091\u0159\3\2\2\2\u0093\u015b\3\2\2\2\u0095\u0096\t\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\2\2\2\u0098\4\3\2\2\2\u0099\u009a"+
		"\7N\2\2\u009a\6\3\2\2\2\u009b\u00a3\5]/\2\u009c\u00a3\5_\60\2\u009d\u00a3"+
		"\5a\61\2\u009e\u00a3\5c\62\2\u009f\u00a3\5e\63\2\u00a0\u00a3\5g\64\2\u00a1"+
		"\u00a3\5i\65\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2"+
		"\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\b\3\2\2\2\u00a4\u00ac\5O(\2\u00a5\u00ac\5Q)\2\u00a6"+
		"\u00ac\5S*\2\u00a7\u00ac\5U+\2\u00a8\u00ac\5W,\2\u00a9\u00ac\5Y-\2\u00aa"+
		"\u00ac\5[.\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2"+
		"\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\7O\2\2\u00ae\f\3\2\2\2\u00af\u00b0"+
		"\7q\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\20\3\2\2\2\u00b3\u00b4"+
		"\7\65\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\7\64\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\t\4\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7%\2\2\u00ba\30\3\2\2\2\u00bb"+
		"\u00bc\7/\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7%\2\2\u00be\u00bf\7%\2\2\u00bf"+
		"\34\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c2\7/\2\2\u00c2\36\3\2\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7I\2\2\u00c6\u00dd\7\64\2\2\u00c7"+
		"\u00c8\7H\2\2\u00c8\u00dd\7\64\2\2\u00c9\u00ca\7H\2\2\u00ca\u00dd\7\65"+
		"\2\2\u00cb\u00cc\7H\2\2\u00cc\u00dd\7\66\2\2\u00cd\u00ce\7E\2\2\u00ce"+
		"\u00dd\7\67\2\2\u00cf\u00d0\7E\2\2\u00d0\u00dd\7\66\2\2\u00d1\u00d2\7"+
		"E\2\2\u00d2\u00dd\7\65\2\2\u00d3\u00d4\7E\2\2\u00d4\u00dd\7\64\2\2\u00d5"+
		"\u00d6\7E\2\2\u00d6\u00dd\7\63\2\2\u00d7\u00d8\7I\2\2\u00d8\u00dd\7\63"+
		"\2\2\u00d9\u00da\7I\2\2\u00da\u00db\7x\2\2\u00db\u00dd\7\64\2\2\u00dc"+
		"\u00c5\3\2\2\2\u00dc\u00c7\3\2\2\2\u00dc\u00c9\3\2\2\2\u00dc\u00cb\3\2"+
		"\2\2\u00dc\u00cd\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc"+
		"\u00d3\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d9\3\2"+
		"\2\2\u00dd\"\3\2\2\2\u00de\u00df\7\"\2\2\u00df$\3\2\2\2\u00e0\u00e1\7"+
		"@\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7*"+
		"\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7]\2"+
		"\2\u00e9.\3\2\2\2\u00ea\u00eb\7_\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7}\2"+
		"\2\u00ed\62\3\2\2\2\u00ee\u00ef\7\177\2\2\u00ef\64\3\2\2\2\u00f0\u00f1"+
		"\7M\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7m\2\2\u00f38\3\2\2\2\u00f4\u00f5"+
		"\7o\2\2\u00f5:\3\2\2\2\u00f6\u00f7\7V\2\2\u00f7<\3\2\2\2\u00f8\u00f9\7"+
		"v\2\2\u00f9>\3\2\2\2\u00fa\u00fb\7Y\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7y"+
		"\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7W\2\2\u00ffD\3\2\2\2\u0100\u0101\7r\2"+
		"\2\u0101F\3\2\2\2\u0102\u0103\7k\2\2\u0103H\3\2\2\2\u0104\u0105\7x\2\2"+
		"\u0105J\3\2\2\2\u0106\u0107\7t\2\2\u0107L\3\2\2\2\u0108\u0109\7T\2\2\u0109"+
		"N\3\2\2\2\u010a\u010b\7C\2\2\u010bP\3\2\2\2\u010c\u010d\7D\2\2\u010dR"+
		"\3\2\2\2\u010e\u010f\7E\2\2\u010fT\3\2\2\2\u0110\u0111\7F\2\2\u0111V\3"+
		"\2\2\2\u0112\u0113\7G\2\2\u0113X\3\2\2\2\u0114\u0115\7H\2\2\u0115Z\3\2"+
		"\2\2\u0116\u0117\7I\2\2\u0117\\\3\2\2\2\u0118\u0119\7c\2\2\u0119^\3\2"+
		"\2\2\u011a\u011b\7d\2\2\u011b`\3\2\2\2\u011c\u011d\7e\2\2\u011db\3\2\2"+
		"\2\u011e\u011f\7f\2\2\u011fd\3\2\2\2\u0120\u0121\7g\2\2\u0121f\3\2\2\2"+
		"\u0122\u0123\7h\2\2\u0123h\3\2\2\2\u0124\u0125\7i\2\2\u0125j\3\2\2\2\u0126"+
		"\u0127\7L\2\2\u0127l\3\2\2\2\u0128\u0129\7e\2\2\u0129\u012a\7n\2\2\u012a"+
		"\u012b\7g\2\2\u012b\u012c\7h\2\2\u012cn\3\2\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7m\2\2\u012f\u0130\7g\2\2\u0130\u0131\7t\2\2\u0131\u0132\7p\2\2"+
		"\u0132p\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135\7o\2\2\u0135\u0136\7g\2"+
		"\2\u0136\u0137\7p\2\2\u0137\u0138\7u\2\2\u0138r\3\2\2\2\u0139\u013a\7"+
		"o\2\2\u013a\u013b\7g\2\2\u013b\u013c\7v\2\2\u013ct\3\2\2\2\u013d\u013e"+
		"\7\60\2\2\u013ev\3\2\2\2\u013f\u0140\7~\2\2\u0140x\3\2\2\2\u0141\u0142"+
		"\7?\2\2\u0142z\3\2\2\2\u0143\u0144\7\61\2\2\u0144|\3\2\2\2\u0145\u0146"+
		"\7^\2\2\u0146~\3\2\2\2\u0147\u0148\7,\2\2\u0148\u0080\3\2\2\2\u0149\u014a"+
		"\7`\2\2\u014a\u0082\3\2\2\2\u014b\u014c\7)\2\2\u014c\u0084\3\2\2\2\u014d"+
		"\u014e\7=\2\2\u014e\u0086\3\2\2\2\u014f\u0150\7<\2\2\u0150\u0088\3\2\2"+
		"\2\u0151\u0152\7\u0080\2\2\u0152\u008a\3\2\2\2\u0153\u0154\7b\2\2\u0154"+
		"\u008c\3\2\2\2\u0155\u0156\7#\2\2\u0156\u008e\3\2\2\2\u0157\u0158\7.\2"+
		"\2\u0158\u0090\3\2\2\2\u0159\u015a\7(\2\2\u015a\u0092\3\2\2\2\u015b\u015c"+
		"\7,\2\2\u015c\u015d\7/\2\2\u015d\u0094\3\2\2\2\6\2\u00a2\u00ab\u00dc\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package com.peerisland.parser.generated;

// Generated from Calculator.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIVIDE=1, INTO=2, MINUS=3, PLUS=4, WHITESPACE=5, NUMBER=6, SEPARATOR=7, 
		PARENTHESIS_R=8, PARENTHESIS_L=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "D", "E", "I", "V", "N", "O", "T", "M", "L", "S", "U", "P", 
			"DIVIDE", "INTO", "MINUS", "PLUS", "WHITESPACE", "NUMBER", "SEPARATOR", 
			"PARENTHESIS_R", "PARENTHESIS_L"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "';'", "')'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DIVIDE", "INTO", "MINUS", "PLUS", "WHITESPACE", "NUMBER", "SEPARATOR", 
			"PARENTHESIS_R", "PARENTHESIS_L"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\6"+
		"\23b\n\23\r\23\16\23c\3\24\6\24g\n\24\r\24\16\24h\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\2\2\30\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31"+
		"\2\33\2\35\3\37\4!\5#\6%\7\'\b)\t+\n-\13\3\2\20\3\2\62;\4\2FFff\4\2GG"+
		"gg\4\2KKkk\4\2XXxx\4\2PPpp\4\2QQqq\4\2VVvv\4\2OOoo\4\2NNnn\4\2UUuu\4\2"+
		"WWww\4\2RRrr\5\2\13\f\17\17\"\"\2d\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3"+
		"\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31"+
		"E\3\2\2\2\33G\3\2\2\2\35I\3\2\2\2\37P\3\2\2\2!U\3\2\2\2#[\3\2\2\2%a\3"+
		"\2\2\2\'f\3\2\2\2)j\3\2\2\2+l\3\2\2\2-n\3\2\2\2/\60\t\2\2\2\60\4\3\2\2"+
		"\2\61\62\t\3\2\2\62\6\3\2\2\2\63\64\t\4\2\2\64\b\3\2\2\2\65\66\t\5\2\2"+
		"\66\n\3\2\2\2\678\t\6\2\28\f\3\2\2\29:\t\7\2\2:\16\3\2\2\2;<\t\b\2\2<"+
		"\20\3\2\2\2=>\t\t\2\2>\22\3\2\2\2?@\t\n\2\2@\24\3\2\2\2AB\t\13\2\2B\26"+
		"\3\2\2\2CD\t\f\2\2D\30\3\2\2\2EF\t\r\2\2F\32\3\2\2\2GH\t\16\2\2H\34\3"+
		"\2\2\2IJ\5\5\3\2JK\5\t\5\2KL\5\13\6\2LM\5\t\5\2MN\5\5\3\2NO\5\7\4\2O\36"+
		"\3\2\2\2PQ\5\t\5\2QR\5\r\7\2RS\5\21\t\2ST\5\17\b\2T \3\2\2\2UV\5\23\n"+
		"\2VW\5\t\5\2WX\5\r\7\2XY\5\31\r\2YZ\5\27\f\2Z\"\3\2\2\2[\\\5\33\16\2\\"+
		"]\5\25\13\2]^\5\31\r\2^_\5\27\f\2_$\3\2\2\2`b\t\17\2\2a`\3\2\2\2bc\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2d&\3\2\2\2eg\5\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2i(\3\2\2\2jk\7=\2\2k*\3\2\2\2lm\7+\2\2m,\3\2\2\2no\7*\2"+
		"\2o.\3\2\2\2\5\2ch\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
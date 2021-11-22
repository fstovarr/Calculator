package com.peerisland;

import java.io.IOException;

import com.peerisland.parser.Visitor;
import com.peerisland.parser.generated.CalculatorLexer;
import com.peerisland.parser.generated.CalculatorParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class App {
    public static void main(String[] args) throws IOException {

        CharStream inputStream = CharStreams.fromString("3 plus 1 minus 3 into 9");

        CalculatorLexer calculatorLexer = new CalculatorLexer(inputStream);

        TokenStream commonTokenStream = new CommonTokenStream(calculatorLexer);

        CalculatorParser calculatorParser = new CalculatorParser(commonTokenStream);

        Visitor visitor = new Visitor();

        visitor.visitLine(calculatorParser.line());
    }
}

package com.peerisland;

import java.io.IOException;
import java.io.InputStreamReader;

import com.peerisland.parser.Visitor;
import com.peerisland.parser.generated.CalculatorLexer;
import com.peerisland.parser.generated.CalculatorParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class App {
    /**
     * Application entry point.
     * 
     * This method keeps listening for user input through the console, and when
     * triggered EOF (Ctrl + D in linux), it evaluates the input and shows the
     * result.
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");

        CharStream inputStream = CharStreams.fromReader(isr);

        CalculatorLexer calculatorLexer = new CalculatorLexer(inputStream);

        TokenStream commonTokenStream = new CommonTokenStream(calculatorLexer);

        CalculatorParser calculatorParser = new CalculatorParser(commonTokenStream);

        Visitor visitor = new Visitor();

        String res = visitor.visitStart(calculatorParser.start());

        System.out.println("##### ANSWER #####");

        System.out.println(res.toString());
    }
}

package com.peerisland.util;

public class AnswerParser {
    /**
     * This method takes the original input and returns a string with both inputs
     * separated by a colon (:), and without spaces at the start and end of line.
     * 
     * @param input  The original input.
     * @param answer The output of the calculator.
     * @return The answer with a nice format.
     */
    public static String parseAnswer(String input, String answer) {
        return input.replaceAll("^(\\s|\t|\n|;)+", "").replaceAll("(\\s|\t|\n|;)+$", "").replaceAll("\\s+|\t+", " ")
                + ": " + answer;
    }
}

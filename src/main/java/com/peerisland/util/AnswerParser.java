package com.peerisland.util;

public class AnswerParser {
    public static String parseAnswer(String input, String answer) {
        return input.replaceAll("^(\\s|\t|\n|;)+", "").replaceAll("(\\s|\t|\n|;)+$", "").replaceAll("\\s+|\t+", " ")
                + ": " + answer;
    }
}

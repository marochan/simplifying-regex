package com.regex.simplifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplifiedRegexFactory {


    public  String simplify(String string){
        StringBuilder sb = new StringBuilder();

        return sb.toString();
    }

    public void checkIfPatternsMatch(String text, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String s  = matcher.group();
            System.out.println("Found match for: + " + s + " at: " + matcher.start() + " ending at: " + matcher.end());
        }
    }


}

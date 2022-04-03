package com.regex.simplifier;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        SimplifiedRegexFactory factory = new SimplifiedRegexFactory();
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type un the regular expression to be simplified");
            String toBeSimplified = scanner.nextLine();
            //String simplifiedRegex = factory.simplify(toBeSimplified);
            System.out.println("Initial: " + toBeSimplified);
            //System.out.printf("Converted: " + simplifiedRegex);
            System.out.println("Type any string to check correctness of the simplification");
            String s = scanner.nextLine();
            factory.checkIfPatternsMatch(s, toBeSimplified);
            //factory.checkIfPatternsMatch(s, simplifiedRegex);
        }
    }
}

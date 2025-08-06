package org.example;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        var count = countVowels("Hello, World!io");
        System.out.println(count);

    }

    private static int countVowels(String string) {
        var vowelsMap = new HashSet<>() {};
        var result = new HashSet<>() {};

        vowelsMap.add('a');
        vowelsMap.add('e');
        vowelsMap.add('i');
        vowelsMap.add('o');
        vowelsMap.add('u');

        for (int i = 0; i < string.length(); i++) {
            var currentChar = string.charAt(i);
            if (vowelsMap.contains(currentChar)){
                result.add(currentChar);
            }
        }
        return result.size();
    }
}
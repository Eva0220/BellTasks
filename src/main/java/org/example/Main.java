package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u'); //y

    public static void main(String[] args) {
        int count = countUniqueVowels("Hello, World!");
        System.out.println(count); 
    }

    public static int countUniqueVowels(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        Set<Character> uniqueVowels = new HashSet<>();
        
        for (char currentChar : input.toLowerCase().toCharArray()) {
            if (VOWELS.contains(currentChar)) {
                uniqueVowels.add(currentChar);
            }
        }
        
        return uniqueVowels.size();
    }
}

/*
package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u'); //y

    public static void main(String[] args) {
        int count = countVowels("Hello, World!");
        System.out.println(count);
    }

    public static int countVowels(String input) {
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
*/


///2
/*


package org.example;

public class Main {
    public static void main(String[] args)
    {
        var m = new int[] {12,13,2,4,3,5,11,15,14};
        var result = countStep(m);
        System.out.println(result);
    }

     public static int countStep(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int currentSequenceLength = 1;
        int maxSequenceLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                currentSequenceLength++;
                maxSequenceLength = Math.max(currentSequenceLength, maxSequenceLength);
            } else {
                currentSequenceLength = 1;
            }
        }

        return maxSequenceLength;
    }
}

*/


/*3*/





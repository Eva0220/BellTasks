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


package org.example;

public class Main {
    public static void main(String[] args)
    {
        var m = new int[] {12,13,2,4,3,5,11,15,14};
        var result = countStep(m);
        System.out.println(result);
    }

    /* реализован метод countStep(), который получает
    в качестве аргумента массив целых чисел и
     подсчитывает максимальное количество последовательных чисел,
     которые идут строго на повышение (каждое следующее число больше предыдущего).
      Данное значение необходимо вывести в консоль.
     Пример:
             *   Аргумент: [12,13,2,4,3,5,11,15,14]
             *   Вывод: 4
 */
     public static int findLongestIncreasingSequenceLength(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (numbers.length == 0) {
            return 0;
        }

        int currentSequenceLength = 1;
        int maxSequenceLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentSequenceLength++;
                maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);
            } else {
                currentSequenceLength = 1;
            }
        }

        return maxSequenceLength;
    }
    private static int countStep(int[] m) {
        var currentCount = 0;
        var maxCount = 0;
        for (int i = 0; i < m.length - 1; i ++) {

            if (m[i] < m[i + 1]) {
                currentCount++;
            }
            else {
                maxCount = ++currentCount;
                currentCount = 0;
            }
        }
        return maxCount;
    }
}



/*3*/



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
package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N: ");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.print("M: ");
        int cols = scanner.nextInt();
        scanner.nextLine();

        int[][] originalArray = createRandomArray(rows, cols);
        System.out.println("Сгенерированный массив");
        printArray(originalArray);

        int[][] resultArray = calculateSums(originalArray);
        System.out.println("Массив после вычисления");
        printArray(resultArray);
        
        scanner.close();
    }

    private static int[][] calculateSums(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] sums = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sums[i][j] = 0;

                // Проверяем сверху
                if (i > 0) {
                    sums[i][j] += array[i-1][j];
                }

                // Проверяем снизу
                if (i < rows - 1) {
                    sums[i][j] += array[i+1][j];
                }

                // Проверяем слева
                if (j > 0) {
                    sums[i][j] += array[i][j-1];
                }

                // Проверяем справа
                if (j < cols - 1) {
                    sums[i][j] += array[i][j+1];
                }
            }
        }

        return sums;
    }

    private static int[][] createRandomArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Random random = new Random();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(9) + 1; // числа от 1 до 9
            }
        }
        
        return array;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}



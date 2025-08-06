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

import java.util.Scanner;
import java.util.Random;

public class NeighborSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Запрос размеров массива у пользователя
        System.out.print("Введите количество строк (N): ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов (M): ");
        int cols = scanner.nextInt();
        
        // 2. Создание и заполнение массива случайными числами
        int[][] originalArray = createRandomArray(rows, cols);
        
        // 3. Создание массива для сумм соседей
        int[][] neighborSums = calculateNeighborSums(originalArray);
        
        // 6. Вывод массивов
        System.out.println("\nИсходный массив:");
        printArray(originalArray);
        
        System.out.println("\nМассив сумм соседей:");
        printArray(neighborSums);
        
        scanner.close();
    }
    
    // Создает и заполняет массив случайными числами от 1 до 9
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
    
    // Вычисляет суммы соседей для каждого элемента
    private static int[][] calculateNeighborSums(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] sums = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sums[i][j] = 0;
                
                // Проверяем соседа сверху
                if (i > 0) {
                    sums[i][j] += array[i-1][j];
                }
                
                // Проверяем соседа снизу
                if (i < rows - 1) {
                    sums[i][j] += array[i+1][j];
                }
                
                // Проверяем соседа слева
                if (j > 0) {
                    sums[i][j] += array[i][j-1];
                }
                
                // Проверяем соседа справа
                if (j < cols - 1) {
                    sums[i][j] += array[i][j+1];
                }
            }
        }
        
        return sums;
    }
    
    // Выводит массив в консоль
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}



package Ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HashSort {

    // function implementing Hash Sort
    public static void sort(int[][] data, int N, int low) {
        int swapCount = 0, hysteresisCount = 0;
        int position = 0;
        int value;

        // condition to check if the end of data list is
        // reached
        while ((swapCount < N) && (hysteresisCount < N)) {
            value = data[(position) / data.length][(position) % data.length];
            int d = (value - low) / data.length;
            int m = (value - low) % data.length;

            // if hysteresis occurs
            if (data[d][m] == value) {
                // force push the position by 1 to avoid
                // hysteresis
                position++;
                hysteresisCount++;
            }
            // if no hysteresis, then swap the positions
            else {
                int temp = data[(position) / data.length][(position) % data.length];
                data[(position) / data.length][(position) % data.length] = data[d][m];
                data[d][m] = temp;
                swapCount++;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Random random = new Random();

        // Generate random dimensions between 3 and 7
        int Dim = random.nextInt(5) + 3;

        // Generate unique random numbers for the matrix
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= Dim * Dim; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        // Fill the matrix with shuffled numbers
        int[][] arr = new int[Dim][Dim];
        int index = 0;
        for (int i = 0; i < Dim; i++) {
            for (int j = 0; j < Dim; j++) {
                arr[i][j] = numbers.get(index++);
            }
        }

        // Print the generated matrix
        System.out.println("Matriz aleatoria generada:");
        for (int i = 0; i < Dim; i++) {
            System.out.print(" ");
            for (int j = 0; j < Dim; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }

        // Call HashSort
        sort(arr, Dim * Dim, 1);

        // Print the sorted matrix
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < Dim; i++) {
            System.out.print(" ");
            for (int j = 0; j < Dim; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}

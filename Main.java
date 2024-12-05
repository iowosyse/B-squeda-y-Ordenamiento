import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import Ordenamiento.*;
import Busqueda.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" --Hash sort-- ");

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
        HashSort.sort(arr, Dim * Dim, 1);

        // Print the sorted matrix
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < Dim; i++) {
            System.out.print(" ");
            for (int j = 0; j < Dim; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }

        int [] elementos = new int[40];
        int num = 1;

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = num;
            num += 2;
        }

        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }

        System.out.println();
        System.out.println("Buscando el 39 con búsqueda binaria...");
        System.out.println("Indice del 39: " + Binary.search(elementos, 39));
        System.out.println("Buscando el 77 con búsqeuda de fibonacci...");
        System.out.println(Fibonacci.search(elementos, 77, elementos.length));
    }
}

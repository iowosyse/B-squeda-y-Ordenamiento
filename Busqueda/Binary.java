package Busqueda;

import java.util.Arrays;

public class Binary {
    public static int search(int[] arreglo, int numeroBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int medio;

        Arrays.sort(arreglo);        

        while (inicio <= fin) {
            medio = inicio + (fin - inicio) / 2;

            if (arreglo[medio] == numeroBuscado) {
                return medio;
            } else if (arreglo[medio] < numeroBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }
}
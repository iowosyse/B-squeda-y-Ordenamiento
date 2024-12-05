package Busqueda;

public class Linear {
    public static int search(int [] arr, int b) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                return i;
            }
        }

        return -1;
    }
}

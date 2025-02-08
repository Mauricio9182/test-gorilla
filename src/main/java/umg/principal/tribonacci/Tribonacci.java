package umg.principal.tribonacci;

import java.util.Arrays;

public class Tribonacci {
    public static int[] generarTribonacci(int[] firma, int n) {
        if (n == 0) {
            return new int[0]; //
        }

        if (n <= 3) {
            return Arrays.copyOf(firma, n);
        }

        int[] secuencia = new int[n];
        System.arraycopy(firma, 0, secuencia, 0, 3);

        for (int i = 3; i < n; i++) {
            secuencia[i] = secuencia[i - 1] + secuencia[i - 2] + secuencia[i - 3];
        }

        return secuencia;
    }

    public static void main(String[] args) {
        int[] firma = {0, 1, 1};
        int n = 9;

        int[] resultado = generarTribonacci(firma, n);
        System.out.println(Arrays.toString(resultado));
    }
}

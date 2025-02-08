package umg.principal.matriz;

public class Matriz {
    public static int calcularPuntuacion(int[] matriz) {
        int puntuacion = 0;

        for (int num : matriz) {
            if (num % 2 == 0) {  // Número par (incluyendo 0)
                puntuacion += 1;
            } else if (num == 5) { // Número 5
                puntuacion += 5;
            } else { // Número impar (excepto 5)
                puntuacion += 3;
            }
        }

        return puntuacion;
    }

    public static void main(String[] args) {
        int[] matriz1 = {5, 6, 7, 8, 9};
        int[] matriz2 = {20, 22, 21};
        int[] matriz3 = {4, 5, 5, 5};

        System.out.println("Producción: " + calcularPuntuacion(matriz1)); // 13
        System.out.println("Producción: " + calcularPuntuacion(matriz2)); // 9
        System.out.println("Producción: " + calcularPuntuacion(matriz3)); // 15
    }
}

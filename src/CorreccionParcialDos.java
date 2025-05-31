import java.util.Random;
import java.util.Scanner;

public class CorreccionParcialDos {

    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        // Instrucciones del reto
        System.out.println("""
        ¡Bienvenido al Laberinto Universitario!
        Este sistema representa los pasillos secretos de tu facultad.
        Cada número indica un nivel de energía en ese punto.
        Tu misión es explorar este laberinto cumpliendo los siguientes desafíos:

        1. Contar cuántos números pares hay mayores a 4. ⚡
        2. Calcular el promedio de los números impares. 🎯
        3. Calcular la suma de los valores de cada fila. 🧮
        4. BONUS: Encuentra la posición del mayor número del laberinto. 👑
        """);

        promedioImpares(laberinto);
        sumarFilas(laberinto);
        encontrarPosicionMaximo(laberinto);
        contarParesMayoresA4(laberinto);

        scanner.close();
    }

    // Mostrar la matriz del laberinto
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void contarParesMayoresA4(int[][] matriz) {
        int total = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if ((valor % 2 == 0) && valor > 4) {
                    total++;
                }
            }
        }
        System.out.println("Cantidad de números pares mayores a 4: " + total);
    }
    public static void promedioImpares(int[][] matriz) {
        int sumaImpares = 0;
        int cantidadImpares = 0;

        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (numero % 2 != 0) {
                    sumaImpares += numero;
                    cantidadImpares++;
                }
            }
        }

        double promedio = (cantidadImpares == 0) ? 0 : (double) sumaImpares / cantidadImpares;
        System.out.printf("El promedio de los números impares es: %.2f%n", promedio);
    }

   
    public static void sumarFilas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int valor : matriz[i]) {
                suma += valor;
            }
            System.out.printf("Suma de la fila %d: %d%n", i + 1, suma);
        }
    }

    
    public static void encontrarPosicionMaximo(int[][] matriz) {
        int max = matriz[0][0];
        int filaMax = 0;
        int colMax = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (matriz[fila][col] > max) {
                    max = matriz[fila][col];
                    filaMax = fila;
                    colMax = col;
                }
            }
        }

        
        System.out.printf("El valor máximo es %d y está en la posición: (%d, %d)%n", max, filaMax + 1, colMax + 1);
    }
}

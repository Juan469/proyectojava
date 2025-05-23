import java.util.Scanner;

public class Arrays13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int conductores = 3; 
        String[] nombre = new String[conductores];
        int[][] kms = new int[conductores][7]; 
        int[] total_kms = new int[conductores];

        
        for (int i = 0; i < conductores; i++) {
            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();

            System.out.println("Ingrese los kilómetros recorridos por " + nombre[i] + " en cada día de la semana:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
                total_kms[i] += kms[i][j]; 
            }
            scanner.nextLine(); 
        }

        System.out.println("\nResumen de kilómetros recorridos:");
        for (int i = 0; i < conductores; i++) {
            System.out.println(nombre[i] + " recorrió un total de " + total_kms[i] + " km en la semana.");
        }

        scanner.close();
    }
}


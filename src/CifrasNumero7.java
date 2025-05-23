import java.util.Scanner;

public class CifrasNumero7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo de hasta tres cifras: ");
        int numero = scanner.nextInt();

       
        if (numero > 0) {
           
            if (numero < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (numero < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else if (numero < 1000) {
                System.out.println("El número tiene 3 cifras.");
            } else {
                System.out.println("Error: el número tiene más de 3 cifras.");
            }
        } else {
            System.out.println("Error: el número debe ser positivo.");
        }

        scanner.close();
    }
}

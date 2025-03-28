import java.util.Scanner;
public class EjercicioProgramacion10 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble();

        System.out.print("Ingrese los años de antigüedad del operario: ");
        int antiguedad = scanner.nextInt();

      
        if (sueldo < 500 && antiguedad >= 10) {
            sueldo = sueldo * 1.20; 
            System.out.printf("Sueldo con aumento: %.2f%n", sueldo);
        } else if (sueldo < 500 && antiguedad < 10) {
            sueldo = sueldo * 1.05; 
            System.out.printf("Sueldo con aumento: %.2f%n", sueldo);
        } else if (sueldo >= 500) {
            System.out.printf("Sueldo sin cambios: %.2f%n", sueldo);
        }

        scanner.close();
    }
}



import java.util.Scanner;

public class SueldosEmpresa12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();

        int contador100a300 = 0;
        int contadorMas300 = 0;
        double totalSueldos = 0;

        
        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + " (entre $100 y $500): ");
            double sueldo = scanner.nextDouble();

           
            if (sueldo >= 100 && sueldo <= 500) {
                totalSueldos += sueldo;
                
                if (sueldo <= 300) {
                    contador100a300++;
                } else {
                    contadorMas300++;
                }
            } else {
                System.out.println("Error: Sueldo fuera del rango permitido.");
                i--; 
            }
        }

       
        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + contador100a300);
        System.out.println("Cantidad de empleados que cobran más de $300: " + contadorMas300);
        System.out.println("Total de sueldos pagados por la empresa: $" + totalSueldos);

        
        scanner.close();
    }
}


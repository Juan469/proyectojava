import java.util.Scanner;
public class EjercicioProgramacion12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        int entre100y300 = 0; 
        int mayores300 = 0;   
        double totalSueldos = 0; 

        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = scanner.nextDouble();

            
            if (sueldo >= 100 && sueldo <= 300) {
                entre100y300++;
            } else if (sueldo > 300) {
                mayores300++;
            }

            
            totalSueldos += sueldo;
        }

        
        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + entre100y300);
        System.out.println("Cantidad de empleados que cobran más de $300: " + mayores300);
        System.out.printf("Total que gasta la empresa en sueldos: %.2f%n", totalSueldos);

        scanner.close();
    }
}

    


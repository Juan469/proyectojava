 import java.util.ArrayList;
import java.util.Scanner;

public class  Arrays8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        
        while (true) {
            System.out.print("Ingrese el nombre del alumno (o '*' para finalizar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) {
                break; 
            }

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            
            nombres.add(nombre);
            edades.add(edad);
        }

        
        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        
        int edadMaxima = edades.isEmpty() ? 0 : edades.get(0);
        for (int edad : edades) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }

        
        System.out.println("\nAlumnos con mayor edad:");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == edadMaxima) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        
        scanner.close();
    }
}



import java.util.Scanner;
public class EjercicioProgramacion15 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) <= 0) {
            System.out.println("Orden alfabético:");
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else {
            System.out.println("Orden alfabético:");
            System.out.println(nombre2);
            System.out.println(nombre1);
        }

        scanner.close();
    }
}




    import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

       
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        
        System.out.print("Introduce tu altura en metros (por ejemplo, 1.75): ");
        double altura = scanner.nextDouble();

        
        System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");

        
        scanner.close();
    }
}



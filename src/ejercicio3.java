import java.util.Scanner;
public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        
        System.out.print("Introduce el primer número: ");
        float num1 = scanner.nextFloat();
        System.out.print("Introduce el segundo número: ");
        float num2 = scanner.nextFloat();

        float resultado;
        
 
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}

    



import  java.util.Scanner;
public class OperadoresAritmeticos {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + division);
        System.out.println("Módulo: " + num1 + " % " + num2 + " = " + modulo);

        
        scanner.close();
    
    }
}

    


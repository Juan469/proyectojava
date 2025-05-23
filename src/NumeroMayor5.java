import java.util.Scanner;

public class NumeroMayor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        
        if (numero1 != numero2) {
            
            double mayor = (numero1 > numero2) ? numero1 : numero2;
            System.out.println("El número mayor es: " + mayor);
        } else {
            System.out.println("Los números ingresados son iguales, deben ser distintos.");
        }

        
        scanner.close();
    }
}

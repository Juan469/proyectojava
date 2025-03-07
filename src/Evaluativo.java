import java.util.Scanner;

public class Evaluativo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        
        System.out.print("Introduce el primer número: ");
        double num1 = leer.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = leer.nextDouble();
        
        System.out.print("Introduce el tercer número: ");
        double num3 = leer.nextDouble();

        
        double media = (num1 + num2 + num3) / 3;

        
        System.out.println("La media de los tres números es: " + media);

        leer.close();
        
    }
}

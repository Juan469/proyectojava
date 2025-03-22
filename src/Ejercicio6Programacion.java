import java.util.Scanner;
public class Ejercicio6Programacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();

        if (numero>0) {
            System.out.println("El numero es positivo");

            
        }else if (numero<0) {
            System.out.println("El numero es negativo");
            
        }else {
            System.out.println("El numero es nulo");
        }

        leer.close();

        
    }
}

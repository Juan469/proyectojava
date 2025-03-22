import java.util.Scanner;
public class Ejercicio7programacion {

    public static void main(String[] args) {
           
        Scanner leer= new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo de hasta tres cifras ");
        int numero = leer.nextInt();

       
        if (numero > 0) {
           
            if (numero < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (numero < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else if (numero < 1000) {
                System.out.println("El número tiene 3 cifras.");
            } else {
               
                System.out.println("Error: El número tiene más de tres cifras.");
            }
           } else {
              System.out.println("Error");
        }

    
        leer.close();
    }
}



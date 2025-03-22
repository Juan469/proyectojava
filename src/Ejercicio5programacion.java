import java.util.Scanner;
public class Ejercicio5programacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número entero:");
        int numeroEntero1 = leer.nextInt();
        System.out.println("ingresa el número");
        int numeroEntero2 = leer.nextInt();

        if (numeroEntero1 > numeroEntero2 ) {
         System.out.println("el numero mayor es " + numeroEntero1  );  

        } else if (numeroEntero2>numeroEntero1) {
            
        
            System.out.println("el numero mayor es " + numeroEntero2);
        }


leer.close();
    
}
}
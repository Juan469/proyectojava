import java.util.Scanner;
public class Ejercicio3programacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingresa un numero positivo");
        int numeroPositivo = leer.nextInt();

        if (numeroPositivo < 1 || numeroPositivo > 99 ) {

            System.out.println(" no sirve");
            
        } else {
         if (numeroPositivo >= 1 && numeroPositivo<= 9 ) {
            System.out.println(" tiene un digito");
            
         } else {
            System.out.println(" numero tiene dos digitos");
         }  
        }
        leer.close();
    }
    
    
}

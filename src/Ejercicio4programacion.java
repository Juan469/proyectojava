import java.util.Scanner;
public class Ejercicio4programacion {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        System.out.println("ingresar el sueldo");
        float sueldo = Leer.nextFloat();

        if (sueldo> 3000) {
            System.out.println(" Usted debe pagar impuestos");
            
        } else {
            System.out.println("No debe pagar impuestos");
        }
        
        Leer.close();
    }
    
}

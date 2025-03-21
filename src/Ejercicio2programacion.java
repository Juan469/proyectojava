import java.util.Scanner;
public class Ejercicio2programacion {

public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("ingresa  primra nota");
    int primeraNota = leer.nextInt();

    System.out.println("ingresa la segunda nota");
    int segundaNota = leer.nextInt();

    System.out.println(" ingresa tercera nota");
    int terceraNota = leer.nextInt();

    int promedio = ( primeraNota+segundaNota+terceraNota)/3;

 
    if (promedio >= 7) {
        System.out.println("promocionado");
        
    }else {
        System.out.println(" no promocionado");

    }

    leer.close();
}
    
}

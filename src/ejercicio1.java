import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        byte numPrimero = leer.nextByte();
        
        System.out.print("Ingrese el segundo número: ");
        byte numSegundo = leer.nextByte();
        
        System.out.println("ingrese el tercer numero:");
        byte numTercero = leer.nextByte();

        if (numPrimero > numSegundo && numPrimero > numTercero) {
            System.out.println("El número mayor es: " + numPrimero);
        } else if (numSegundo > numPrimero && numSegundo > numTercero) {
            System.out.println("El número mayor es: " + numSegundo);
        } else  {
 System.out.println("El número mayor es: " + numTercero);
    
    }
    leer.close();
    
}
}

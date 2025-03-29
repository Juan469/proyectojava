import java.util.Scanner;
public class EjercicioArray {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int [] numeros = new int [5];
       int suma = 0;

       for (int i = 0; i < numeros.length; i++) {

            System.err.println("ingrese un numero");
            numeros [i] = leer.nextInt();
            suma += numeros[i];
        
       }
        int promedio = suma /5;
        System.out.println(" promedio de los numeros es:" + promedio);

        leer.close();
       
    }
    
}

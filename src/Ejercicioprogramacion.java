import java.util.Scanner;
public class Ejercicioprogramacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca un numero");
        int numeroUno= leer.nextInt();
        System.out.print("Introduzca un numero");
        int numeroDos= leer.nextInt();


        System.out.println("El numero introducido es" + numeroUno);
        System.out.println(" El numero introducido es " + numeroDos);

        if (numeroUno>numeroDos) {
            int suma = numeroUno + numeroDos;
            int diferencia = numeroUno - numeroDos;

            System.out.println("La suma es" + suma);
            System.out.println("La diferencia es " + diferencia);
        } else  {
            int producto = numeroUno * numeroDos;
            int division = numeroUno / numeroDos;

            System.out.println("El producto es " + producto);
            System.out.println("La division es " + division);


        }


        leer.close();







        }
    
}

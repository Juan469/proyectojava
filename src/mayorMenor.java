import java.util.Scanner;

public class mayorMenor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese 3 numeros");

        int numPrimer = leer.nextInt();
        int numSegundo = leer.nextInt();
        int numTercer = leer.nextInt();

        System.out.println("el primer numero es mayor que el segundo y menor que el tercero "
                + (numPrimer > numSegundo && numPrimer < numTercer));
        leer.close();

    }

}

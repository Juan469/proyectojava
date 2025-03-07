import java.util.Scanner;

public class LeerDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese un numero decimal: ");
        float numDecimal = scanner.nextFloat();

        System.out.print("el numero decimal ingresado es: " + numDecimal);

        scanner.close();
    }

}

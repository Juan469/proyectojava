
    import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        System.out.print("Ingrese el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        
        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("Mes seleccionado: " + nombresMeses[numeroMes - 1]);
            System.out.println("Cantidad de días: " + diasMeses[numeroMes - 1]);
        } else {
            System.out.println("Error: número de mes inválido. Debe estar entre 1 y 12.");
        }

        
        scanner.close();
    }
}

    


import java.util.Scanner;
public class Ejercicio8Programacion {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de preguntas correctas: ");
        int correctas = scanner.nextInt();

        double porcentaje = (correctas / (double) totalPreguntas) * 100;

        String nivel;
        if (porcentaje >= 90) {
            nivel = "Nivel máximo";
        } else if (porcentaje >= 75) {
            nivel = "Nivel medio";
        } else if (porcentaje >= 50) {
            nivel = "Nivel regular";
        } else {
            nivel = "Fuera de nivel";
        }

        System.out.printf("Porcentaje de respuestas correctas: %.2f%%%n", porcentaje);
        System.out.println("Nivel obtenido: " + nivel);

        scanner.close();
    }
}


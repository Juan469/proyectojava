import java.util.Scanner;

public class NivelPostulante8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad total de preguntas del test: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();

        
        if (totalPreguntas > 0 && respuestasCorrectas >= 0 && respuestasCorrectas <= totalPreguntas) {
           
            double porcentaje = ((double) respuestasCorrectas / totalPreguntas) * 100;

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

           
            System.out.println("El postulante obtuvo un " + porcentaje + "% de aciertos.");
            System.out.println("Nivel asignado: " + nivel);
        } else {
            System.out.println("Error: Datos ingresados no válidos.");
        }

        scanner.close();
    }
}

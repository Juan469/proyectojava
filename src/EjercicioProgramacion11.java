import java.util.Scanner;
public class EjercicioProgramacion11 {
    

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int mayoresIguales7 = 0;
            int menores7 = 0;
    
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese la nota del alumno " + i + ": ");
                double nota = scanner.nextDouble();
    
                
                if (nota >= 7) {
                    mayoresIguales7++;
                } else {
                    menores7++;
                }
            }
    
            
            System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + mayoresIguales7);
            System.out.println("Cantidad de alumnos con notas menores a 7: " + menores7);
    
            scanner.close();
        }
    }
        


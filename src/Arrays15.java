
    import java.util.Scanner;

public class Arrays15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int partidos = 15; 
        String[][] equipos = new String[partidos][2]; 
        int[][] resultados = new int[partidos][2]; 

    
        System.out.println("Ingrese los equipos y resultados de cada partido:");
        for (int i = 0; i < partidos; i++) {
            System.out.print("Equipo 1 del partido " + (i + 1) + ": ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("Equipo 2 del partido " + (i + 1) + ": ");
            equipos[i][1] = scanner.nextLine();

            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.println("\nResultados de la quiniela:");
        System.out.println("Equipo 1       Goles | Goles  Equipo 2");
        System.out.println("--------------------------------------");
        for (int i = 0; i < partidos; i++) {
            System.out.printf("%-12s %5d | %-5d %s%n", equipos[i][0], resultados[i][0], resultados[i][1], equipos[i][1]);
        }

        scanner.close();
    }
}



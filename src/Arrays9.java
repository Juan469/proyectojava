import java.util.Scanner;

public class Arrays9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = 5;
        double[] tempMinima = new double[dias];
        double[] tempMaxima = new double[dias];

       
        for (int i = 0; i < dias; i++) {
            System.out.print("Ingrese la temperatura mínima del día " + (i + 1) + ": ");
            tempMinima[i] = scanner.nextDouble();
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            tempMaxima[i] = scanner.nextDouble();
        }

     
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < dias; i++) {
            double media = (tempMinima[i] + tempMaxima[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media + "°C");
        }

       
        double menorTempMinima = tempMinima[0];
        for (int i = 1; i < dias; i++) {
            if (tempMinima[i] < menorTempMinima) {
                menorTempMinima = tempMinima[i];
            }
        }

        System.out.println("\nDías con la menor temperatura mínima:");
        for (int i = 0; i < dias; i++) {
            if (tempMinima[i] == menorTempMinima) {
                System.out.println("Día " + (i + 1) + " con " + tempMinima[i] + "°C");
            }
        }

        
        System.out.print("\nIngrese una temperatura máxima para buscar días: ");
        double tempBuscada = scanner.nextDouble();

        boolean encontrado = false;
        for (int i = 0; i < dias; i++) {
            if (tempMaxima[i] == tempBuscada) {
                System.out.println("Día " + (i + 1) + " tuvo una temperatura máxima de " + tempBuscada + "°C");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hubo ningún día con la temperatura máxima ingresada.");
        }

       
        scanner.close();
    }
}


    

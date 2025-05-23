
    import java.util.Scanner;

public class Arrays14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int articulos = 5;
        int sucursales = 4;
        double[] precios = new double[articulos];
        int[][] cantidades = new int[articulos][sucursales];
        double[] recaudacionSucursal = new double[sucursales];
        double recaudacionTotal = 0;

    
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < articulos; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        
        System.out.println("\nIngrese las cantidades vendidas en cada sucursal:");
        for (int i = 0; i < articulos; i++) {
            for (int j = 0; j < sucursales; j++) {
                System.out.print("Artículo " + (i + 1) + ", Sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
                recaudacionSucursal[j] += precios[i] * cantidades[i][j]; 
                recaudacionTotal += precios[i] * cantidades[i][j]; 
            }
        }

        
        System.out.println("\nCantidad total de cada artículo:");
        for (int i = 0; i < articulos; i++) {
            int totalArticulo = 0;
            for (int j = 0; j < sucursales; j++) {
                totalArticulo += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulo);
        }

        int totalSucursal2 = 0;
        for (int i = 0; i < articulos; i++) {
            totalSucursal2 += cantidades[i][1]; 
        }
        System.out.println("\nTotal de artículos vendidos en la sucursal 2: " + totalSucursal2);

      
        System.out.println("\nCantidad vendida del artículo 3 en la sucursal 1: " + cantidades[2][0]);

     
        System.out.println("\nRecaudación total de cada sucursal:");
        for (int j = 0; j < sucursales; j++) {
            System.out.println("Sucursal " + (j + 1) + ": $" + recaudacionSucursal[j]);
        }

     
        System.out.println("\nRecaudación total de la empresa: $" + recaudacionTotal);

      
        int sucursalMayor = 0;
        double maxRecaudacion = recaudacionSucursal[0];

        for (int j = 1; j < sucursales; j++) {
            if (recaudacionSucursal[j] > maxRecaudacion) {
                maxRecaudacion = recaudacionSucursal[j];
                sucursalMayor = j;
            }
        }
        System.out.println("\nLa sucursal de mayor recaudación es la Sucursal " + (sucursalMayor + 1) + " con $" + maxRecaudacion);

        
        scanner.close();
    }
}

    



    public class Arrays11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5]; 

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1; 
                } else {
                    diagonal[i][j] = 0; 
                }
            }
        }

        System.out.println("Matriz 5x5 con diagonal principal en 1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}



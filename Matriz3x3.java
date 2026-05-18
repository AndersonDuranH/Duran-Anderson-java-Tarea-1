import java.util.Scanner;

class Matriz3x3 {
    public static void Mostrar(Scanner sc) {


        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los valores de la matriz 3x3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();


        System.out.println("\nMatriz 3x3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }
}
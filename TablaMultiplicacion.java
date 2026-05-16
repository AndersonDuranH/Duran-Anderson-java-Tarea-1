import java.util.Scanner;

public class TablaMultiplicacion{
    public void TablaMultiplicacion(Scanner sc){
        System.out.println("Tabla de Multiplicacion");
        System.out.println("1. Tabla del 1");
        System.out.println("2. Tabla del 2");
        System.out.println("3. Tabla del 3");
        System.out.println("4. Tabla del 4");
        System.out.println("5. Tabla del 5");
        System.out.println("6. Tabla del 6");
        System.out.println("7. Tabla del 7");
        System.out.println("8. Tabla del 8");
        System.out.println("9. Tabla del 9");
        System.out.println("10. Tabla del 10");
        System.out.print("Seleccione una opcion: ");

        int opcion = sc.nextInt();
        int numero = opcion; 

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
import java.util.Scanner;
public class NumParesImpares{

    public void NumerosParesImpares(Scanner sc){ 
       System.out.println();
        System.out.print("Digite un Numero: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println();
            System.out.println("==========================================");
            System.out.println("El numero es par");
            System.out.println("==========================================");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("==========================================");
            System.out.println("El numero es impar");
            System.out.println("==========================================");
            System.out.println();
        }
        
    }
}
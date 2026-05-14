import java.util.Scanner;
public class NumParesImpares{

    public void NumerosParesImpares(Scanner sc){ 
       
        System.out.print("Digite un Numero: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
        
    }
}
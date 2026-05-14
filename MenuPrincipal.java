import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
     do{
        Calculadora calculadora = new Calculadora(); 
        NumParesImpares numeros = new NumParesImpares();
        PromedioNotas promedio = new PromedioNotas();
        ContadorVocales contador = new ContadorVocales();

        System.out.println("Bienvenido al Menu Principal");
        System.out.println("1. Calculadora");
        System.out.println("2. Numeros Pares e Impares");
        System.out.println("3. Promedio de Notas");
        System.out.println("4. Contador de Vocales");
        System.out.println("0. Salir del Menu Principal");

        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                calculadora.Calculadora(sc);
                break;
            case 2:
                numeros.NumerosParesImpares(sc);
                break;
            case 3:
                promedio.PromedioNotas(sc);
                break;
            case 4:
                contador.ContadorVocales(sc);
                break;
            case 0:
                System.out.println("Saliendo del Menu Principal");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
       }while(opcion != 0);

      sc.close();

    }
}
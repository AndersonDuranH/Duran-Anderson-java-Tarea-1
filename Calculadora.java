import java.util.Scanner;

public class Calculadora {
   
    
    public void Calculadora(Scanner sc){
        System.out.println("Seleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        int opcion = sc.nextInt();
        System.out.print("Digite el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite el segundo numero: ");
        double num2 = sc.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("El resultado es: " + Suma(num1, num2));
                    
                break;
            case 2:
                System.out.println("El resultado es: " +- Resta(num1, num2));
                System.out.println();
                break;
            case 3:
                System.out.println("El resultado es: " + Multiplicacion(num1, num2));
                System.out.println();
                break;
            case 4:
                System.out.println("El resultado es: " + Division(num1, num2));
                System.out.println();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public static double Suma(double a, double b){
        return a + b;
    }
    public static double Resta(double a, double b){
        return a - b;
    }
    public static double Multiplicacion(double a, double b){
        return a * b;
    }
    public static double Division(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
}
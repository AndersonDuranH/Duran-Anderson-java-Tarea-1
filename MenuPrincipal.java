import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
     do{
        Calculadora calculadora = new Calculadora(); 
        NumParesImpares numeros = new NumParesImpares();
        TablaMultiplicacion tabla = new TablaMultiplicacion();
        PromedioNotas promedio = new PromedioNotas();
        ContadorVocales contador = new ContadorVocales();
        ClaseEstudiante estudiante = new ClaseEstudiante();
        CuentaBancaria cuentas = new CuentaBancaria();
        HerenciaVehiculos vehiculo = new HerenciaVehiculos();
        
        System.out.println("=======================================");
        System.out.println("=====Bienvenido al Menu Principal======");
        System.out.println("=======================================");
        System.out.println("||1.-Calculadora                    -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||2.-Numeros Pares e Impares        -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||3.-Tabla de Multiplicacion        -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||4.-Contador de Vocales            -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||5.-Promedio de Notas              -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||6.-Clase Estudiante               -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||7.-Cuenta Bancaria                -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||8.-Herencia de vehículos          -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||9.-Matriz 3x3                     -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||10.-Sistema básico de inventario  -||");
        System.out.println("||-----------------------------------||");
        System.out.println("||11.-Salir De La Aplicacion        -||");
        System.out.println("||-----------------------------------||");
        System.out.println("=======================================");
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
                 tabla.TablaMultiplicacion(sc);
                break;
            case 4:
                contador.ContadorVocales(sc);
                break;
            case 5:
                promedio.PromedioNotas(sc);
                break;
            case 6:
                sc.nextLine();
                estudiante.ClaseEstudiante(sc);
                break;
            case 7:
                sc.nextLine();
                cuentas.CuentaBancaria(sc);
                break;
            case 8:
                vehiculo.HerenciaVehiculos(sc);
                break;
            case 9:
                
                break;
            case 10:
                
                break;

            case 11:
                System.out.println("Salir de la Aplicacion");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
       }while(opcion != 11);

      sc.close();

    }
}
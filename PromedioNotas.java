import java.util.Scanner;
public class PromedioNotas
{

  public void PromedioNotas(Scanner sc){
    System.out.print("Digite una cantidad de notas: ");
    int cantidadNotas = sc.nextInt();
    int suma = 0;
    for(int i = 0; i < cantidadNotas; i++){
        System.out.print("Digite la nota " + (i+1) + ": ");
        int nota = sc.nextInt();
        suma += nota;
    }
    System.out.println("La suma de las notas es: " + suma);
    double promedio = (double) suma / cantidadNotas;
    System.out.println("El promedio de las notas es: " + promedio);
  }

}
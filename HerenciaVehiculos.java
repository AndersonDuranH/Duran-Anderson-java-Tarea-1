import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaVehiculos {

    

    public static void HerenciaVehiculos(Scanner sc) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
       System.out.println();
        for (int i = 1; i <= 2; i++) {

            System.out.println("1. Barco");
            System.out.println("2. Carro");
            System.out.println("3. Camioneta");
            System.out.println("4. Motocicleta");
            System.out.print("Digite una opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite la marca: ");
            String marca = sc.nextLine();

            System.out.print("Digite el año: ");
            int año = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite el modelo: ");
            String modelo = sc.nextLine();

            switch (opcion) {

                case 1:

                    Barco b = new Barco(marca, año, modelo, "");
                    vehiculos.add(b);

                    break;

                case 2:

                    Carro c = new Carro(marca, año, modelo, 0);
                    vehiculos.add(c);

                    break;

                case 3:

                    Camioneta ca = new Camioneta(marca, año, modelo, 0);
                    vehiculos.add(ca);

                    break;

                case 4:

                    Motocicleta m = new Motocicleta(marca, año, modelo, 0);
                    vehiculos.add(m);

                    break;
            }
        }

        System.out.println();
        for (Vehiculo v : vehiculos) {
            System.out.println("==============================");
            v.mostrarDatos();
        }
        System.out.println();
    }
}

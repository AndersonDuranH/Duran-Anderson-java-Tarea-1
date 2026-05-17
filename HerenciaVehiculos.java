import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaVehiculos {

    static class Vehiculo {
        private  String marca;
        private int año;
        private String modelo;

        public Vehiculo(String marca, int año, String modelo) {
            this.marca = marca;
            this.año = año;
            this.modelo = modelo;
        }

        public void mostrarDatos() {
            System.out.println("Marca: " + marca);
            System.out.println("Año: " + año);
            System.out.println("Modelo: " + modelo);
        }
    }

    static class Carro extends Vehiculo {
        private int puertas;

        public Carro(String marca, int año, String modelo, int puertas) {
            super(marca, año, modelo);
            this.puertas = puertas;
        }

        @Override
        public void mostrarDatos() {
            super.mostrarDatos();
        }
    }

    static class Camioneta extends Vehiculo {
        private double capacidadCarga;

        public Camioneta(String marca, int año, String modelo, double capacidadCarga) {
            super(marca, año, modelo);
            this.capacidadCarga = capacidadCarga;
        }

        @Override
        public void mostrarDatos() {
            super.mostrarDatos();
        }
    }

    static class Motocicleta extends Vehiculo {
        private int cilindrada;

        public Motocicleta(String marca, int año, String modelo, int cilindrada) {
            super(marca, año, modelo);
            this.cilindrada = cilindrada;
        }

        @Override
        public void mostrarDatos() {
            super.mostrarDatos();
        }
    }

    static class Barco extends Vehiculo {
        private String tipo;

        public Barco(String marca, int año, String modelo, String tipo) {
            super(marca, año, modelo);
            this.tipo = tipo;
        }

        @Override
        public void mostrarDatos() {
            super.mostrarDatos();
        }
    }

    public static void HerenciaVehiculos(Scanner sc) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

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

        for (Vehiculo v : vehiculos) {
            System.out.println("==============================");
            v.mostrarDatos();
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class SistemaBasicoInventario {

    public static void Mostrar(Scanner sc) {

        ArrayList<Producto> inventario = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n--- INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println();
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    inventario.add(new Producto(nombre, cantidad, precio));

                    System.out.println("Producto agregado.");
                    break;

                case 2:

                    if (inventario.size() == 0) {

                        System.out.println("No hay productos.");

                    } else {
                        System.out.println("---------------------------");
                        System.out.println("\nProductos guardados:");
                        System.out.println();
                        System.out.println("---------------------------");
                        for (Producto p : inventario) {
                            System.out.println("---------------------------");
                            p.mostrarProducto();
                            
                        }
                        System.out.println("---------------------------");
                        System.out.println();
                    }

                    break;

                case 3:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);
    }
}

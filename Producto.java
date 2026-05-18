class Producto {
    String nombre;
    int cantidad;
    double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: RD$" + precio);
        System.out.println("---------------------------");
    }
}
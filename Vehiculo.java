 class Vehiculo {
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
 class Camioneta extends Vehiculo {
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
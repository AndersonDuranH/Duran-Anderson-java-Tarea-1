 class Barco extends Vehiculo {
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
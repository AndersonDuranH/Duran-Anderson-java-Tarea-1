 class Carro extends Vehiculo {
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
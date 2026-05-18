 class Motocicleta extends Vehiculo {
        private int cilindrada;

        public Motocicleta(String marca, int año, String modelo, int cilindrada) {
            super(marca, año, modelo);
            this.cilindrada = cilindrada;
        }
 }
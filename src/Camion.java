public class Camion extends Vehiculo {
    //Atributo
    private Double capacidadCarga;

    //Constructor
    public Camion(String marca, String modelo, String año, Double capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    //Getters
    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.printf("%n El camión se mueve");
    }
    @Override
    public void mostrarInformacion() {
        System.out.println();
        super.mostrarInformacion();
        System.out.printf("Capacidad de carga: %.2f",getCapacidadCarga());
    }
    

    

    
    
}

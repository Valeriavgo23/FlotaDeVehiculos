public class Motocicleta extends Vehiculo implements Interfaz {
    //Atributos
    private Integer cilindrada;

    //Constructor
    public Motocicleta(String marca, String modelo, String año, Integer cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    //Getters
    public Integer getCilindrada() {
        return cilindrada;
    }

    //Metodos
    @Override
    public void mover() {
        System.out.println("La motocicleta acelera");
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println();
        System.out.printf("Cilindrada: %d%n",getCilindrada());
    }
    @Override
    public void arrancar() {
    System.out.printf("%nLa motocicleta arranca");
        
    }
    
    
    
}

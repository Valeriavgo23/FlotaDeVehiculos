public class Coche extends Vehiculo implements Interfaz {
    //Atributo
    private Integer numeroPuertas;

    //Constructor
    public Coche(String marca, String modelo, String año, Integer numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }
    
    @Override
    public void mover() {
        System.out.println("El auto se esta moviendo");
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("%nNúmero de Puertas: %d%n", getNumeroPuertas());
        System.out.println();
    }
    @Override
    public void arrancar() {
        System.out.printf("El vehiculo %s, arranca ", getMarca());
        
    }
    

    
    
}

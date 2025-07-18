public abstract class Vehiculo{
    //Atributos
    private String marca;
    private String modelo;
    private String año;

    //Constructor
    
    public Vehiculo(String marca, String modelo, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    //Getters

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public String getAño() {
        return año;
    }


    //Metodos
    public void mostrarInformacion(){
        System.out.printf("""
                Marca: %s
                Modelo: %s
                Año: %s
                """,getMarca(),getModelo(),getAño());
    }


    public void mover(){
        System.out.println("El auto esta en movimiento");

    }

}
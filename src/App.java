public class App {
    public static void main(String[] args) throws Exception {
        var vehi1 = new Coche("Mercedes", "s.d", "2023", 5);
        var vehi2 = new Camion("volvo", "VNL 860", "2023", 20.000);
        var vehi3 = new Motocicleta("Ducati", "Panigali v4 s", "2025", 1103);

        vehi1.mostrarInformacion();
        vehi1.mover();
        vehi1.arrancar();

        vehi2.mostrarInformacion();
        vehi2.mover();

        vehi3.mostrarInformacion();
        vehi3.mover();
        vehi3.arrancar();

    }
}

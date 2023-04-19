public class Controller {
    public static void main(String[] args) {
        Modelo miModelo = new Modelo();

        // Crear tres coches

        miModelo.crearCoche("LaFerrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModelo.getCoche("SBC 1234");
        System.out.println("FIN");

        Coche alpine =miModelo.getCoche("Hyu 4567");
        System.out.println("FIN");
    }
}
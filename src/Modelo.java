import java.util.ArrayList;

public class Modelo {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche coche = new Coche(modelo, matricula);
        parking.add(coche);
        return coche;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche coche = null;
        for (Coche parkingBusqueda: parking) {
            if (parkingBusqueda.matricula.equals(matricula)) {
                coche = parkingBusqueda;
            }

        }
        return coche;
    }
}

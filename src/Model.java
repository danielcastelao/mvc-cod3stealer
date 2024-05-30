import java.util.ArrayList;

/**
 * Clase Modelo que representa el Modelo en el patrón MVC.
 * Contiene un ArrayList de objetos `Coche` y métodos para crear, obtener, modificar y eliminar coches del ArrayList.
 */
public class Model {
    /**
     * ArrayList de objetos `Coche`.
     */
    private static final ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Constructor por defecto de la clase `Model`.
     */
    public Model() {}

    /**
     * Método que crea un objeto `Coche` con los parámetros `modelo` y `matricula` y lo añade al ArrayList `parking`.
     *
     * @param modelo Modelo del coche.
     * @param matricula Matrícula del coche.
     */
    public void crearCoches(String modelo, String matricula) {
        parking.add(new Coche(modelo,matricula));
    }

    /**
     * Método que devuelve el ArrayList `parking` si encuentra un coche con la matrícula `matricula` y `null` en caso contrario.
     *
     * @param matricula Matrícula del coche a buscar.
     * @return ArrayList `parking` si encuentra un coche con la matrícula `matricula` y `null` en caso contrario.
     */
    public ArrayList<Coche> getCoches(String matricula) {
        for (Coche c : parking) {
            if (c.getMatricula().equals(matricula)) {
                return parking;
            }
        }
        return null;
    }

    /**
     * Método que modifica la velocidad de un coche con la matrícula `matricula` en el ArrayList `parking`.
     *
     * @param matricula Matrícula del coche a modificar.
     * @param velocidad Nueva velocidad del coche.
     */
    public void cambiarVelocidad(String matricula, int velocidad) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                coche.setVelocidad(velocidad);
            }
        }
    }

    /**
     * Método que devuelve la velocidad de un coche con la matrícula `matricula` en el ArrayList `parking` o `null` en caso contrario.
     *
     * @param matricula Matrícula del coche a buscar.
     * @return Velocidad del coche con la matrícula `matricula` o `null` en caso contrario.
     */
    public Integer getVelocidad(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche.getVelocidad();
            }
        }
        return null;
    }
}

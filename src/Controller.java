import java.util.ArrayList;

/**
 * Clase Controlador que actúa como intermediario entre el Modelo y la Vista.
 * Contiene métodos para crear, obtener, modificar y eliminar coches y llama a los métodos correspondientes del Modelo para realizar las operaciones solicitadas.
 */
public class Controller {
    /**
     * Modelo que contiene los datos de la aplicación.
     */
    private final Model model;

    /**
     * Constructor de la clase Controlador que recibe un objeto Modelo.
     *
     * @param model Modelo que contiene los datos de la aplicación.
     */
    public Controller(Model model) {
        this.model = model;
    }

    /**
     * Método que crea un coche con los parámetros `modelo` y `matricula` y llama al método `crearCoches` del Modelo.
     *
     * @param modelo Modelo del coche.
     * @param matricula Matrícula del coche.
     */
    public void createCar(String modelo, String matricula) {
        model.crearCoches(modelo, matricula);
    }

    /**
     * Método que devuelve el ArrayList de coches con la matrícula `matricula` del Modelo.
     *
     * @param matricula Matrícula del coche a buscar.
     * @return ArrayList de coches con la matrícula `matricula` del Modelo.
     */
    public ArrayList<Coche> getCoches(String matricula) {
        return model.getCoches(matricula);
    }

    /**
     * Método que modifica la velocidad de un coche con la matrícula `matricula` en el ArrayList `parking` del Modelo.
     *
     * @param matricula Matrícula del coche a modificar.
     * @param velocidad Nueva velocidad del coche.
     */
    public void changeSpeed(String matricula, int velocidad) {
        model.cambiarVelocidad(matricula, velocidad);
    }

    /**
     * Método que devuelve la velocidad de un coche con la matrícula `matricula` en el ArrayList `parking` del Modelo.
     *
     * @param matricula Matrícula del coche a buscar.
     * @return Velocidad del coche con la matrícula `matricula` en el ArrayList `parking` del Modelo.
     */
    public Integer getSpeed(String matricula) {
        return model.getVelocidad(matricula);
    }
}
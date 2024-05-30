/**
 * Clase Main que es el punto de entrada de la aplicación.
 */
public class Main {
    /**
     * Método main que es el punto de entrada de la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crea una instancia de la clase Model que contiene los datos de la aplicación.
        Model model = new Model();

        // Crea una instancia de la clase Controller que actúa como intermediario entre el Modelo y la Vista.
        Controller controller = new Controller(model);

        // Crea una instancia de la clase View que representa la interfaz de usuario de la aplicación.
        new View(controller);
    }
}
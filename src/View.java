import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Vista que representa la interfaz de usuario de la aplicación.
 * Contiene métodos para interactuar con el usuario y solicitar datos para crear, obtener, modificar y eliminar coches.
 */
public class View {
    /**
     * Controlador que se encarga de gestionar las solicitudes del usuario.
     */
    private final Controller controller;

    /**
     * Constructor de la clase Vista que recibe un objeto Controller.
     *
     * @param controller Controlador que se encarga de gestionar las solicitudes del usuario.
     */
    public View(Controller controller) {
        this.controller = controller;
        init();
    }

    /**
     * Método que inicializa la interfaz de usuario y llama a los métodos para crear, obtener, modificar y eliminar coches.
     */
    private void init() {
        createCar();
        getCoches();
        getSpeed();
        changeSpeed();
        getSpeed();
    }

    /**
     * Método que solicita al usuario los datos para crear un coche y llama al método createCar del Controlador.
     */
    public void createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el modelo del coche:");
        String modelo = scanner.nextLine();
        System.out.println("Introduce la matrícula del coche:");
        String matricula = scanner.nextLine();
        controller.createCar(modelo, matricula);
    }

    /**
     * Método que solicita al usuario la matrícula de un coche y llama al método getCoches del Controlador.
     * Muestra los coches encontrados con la matrícula introducida.
     */
    public void getCoches() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la matrícula del coche:");
        String matricula = scanner.nextLine();
        ArrayList<Coche> coches = controller.getCoches(matricula);
        if (coches!= null) {
            System.out.println("Coches encontrados:");
            for (Coche coche : coches) {
                System.out.println(coche.getModelo() + " " + coche.getMatricula() + " " + coche.getVelocidad());
            }
        } else {
            System.out.println("No se encontraron coches con esa matrícula.");
        }
    }

    /**
     * Método que solicita al usuario la matrícula de un coche y la nueva velocidad, y llama al método changeSpeed del Controlador.
     */
    public void changeSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la matrícula del coche:");
        String matricula = scanner.nextLine();
        System.out.println("Introduce la nueva velocidad del coche:");
        int velocidad = scanner.nextInt();
        controller.changeSpeed(matricula, velocidad);
    }

    /**
     * Método que solicita al usuario la matrícula de un coche y llama al método getSpeed del Controlador.
     * Muestra la velocidad del coche encontrada con la matrícula introducida.
     */
    public void getSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la matrícula del coche:");
        String matricula = scanner.nextLine();
        Integer velocidad = controller.getSpeed(matricula);
        if (velocidad!= null) {
            System.out.println("La velocidad del coche es: " + velocidad);
        } else {
            System.out.println("No se encontró un coche con esa matrícula.");
        }
    }
}
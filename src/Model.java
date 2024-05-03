import java.util.ArrayList;

public class Model {
    private static ArrayList<Coche> parking = new ArrayList<>();

    public Model() {}

    public static void crearCoches(String modelo, String matricula) {
        parking.add(new Coche(modelo,matricula));
    }

    public static ArrayList<Coche> getCoches(String matricula) {
        for (Coche c : parking) {
            if (c.getMatricula().equals(matricula)) {
                return parking;
            }
        }
        return null;
    }

    public static void cambiarVelocidad(String matricula, int velocidad) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                coche.setVelocidad(velocidad);
            }
        }
    }

    public static Integer getVelocidad(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche.getVelocidad();
            }
        }
        return null;
    }
}

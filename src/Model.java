import java.util.ArrayList;

public class Model {
    private ArrayList<Coche> coches = new ArrayList<>();

    public Model() {}

    public void crearCoches (String modelo, String matricula) {
        coches.add(new Coche(modelo,matricula));
    }
    public ArrayList<Coche> getCoches(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                return coches;
            }
        }
        return null;
    }

    public void cambiarVelocidad(String matricula, int velocidad) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                coche.setVelocidad(velocidad);
            }
        }
    }

    public Integer getVelocidad(String matricula) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                return coche.getVelocidad();
            }
        }
        return null;
    }
}

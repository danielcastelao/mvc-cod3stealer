import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    @Test
    public void testCrearCoches() {
        Model.crearCoches("Toyota", "ABC123");
        assertNotNull(Model.getCoches("ABC123"));
    }

    @Test
    public void testCambiarVelocidad() {
        Model.crearCoches("Toyota", "ABC123");
        Model.cambiarVelocidad("ABC123", 100);

        assertEquals(100, Model.getVelocidad("ABC123"));
    }

    @Test
    public void testGetCoches() {
        Model.crearCoches("Toyota", "ABC123");

        assertNotNull(Model.getCoches("ABC123"));
        assertNull(Model.getCoches("XYZ456"));
    }

    @Test
    public void testGetVelocidad() {
        Model.crearCoches("Toyota", "ABC123");
        assertNull(Model.getVelocidad("XYZ456"));
    }
}
